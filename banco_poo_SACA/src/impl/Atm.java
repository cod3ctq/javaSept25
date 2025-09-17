package impl;

import constants.Constants;
import exceptions.AccountNotExistException;
import exceptions.InsufficientBalanceException;
import exceptions.MaximumDailyWithdrawalExceededException;
import exceptions.MinimumBalanceExceededException;
import models.Cuenta;
import models.Identificador;
import models.Ticket;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

public abstract class Atm {
    private String ubicacion;
    private int folio;


    //Base de Datos
    Map<String, Cuenta> cuentas;
    Map<Identificador, Double>registro; // Monitoriza cuanto ha retirado cada cuenta por dia.


    public Atm(){}

    public Map<Identificador, Double> getRegistro() {
        return registro;
    }

    public void setRegistro(Map<Identificador, Double> registro) {
        this.registro = registro;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public Map<String, Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(Map<String, Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "Atm{" +
                "ubicacion='" + ubicacion + '\'' +
                ", folio=" + folio +
                ", cuentas=" + cuentas +
                '}';
    }

    public Object[] retirar(String numCuenta, double monto) throws MaximumDailyWithdrawalExceededException, MinimumBalanceExceededException, InsufficientBalanceException {

        /*
            1.- Que exista cuenta
            2.- Que no me pase de la cantidad max permitida por dia.
            3.- La cantidad a retirar sea menor al saldo disponible.
            4.- Que al retirar no me quede por debajo del minimo.

        */
        Cuenta cuenta = null;
        Ticket ticket = null;
        Object[] data = new Object[2];
        try {//Existe la cuenta

            //Crea el objeto identificador para poder comprobar en el registro cuanto a retirado en el dia.
            cuenta = this.buscar(numCuenta);
            if (monto < cuenta.getSaldo()){//Si me alcanza
                if (cuenta.getSaldo() - monto > cuenta.getMin()){//no excedo el monto
                    Identificador id = new Identificador(numCuenta, LocalDate.now());
                    if (registro.containsKey(id)){ //Si ya lleva al menos un retiro
                        //Si la cantidad retirada actual ya llego al maximo
                        if (registro.get(id) >= Constants.CANTIDAD_MAXIMA_POR_DIA){
                            throw new MaximumDailyWithdrawalExceededException("Se ha alcanzado la cantidad maxima de retiro por dia.");
                        }else{
                            data = this.descontarSaldo(cuenta, monto);
                            //actualiza el monto de lo que ha retirado en la base de retiros.
                            registro.put(id,registro.get(id)+ monto);
                        }
                    }else{
                        //Registrar este movimiento y cuanto fue el monto.
                        data = this.descontarSaldo(cuenta,monto);
                        //Crea la llave para ser insertada por primera vez
                        Identificador retiroId = new Identificador(numCuenta, LocalDate.now());
                        registro.put(retiroId, monto);
                    }
                }else{
                    throw new MinimumBalanceExceededException("El retiro excede el minimo permitido de la cuenta.");
                }
            }else{
                throw new InsufficientBalanceException("Saldo insuficiente.");
            }
        }catch (AccountNotExistException ex){
            System.out.println(ex.getMessage());
        }
        return data;
    }

    public Cuenta buscar(String numCuenta) throws AccountNotExistException { //Un metodo puede propagar mas de una Excepción

        Cuenta cuenta = null;//dummy
        //Buscar si existe la cuenta
        if (cuentas.containsKey(numCuenta)){
            cuenta = cuentas.get(numCuenta);
            return cuenta;
        }else{
            throw new AccountNotExistException("La Cuenta indicada no existe"); //Creando la Excepción
        }

    }



    public Object[] descontarSaldo(Cuenta cuenta, double monto){
        Ticket ticket=null;
        Object[] data  = new Object[2];

        //actualizas el saldo en la cuenta, pero la cuenta esta dentro del mapa
        cuentas.get(cuenta.getNumCuenta()).setSaldo(cuenta.getSaldo()-monto);
        ticket = new Ticket(1000, new Date(), monto, "RETIRO", this.getUbicacion());
        //Empaqueto los datos de salida
        data[0] = monto;
        data[1] = ticket;

        return data;
    }

    public abstract void consultarSaldo(String numCuenta);



}


package impl;

import models.Cuenta;
import models.Recibo;
import models.Ticket;
import service.IOperacionesAvanzadas;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class PractiCaja extends Atm implements IOperacionesAvanzadas {

    Map<String, List<Recibo>> servicios;


    public PractiCaja (){

    }

    public Map<String, List<Recibo>> getServicios() {
        return servicios;
    }

    public void setServicios(Map<String, List<Recibo>> servicios) {
        this.servicios = servicios;
    }

    @Override
    public void consultarSaldo(String numCuenta) {
        Cuenta cuenta = this.buscar(numCuenta);
        System.out.println("Tu saldo es: " + cuenta.getSaldo());
    }

    @Override
    public Ticket depositar(String numCuenta, double monto) {

        Ticket ticket = null;
        Cuenta cuenta = null;
    //Que exista la cuenta
        if (this.buscar(numCuenta)!=null){
            cuenta = this.buscar(numCuenta);
            if (cuenta.getMax()>monto){
                if (cuenta.getSaldo()+monto <= cuenta.getMax()){
                    this.getCuentas().get(numCuenta).setSaldo(cuenta.getSaldo()+monto);
                    ticket = new Ticket(1000, new Date(), monto, "DEPOSITO", this.getUbicacion());
                }else{
                    System.out.println("Monto maximo permitido.");
                }
            }else{
                System.out.println("Monto excede el maximo permitido.");
            }
        }else{
            System.out.println("La cuenta no existe.");
        }
        return ticket;
    }

    @Override
    public Ticket pagoServicios(String numConvenio, Recibo recibo) {
        Recibo rec = null;
        Ticket ticket = null;
        if (this.servicios.containsKey(numConvenio)){ //Si existe convenio

            //verificar si existe el recibo dentro de la lista asociada al convenio.
            if (this.servicios.get(numConvenio).contains(recibo)){//Si existe el recibo..

                int index = this.servicios.get(numConvenio).indexOf(recibo);
                rec = this.servicios.get(numConvenio).get(index);
                if (!rec.isPagado()){ //Si el recibo esta pagado...
                    this.servicios.get(numConvenio).get(index).setPagado(true);
                    ticket = new Ticket(1000, new Date(),recibo.getMonto(), "PAGO DE SERVICIOS", this.getUbicacion());
                }
            }
        }else{
            System.out.println("Convenio invalido");
        }



        return ticket;
    }

    @Override
    public Ticket pagarTarjetaCredito(String numTarjeta) {
        return null;
    }
}

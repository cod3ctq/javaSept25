package impl;

import models.Cuenta;

public class Basico extends Atm{


    @Override
    public void consultarSaldo(String numCuenta) {
        Cuenta cuenta = this.buscar(numCuenta);
        System.out.println("Tu saldo disponible es: " + cuenta.getSaldo());


    }
}

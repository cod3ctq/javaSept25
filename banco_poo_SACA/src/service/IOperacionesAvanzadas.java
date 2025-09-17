package service;

import models.Recibo;
import models.Ticket;

public interface IOperacionesAvanzadas {
    Ticket depositar(String numCuenta, double monto);
    Ticket pagoServicios(String numConvenio, Recibo recibo);
    Ticket pagarTarjetaCredito(String numTarjeta);






}

import exceptions.InsufficientBalanceException;
import exceptions.MaximumDailyWithdrawalExceededException;
import exceptions.MinimumBalanceExceededException;
import impl.PractiCaja;
import models.Cuenta;
import models.Identificador;
import models.Recibo;
import models.Ticket;

import java.util.*;

public class Main {
    public static void main(String[] args) {

       // System.out.println(LocalDate.now());

        PractiCaja prac = new PractiCaja();
        prac.setUbicacion("Avenida Revolución 432");

        // Creación manual de 20 cuentas con datos de ejemplo
        Cuenta c1  = new Cuenta("100001", "002010000000000001", 12500.75, 1000.00, 20000.00);
        Cuenta c2  = new Cuenta("100002", "002010000000000002", 8300.50,  500.00, 15000.00);
        Cuenta c3  = new Cuenta("100003", "002010000000000003", 21000.00, 5000.00, 40000.00);
        Cuenta c4  = new Cuenta("100004", "002010000000000004", 4700.25,  100.00, 10000.00);
        Cuenta c5  = new Cuenta("100005", "002010000000000005", 30500.10, 5000.00, 60000.00);
        Cuenta c6  = new Cuenta("100006", "002010000000000006", 9500.80,  1000.00, 20000.00);
        Cuenta c7  = new Cuenta("100007", "002010000000000007", 15800.00, 2000.00, 30000.00);
        Cuenta c8  = new Cuenta("100008", "002010000000000008", 6200.55,  500.00, 12000.00);
        Cuenta c9  = new Cuenta("100009", "002010000000000009", 18400.40, 1000.00, 25000.00);
        Cuenta c10 = new Cuenta("100010", "002010000000000010", 7300.00,  500.00, 15000.00);
        Cuenta c11 = new Cuenta("100011", "002010000000000011", 9900.90,  500.00, 20000.00);
        Cuenta c12 = new Cuenta("100012", "002010000000000012", 5400.60,  500.00, 15000.00);
        Cuenta c13 = new Cuenta("100013", "002010000000000013", 26500.30, 5000.00, 50000.00);
        Cuenta c14 = new Cuenta("100014", "002010000000000014", 13200.75, 1000.00, 25000.00);
        Cuenta c15 = new Cuenta("100015", "002010000000000015", 7800.15,  500.00, 15000.00);
        Cuenta c16 = new Cuenta("100016", "002010000000000016", 41500.90, 8000.00, 70000.00);
        Cuenta c17 = new Cuenta("100017", "002010000000000017", 5600.45,  500.00, 15000.00);
        Cuenta c18 = new Cuenta("100018", "002010000000000018", 17400.25, 2000.00, 30000.00);
        Cuenta c19 = new Cuenta("100019", "002010000000000019", 8900.60,  500.00, 18000.00);
        Cuenta c20 = new Cuenta("100020", "002010000000000020", 22300.10, 5000.00, 40000.00);

        Map<String, Cuenta> cuentas = new HashMap<>();

        // Insertar en el HashMap usando el numCuenta como llave
        cuentas.put(c1.getNumCuenta(),  c1);
        cuentas.put(c2.getNumCuenta(),  c2);
        cuentas.put(c3.getNumCuenta(),  c3);
        cuentas.put(c4.getNumCuenta(),  c4);
        cuentas.put(c5.getNumCuenta(),  c5);
        cuentas.put(c6.getNumCuenta(),  c6);
        cuentas.put(c7.getNumCuenta(),  c7);
        cuentas.put(c8.getNumCuenta(),  c8);
        cuentas.put(c9.getNumCuenta(),  c9);
        cuentas.put(c10.getNumCuenta(), c10);
        cuentas.put(c11.getNumCuenta(), c11);
        cuentas.put(c12.getNumCuenta(), c12);
        cuentas.put(c13.getNumCuenta(), c13);
        cuentas.put(c14.getNumCuenta(), c14);
        cuentas.put(c15.getNumCuenta(), c15);
        cuentas.put(c16.getNumCuenta(), c16);
        cuentas.put(c17.getNumCuenta(), c17);
        cuentas.put(c18.getNumCuenta(), c18);
        cuentas.put(c19.getNumCuenta(), c19);
        cuentas.put(c20.getNumCuenta(), c20);



        // Ejemplo de uso
        System.out.println("Total de cuentas: " + cuentas.size());
        //System.out.println(cuentas);
        // Carga la base de datos de cuentas

        prac.setCuentas(cuentas);

        // Carga la base de datos de retiros
        Map<Identificador, Double>retiros = new HashMap<Identificador, Double>();
        prac.setRegistro(retiros);

        //Maneja los errores/excepciones lanzados en el método retirar
        try{
            Ticket t1 = (Ticket) prac.retirar("100010",500)[1];
            Ticket t2 = (Ticket) prac.retirar("100010",500)[1];
            Ticket t3 = (Ticket) prac.retirar("100010",500)[1];
            Ticket t4 = (Ticket) prac.retirar("100010",500)[1];
            Ticket t5 = (Ticket) prac.retirar("100010",500)[1];
            Ticket t6 = (Ticket) prac.retirar("100010",800)[1]; //4000
            Ticket t7 = (Ticket) prac.retirar("100010",500)[1];
            Ticket t8 = (Ticket) prac.retirar("100010",500)[1]; //300
            Ticket t9 = (Ticket) prac.retirar("100010",1500)[1]; //1500
            Ticket t10 = (Ticket) prac.retirar("100010",800)[1];
            Ticket t11 = (Ticket) prac.retirar("100010",800)[1];;

            System.out.println(t11);
        //Si se coloca Exception ex, se manejan todas las excepciones personaliozadas incluso todas las que no consideramos, puedes señalar que excepciones manejar en un catch separandolas con el operador OR |.
        }catch (MaximumDailyWithdrawalExceededException | MinimumBalanceExceededException |
                InsufficientBalanceException ex){
            System.out.println(ex.getMessage());
        }



/*
        Ticket t1 = (Ticket) prac.retirar("100010",500)[1];
        Ticket t2 = (Ticket) prac.retirar("100010",500)[1];
        Ticket t3 = (Ticket) prac.retirar("100010",500)[1];
        Ticket t4 = (Ticket) prac.retirar("100010",500)[1];
        Ticket t5 = (Ticket) prac.retirar("100010",500)[1];
        Ticket t6 = (Ticket) prac.retirar("100010",800)[1]; //4000
        Ticket t7 = (Ticket) prac.retirar("100010",500)[1];
        Ticket t8 = (Ticket) prac.retirar("100010",500)[1]; //300
        Ticket t9 = (Ticket) prac.retirar("100010",1500)[1]; //1500
        Ticket t10 = (Ticket) prac.retirar("100010",800)[1]; //700



        System.out.println(t1);
        //Consultar el saldo
        prac.consultarSaldo("100010");
        //System.out.println("Registro de retiros: " + prac.getRegistro());
        //Imprimimos los retiros
        for (Identificador id: prac.getRegistro().keySet()){
            System.out.println(id + ":" + prac.getRegistro().get(id));
        }

        //Depositos
        Ticket t1 = prac.depositar("100010", 5000);
        System.out.println(t1);
        prac.consultarSaldo("100010");

        // Convenios CFE y TLMX

        List<Recibo> lista1 = new ArrayList<Recibo>();
        List<Recibo> lista2 = new ArrayList<Recibo>();


        // Creación manual de 20 objetos Recibo con datos de ejemplo
        Recibo r1  = new Recibo("Av. Reforma 101, CDMX",   "2025-01", "SRV001", "Ana López",     850.50,  true);
        Recibo r2  = new Recibo("Calle Juárez 45, Puebla", "2025-01", "SRV002", "Carlos Pérez",  620.75,  false);
        Recibo r3  = new Recibo("Av. Hidalgo 230, GDL",    "2025-01", "SRV003", "María Torres",  410.00,  true);
        Recibo r4  = new Recibo("Col. Centro 12, Mérida",  "2025-02", "SRV004", "Luis Sánchez",  980.25,  true);
        Recibo r5  = new Recibo("Priv. Olivos 8, Monterrey","2025-02","SRV005", "Lucía Gómez",   715.40,  false);
        Recibo r6  = new Recibo("Av. Morelos 99, Toluca",  "2025-02", "SRV006", "Jorge Díaz",    540.30,  true);
        Recibo r7  = new Recibo("Calle Lago 77, Cancún",   "2025-02", "SRV007", "Paola Ruiz",    860.00,  true);
        Recibo r8  = new Recibo("Blvd. Sur 120, Oaxaca",   "2025-03", "SRV008", "Mario Vargas",  450.60,  false);
        Recibo r9  = new Recibo("Av. Insurgentes 333, CDMX","2025-03","SRV009", "Elena García",  730.15,  true);
        Recibo r10 = new Recibo("Calle 5 de Mayo 20, León","2025-03","SRV010", "Rafael Ortega",  650.00,  false);
        Recibo r11 = new Recibo("Av. del Sol 14, Tijuana", "2025-03", "SRV011", "Carmen Silva",  510.25,  true);
        Recibo r12 = new Recibo("Col. Roma 221, CDMX",     "2025-04", "SRV012", "Víctor Ramos",  920.90,  true);
        Recibo r13 = new Recibo("Calle Palma 88, Mérida",  "2025-04", "SRV013", "Sandra Flores", 375.40,  false);
        Recibo r14 = new Recibo("Av. Patria 450, GDL",     "2025-04", "SRV014", "Hugo Chávez",   690.75,  true);
        Recibo r15 = new Recibo("Blvd. Díaz Ordaz 310, MTY","2025-04","SRV015","Diana Herrera",  805.00,  true);
        Recibo r16 = new Recibo("Calle Cedros 17, Puebla", "2025-05", "SRV016", "Pedro Núñez",   560.55,  false);
        Recibo r17 = new Recibo("Av. Reforma 202, CDMX",   "2025-05", "SRV017", "Laura Méndez",  480.90,  true);
        Recibo r18 = new Recibo("Calle Sur 77, Veracruz",  "2025-05", "SRV018", "Andrés Salas",  710.20,  true);
        Recibo r19 = new Recibo("Col. Norte 31, Chihuahua","2025-05","SRV019", "Marta Gil",     660.10,  false);
        Recibo r20 = new Recibo("Av. Libertad 5, Querétaro","2025-05","SRV020","Rodrigo León",  590.45,  true);
        //Añade los recibos a la lista de CFE
        lista1.add(r1);
        lista1.add(r2);
        lista1.add(r3);
        lista1.add(r4);
        lista1.add(r5);
        lista1.add(r6);
        lista1.add(r7);
        lista1.add(r8);
        lista1.add(r9);
        lista1.add(r10);
        //Añade los recibos a la lista de TLMX
        lista2.add(r11);
        lista2.add(r12);
        lista2.add(r13);
        lista2.add(r14);
        lista2.add(r15);
        lista2.add(r16);
        lista2.add(r17);
        lista2.add(r18);
        lista2.add(r19);
        lista2.add(r20);

        //Crea la base de datos de los servicios y añade las listas al mapa
        Map<String,List<Recibo>> servicios = new HashMap<String, List<Recibo>>();

        //Cargar la listas a la base de datos
        servicios.put("CFE001", lista1);
        servicios.put("TLMX002", lista2);

        //Carga la base de datos de servicios a la practiCaja;
        prac.setServicios(servicios);
        Ticket ps = prac.pagoServicios("TLMX002", r19);
        System.out.println(ps);
*/
        //Estructura de paquetes del proyecto -  desarrollo en capas
        //Generar una organización del código basado en su responsabilidad y separados en paquetes/carpetas.
        //Models: Clases que contienen simples models que pueden ser auxiliares o de composición.
        //Impl: Clases que contienen la resolución de logica de negocio
        //service: Contrato donde se diseñan las operaciones de negocio (no se resuelven)
        //constants: Guardo las constantes que se usaran en las reglas de negocio.

    }
}

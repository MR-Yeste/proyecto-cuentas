package cuentas.clientes;

public class Main {

    public static void main(String[] args) {
        operativa_cuenta(null);
    }

    private static void operativa_cuenta(java.lang.Float cantidad) {
        Cuenta cuenta01;
        double saldoActual;

        cuenta01 = new Cuenta("Rafael Nadal Parera","1000-2365-85-1230456789",2500,0);
        
        System.out.println("El saldo actual es:"+ cuenta01.estado() );

        try {
            cuenta01.retirar(2300);
            System.out.println("El saldo actual es:"+ cuenta01.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta01.ingresar(695);
            System.out.println("El saldo actual es:"+ cuenta01.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}

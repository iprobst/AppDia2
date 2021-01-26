package ejercicioTM.ej1;

public class main {
    public static void main(String[] args) {

        //Ejercicio 1

        CuentaCorriente c1 = new CuentaCorriente(5000);
        CuentaCorriente c2 = new CuentaCorriente(6000);

        c1.egreso(2000);
        System.out.println(c1);

        c1.ingreso(1000);
        System.out.println(c1);

        c1.egreso(6000);
        System.out.println(c1);

        c1.transferencia(3000, c2);
        System.out.println("saldo cuenta 1: " + c1);
        System.out.println("saldo cuenta 2: " + c2);

    }
}

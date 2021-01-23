package ejercicioTM;

public class main {
    public static void main(String[] args) {

        //Ejercicio 1
        /*
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
         */

        //Ejercico 2
        /*Contador contador = new Contador();
        System.out.println(contador.getValor());

        contador.incrementar(3);
        System.out.println(contador.getValor());

        contador.decrementar(5);
        System.out.println(contador.getValor());

        Contador contador2 = new Contador(7);
        System.out.println(contador2.getValor());

        contador2.incrementar(1);
        System.out.println(contador2.getValor());

        contador.decrementar(2);
        System.out.println(contador2.getValor());*/

        //Ejercio 3
        /*Libro lb1 = new Libro("Harry Potter", "9780545582889", "Rowling,J.K", true);
        System.out.println("lb1 = " + lb1);
        lb1.prestamo();
        System.out.println("lb1 = " + lb1);
        lb1.devolver();
        System.out.println("lb1 = " + lb1);*/

        //Ejercico 4

        Fraccion f1 = new Fraccion(3, 6);
        System.out.println(f1.sumar(5));;


    }
}

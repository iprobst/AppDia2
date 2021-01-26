package ejercicioTM.ej3;

public class main {
    public static void main(String[] args) {


        //Ejercio 3
        Libro lb1 = new Libro("Harry Potter", "9780545582889", "Rowling,J.K", true);
        System.out.println("lb1 = " + lb1);
        lb1.prestamo();
        System.out.println("lb1 = " + lb1);
        lb1.devolver();
        System.out.println("lb1 = " + lb1);



    }
}

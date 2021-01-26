package ejercicioTM.ej4;

public class main {
    public static void main(String[] args) {

        Fraccion f1 = new Fraccion(3, 6);
        Fraccion f2 = f1.sumar(5);
        System.out.println(f2); // 33/6

        Fraccion f3 = f2.sumar(f1);
        System.out.println(f3); // 216/36

        Fraccion f4 = f3.restar(4);
        System.out.println(f4); // 72/36

        Fraccion f5 = f3.restar(f4);
        System.out.println(f5); // 5184/1296

        Fraccion f6 = f1.multiplicar(4);
        System.out.println(f6);// 12/6

        Fraccion f7 = f1.multiplicar(f3); // 648-216
        System.out.println(f7);

    }
}

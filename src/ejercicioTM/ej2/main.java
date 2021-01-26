package ejercicioTM.ej2;

public class main {
    public static void main(String[] args) {

        //Ejercico 2
        Contador contador = new Contador();
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
        System.out.println(contador2.getValor());

    }
}

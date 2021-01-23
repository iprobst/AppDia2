package ejercicioTT.ej2;

public class Main {

    public static void main(String[] args) {
        Circulo c1 = new Circulo(4);
        System.out.println("El area del circulo es: " + c1.area());
        Triangulo t1 = new Triangulo(7, 8, 12);
        System.out.println("El area del triangulo es: " + t1.area());
        Rectangulo r1 = new Rectangulo(4, 6);
        System.out.println("El area del rectangulo es: " + r1.area());

        FiguraGeometrica [] figuras = {c1, t1, r1};
        System.out.println("El promedio del area de todas las figuras geometricas es: " + Util.areaPromedio(figuras));
    }
}

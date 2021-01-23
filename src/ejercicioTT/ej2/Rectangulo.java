package ejercicioTT.ej2;

public class Rectangulo extends FiguraGeometrica{

    double lado1;
    double lado2;

    public Rectangulo(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double area() {
        double area = lado1 * lado2;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                '}';
    }
}


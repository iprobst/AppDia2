package ejercicioTT.ej2;

public class Triangulo extends FiguraGeometrica{

    double lado1;
    double lado2;
    double lado3;


    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double area() {
        double area = (lado1 + lado2 + lado3) /2;
        return area;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                '}';
    }
}


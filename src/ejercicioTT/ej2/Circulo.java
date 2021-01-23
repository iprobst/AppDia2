package ejercicioTT.ej2;

public class Circulo extends FiguraGeometrica{

    double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double area() {
        double area = Math.PI * Math.pow(this.radio, 2);
        return area;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}

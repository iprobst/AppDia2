package ejercicioTM.ej4;

public class Fraccion {

    private int num;
    private int den;

    public Fraccion(int num, int den){
        this.num = num;
        this.den = den;
    }

    public Fraccion sumar(double numero){
        int num = (int) (this.num + numero * this.den);
        int den = (int) (this.den);
        Fraccion resultado =  new Fraccion(num, den);
        return resultado;
    }
    public Fraccion sumar(Fraccion fr){
        int num = (int) (this.num * fr.den + fr.num * this.den);
        int den = (int) (this.den*fr.den);
        Fraccion resultado =  new Fraccion(num, den);
        return resultado;
    }

    public Fraccion restar(double numero){
        int num = (int) (this.num - numero * this.den);
        int den = (int) (this.den);
        Fraccion resultado =  new Fraccion(num, den);
        return resultado;
    }

    public Fraccion restar(Fraccion fr){
        int num = (int) (this.num * fr.den - fr.num * this.den);
        int den = (int) (this.den*fr.den);
        Fraccion resultado =  new Fraccion(num, den);
        return resultado;
    }

    public Fraccion multiplicar(double numero){
        int num = (int) (numero * this.num);
        int den = (int) (this.den);
        Fraccion resultado =  new Fraccion(num, den);
        return resultado;
    }

    public Fraccion multiplicar(Fraccion fr){
        int num = (int) (this.num * fr.num);
        int den = (int) (this.den*fr.den);
        Fraccion resultado =  new Fraccion(num, den);
        return resultado;
    }


    @Override
    public String toString() {
        return "Fraccion{" +
                "num=" + num +
                ", den=" + den +
                '}';
    }
}

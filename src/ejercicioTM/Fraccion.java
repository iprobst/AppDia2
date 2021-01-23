package ejercicioTM;

public class Fraccion {

    private int num;
    private int den;

    public Fraccion(int num, int den){
        this.num = num;
        this.den = den;
    }

    public Double sumar(double numero){
        return (this.den * numero + this.num)/this.den;
    }
    public Double sumar(Fraccion fr){



        return 3.4;
    }


}

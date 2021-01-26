package ejercicioTM.ej2;

public class Contador {
    private int valor;

    public Contador() {
        this.valor =0;
    }

    public Contador(int valor) {
        this.valor = valor;
    }

    public Contador(Contador contador) {
        this.valor = contador.valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void incrementar(int valor){
        this.valor+=valor;
    }

    public void decrementar(int valor){
        this.valor-=valor;
    }
}

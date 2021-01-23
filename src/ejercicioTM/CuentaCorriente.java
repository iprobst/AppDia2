package ejercicioTM;

public class CuentaCorriente {

    private double saldo;

    public CuentaCorriente(double saldo) {

        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente cuentaCorriente) {

        this.saldo = cuentaCorriente.saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Double getSaldo() {
        return saldo;
    }

    public void ingreso(double saldo){
        setSaldo(getSaldo()+saldo);
    }

    public boolean egreso(double saldo){
        if(getSaldo() >= saldo){
            setSaldo(getSaldo()-saldo);
            return true;
        }else{
            return false;
        }
    }

    public void reintegro(double reintegro){
        ingreso(reintegro);
    }

    public boolean transferencia(double monto, CuentaCorriente cuentaCorriente){

        if(egreso(monto)){
            cuentaCorriente.setSaldo(cuentaCorriente.getSaldo()+monto);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "saldo=" + saldo +
                '}';
    }
}

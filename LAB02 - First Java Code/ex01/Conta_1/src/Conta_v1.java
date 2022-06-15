public class Conta_v1
{
    private double saldo;
    private double limite;

    //Método depositar
    public void depositar ( double x){
        saldo = saldo + x;
    }

    //Método sacar
    public void sacar (double x){
        saldo = saldo - x;
    }

    //Método getSaldo
    public double getSaldo() {
        return saldo;
    }

    //Método setLimite
    public void setLimite( double x){
        limite = x;
    }

    //Método getLimite

    public double getLimite() {
        return limite;
    }
}

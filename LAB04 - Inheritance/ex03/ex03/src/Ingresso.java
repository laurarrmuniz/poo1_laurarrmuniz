public class Ingresso
{
    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void escreveValor()
    {
        System.out.println("Valor do Ingresso: R$ " + this.valor);
        System.out.println();
    }
}

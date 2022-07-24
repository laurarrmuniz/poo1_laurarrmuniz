public class Servico implements Classificavel {

    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean eMenorQue(Classificavel obj3) {
        Servico compara = (Servico) obj3;
        if (this.preco < compara.preco) {
            return true;
        } else {
            return false;
        }
    }
}

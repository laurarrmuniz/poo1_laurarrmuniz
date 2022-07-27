public class Servico implements Classificavel {

    public Servico(double preco) {
        this.preco = preco;
    }

    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
        Servico compara = (Servico) obj;
        if (this.preco < compara.preco) {
            return true;
        } else {
            return false;
        }
    }
    public void print_servico(){
        System.out.println("Preços ordenados: " + preco);
    }
}

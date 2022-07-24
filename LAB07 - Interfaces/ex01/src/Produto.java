public class Produto implements Classificavel {

    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean eMenorQue(Classificavel obj1){
        Produto compara = (Produto) obj1;
        if (this.codigo < compara.codigo){
            return true;
        }else {
            return false;
        }
    }
}

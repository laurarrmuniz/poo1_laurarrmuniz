public class Cliente  implements Classificavel {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean eMenorQue(Classificavel obj){
        Cliente compara = (Cliente) obj;
        if (this.nome.compareTo(compara.nome) > 0){
            return true;
        }else {
            return false;
        }
    }
    public void print_cliente(){
        System.out.println("Nomes ordenados: " + nome);
    }
}


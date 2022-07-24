public class Cliente implements Classificavel {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean eMenorQue(Classificavel obj2) {
        if (this.nome == "Ana") {
            return true;
        }
        if (this.nome == "Maria"){
            return true;
        }
        if (this.nome == "Beatriz"){
            return true;
        }
        if(this.nome == "Carlos"){
            return true;
        }
        else {
            return false;
        }
    }
}


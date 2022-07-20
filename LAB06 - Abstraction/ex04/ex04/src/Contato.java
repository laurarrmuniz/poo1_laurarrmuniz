public abstract class Contato
{
    protected String apelido, nome, email, aniversario;

    public Contato(String apelido, String nome, String email, String aniversario){
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }
    public Contato(){

    }

    public void imprimeBasico(){
        System.out.println("Apelido: " +this. apelido);
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Aniversário: " + this.aniversario);
    }

    public abstract void imprimeContato();
}

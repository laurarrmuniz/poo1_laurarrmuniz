public class Trabalho extends Contato
{
    protected String tipo;


    public Trabalho(String apelido, String nome, String email, String aniversario, String tipo){
        super(apelido,nome,email,aniversario);
        this.tipo = tipo;
    }

    @Override
    public void imprimeContato() {
        super.imprimeBasico();
        System.out.println("Tipo: " + this.tipo);
    }
}

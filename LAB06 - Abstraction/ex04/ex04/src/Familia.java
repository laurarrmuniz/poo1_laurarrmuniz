public class Familia extends Contato
{
    protected String parentesco;


    public Familia(String apelido, String nome, String email, String aniversario, String parentesco){
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }

    @Override
    public void imprimeContato() {
        super.imprimeBasico();
        System.out.println("Parentesco: " + this.parentesco);
    }
}

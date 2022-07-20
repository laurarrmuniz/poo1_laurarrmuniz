public class Amigos extends Contato
{
    protected int grau;  // 1 =melhor amigo, 2 = amigo, 3 = conhecido

    public Amigos(String apelido, String nome, String email, String aniversario, int grau){
        super(apelido,nome,email,aniversario);
        this.grau = grau;
    }


    @Override
    public void imprimeContato() {
        super.imprimeBasico();
        System.out.println("Grau de amizade: " + this.grau);
    }
}

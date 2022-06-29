public class C1
{
    public String nome;
    protected int cpf;
    private String endereco;

    public C1()
    {
        System.out.println( "Classe C1: chamada do construtor padrao, sem parametros");
        System.out.println("+------------------+------------------+");
    }

    public C1(String nome, int cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;

        System.out.println("Classe C1: chamada do construtor com parametros");
        System.out.println("+------------------+------------------+");
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void mostrar_atributos(){
        System.out.println("Mostra sem super");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf );
        System.out.println("Endereço: " + this.endereco);
        System.out.println("+------------------+------------------+");
    }

    public void mostrar_atributos_super(){
        System.out.println("Mostra com super");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf );
        System.out.println("Endereço: " + this.endereco);
        System.out.println("+------------------+------------------+");
    }
}

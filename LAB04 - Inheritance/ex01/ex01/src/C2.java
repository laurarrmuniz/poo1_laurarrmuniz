public class C2 extends C1
{
    public String data_nascimento;
    private String num_carteira;
    protected String data_expiracao;

    public C2() {
        System.out.println("Classe C2: chamada do construtor padrão, sem parametros");
        System.out.println("+------------------+------------------+");
    }

    public C2(String nome, int cpf, String endereco, String data_nascimento, String num_carteira, String data_expiracao) {
        super(nome, cpf, endereco);
        this.data_nascimento = data_nascimento;
        this.num_carteira = num_carteira;
        this.data_expiracao = data_expiracao;

        System.out.println("Classe C2: chamada do construtor com parametros");
        System.out.println("+------------------+------------------+");
    }

    public String getNum_carteira() {
        return num_carteira;
    }

    public void setNum_carteira(String num_carteira) {
        this.num_carteira = num_carteira;
    }

    public void mostrar_atributos(){

        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf );
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Data Nascimento: " + this.data_nascimento);
        System.out.println("Numero Carteira: " + getNum_carteira());
        System.out.println("Data Expiração: " + this.data_expiracao);
        System.out.println("+------------------+------------------+");

    }

    public void mostrar_atributos_super(){
        super.mostrar_atributos_super();
        System.out.println("Data Nascimento: " + this.data_nascimento);
        System.out.println("Numero Carteira: " + getNum_carteira());
        System.out.println("Data Expiração: " + this.data_expiracao);
        System.out.println("+------------------+------------------+");
    }
}

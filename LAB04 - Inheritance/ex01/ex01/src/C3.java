public class C3 extends C2
{
    public String hora_chegada ;
    private int num_crea;
    protected String hora_saida;

    public C3() {
        System.out.println("Classe C3: chamada do construtor padrão, sem parametros");
        System.out.println("+------------------+------------------+");
    }

    public C3(String hora_chegada, int num_crea, String hora_saida, String data_nascimento, String num_carteira,
              String data_expiracao, String nome, int cpf, String endereco) {
        super(nome, cpf, endereco, data_nascimento, data_expiracao, num_carteira);
        this.hora_chegada = hora_chegada;
        this.num_crea = num_crea;
        this.hora_saida = hora_saida;
        System.out.println("Classe C3: chamada do construtor com parametros");
        System.out.println("+------------------+------------------+");
    }

    public int getNum_crea() {
        return num_crea;
    }

    public void setNum_crea(int num_crea) {
        this.num_crea = num_crea;
    }

    public void mostrar_atributos(){

        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf );
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Data Nascimento: " + this.data_nascimento);
        System.out.println("Numero Carteira: " + getNum_carteira());
        System.out.println("Data Expiração: " + this.data_expiracao);
        System.out.println("Hora Chegada: " + this.hora_chegada);
        System.out.println("Num. Crea.: " + getNum_crea());
        System.out.println("Hora Saída: " + this.hora_saida);
        System.out.println("+------------------+------------------+");
    }

    public void mostrar_atributos_super(){
        super.mostrar_atributos_super();
        System.out.println("Hora Chegada: " + this.hora_chegada);
        System.out.println("Num. Crea.: " + getNum_crea());
        System.out.println("Hora Saída: " + this.hora_saida);
        System.out.println("+------------------+------------------+");
    }
}

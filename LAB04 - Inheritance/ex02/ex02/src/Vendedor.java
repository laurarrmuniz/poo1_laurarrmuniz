public class Vendedor extends Funcionario
{
    protected double comissao;
    protected double valor_fixo;
    public int vendas;

    public Vendedor(String nome, String data_nascimento, double salario, double valor_fixo, double comissao, double vendas) {
        super(nome, data_nascimento, salario);
    }

    public void mostra_func()
    {
        super.mostra_func();
        System.out.println();

    }
}

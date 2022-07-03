public class Operario extends Funcionario
{
    private double valor_prod;
    public int qtd_produzida;

    public Operario(String nome, String data_nascimento, double salario, double valor_prod, int qtd_produzida) {
        super(nome, data_nascimento, salario);
    }


    public void mostra_func()
    {
        super.mostra_func();
        System.out.println();

    }

}

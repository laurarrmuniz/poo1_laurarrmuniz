public class Chefe extends Funcionario {

    public Chefe(String nome, String data_nascimento, double salario) {
        super(nome, data_nascimento, salario);
    }

    public void mostra_func()
    {
        super.mostra_func();
        System.out.println();

    }

}

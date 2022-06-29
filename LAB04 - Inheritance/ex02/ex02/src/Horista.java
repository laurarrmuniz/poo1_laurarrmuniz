public class Horista extends Funcionario
{
    private double valor_hora;
    private int horas_trabalhadas;

    public Horista(String nome, String data_nascimento, double salario, double valor_hora, int horas_trabalhadas) {
        super(nome, data_nascimento, salario);
    }
    /*
    public double salario_horista(){
        return valor_hora * horas_trabalhadas;
    }*/

    public void mostra_func()
    {
        super.mostra_func();
        System.out.println();

    }
}

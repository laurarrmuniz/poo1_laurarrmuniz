public class Funcionario
{
    private String nome;
    private String data_nascimento;
    private double salario;

    public Funcionario(String nome, String data_nascimento, double salario) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public void mostra_func()
    {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data Nascimento: " + this.getData_nascimento());
        System.out.println("Salário: R$ " + this.getSalario());

    }
}

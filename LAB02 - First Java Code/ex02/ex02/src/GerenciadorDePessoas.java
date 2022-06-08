public class GerenciadorDePessoas
{
    public static void main (String args[])
    {
        Produtos p1 = new Produtos();

        //Atribuindo valor aos atributos do objeto p1

        p1.codigo       = "0101";
        p1.nome         = "Camiseta Preta M";
        p1.fabricante   = "Industria de Tecidos";
        p1.preco        = 59.90;
        System.out.println("Codigo: " + p1.codigo + "\n" + "Produto: " + p1.nome + "\n" + "Fabricante: " + p1.fabricante + "\n"
        + "Preco: " + p1.preco + "\n");

        Clientes c1 = new Clientes();

        //Atribuindo valor aos atributos do objeto c1

        c1.cpf              = "142.589.589-89";
        c1.nome             = "Joao Oliveira";
        c1.dataDeNascimento = "16/06/1999";
        c1.cep              = "38411-596";
        System.out.println("CPF: " + c1.cpf + "\n" + "Nome Cliente: " + c1.nome + "\n" + "Data de Nascimento: " + c1.dataDeNascimento
                + "\n" + "CEP: " + c1.cep + "\n");

        Funcionarios f1 = new Funcionarios();

        //Atribuindo valor aos atributos do objeto f1

        f1.cpf              = "145.582.589-36";
        f1.nome             = "Maria Souza";
        f1.dataDeNascimento = "21/09/1998";
        f1.dataDeIngresso   = "01/06/2022";
        System.out.println("CPF: " + f1.cpf + "\n" + "Nome Funcionário: " + f1.nome + "\n" + "Data de Nascimento: " + f1.dataDeNascimento
                + "\n" + "Data de Ingresso: " + f1.dataDeIngresso + "\n");
    }
}

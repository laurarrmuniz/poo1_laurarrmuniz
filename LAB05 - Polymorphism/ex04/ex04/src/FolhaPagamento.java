import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantidade de funcionarios: ");
        int funcionario = entrada.nextInt();

        Funcionario[] func1 = new Funcionario[funcionario];

        for (int i = 0; i < func1.length; i++) {
            entrada.nextLine();
            System.out.print("Nome: ");
            String nome = entrada.nextLine();
            System.out.print("Data de Nascimento: ");
            String data_nascimento = entrada.nextLine();
            System.out.print("Salário: ");
            double salario = entrada.nextDouble();
            func1[i] = new Funcionario(nome, data_nascimento, salario);
            System.out.println();
        }
        for (int i = 0; i < funcionario; i++) {
            System.out.println();
            System.out.println("Folha de Pagamento");
            func1[i].mostra_func();
        }
    }
}

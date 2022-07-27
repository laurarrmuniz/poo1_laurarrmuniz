import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantidade de produtos: ");
        int qtd_prod = entrada.nextInt();

        Produto[] prod1 = new Produto[qtd_prod];

        for (int i = 0; i < prod1.length; i++) {
            System.out.print("Código produto " + i + ": ");
            int codigo = entrada.nextInt();
            entrada.nextLine();
            prod1[i] = new Produto(codigo);
        }

        Classificador.ordena(prod1);
        for(int i = 0; i< qtd_prod; i++)
        prod1[i].print_produto();
        System.out.println();

        System.out.print("Quantidade de clientes: ");
        int qtd_cliente = entrada.nextInt();
        entrada.nextLine();

        Cliente[] c1 = new Cliente[qtd_cliente];

        for (int i = 0; i < c1.length; i++) {
            System.out.print("Nome cliente " + i + ": ");
            String nome = entrada.nextLine();
            c1[i] = new Cliente(nome);
        }

        Classificador.ordena(c1);
        for(int i = 0; i< qtd_cliente; i++)
            c1[i].print_cliente();

        System.out.println();
        System.out.print("Quantidade de serviços: ");
        int qtd_serv = entrada.nextInt();
        entrada.nextLine();

        Servico[] serv1 = new Servico[qtd_serv];

        for (int i = 0; i < serv1.length; i++) {
            System.out.print("Preço serviço " + i + ": ");
            double preco = entrada.nextDouble();
            serv1[i] = new Servico(preco);
        }
        Classificador.ordena(serv1);
        for(int i = 0; i< qtd_serv; i++)
            serv1[i].print_servico();
        System.out.println();
    }
}

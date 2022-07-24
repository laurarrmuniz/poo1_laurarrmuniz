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
            /*System.out.print("Nome produto " + i + ": ");
            String nome_prod = entrada.nextLine();
            System.out.print("Preço produto " + i + ": ");
            double preco = entrada.nextDouble();*/
            //boolean s = prod1[i].eMenorQue(prod1[i]);
            //System.out.println(s);
            //System.out.println(prod1[i].eMenorQue(prod1[i]));
            System.out.println();

        }
        System.out.println();
        System.out.print("Quantidade de clientes: ");
        int qtd_cliente = entrada.nextInt();
        entrada.nextLine();

        Cliente[] c1 = new Cliente[qtd_cliente];

        for (int i = 0; i < c1.length; i++) {
            System.out.print("Nome cliente " + i + ": ");
            String nome = entrada.nextLine();
        }

        System.out.println();
        System.out.print("Quantidade de serviços: ");
        int qtd_serv = entrada.nextInt();
        entrada.nextLine();

        Servico[] serv1 = new Servico[qtd_serv];

        for (int i = 0; i < serv1.length; i++) {
            System.out.print("Preço serviço " + i + ": ");
            double preco = entrada.nextDouble();
        }

        for (int i = 0; i < qtd_prod; i++) {
            System.out.println();
        }
    }
}

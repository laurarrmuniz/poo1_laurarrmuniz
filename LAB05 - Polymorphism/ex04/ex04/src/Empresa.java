import java.util.Scanner;

public class Empresa {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantidade de funcionarios CHEFES: ");
        int chefe = entrada.nextInt();

        Chefe[] func1 = new Chefe[chefe];

        for (int i = 0; i < func1.length; i++) {
            entrada.nextLine();
            System.out.print("Nome: ");
            String nome = entrada.nextLine();
            System.out.print("Data de Nascimento: ");
            String data_nascimento = entrada.nextLine();
            System.out.print("Salário: ");
            double salario = entrada.nextDouble();
            func1[i] =  new Chefe(nome,data_nascimento,salario);
            System.out.println();
        }


        System.out.print("Quantidade de funcionarios VENDEDOR: ");
        int vend = entrada.nextInt();

        Vendedor[] func2 = new Vendedor[vend];

        for (int i = 0; i < func2.length; i++) {
            entrada.nextLine();
            System.out.print("Nome: ");
            String nome = entrada.nextLine();
            System.out.print("Data de Nascimento: ");
            String data_nascimento = entrada.nextLine();
            System.out.print("Valor Fixo: ");
            double valor_fixo = entrada.nextDouble();
            System.out.print("Comissão: ");
            double comissao = entrada.nextDouble();
            System.out.print("Vendas: ");
            int vendas = entrada.nextInt();
            double salario = (valor_fixo + (comissao * vendas));
            func2[i] =  new Vendedor(nome, data_nascimento, salario, valor_fixo, comissao, vendas);
            System.out.println();
        }

        System.out.print("Quantidade de funcionarios OPERÁRIO: ");
        int op = entrada.nextInt();

        Operario[] func3 = new Operario[op];

        for (int i = 0; i < func3.length; i++) {
            entrada.nextLine();
            System.out.print("Nome: ");
            String nome = entrada.nextLine();
            System.out.print("Data de Nascimento: ");
            String data_nascimento = entrada.nextLine();
            System.out.print("Valor por produção: ");
            double valor_prod = entrada.nextDouble();
            System.out.print("Quantidade produzida: ");
            int qtd_produzida = entrada.nextInt();
            double salario = (valor_prod * qtd_produzida);
            func3[i] = new Operario(nome, data_nascimento, salario, valor_prod, qtd_produzida);
            System.out.println();
        }

        System.out.print("Quantidade de funcionarios HORISTA: ");
        int h = entrada.nextInt();

        Horista[] func4 = new Horista[h];

        for (int i = 0; i < func4.length; i++) {
            entrada.nextLine();
            System.out.print("Nome: ");
            String nome = entrada.nextLine();
            System.out.print("Data de Nascimento: ");
            String data_nascimento = entrada.nextLine();
            System.out.print("Valor hora: ");
            double valor_hora = entrada.nextDouble();
            System.out.print("Horas Trabalhadas: ");
            int horas_trabalhadas = entrada.nextInt();
            double salario = (valor_hora * horas_trabalhadas);
            func4[i] = new Horista(nome, data_nascimento, salario, valor_hora, horas_trabalhadas);
            System.out.println();
        }
        for(int i = 0; i < chefe; i++){
            System.out.println();
            System.out.print("Chefe " + i + ": ");
            func1[i].mostra_func();
        }
        for(int i = 0; i < vend; i++){
            System.out.println();
            System.out.print("Vendedor " + i + ": ");
            func2[i].mostra_func();
        }
        for(int i = 0; i < op; i++){
            System.out.println();
            System.out.print("Operário " + i + ": ");
            func3[i].mostra_func();
        }
        for(int i = 0; i < h; i++){
            System.out.println();
            System.out.print("Horista " + i + ": ");
            func4[i].mostra_func();
        }
    }
}


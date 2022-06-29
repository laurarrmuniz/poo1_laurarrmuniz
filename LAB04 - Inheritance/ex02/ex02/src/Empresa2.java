import java.util.Scanner;

public class Empresa2
{
    public static void main(String args[])
    {
        Funcionario func = new Funcionario("João", "23/09/2000", 2000);

        System.out.println();

        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantidade de funcionarios CHEFES: ");
        int n = entrada.nextInt();

        Chefe[] func1 = new Chefe[n];

        for (int i = 0; i < func1.length; i++) {
            System.out.print("Salário fixo: ");
            double valor_fixo = entrada.nextDouble();
            System.out.println();
        }

    }
}

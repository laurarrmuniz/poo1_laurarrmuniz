import java.util.Scanner;

public class Main
{
    public static void main (String args[])
    {
        Ponto p1 = new Ponto();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de x: ");
        p1.x1 = entrada.nextDouble();
        System.out.println("Digite o valor de y: ");
        p1.y1 = entrada.nextDouble();
        System.out.println("O ponto digitado é: " + "(" + p1.x1 + "," + p1.y1 + ")");
    }
}

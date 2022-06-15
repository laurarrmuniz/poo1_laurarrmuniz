import java.util.Scanner;
public class Main
{
    public static void main (String args[])
    {
        Ponto p1 = new Ponto();

        Scanner entrada = new Scanner(System.in);
    //Leitura imprime_ponto
        System.out.println("Digite o valor de x: ");
        p1.x1 = entrada.nextDouble();
        System.out.println("Digite o valor de y: ");
        p1.y1 = entrada.nextDouble();
        System.out.print("O valor digitado é: ");
        p1.imprime_ponto();

    //Leitura do método soma_ponto
        System.out.println("Digite o valor de x1: ");
        p1.x1 = entrada.nextDouble();
        System.out.println("Digite o valor de y1: ");
        p1.y1 = entrada.nextDouble();

        System.out.println("Digite o valor de x2: ");
        p1.x2 = entrada.nextDouble();
        System.out.println("Digite o valor de y2: ");
        p1.y2 = entrada.nextDouble();
        System.out.print("A soma de " + "(" + p1.x1 + "," + p1.y1 + ") e " + "(" + p1.x2 + "," + p1.y2 + ") é ");
        p1.soma_ponto();


    //Chama o método soma_ponto_est


    // chama método calc_area

        Ponto.calc_area();

    //chama método mult_const

        p1.mult_const();

    }

    //chama método inc_dir

}

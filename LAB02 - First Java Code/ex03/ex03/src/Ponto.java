import java.util.Scanner;
public class Ponto {
    double x1;
    double x2;
    double y1;
    double y2;

    //Método imprime_ponto
    public void imprime_ponto() {
        System.out.println("(" + x1 + "," + y1 + ")");
    }

    //Método para somar dois pontos
    public void soma_ponto() {
        x1 = x1 + x2;
        y1 = y1 + y2;
        imprime_ponto();
    }
    //Método estático soma_ponto
   /* public static void soma_ponto_est()
    {
        double soma, x1, x2;
        soma = x1 + x2;
    }*/




    //Método calc_area
    public static void calc_area ()
    {
        double area,ponto1,ponto2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de p1: ");
        ponto1 = entrada.nextDouble();
        System.out.println("Digite o valor de p2: ");
        ponto2 = entrada.nextDouble();

        area = ponto1 * ponto2;

        System.out.println("A area do retangulo definida por " + ponto1 + " e " + ponto2 + " eh " + area);
    }
    //Método mult_const
    public void  mult_const()
    {
        double constante;
        double ponto1, ponto2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de p1 e p2: ");
        ponto1 = entrada.nextDouble();
        ponto2 = entrada.nextDouble();
        System.out.println("Digite a constante: ");
        constante = entrada.nextDouble();

        x1 = ponto1 * constante;
        y1 = ponto2 * constante;
        System.out.println("Resultado: " + "(" + ponto1 + "," + ponto2 + ") * " + constante + " = " +
                "(" + x1 + "," + y1 + ")");

    }
    //Método inc_dir
    public void inc_dir()
    {

    }

}

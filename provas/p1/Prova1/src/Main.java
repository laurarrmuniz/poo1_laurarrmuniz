import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        Circulo circulo = new Circulo();

        System.out.print("Raio: ");
        circulo.setRaio(entrada.nextDouble());// check:<<<erro: e o ponto central>>>>
 
        double areaCirculo = circulo.area();
        System.out.println("Area: " + areaCirculo);



        System.out.println("Raio: ");
        circulo.setRaio(entrada.nextDouble());
// check:<<<erro: estática>>>>
        double perimetroCirculo = circulo.perimetro();
        System.out.println("Perímetro: " + perimetroCirculo);




    }

}

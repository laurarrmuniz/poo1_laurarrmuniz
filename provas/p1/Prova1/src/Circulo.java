import java.util.Scanner;

public class Circulo
{
    private Ponto ponto;
    private static double raio;

    //Contrutores
/*
    public Circulo(double raio) {
        this.raio = raio;
        // check:<<<erro: observe que por esse construtor sua variável que armazena os pontos fica NULL>>>>

    }

    public Circulo(Ponto ponto, double raio) {
        this.ponto = ponto;
        this.raio = raio;
    }*/ //n consegui implementar os construtores
// check:<<<erro: pq não? qual foi o problema?>>>>

    //Método para calcular a area

    public double area(){

        double pi = 3.14;
        return pi*(raio * raio);
    }

    //Método estático para o perímetro

    public static double perimetro(){// check:<<<erro: raio por paramerto>>>>

        double pi = 3.14;
        return 2 * pi * raio;
    }

    public static double getRaio() {
        return raio;
    }

    public static void setRaio(double raio) {
        Circulo.raio = raio;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }
}

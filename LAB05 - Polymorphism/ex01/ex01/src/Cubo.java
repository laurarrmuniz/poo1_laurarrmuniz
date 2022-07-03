public class Cubo extends FormaTridimensional
{

    public Cubo(double lado, double altura, double raio) {
        super(lado, altura, raio);
    }


    public double obterArea(double lado){
        return 6 * (lado * lado);
    }

    public double obterVolume(double lado){
        return lado*lado*lado;
    }

    public String toString(){
        return "Volume do CUBO = " + String.format("%.2f", obterVolume(getLado()));
    }

    public void descricao(){
        System.out.println("Descricao Cubo: ");
        System.out.println("O cubo é uma forma tridimencional que possui area e volume, sendo o último dado pelo seu lado ao cubo, ou seja lado^3\n");
    }
}

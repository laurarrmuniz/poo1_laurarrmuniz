import jdk.swing.interop.SwingInterOpUtils;

public class Esfera extends FormaTridimensional
{

    public Esfera(double lado, double altura, double raio) {
        super(lado, altura, raio);
    }

    public double obterArea(double raio){
        return (4 * Pi * (raio * raio));
    }

    public double obterVolume(double raio){
        return ((4*Pi*raio*raio*raio)/3);
    }

    public String toString(){
        return "Volume da ESFERA = " + String.format("%.2f", obterVolume(getRaio()));
    }

    public void descricao(){
        System.out.println("Descrição Esfera: ");
        System.out.println("A esfera é uma forma tridimencional que possui area e volume, sendo o último dado por (4/3)*pi*raio^3\n");
    }
}

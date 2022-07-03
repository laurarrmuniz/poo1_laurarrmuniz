public class Circulo extends FormaBidimensional
{
    public Circulo(double lado, double altura, double raio) {
        super(lado, altura, raio);
    }


    public double obterArea(double raio){
        return Pi * (raio * raio);
    }

    public String toString(){
        return "Area do CIRCULO = " + String.format("%.2f", obterArea((getRaio())));
    }

    public void descricao(){
        System.out.println();
        System.out.println("Descrição Circulo: ");
        System.out.println("Círculo é o conjunto de pontos resultantes da união entre uma circunferência e seus pontos internos." +
                " Em outras palavras, o círculo é a área cuja fronteira é uma circunferência.");
        System.out.println();
    }
}

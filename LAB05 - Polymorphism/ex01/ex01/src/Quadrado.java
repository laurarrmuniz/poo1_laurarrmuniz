public class Quadrado extends FormaBidimensional
{
    public Quadrado(double lado, double altura, double raio) {
        super(lado, altura, raio);
    }

    public double obterArea(double lado){
        return lado * lado;
    }

    public String toString(){
        return "Area do QUADRADO = " + String.format("%.2f", obterArea((getLado())));
    }

    public void descricao(){
        System.out.println("Descrição Quadrado: ");
        System.out.println("O quadrado é uma figura plana, classificado como polígono, composto por 4 lados e 4 ângulos congruentes entre si, ou seja, que possuem as mesmas medidas.");
        System.out.println();
    }
}

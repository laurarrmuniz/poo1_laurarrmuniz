public class Triangulo extends FormaBidimensional
{
    public double base;
    public Triangulo(double lado, double altura, double raio, double base) {
        super(lado, altura, raio);
        this.base = base;
    }

    public double obterArea(double altura, double base){
        return base * altura;
    }

    public String toString(){
        return "Area do TRIANGULO = " + String.format("%.2f", obterArea(base, getAltura()));
    }

    public void descricao(){
        System.out.println("Descrição Triangulo: ");
        System.out.println("Triângulos são figuras geométricas formadas por três segmentos de reta que se encontram nas extremidades." +
                " Assim, são polígonos com três lados, três ângulos e três vértices. ");
        System.out.println();
    }
}

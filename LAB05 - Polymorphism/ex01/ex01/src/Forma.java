public class Forma
{
    private double lado, altura, raio;
    public static double Pi = 3.14;

    public Forma(double lado, double altura, double raio){
        this.altura = altura;
        this.lado = lado;
        this.raio = raio;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double largura) {
        this.lado = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}

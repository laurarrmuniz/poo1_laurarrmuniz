public class Tetraedro extends FormaTridimensional {
    public double areaBase;

    public Tetraedro(double lado, double altura, double raio, double areaBase) {
        super(lado, altura, raio);
        this.areaBase = areaBase;
    }

    public double obterArea(double lado) {
        return ((lado * lado) * Math.sqrt(3));
    }

    public double obterVolume(double altura, double areaBase) {
        return (1 * altura * areaBase) / 3;
    }

    public String toString(){
        return "Volume do TETRAEDRO = " + String.format("%.2f", obterVolume(getAltura(), areaBase));
    }

    public void descricao() {
        System.out.println("Descrição Tetraedro: ");
        System.out.println("O tetraedro é uma forma tridimencional que possui area e volume, sendo o último dado por (1/3)*AreaBase*altura\n");
    }
}

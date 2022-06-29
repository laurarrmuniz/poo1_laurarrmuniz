public class CamaroteSuperior extends Vip
{
    private double adicionalSup;

    public CamaroteSuperior(double valor, double adicional, double adicionalSup) {
        super(valor, adicional);
        this.adicionalSup = adicionalSup;
    }

    @Override
    public double getAdicional() {
        return adicionalSup;
    }

    @Override
    public void setAdicional(double adicional) {
        this.adicionalSup = adicional;
    }

    public double camSuperior(){
        return adicionalSup + ingressoVip();
    }

}

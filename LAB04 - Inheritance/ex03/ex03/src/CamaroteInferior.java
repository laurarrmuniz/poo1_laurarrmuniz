public class CamaroteInferior extends Vip
{
    private String localizacao;
    public CamaroteInferior(double valor, double adicional, String localizacao) {
        super(valor, adicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }


    public void imprimeLocal(){
        System.out.println("Local: " + getLocalizacao());
    }

}

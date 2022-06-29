public class Main
{
    public static void main(String args[]){

        Ingresso ingresso = new Ingresso(250);
        ingresso.escreveValor();

        Vip vip = new Vip(250, 200);
        double ing = vip.ingressoVip();
        System.out.println("Ingresso VIP: R$ " + ing);
        vip.ingressoVip();
        System.out.println();

        Normal normal = new Normal(250);
        normal.ingressoNormal();
        System.out.println();

        CamaroteInferior inferior = new CamaroteInferior(250,250, "Arquibancada Inferior, A3");
        inferior.imprimeLocal();
        System.out.println();

        CamaroteSuperior superior = new CamaroteSuperior(250,250, 100);
        System.out.print("Ingresso Camarote Superior: R$ ");
        System.out.print(superior.camSuperior());
        superior.camSuperior();
        System.out.println();

    }
}

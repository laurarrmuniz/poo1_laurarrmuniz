public class Main
{
    public static void main(String args[]){

        Piloto p1 = new Piloto("João", "145.365.896.52", "145.529-96",30,205,40);
        System.out.println("Salário: " + p1.calculaSalario());

        Atendente a1 = new Atendente("Maria", "478.526.896.35", "185.589-63", 29,589);
        System.out.println("Salário: " + a1.calculaSalario());
    }
}

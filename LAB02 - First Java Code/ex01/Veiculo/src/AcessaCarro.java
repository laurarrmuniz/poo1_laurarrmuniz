public class AcessaCarro
{
    public static void main (String args[])
    {
        Veiculo veiculo1 = new Veiculo ();

        // Inicializando veículo1
        veiculo1.marca = "Fiat";
        veiculo1.modelo = "2000";
        veiculo1.placa = "FRE-6454";

        //  Simulando operação sobre objeto veiculo1
        veiculo1.acelerar();
        System.out.println( veiculo1.marca + " modelo " + veiculo1.modelo + "," + " placa " + veiculo1.placa + "," + " acelerou.");

        veiculo1.frear();
        System.out.println( veiculo1.marca + " modelo " + veiculo1.modelo + "," + " placa " + veiculo1.placa + "," + " freou.");
    }

}

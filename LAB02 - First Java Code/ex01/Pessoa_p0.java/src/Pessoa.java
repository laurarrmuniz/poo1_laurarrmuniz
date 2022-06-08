public class Pessoa
{
    String nome;
    String profissao;
    int idade;
    double dinheiroNaCarteira;

    public void gastar( double valor)
    {
     dinheiroNaCarteira = dinheiroNaCarteira - valor;
    }

    public void receber( double valor)
    {
        dinheiroNaCarteira = dinheiroNaCarteira + valor;
    }
}

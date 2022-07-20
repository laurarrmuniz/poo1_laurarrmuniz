public class ContaComum extends ContaCorrente{
    public ContaComum(float val, int num, int pwd) {
        super(val, num, pwd);
    }

    @Override
    public boolean debitaValor(float val, int pwd) {
        if (pwd != senha)
            return (false); // senha deve ser vá lida
        if (estado != 1)
            return (false); // conta deve ser ativa
        if (val <= 0)
            return (false); // val > 0
        if (val > saldo)
            return (false);

        saldo -= val;
        if (saldo == 0)
            estado = 2; // torna conta inativa
        return (true);
    }

    @Override
    public float debitaValor(float val) {
        return saldo -= val;
    }

    public float getSaldo(int pwd) {
        if (senha == pwd)
            return saldo;
        else
            return -1; // indicando que houve problema na senha

    }
    protected int getEstado ( int pwd ) {
        if ( senha == pwd )
            return estado ;
        else
            return -1;
    }

    protected void setEstado ( int pwd , int e ) {
        if ( senha == pwd )
            estado = e;
    }

    @Override
    public float creditaValor(int pwd, float val) {
        if ( senha == pwd )
            saldo += val ;
        return saldo;
    }

    @Override
    protected boolean isSenha(int pwd) {
        if ( senha == pwd )
            return true ;
        else
            return false ;
    }
}

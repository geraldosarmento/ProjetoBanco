package conta;

import banco.Titular;

public class ContaCorrente extends Conta {

    private double limiteEspecial;
    
    public ContaCorrente(Titular titular, double saldo) {
        super(titular, saldo);
        limiteEspecial = 500.0;
    }

    @Override
    public void sacar(double valor) {
        if (valor > (saldo))
            throw new RuntimeException("Saldo Insuficiente");
        
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
    
}

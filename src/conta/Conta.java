package conta;

import banco.Titular;

public abstract class Conta {
    protected int numero;
    protected double saldo;
    protected Titular titular;

    public Conta(Titular titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);

    public int obterNumero() {
        return numero;
    }
    public double obterSaldo() {
        return saldo;
    }
}

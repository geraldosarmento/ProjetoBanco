package banco;

import java.util.ArrayList;
import conta.Conta;

public class Agencia {
    private String banco;
    private int numero;
    private ArrayList<Conta> contas;
    

    public Agencia(int numero, String banco) {
        this.banco = banco;
        this.numero = numero;
        contas = new ArrayList<>();        
    }

    public int getNumero() {
        return numero;
    }

    public void abrirContaCorrente(Conta minhaConta) {
        contas.add(minhaConta.obterNumero(), minhaConta);
    }

    public Conta acessarConta(int i) throws IndexOutOfBoundsException {        
        return contas.get(i);
    }    
}

    
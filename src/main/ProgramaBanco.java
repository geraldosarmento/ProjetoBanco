package main;

import banco.Agencia;
import banco.Titular;
import conta.Conta;
import conta.ContaCorrente;

public class ProgramaBanco {
    public static void main(String[] args) {
        Agencia minhaAgencia = new Agencia(1,"Banco do Brasil");        
        Titular titular = new Titular("Pedro", "8699876123");
        Conta minhaConta = new ContaCorrente(titular, 100.0);
        int codigo = minhaConta.obterNumero();


        minhaAgencia.abrirContaCorrente(minhaConta);
        minhaAgencia.acessarConta(codigo).depositar(50);

        System.out.println(minhaAgencia.acessarConta(codigo).obterSaldo());

        
    }
}

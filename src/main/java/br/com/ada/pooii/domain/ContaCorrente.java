package br.com.ada.pooii.domain;

public class ContaCorrente extends Conta {
    @Override
    void depositar(double valor) {
        this.saldo += valor * 0.95;
    }

    @Override
    void sacar (double valor){
        this.saldo -= valor * 0.95;
    }
}

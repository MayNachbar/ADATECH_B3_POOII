package br.com.ada.pooii.domain;

public abstract class Conta {
    protected String titular;
    protected double saldo = 0.0;

    abstract  void depositar(double valor);
    abstract  void sacar(double valor);

    public double getSaldo() {
        return saldo;
    }
}

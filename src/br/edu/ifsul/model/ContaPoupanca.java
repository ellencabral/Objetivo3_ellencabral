package br.edu.ifsul.model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(int id, double saldo) {
        super(id, saldo);
    }

    @Override
    public void deposita(double valor) {
        this.saldo += valor;
    }

    @Override
    public void saca(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void atualiza(double taxa) {
        this.saldo += (this.saldo * (taxa/100) );
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}

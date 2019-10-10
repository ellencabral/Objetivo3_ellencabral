package br.edu.ifsul.model;

public class ContaCorrente extends Conta {

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(int id, double saldo) {
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

    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}

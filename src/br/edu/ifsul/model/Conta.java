package br.edu.ifsul.model;

public abstract class Conta {
    protected int id;
    protected double saldo;

    public Conta() {
    }

    public Conta(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void deposita(double valor);

    public abstract void saca(double valor);

    public abstract void atualiza(double taxa);
}

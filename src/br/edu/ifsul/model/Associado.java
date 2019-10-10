package br.edu.ifsul.model;

public class Associado implements AssociadoVip {

    private int id;

    private int qdeCotas;
    private double valorCota;

    public Associado() {
    }

    public Associado(int id, int qdeCotas, double valorCota) {
        this.id = id;
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQdeCotas() {
        return qdeCotas;
    }

    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    public double getValorCota() {
        return valorCota;
    }

    public void setValorCota(double valorCota) {
        this.valorCota = valorCota;
    }

    @Override
    public double lucros(int qtdeCotas, double valorCota) {
        return 0;
    }

    @Override
    public String toString() {
        return "Associado{" +
                "id=" + id +
                ", qdeCotas=" + qdeCotas +
                ", valorCota=" + valorCota +
                '}';
    }
}

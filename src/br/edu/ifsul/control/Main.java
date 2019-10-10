package br.edu.ifsul.control;

import br.edu.ifsul.model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // a)
        System.out.println("a) \n");

        ContaCorrente cc1 = new ContaCorrente(1, 0);
        ContaCorrente cc2 = new ContaCorrente(2, 0);
        ContaCorrente cc3 = new ContaCorrente(3, 0);

        ContaPoupanca cp1 = new ContaPoupanca(4, 0);
        ContaPoupanca cp2 = new ContaPoupanca(5, 0);
        ContaPoupanca cp3 = new ContaPoupanca(6, 0);

        Associado a1 = new Associado(7, 0, 0);
        Associado a2 = new Associado(8, 0, 0);
        Associado a3 = new Associado(9, 0, 0);

        System.out.println(cc1 +"\n"+ cc2 +"\n"+ cc3 +"\n"+ cp1 +"\n"+ cp2 +"\n"+ cp3 +"\n"+ a1 +"\n"+ a2 +"\n"+ a3 +"\n");

        // b)
        System.out.println("b) \n");

        List<Associado> associados = new ArrayList<>();

        associados.add(a1);
        associados.add(a2);
        associados.add(a3);

        List<Conta> contas = new ArrayList<>();

        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        contas.add(cp1);
        contas.add(cp2);
        contas.add(cp3);

        System.out.println(associados);
        System.out.println(contas +"\n");

        // c)

        cp1.deposita(1000);
        cp1.atualiza(5);
        cp1.saca(50);

        // d)

        cc1.deposita(500);
        cc1.saca(400);

        // e)
        System.out.println("e) \n");

        a1.setQdeCotas(100);
        a2.setQdeCotas(400);
        a3.setQdeCotas(600);
        Associado a4 = new Associado(10, 300, 0);
        Associado a5 = new Associado(11, 600, 0);
        Associado a6 = new Associado(12, 600, 0);

        associados.add(a4);
        associados.add(a5);
        associados.add(a6);

        System.out.println(associados +"\n");

        // f)
        System.out.println("f) \n");

        associados.sort(Comparator.comparingInt(Associado::getQdeCotas).reversed());

        System.out.println("Associados em ordem decrescente pelas cotas: \n"+associados);

        System.out.println("Associados com maior número de cotas: \n"+ Main.getMaxAssociados(associados) +"\n");

        // g)
        System.out.println("g) \n");

        contas.sort(Comparator.comparingDouble(Conta::getSaldo).reversed());

        System.out.println("Contas em ordem decrescente pelo saldo: \n"+contas);

        System.out.println(associados);

        System.out.println("Contas com maior saldo: \n"+ Main.getMaxContas(contas));


    }

    private static List<Associado> getMaxAssociados(List<Associado> associados) {
        List<Associado> maxs = new ArrayList<>();
        if(!associados.isEmpty()){
            Associado assMax = Collections.max(associados, Comparator.comparingInt(Associado::getQdeCotas));
            maxs.add(assMax);
            for(int i=1; i < associados.size(); i++) {
                if(assMax.getQdeCotas() == associados.get(i).getQdeCotas()){
                    maxs.add(associados.get(i));
                }
            }
        }
        return maxs;
    }

    private static List<Conta> getMaxContas(List<Conta> contas) {
        List<Conta> maxs = new ArrayList<>();
        if(!contas.isEmpty()){
            Conta contaMax = Collections.max(contas, Comparator.comparingDouble(Conta::getSaldo));
            maxs.add(contaMax);
            for(int i=1; i < contas.size(); i++) {
                if(contaMax.getSaldo() == contas.get(i).getSaldo()){
                    maxs.add(contas.get(i));
                }
            }
        }
        return maxs;
    }
}

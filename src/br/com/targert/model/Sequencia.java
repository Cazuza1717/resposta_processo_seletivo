package br.com.targert.model;

import java.util.ArrayList;

public class Sequencia {
    private int t1 = 0;
    private int t2 = 1;

    public Sequencia() {
    }

    public Sequencia(int t1, int t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public void verificar(int numero) {
        boolean verdade =false;

        while (t1 <= numero) {
            if (t1 == numero || numero == 1 || numero == 0) {
                System.out.println("\nO numero " + numero + " esta na sequencia");
                verdade = true;
                break;
            }
            int t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
            System.out.print(t1 + " - ");
        }
        if(verdade == false){
            System.out.println("O numero " + numero + " nao esta na sequencia");
        }

    }
}


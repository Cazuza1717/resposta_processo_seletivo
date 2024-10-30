package br.com.targert.view;

import br.com.targert.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        boolean sair = false;
        Sequencia sequencia = new Sequencia();
        VerificacaoA verificacaoA = new VerificacaoA();

        System.out.println("Olá, seja bem vindo " + nome + "\nVamos começar?");


        while (!sair){
            System.out.println("Insira qual resposta deseja verificar:\n1 - Sequencia de Fibonacci\n2 - Verificação da letra A\n3 - Codigo soma\n4 - Logica\n5 - Resposta de raciocinio\n0 - Sair");
            int resposta = sc.nextInt();
            try {
            switch (resposta){
                case 1:
                    System.out.println("Insira o nunero que deseja verificar se tem na sequencia de Fibonacci:");
                    int numero = sc.nextInt();
                    sequencia.verificar(numero);
                    break;
                case 2:
                    System.out.println("escreva uma palavra para saber quantas vezes a letra 'A' aparece na palavra");
                    String palavra = sc.next();
                    verificacaoA.verificar(palavra);
                    break;
                case 3:
                    Codigo cd = new Codigo();
                    cd.CodigoSoma();
                    break;
                case 4:
                    Logica logica = new Logica();
                    logica.logica();
                    break;
                case 5:
                    Resposta5 rs = new Resposta5();
                    rs.resposta();

                    break;
                case 0:
                    System.out.println("Até mais! " + nome);
                    sair = true;
                default:
                    System.out.println("Digite uma opção valida.");
            }
            }catch (Exception e) {
                System.err.println("ERRO" + e.getMessage());
            }
        }
        sc.close();

    }
}
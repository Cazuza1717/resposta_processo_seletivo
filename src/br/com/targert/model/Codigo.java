package br.com.targert.model;

public class Codigo {

    public Codigo() {
    }

    public void CodigoSoma() {
        int i = 12;
        int soma = 0;
        int k = 1;
        while(k< i){
                k = k + 1;
                soma = soma + k;
            }
        System.out.println("O resultaddo da soma:\nint i = 12;\n" +
                "        int soma = 0;\n" +
                "        int k = 1;\n" +
                "        while(k< i){\n" +
                "                k = k + 1;\n" +
                "                soma = soma + k;\n" +
                "            }\n é:" + soma);

        }
    }


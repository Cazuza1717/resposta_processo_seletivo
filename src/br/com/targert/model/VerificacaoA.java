package br.com.targert.model;

public class VerificacaoA {
    private String entrada;

    public VerificacaoA(String entrada) {
        this.entrada = entrada;
    }
    public VerificacaoA() {
    }

    public void verificar(String entrada) {
        entrada.length();
        int cont = 0;
        for (int i = 0; i < entrada.length(); i++) {
            if (entrada.charAt(i) == 'a') {
                cont++;
            }
        }
        if (cont > 0) {
            System.out.println("A letra a aparece " + cont + " vezes na string");
        } else {
            System.out.println("A letra a nao aparece na string");
        }

    }
}

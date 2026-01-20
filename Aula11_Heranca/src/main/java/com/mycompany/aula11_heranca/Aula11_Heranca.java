package com.mycompany.aula11_heranca;

public class Aula11_Heranca {
    public static void main(String[] args) {
        Bolsista b1 = new Bolsista();
        
        b1.setNome("Carlos");
        b1.setMatricula(25108);
        b1.setSexo("M");
        b1.setIdade(18);
        b1.setBolsa(15.5f);
        b1.pagarMensalidade();
    }
}

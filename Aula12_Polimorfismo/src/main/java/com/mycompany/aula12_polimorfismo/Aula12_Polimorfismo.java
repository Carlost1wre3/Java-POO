package com.mycompany.aula12_polimorfismo;

public class Aula12_Polimorfismo {
    public static void main(String[] args) {
        
        Canguru canguru = new Canguru();
        Cobra cobra = new Cobra();
        Pirarucu pirarucu = new Pirarucu();
        Arara arara = new Arara();
        
        canguru.locomover();
        cobra.locomover();
    }
}

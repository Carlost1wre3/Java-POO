package com.mycompany.aula12_polimorfismo;
public class Peixe extends Animal{
    
    private String corEscamas;

    @Override
    public void locomover() {
        System.out.println("Nandando");
    }

    @Override
    public void alimentar() {
        System.out.println("Algas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Nada");
    }
    
    public void soltarBolhas(){
        System.out.println("Soltando bolhas");
    }

    public String getCorEscamas() {
        return corEscamas;
    }

    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }
    
    
}

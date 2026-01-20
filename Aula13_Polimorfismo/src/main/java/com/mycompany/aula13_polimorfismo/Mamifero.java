package com.mycompany.aula13_polimorfismo;
public abstract class Mamifero extends Animal{
    
    protected String corPelo;
    
    @Override
    public void emitirSom(){
        System.out.println("Som de mamifero!");
        System.out.println(" ");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

}

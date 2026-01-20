package com.mycompany.aula12_polimorfismo;

public abstract class Animal{
    
    // === ATRIBUTOS ===
    protected float peso;
    protected int idade, membros;
    
    // === METODOS ===
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    // === METODOS ESPECIAIS ===

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
}

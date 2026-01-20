package com.mycompany.aula14_projetofinal;
public abstract class Pessoa {
    // === ATRIBUTOS ===
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;
    
    // === CONSTRUTOR ===

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }
    
    
    // === METODOS ===
    public void ganharExperiencia(){
        
    }
    
    // === METODOS ESPEIAIS ===

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }
    
    
}

package com.mycompany.aula11_heranca;
public class Aluno extends Pessoa{
    
    // === ATRIBUTOS ===
    private int matricula;
    private String curso;
    
    // === METODOS ===
    public void pagarMensalidade(){
        System.out.println("Matricula paga do aluno " + this.getNome());
        System.out.println(" ");
    }
    
    // === METODOS ESPECIAIS ===

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}

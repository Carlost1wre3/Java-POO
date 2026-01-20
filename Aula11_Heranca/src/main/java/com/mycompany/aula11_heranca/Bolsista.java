package com.mycompany.aula11_heranca;
public class Bolsista extends Aluno{
    
    // === ATRIBUTOS ===
    private float bolsa;
    
    // === METODOS ===
    public void renovarBolsa(){
        System.out.println("Bolsa renovada do aluno: " + this.getNome());
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga do bolsista: " + this.getNome());
    }

    // === METODOS ESPECIAIS ===
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}

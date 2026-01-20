package aula9_avaliação;

public class Pessoa {
    // === ATRIBUTOS ===
    private String nome;
    private int idade;
    private boolean sexo;

    // === METODOS ===
    public Pessoa(String nome, int idade, boolean sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public void fazerAniver(){
        System.out.println("FELIZ ANIVERSARIO!");
        this.setIdade( this.getIdade() + 1);
        System.out.println(" ");
    }
    
    public void statusP(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        if(sexo){
            System.out.println("Sexo: Masculino");
        } else{
            System.out.println("Sexo: Feminino");
        }
        System.out.println(" ");
    }

    // === METODOS ESPECIAIS ===
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

    public boolean getSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    
    
}

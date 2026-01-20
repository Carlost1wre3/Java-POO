package aula7_uec;
public class Lutador {
    
    // === ATRIBUTOS ===
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria, derrotas, empates;
    
    // === MÉTODOS ===
    public void aprensetar(){
        System.out.println("|===============================================|");
        System.out.println("Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade());
        System.out.println("Pesando " + this.getPeso() + "KG");
        System.out.println(this.getVitoria() + " vitorias");
        System.out.println(this.getDerrotas()+ " derrotas");
        System.out.println(this.getEmpates()+ " empates");
    }
    
    public void status(){
        System.out.println("|===============================================|");
        System.out.println(this.getNome() + " e um peso " + this.getCategoria());
        System.out.println(this.getVitoria() + " vitorias");
        System.out.println(this.getDerrotas()+ " derrotas");
        System.out.println(this.getEmpates()+ " empates");
    }
    
    public void ganharLuta(){
        
    }
    
    public void perderLuta(){
        
    }
    
    public void empatarLuta(){
        
    }
    
    // === MÉTODOS ESPECIAIS  ===

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitoria, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitoria = vitoria;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Invalido";
        } else if (this.peso <= 70.3){
            this.categoria = "Leve";
        } else if(this.peso <= 83.9){
            this.categoria = "Medio";
        } else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        } else{
            this.categoria = "Invalido";
        } 
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.setVitoria(this.getVitoria() + 1);
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.setEmpates(this.getEmpates() + 1);
    }
    
    
    
    
}

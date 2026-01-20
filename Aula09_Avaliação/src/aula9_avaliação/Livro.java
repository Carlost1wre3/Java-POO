package aula9_avaliação;

public class Livro implements Publicacao {
    // === ATRIBUTOS ===
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // === METODOS ===

    public Livro(String titulo, String autor, int totPaginas, int pagAtual, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    
    public void detalhes(){
        System.out.println("Nome: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de Paginas: " + this.getTotPaginas());
        System.out.println("Pagina atual: " + this.getPagAtual());
        if(this.aberto){
            System.out.println("Situacao: Aberto");
        } else{
            System.out.println("Situacao: Fechado");
        }
        System.out.println("Leitor: " + this.leitor.getNome());
        System.out.println(" ");
    }
    
    // === METODOS ESPECIAIS ===
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    // === METODOS ABSTRATOS ===
    @Override
    public void abrir() {
        System.out.println("Voce abriu o livro");
        this.setAberto(true);
        System.out.println(" ");
    }

    @Override
    public void fechar() {
        System.out.println("Voce fechou o livro");
        this.setAberto(false);
        System.out.println(" ");
    }

    @Override
    public void folhear() {

    }

    @Override
    public void avancarPag() {
        System.out.println("Voce avancou uma pagina");
        this.setPagAtual(this.getPagAtual() + 1);
        System.out.println(" ");
    }

    @Override
    public void voltarPag() {
        System.out.println("Voce voltou uma pagina");
        this.setPagAtual(this.getPagAtual() - 1);
        System.out.println(" ");
    }  
}

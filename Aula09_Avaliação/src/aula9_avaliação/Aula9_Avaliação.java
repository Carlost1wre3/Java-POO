package aula9_avaliação;

public class Aula9_Avaliação {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carlos", 18, true); 
        Livro l1 = new Livro("One Piece", "Oda", 100, 1, p1);
        
        l1.detalhes();
    }
}

package aula3_visibilidade;

public class Aula3_Visibilidade {
    public static void main(String[] args) {
       Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Preta";
        // ERRO: ponta é privada
        // c1.ponta = 0.5f;
        c1.carga = 10;
        c1.tampada = true;
        /*c1.status();
         /* Destampando caneta */
        c1.status();
        c1.destampar();
        c1.rabiscar();
       
    }
    
}

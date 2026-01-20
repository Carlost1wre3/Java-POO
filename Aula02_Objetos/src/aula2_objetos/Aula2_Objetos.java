package aula2_objetos;

public class Aula2_Objetos {
    public static void main(String[] args) {
       Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Preta";
        c1.ponta = 0.5f;
        c1.carga = 100;
        c1.tampada = true;
        /*c1.status();
         /* Destampando caneta */
        c1.destampar();
        c1.rabiscar();
       
       Caneta c2 = new Caneta();
        c2.modelo = "Bic Cristal";
        c2.cor = "Azul";
        c2.ponta = 1f;
        c2.carga = 10;
        c2.tampada = false;

        c2.tampar();
        c2.rabiscar();
    }
    
}

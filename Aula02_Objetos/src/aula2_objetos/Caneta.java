package aula2_objetos;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Qual o modelo? " + this.modelo);
        System.out.println("Qual sua cor? " + this.cor);
        System.out.println("Qual sua ponta? " + this.ponta);
        System.out.println("Qual sua carga? " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO " + this.modelo + "_" + this.cor + ": Caneta tampada!");
        }else{
            System.out.println(this.modelo + "_" + this.cor + " rabiscando com Sucesso!");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}

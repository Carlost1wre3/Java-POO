package aula3_visibilidade;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    void status(){
        System.out.println("Qual o modelo? " + this.modelo);
        System.out.println("Qual sua cor? " + this.cor);
        System.out.println("Qual sua ponta? " + this.ponta);
        System.out.println("Qual sua carga? " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO " + this.modelo + "_" + this.cor + ": Caneta tampada!");
        }else{
            System.out.println(this.modelo + "_" + this.cor + " rabiscando com Sucesso!");
        }
    }
    
    protected void tampar(){
        this.tampada = true;
    }
    
    protected void destampar(){
        this.tampada = false;
    }
}


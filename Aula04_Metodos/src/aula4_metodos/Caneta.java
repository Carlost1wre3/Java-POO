package aula4_metodos;
public class Caneta {
    
    public String modelo;
    private float ponta;
    public String cor;
    public boolean tampada;
    
    //MÉTODO CONSTUTOR
    public Caneta( String m, String c, float p){
        this.tampar(); 
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);

    }
    
    // MÉTODOS MODELO
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo( String m ){
        this.modelo = m;
    }
    
    // MÉTODOS COR
    public String getCor(){
        return this.modelo;
    }
    
    public void setCor( String c ){
        this.cor = c;
    }

    public boolean getTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    
    
    // MÉTODOS PONTA
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta( float p ){
        this.ponta = p;
    }
    
    // FUNCIONALIDADES 
    
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("Sobre a Caneta:");
        System.out.println("Modelo: " + this.getModelo() );
        System.out.println("Ponta: " + this.getPonta() );
        System.out.println("Cor: " + this.getCor() );
        System.out.println("Tampada: " + this.getTampada() );
    }
    
}

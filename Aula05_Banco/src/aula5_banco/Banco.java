package aula5_banco;
import java.util.Random;

public class Banco {
    
    public int numConta;
    protected boolean tipo; // Falso - Conta Corrente |___| Verdadeiro - Conta Poupança
    private String dono;
    private int saldo;
    private boolean status;

    public Banco(boolean tipo, String dono) {
        this.tipo = tipo;
        this.dono = dono;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public boolean getTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = this.saldo + saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(){
        if(this.tipo == false){
            this.setSaldo(50);
            System.out.println("Obrigado por abrir uma Conta Corrente! Saldo inicial: 50R$");
            this.status = true;
        }else{
            this.setSaldo(150);
            System.out.println("Obrigado por abrir uma Conta Corrente! Saldo inicial: 150R$");
            this.status = true;
        }
        
        Random random = new Random();
        int sorteio = random.nextInt(100 ) + 1;
        this.setNumConta(sorteio);
        
    }
    
    public void fecharConta(){
        if(this.saldo == 0){
            System.out.println("Conta fechada!");
            this.status = false;
        }else{
            System.out.println("ERROR: Nao e possivel fechar sua conta com 'Saldo'. Remova!");
            
        }
    }
    
    public void depositar(int d){
        if(this.status == false){
            System.out.println("Abra sua conta!");
        }else{
            this.setSaldo(d);
        }
    }
    
    public void sacar(int d){
        if(d > this.saldo){
            System.out.println("Valor acima do saldo! Saque recusado!");
        }else{
            this.setSaldo(-d);
            System.out.println("Saque efetivado!");
        }
    }
    
    public void pagarMensal(){
        if(this.status == false){
            this.setSaldo(-12);
            System.out.println("Mensalidade paga no valor de 12R$");
        }else{
            this.setSaldo(-20);
            System.out.println("Mensalidade paga no valor de 12R$");
        }
    }
    
    public void status(){
        System.out.println("Status da sua Conta");
        System.out.println("Numero da Conta: " + this.getNumConta());
        if(this.getTipo() == false){
            System.out.println("Status da Conta: Conta Corrente");
        }else{
            System.out.println("Status da Conta: Conta Poupanca");
        }
        System.out.println("Dono da Conta: " + this.getDono());
        System.out.println("Saldo em Conta: " + this.getSaldo());
        if(this.getStatus() == false){
            System.out.println("Status da Conta: Conta Fechada");
        }else{
            System.out.println("Status da Conta: Conta Aberta");
        }
    }
    
}
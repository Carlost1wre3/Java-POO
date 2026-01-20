package aula6_emcapsulamento;
public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligando;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligando = true;
        this.tocando = false; 
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigando() {
        return ligando;
    }

    private void setLigando(boolean ligando) {
        this.ligando = ligando;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //Métodos abstratos
    @Override
    public void ligar() {
        this.setLigando(true);
    }

    @Override
    public void desligar() {
        this.setLigando(false);
    }

    @Override
    public void abrirMenu() {
        if(this.getLigando()){
            System.out.println("====== MENU ======");
            System.out.println("Esta ligado?: " + this.getLigando());
            System.out.println("Esta ocando?: " + this.getTocando());
            System.out.print("Volume: " + this.getVolume() + " ");

            for(int i=0; i <= this.getVolume(); i+=10){
                System.out.print("|");
            }
            System.out.println("");
        }else{
            System.out.println("ERROR: Aparelho desligado");
        }
    }

    @Override
    public void fechaMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigando()){
            this.setVolume(this.getVolume() + 5);
        }else{
            System.out.println("ERROR: Aparelho desligado");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigando()) {
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("ERROR: Aparelho desligado");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigando() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigando() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigando() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigando() && this.getTocando()){
            this.setTocando(false);
        }
    }
}

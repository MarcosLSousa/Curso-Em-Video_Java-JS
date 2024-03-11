package aula06;
public class ControleRemoto implements Controlador{
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
//Mét. especiais
    public ControleRemoto() { //Construtor
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() { //Métodos getters e setters estão privados e
        //só poderão ser usados dentro dessa mesma classe
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //Métodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("--------Menu----------");
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 1 ; i <= this.getVolume() ; i += 5)
        {
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado())
        {
            this.setVolume(this.getVolume() + 5);
        }
        else
        {
            System.out.println("TV desligada");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado())
        {
            this.setVolume(this.getVolume() - 5);
        }
        else
        {
            System.out.println("TV desligada");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0)
        {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0)
        {
            this.setVolume(50);//o certo era voltar pro ultimo valor
            //antes de ser mutado mas o prof quis simplificar
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !this.isTocando())
        {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando())
        {
            this.setTocando(false);
        }
    }
    
    
    
}

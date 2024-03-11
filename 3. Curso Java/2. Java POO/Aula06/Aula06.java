package aula06;
public class Aula06 {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto (); // o construtor poderia ter
        //algum parâmetro mas o prof dispensou
        c.ligar();
        //c.volume = 50; (proibido pelo encapsulamento
        c.maisVolume();
        c.maisVolume();
        //c.menosVolume();
        //c.ligarMudo();
        c.play();
        //c.pause();
        c.abrirMenu();
        c.fecharMenu();
    }
    
}

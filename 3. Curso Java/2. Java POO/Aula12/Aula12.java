package aula12;
public class Aula12 {
    public static void main(String[] args) {
        //Animal n = new Animal(); (classe animal é abstrata - devemos trabalhar com suas herdeiras)
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();
        
        /*m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        System.out.println("--------");
        a.locomover();
        System.out.println("--------");
        p.locomover();
        System.out.println("---------");
        r.locomover();
        System.out.println("");*/
        
        c.locomover();
        c.emitirSom();
        System.out.println("------------");
        k.locomover();
        k.emitirSom();
        System.out.println("");
    }
}

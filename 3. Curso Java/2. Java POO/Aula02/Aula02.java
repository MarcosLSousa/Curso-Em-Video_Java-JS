package aula02;
public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        //Atributos:
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        //c1.tampada = false
        //Métodos:
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Bic Cristal";
        c2.cor = "Vermelha";
        c2.ponta = 0.5f;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}

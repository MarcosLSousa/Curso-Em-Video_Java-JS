package aula04;
public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String modelo, float ponta, boolean tampada, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.tampada = tampada;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public String getCor() {
        return cor;
    }
      public void status()
    {
        System.out.println("Sobre a caneta: ");
        //System.out.println("Modelo: " + this.modelo);
        System.out.println("Modelo: " + this.getModelo());
        //System.out.println("Ponta: " + this.ponta);
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor); //prof nao criou met acessores
        // e modificadores por questão de tempo
        System.out.println("Tampada? " + this.tampada);//prof nao criou met acessores
        // e modificadores por questão de tempo
    }
    
}

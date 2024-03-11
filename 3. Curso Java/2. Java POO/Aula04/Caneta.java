package aula04;
public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    public Caneta() // Pra identificar um método construtor, é aquele
            //método que tem o mesmo nome da classe
    {
        this.tampar();
        this.cor = "Azul";
    }
    
    public String getModelo() // nao pode ser void, da incompatibl. Tem que 
            //retornar o mesmo tipo do atributo
    {
        return this.modelo; // return porque é getter
    }
    public void setModelo(String m)// setter envia parâmetro, como não retorna
            //nada, pode ser void
    {
        this.modelo = m; 
    }
    public float getPonta()
    {
        return this.ponta;
    }
    public void setPonta(float p)
    {
        this.ponta = p;
    }
    public void tampar()
    {
        this.tampada = true;
    }
    public void destampar()
    {
        this.tampada = false;
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

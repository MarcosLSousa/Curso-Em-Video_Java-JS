package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status()
    {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);// "this" será autoreferência
        // Quem chamou o status vai ser substituído por this. Prof vai explicar 
        //melhor depois
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
    }
    
    void rabiscar ()
    {
        if (this.tampada == true)
        {
            System.out.println("ERRO! Não pode rabiscar, caneta está tampada.");
        }
            else
            {
                System.out.println("Estou rabiscando");
            }
    }
    void tampar ()
    {
        this.tampada = true; // Como dito anteriormente, "this" vai referenciar
        // o objeto que fez a chamada (nesse caso c1). Acredito, eu, que seja
        // uma maneira de poder generalizar, pois se especificarmos algum objeto
        // talvez os demais não pudessem usar o método ou precisaríamos de mais
        // linha de  cód..
    }
    void destampar()
    {
        this.tampada = false;
    }

}

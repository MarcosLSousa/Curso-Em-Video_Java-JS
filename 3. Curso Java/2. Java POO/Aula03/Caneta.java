package aula02;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada; // MÉTODOS TAMPAR E DESTAMPAR ESTÃO PÚBLICOS, ENTÃO
    // ELES POR ESTAREM DENTRO DA PRÓPRIA CLASSE, PODEM ALTERAR ESSE 
    //ATRIBUTO. MAS O ARQUIVO AULA02, P EX., NÃO PODERIA DIRETAMENTE. MAS POR
    //MEIO DOS MÉTODOS TAMPAR/DEST. ELE PODE ALTERAR.
    
    public void status()
    {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);// "this" será autoreferência
        // Quem chamou o status vai ser substituído por this. Prof vai explicar 
        //melhor depois
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
    }
    
    public void rabiscar ()
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
    public void tampar ()
    {
        this.tampada = true; // Como dito anteriormente, "this" vai referenciar
        // o objeto que fez a chamada (nesse caso c1). Acredito, eu, que seja
        // uma maneira de poder generalizar, pois se especificarmos algum objeto
        // talvez os demais não pudessem usar o método ou precisaríamos de mais
        // linha de  cód..
    }
    public void destampar()
    {
        this.tampada = false;
    }

}

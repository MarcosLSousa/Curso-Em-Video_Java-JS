package aula05;
public class ContaBanco {
   public int numConta;
   protected String tipo;
   private String dono;
   private float saldo;
   private boolean status;
   //Métodos especiais abaixo:
   public void estadoAtual()
   {
       System.out.println("------------------------------");
       System.out.println("Conta: " + this.getNumConta());
       System.out.println("Tipo: " + this.getTipo());
       System.out.println("Dono: " + this.getDono());
       System.out.println("Saldo: " + this.getSaldo());
       System.out.println("Status: " + this.isStatus());
   }
   //public ContaBanco (int saldo, boolean aberta)// pra deixar assim, precisa
   //enviar os parâmetros ContaBanco pessoa1 = new ContaBanco(0,false)
   public ContaBanco ()
           {
               this.saldo = 0;
               //this.setSaldo = 0; 
               this.status = false;
           }
   
   public void abrirConta(String t)
   {
       this.setTipo(t);
       this.setStatus(true);
       if (t == "CC") 
       {
           this.setSaldo(50);
       } 
       else if(t == "CP")
           {
               this.setSaldo(150);
           }
       System.out.println("Conta aberta com sucesso!");
   }
   public void fecharConta()
   {
       if (this.getSaldo() > 0)
       {
           System.out.println("Conta não pode ser fechada, pois há saldo positivo na conta");
       }
       else if (this.getSaldo() < 0)
       {
           System.out.println("Conta não pode ser fechada, pois há saldo negativo");
       }
       else
       {
           System.out.println("Conta fechada com sucesso");
       }
   }
   public void depositar(float v)
   {
       //if (this.status == true)
       if (this.isStatus()) //if == true
       {
           //this.saldo += + v;
           this.setSaldo(this.getSaldo() + v);//getSaldo = saldo atual
           System.out.println("Depósito realizado com sucesso");
       }
       else
       {
           System.out.println("Abra uma conta antes!");
       }
   }
   public void sacar(float v)
   {
       if (this.isStatus())
       {
           if (this.getSaldo() >= v)
           {
               this.setSaldo(this.getSaldo() - v);
               System.out.println("Saldo realizado na conta de " + this.getDono());
           }
           else
           {
               System.out.println("Saldo insuficiente para saque");
           }
       }
        else 
           {
               System.out.println("Abra uma conta antes");
           }
   }
   public void pagarMensal()
   {
   int v = 0;
   if (this.getTipo() == "CC")
   {
       v = 12;
   } 
   else if(this.getTipo() == "CP") 
   {
       v = 20;
   }
   if (this.isStatus())
   {
       this.setSaldo(this.getSaldo() - v);
       System.out.println("Mensalidade paga com sucesso");
   }
   else
   {
       System.out.println("Abra uma conta antes de pagar mensalidade");
   }
   }
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
   
}

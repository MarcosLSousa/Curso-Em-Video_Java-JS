//mesmo programa mas usando o meétodo construtor (no outro arquivo começou o 
//uso dele mas começou a alterar muito a aula e deixar o conteúdo confuso
// Por isso separei a aula

package aula04;
public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", 0.4f, false, "Amarelo"); //Se não colocar
        //os parâmetros vai dar erro pq o método construtor criou:
        // (String m, String c, float p)
        c1.status();
        
        Caneta c2 = new Caneta ("KK", 1.5f, false, "Laranja");
        c2.status();
    } 
}

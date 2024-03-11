/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author Marcos
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Marcos";
        String nome2 = "Marcos";
        String nome3 = new String("Marcos");
        String res;
        //res = (nome1==nome2)?"igual":"diferente";
        //res = (nome1==nome3)?"igual":"diferente";
        res = (nome1.equals(nome3))?"igual":"diferente"; //EQUALS compara
        //conteúdos, então podemos comparar conteúdo de objetos e/ou classes 
        //invólucras com demais conteúdos
        System.out.println(res);
        
    }
    
}

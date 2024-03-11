/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

/**
 *
 * @author Marcos
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3,2,8,7,5,4};
        
        System.out.println("Total de casas de N e: " + n.length);
        
        for(int cont = 0; cont <=n.length-1; cont++)
        {
        System.out.println("Na posicao " + cont + " temos o valor " + n[cont]); 
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador01;

/**
 *
 * @author Marcos
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont = 0;
        while (cont <  10 )
        {
            cont++;
            if (cont == 2 || cont == 3 || cont == 4)
            {
               continue; // ESSE COMANDO MANDA A EXECUÇÃO DO PROGRAMA PARA O 
               // INÍCIO DO LOOP
            }
            if (cont == 9)
            {
                break; // FINALIZA A EXECUÇÃO DO LOOP
            }
            System.out.println("Cambalhota " + cont);
        }
    }
}

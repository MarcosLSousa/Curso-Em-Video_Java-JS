/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao01;

/**
 *
 * @author Marcos
 */
public class TesteFuncao01 {

    //static void soma(int a, int b)
    static int soma(int a, int b)
        {
            int s = a + b;
            
            //System.out.println("A soma e " + s);
            return s;
        }
     
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Comecou o programa (comeca no metodo main)");
        int sm = soma (10,7);
        System.out.println("A soma vale " + sm);
    }
    
}

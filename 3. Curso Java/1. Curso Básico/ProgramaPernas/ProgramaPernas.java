/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec= new Scanner (System.in);
        System.out.println("Quantas pernas?");
        int perna = tec.nextInt();
        String tipo = null;
        System.out.println("Isso é um(a) ");
        switch (perna)
        {
            case 1 -> tipo = "Saci";
            case 2 -> tipo = "Bípede";
            case 3 -> tipo = "Tripé";
            case 4 -> tipo = "Quadrúpede";
            case 5 -> tipo = "Aranha";
            case 6 -> tipo = "ET";                
        }
        System.out.println(tipo);
    }
}

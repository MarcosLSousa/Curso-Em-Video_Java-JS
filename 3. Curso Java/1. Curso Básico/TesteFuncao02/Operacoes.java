/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testefuncao02;

/**
 *
 * @author Marcos
 */
public class Operacoes {
    
    public static String contador (int ini, int fim)
        {
        String s = "";
        for (int cont = ini ; cont <= fim ; cont++)
        {
        s += cont + " ";
        }
        return s;
        }
}

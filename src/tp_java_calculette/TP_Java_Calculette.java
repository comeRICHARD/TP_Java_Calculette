/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 
// Côme RICHARD
// Gpr
// 29\09\01
 */
package tp_java_calculette;

import java.util.Scanner;

/**
 *
 * @author richa
 */
public class TP_Java_Calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operateur;
        int operand1;
        int operand2;
        int result = 0;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the operateur :\n" + "1)add\n" + "2)substract\n" + "3)multiply\n" + "4)divide\n" + "5)modulo");
        System.out.println("\n Entrer le nombre :");
        operateur = sc.nextInt();
        if (operateur > (5) || operateur < 1)
            System.out.print("Erreur de saisie");
            
        
        System.out.println("Choississez un nombre :");
        operand1 = sc.nextInt();
        System.out.println("Choississez un nombre :");
        operand2 = sc.nextInt();
        switch (operateur) {

            case 1:
                result = operand1 + operand2;
                break;
            case 2:
                result = operand1 - operand2;
                break;
            case 3:
                result = operand1 * operand2;
                break;
            case 4:
                result = operand1 / operand2;
                break;
            case 5:
                result = operand1 % operand2;
                break;
            default :
                 
                System.err.println("erreur de saisie");
                break; 
             
        }

        System.out.print(result);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ilha Edição
 */
public class Program {
    
    
    public static void main(String[] args){
        
        // ele vai chamar metodo 
        
        method2();
        // depois escreve mensagem q terminou
        System.out.println("End of program");

    }
    
    
    // metodo 
    public static void method2(){
 
        System.out.println("***** Methodo2 Start *******");
        Scanner sc = new Scanner(System.in);
        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
          
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position");
        }
      
        catch(InputMismatchException e) {
            System.out.println("Input error");   
        }
        sc.close();
        System.out.println("***** Methodo2 End *******")
        
        
    }
    
    
}

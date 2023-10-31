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
        Scanner sc = new Scanner(System.in);
        
        // vetor q vai receber varios com esse split espaço em branco
        
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
        
        System.out.println("End of program");
        
        
        
        
        
        
        sc.close();
    }
    
}

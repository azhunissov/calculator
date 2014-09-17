/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexamples;

import java.util.*;

/**
 *
 * @author Alisher
 */
public class JavaExamples {
    public static int calc(int num1, char s, int num2) {
        if(s == '+') {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        }
        else if(s == '-') {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        }
        else if(s == '*') {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        }
        else if(s == '/' && num2 != 0) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
        else if(num1 != 0 && num2 == 0){
            System.out.println(num1 + " / " + num2 + " = ~infinity");
        }
        else {
            System.out.println(num1 + " / " + num2 + " = indeterminate");
        }
        return 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //define 2 variables number1 and number2
        //create 4 different methods to make calculation
        //"+","-","*","/"
        
        //we will create a user panel to select which calculation
        Scanner reader = new Scanner(System.in);
        int num1, num2;
        boolean ok = true;
                
        while(ok == true) {
            System.out.println("Enter the first number: ");
            num1 = reader.nextInt();
            
            System.out.println("Enter the mathematical sign: (Ex: +, -, *, /)");
            char s = reader.next().charAt(0);
        
            System.out.println("Enter the second number: ");
            num2 = reader.nextInt();
            
            calc(num1, s, num2);    
            
            System.out.println("Would you like to use calculator again? (Y/N)");
            char c = reader.next().charAt(0);
            
            if(c == 'Y' || c == 'y') {
                ok = true;
            }
            else if(c == 'N' || c == 'n') {
                ok = false;
            }
            else {
                System.out.println("Invalid input, Bye Bye!");
            }
        }
    }
    
}

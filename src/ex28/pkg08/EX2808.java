/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex28.pkg08;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EX2808 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1,n2;
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Escreva o número 1: ");
        n1 = leitor.nextInt();
        System.out.print("Escreva o número 2: ");
        n2 = leitor.nextInt();
        
        if(n1 > n2) {
            System.out.println("A ordem é: " + n2 + "," + n1);
           
        } else {
         
           System.out.println("A ordem é: " + n1 + "," + n2);
        }
    


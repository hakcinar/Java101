/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication32;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication32 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 2 * n - 1; k >= (2 * i + 1); k--) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
    
}

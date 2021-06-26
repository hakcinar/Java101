/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("N Adedini Giriniz: ");
        int n = scan.nextInt();
        int maks = 0;
        int min = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println(i + ". sayiyi giriniz: ");
            int sayi = scan.nextInt();

            if (i == 1) {
                maks = sayi;
                min = sayi;
            }

            if (sayi > maks) {
                maks = sayi;
            }

            if (sayi < min) {
                min = sayi;
            }
        }

        System.out.println("En Büyük Sayı: " + maks);
        System.out.println("En Küçük Sayı: " + min);
    }
    
}

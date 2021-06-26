/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Sayıyı Girin: ");
        int sayi = scan.nextInt();
        int toplam = 0;

        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (sayi == toplam) {
            System.out.println(sayi + " Girilen Sayı Mükemmel Sayıdır");
        } else {
            System.out.println(sayi + "Girilen Sayı Mükemmel Sayı Değildir");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sicaklik;

        System.out.println("Sıcaklık Değeri Girin: ");
        sicaklik = scan.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak Yapabilirsiniz.");
        }
        if (sicaklik > 5 && sicaklik < 15) {
            System.out.println("Sinemaya Gidebilirsiniz");
        }
        if (sicaklik > 10 && sicaklik < 25) {
            System.out.println("Piknik Yapabilirsiniz");
        }
        if (sicaklik > 25) {
            System.out.println("Yüzebilirsiniz.");
        }

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication38;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class RecursiveUsHesaplama {

    public static int us(int taban, int usDeger) {
        if (usDeger == 0) {
            return 1;
        } else if (taban == 1) {
            return 1;
        } else {
            return taban * us(taban, usDeger - 1);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Taban Değeri Giriniz: ");
        int taban = scan.nextInt();
        System.out.print("Üs Değeri Giriniz: ");
        int usDeger = scan.nextInt();

        System.out.println("Sonuç = " + us(taban, usDeger));

    }
    
}

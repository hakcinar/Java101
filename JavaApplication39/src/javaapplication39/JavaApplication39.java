/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication39 {

    public static int isAsal(int sayi, int i) {
        if (i == 1) {
            return 1;
        } else {
            if (sayi % i == 0) {
                return 0;
            } else {
                return isAsal(sayi, i - 1);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int sayi = sc.nextInt();
        System.out.println(sayi + " " + (isAsal(sayi, sayi / 2) == 1 ? "Sayısı Asal Sayıdır" : "Sayısı Asal Sayı Değildir"));

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int secim, s1, s2;
        System.out.print("Birinci Sayı: ");
        s1 = scan.nextInt();
        System.out.print("\nİkinci Sayı: ");
        s2 = scan.nextInt();
        System.out.print("\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nSeçiminiz : ");
        secim = scan.nextInt();
        switch (secim) {
            case 1:
                System.out.println("Toplama = " + (s1 + s2));
                break;
            case 2:
                System.out.println("Çıkarma = " + (s1 - s2));
                break;
            case 3:
                System.out.println("Çarpma = " + (s1 * s2));
                break;
            case 4:
                switch (s2) {
                    case 0:
                        System.out.println("Bir Sayı 0'a Bölünemez");
                        break;
                    default:
                        System.out.println("Bölme = " + (s1 / s2));
                        break;
                }
                break;
        }
    }}

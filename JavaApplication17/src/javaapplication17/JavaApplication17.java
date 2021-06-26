/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Doğum Yılınız: ");
        int yil = scan.nextInt();
        yil = yil % 12;
        String zodyag = "";
        switch (yil) {
            case 0:
                zodyag = "Monkey";
                break;
            case 1:
                zodyag = "Horoz";
                break;
            case 2:
                zodyag = "Köpek";
                break;
            case 3:
                zodyag = "Domuz";
                break;
            case 4:
                zodyag = "Fare";
                break;
            case 5:
                zodyag = "Öküz";
                break;
            case 6:
                zodyag = "Kaplan";
                break;
            case 7:
                zodyag = "Tavşan";
                break;
            case 8:
                zodyag = "Ejderha";
                break;
            case 9:
                zodyag = "Yılan";
                break;
            case 10:
                zodyag = "At";
                break;
            case 11:
                zodyag = "Koyun";
                break;
        }
        System.out.println("Çin Zodyağı Burcunuz : " + zodyag);

    }
}

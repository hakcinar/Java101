/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gun, ay;
        String burc = "";

        System.out.println("Ay: ");
        ay = scan.nextInt();

        System.out.println("Gün: ");
        gun = scan.nextInt();

        if (ay == 1) {
            if (gun > 31) {
                System.out.println("En Fazla 31 Gün Var");
            } else if (gun <= 21) {
                burc = "Oğlak";
            } else {
                burc = "Kova";
            }
        } else if (ay == 2) {
            if (gun > 28) {
                System.out.println("En Fazla 28 Gün Var");
            } else if (gun <= 19) {
                burc = "Kova";
            } else {
                burc = "Balık";
            }
        } else if (ay == 3) {
            if (gun > 31) {
                System.out.println("En Fazla 31 Gün Var");
            } else if (gun <= 20) {
                burc = "Balık";
            } else {
                burc = "Koç";
            }
        } else if (ay == 4) {
            if (gun > 31) {
                System.out.println("En Fazla 31 Gün Var");
            } else if (gun <= 20) {
                burc = "Koç";
            } else {
                burc = "Boğa";
            }
        } else if (ay == 5) {
            if (gun > 31) {
                System.out.println("En Fazla 31 Gün Var");
            } else if (gun <= 21) {
                burc = "Boğa";
            } else {
                burc = "İkizler";
            }
        } else if (ay == 6) {
            if (gun > 31) {
                System.out.println("En Fazla 31 Gün Var");
            } else if (gun <= 22) {
                burc = "İkizler";
            } else {
                burc = "Yengeç";
            }
        } else if (ay == 7) {
            if (gun > 31) {
                System.out.println("En Fazla 31 Gün Var");
            } else {
                burc = gun <= 22 ? "Yengeç" : "Aslan";
            }
        } else if (ay == 8) {
            if (gun > 31) {
                System.out.println("En Fazla 31 Gün Var");
            } else {
                burc = gun <= 22 ? "Aslan" : "Başak";
            }
        } else if (ay == 9) {
            if (gun > 31) {
                System.out.println("En Fazla 31 Gün Var");
            } else {
                burc = gun <= 22 ? "Başak" : "Terazi";
            }
        } else if (ay == 10) {
            if (gun > 31) {
                System.out.println("En Fazla 31 Gün Var");
            } else {
                burc = gun <= 22 ? "Terazi" : "Akrep";
            }
        } else if (ay == 11) {
            if (gun > 31) {
                System.out.println("En Fazla 31 Gün Var");
            } else {
                burc = gun <= 21 ? "Akrep" : "Yay";
            }
        } else if (ay == 12) {
            if (gun > 31) {
                System.out.println("En Fazla 31 Gün Var");
            } else {
                burc = gun <= 21 ? "Yay" : "Oğlak";
            }
        }

        System.out.println("Burcunuz: " + burc);

    } // TODO code application logic here
    
}

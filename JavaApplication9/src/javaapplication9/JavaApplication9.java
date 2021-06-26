/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double armut, elma, domates, muz, patlican ;

        System.out.print("Armut kaç kilo: ");
        armut = scan.nextDouble();
        System.out.print("Elma kaç kilo: ");
        elma = scan.nextDouble();
        System.out.print("Domates kaç kilo: ");
        domates = scan.nextDouble();
        System.out.print("Muz kaç kilo: ");
        muz = scan.nextDouble();
        System.out.print("Patlıcan kaç kilo: ");
        patlican = scan.nextDouble();
        double sonuc = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5);
        System.out.println("Toplam Tutar : " + sonuc);
    }
}

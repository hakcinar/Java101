/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int Matematik, Fizik, Türkce, Kimya, Muzik, Sayac = 0, Notlar = 0;

        System.out.println("Matematik Notunuz : ");
        Matematik = scan.nextInt();
        System.out.println("Fizik Notunuz : ");
        Fizik = scan.nextInt();
        System.out.println("Türkçe Notunuz : ");
        Türkce = scan.nextInt();
        System.out.println("Kimya Notunuz : ");
        Kimya = scan.nextInt();
        System.out.println("Müzik Notunuz : ");
        Muzik = scan.nextInt();
        
        if(Matematik >= 0 && Matematik <= 100){
            Notlar += Matematik;
            Sayac++;
        }
        if(Fizik >= 0 && Fizik <= 100){
            Notlar += Fizik;
            Sayac++;
        }
        if(Türkce >= 0 && Türkce <= 100){
            Notlar += Türkce;
            Sayac++;
        }
        if(Kimya >= 0 && Kimya <= 100){
            Notlar += Kimya;
            Sayac++;
        }
        if(Muzik >= 0 && Muzik <= 100){
            Notlar += Muzik;
            Sayac++;
        }
        
        System.out.println((Notlar / Sayac)>=55 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız");
        
    }
}

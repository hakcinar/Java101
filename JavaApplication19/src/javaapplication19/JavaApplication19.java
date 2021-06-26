/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        double toplam=0;
        int sayac=0;
        for (int i = 1; i <= a; i++) {
            if(i%3==0){
            toplam=toplam+i;
            sayac++;
            }
            if(i%4==0&&i%3!=0){
            toplam=toplam+i;
            sayac++;
            }
        }
        double ortalama=toplam/sayac;
        System.out.println("sayıların toplamı:"+toplam);
        System.out.println("sayı adedi"+sayac);
        System.out.println("sayıların ortalaması"+ortalama);
    }
    
}

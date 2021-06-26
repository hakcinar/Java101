/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kdvhesaplama;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class KdvHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double deger;
        double kdvOran=0.18;
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Ürünün Değerini Giriniz");
        deger=scan.nextInt();
         if(deger>1000){
        kdvOran=0.08;
        }
        double kdvDegeri=deger*kdvOran;
        double kdvliDeger=kdvDegeri+deger;
        System.out.println("kdvsiz tutar="+deger);
        System.out.println("kdv oranı="+kdvOran);
        System.out.println("kdvli tutar="+kdvliDeger);
       
    }
    
}

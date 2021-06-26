/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication40;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication40 {

    public static void metotDeseni(int sayi, int tmp, boolean status) {

        if (sayi <= tmp) {
            System.out.println(sayi);
            if (sayi > 0 && !status) {
                metotDeseni(sayi-5,tmp,false);
            }else{
                metotDeseni(sayi+5,tmp,true);
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
        int tmp = sayi;
        metotDeseni(sayi,tmp,false);
    }
    
}

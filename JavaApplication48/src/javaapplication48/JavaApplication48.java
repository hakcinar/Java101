/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication48;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication48 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = scan.nextInt();
        int[] dizi = new int[n];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            dizi[i] = scan.nextInt();
        }
        int tmp = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (dizi[j] < dizi[i]) {
                    tmp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = tmp;
                }
            }
        }
        System.out.print("Sıralama : ");
        for(int i : dizi){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
}

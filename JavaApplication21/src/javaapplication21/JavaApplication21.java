/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a;
        int toplam=0;
        for (int i = 0;; i++) {
            a=scan.nextInt();
            if(a%2!=0){break;}
            if(a%2==0&&a%4==0){
            toplam=toplam+a;
            }
        }
        System.out.println(toplam);
    }
    
}

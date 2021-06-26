/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taksimetre;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class Taksimetre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int km;
        double perkm=2.20;
        int start=10;
        int min=20;
        double total;
        Scanner scan=new Scanner(System.in);
        System.out.println("Mesafe Giriniz");
        km=scan.nextInt();
        total=start+km*perkm;
        if(total<20){
        total=20;
        }
        System.out.println("toplam ücret"+total);
    }
    
}

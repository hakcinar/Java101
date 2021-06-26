/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipotenüshesaplama;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class HipotenüsHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Üçgenin ilk kenarını giriniz");
        int a=scan.nextInt();
        System.out.println("Üçgenin ikinci kenarını giriniz");
        int b=scan.nextInt();
        System.out.println("Üçgenin üçüncü kenarını giriniz");
        int c=scan.nextInt();
        double u=a+b+c/2;
        double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println(alan);
    }
    
}


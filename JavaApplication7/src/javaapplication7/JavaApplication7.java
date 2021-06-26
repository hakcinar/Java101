/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double pi=3.14;
        Scanner scan=new Scanner(System.in);
        System.out.println("Yarıçap Uzunluğunu Giriniz");
        double yariCap=scan.nextDouble();
        System.out.println("Merkez Açısının Ölçüsünü Giriniz");
        double merkezAci=scan.nextDouble();
        double daireDilimi=(pi*(yariCap*yariCap)*merkezAci);
        System.out.println(daireDilimi);
    }
    
}

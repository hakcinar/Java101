/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication44;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication44 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        int i, n;
        int dizi[] = {3, 5, 6, 7, 5};
        double ort = 0;

        for (i = 0; i < dizi.length; i++) {
            ort = ort + (1.0 / dizi[i]);
        }
        ort = dizi.length / ort;
        System.out.println("Harmonik Ortalama : " + ort);
    }

}
    


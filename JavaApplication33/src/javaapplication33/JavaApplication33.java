/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication33 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {

        for (int sayi = 2; sayi <= 100; sayi++) {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    kontrol = 1;
                    break;
                }
            }

            if (kontrol == 0) {
                System.out.print(sayi + "\n");
            }
        }
    }
}

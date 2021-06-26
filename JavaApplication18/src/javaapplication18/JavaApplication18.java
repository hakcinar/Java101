/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Yıl Giriniz : ");
        int yil = scan.nextInt();

        if (yil % 400 == 0 || yil % 4 == 0) {
            if (yil % 100 != 0) {
                System.out.println(yil + " Bir Artık Yıldır !");
            }
        } else {
            System.out.println(yil + " Bir Artık Yıl Değildir !");
        }
    }
    
}

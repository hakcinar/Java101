/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int s1, s2, s3;

        System.out.println("s1 : ");
        s1 = scan.nextInt();
        System.out.println("s2 : ");
        s2 = scan.nextInt();
        System.out.println("s3 : ");
        s3 = scan.nextInt();

        if (s1 > s2 && s1 > s3) {
            if (s2 > s3) {
                System.out.println(s1 + " " + s2 + " " + s3);
            } else {
                System.out.println(s1 + " " + s3 + " " + s2);
            }
        } else if (s2 > s1 && s2 > s3) {
            if (s1 > s3) {
                System.out.println(s2 + " " + s1 + " " + s3);
            } else {
                System.out.println(s2 + " " + s3 + " " + s1);
            }
        } else {
            if (s1 > s2) {
                System.out.println(s3 + " " + s1 + " " + s2);
            } else {
                System.out.println(s3 + " " + s2 + " " + s1);
            }
        }

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n1 = 0, n2 = 1, n3, i, n;
        System.out.print("N Sayısını Girin:");
        n = scan.nextInt();
        System.out.print(n1 + " " + n2);

        for (i = 2; i <= n; ++i)
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
    
}

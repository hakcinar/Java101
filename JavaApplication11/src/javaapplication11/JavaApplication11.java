/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author Akcinar Ailesi
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userName, password, newPassword;
        int secim;
        
        System.out.print("Kullanıcı Adınız : ");
        userName = scan.next();
        System.out.print("\nŞifreniz : ");
        password = scan.next();
        
        if (!(userName.equals("admin") && password.equals("admin"))) {
            System.out.print("\nŞifrenizi sıfırlamak için 1 tuşuna basın : ");
            secim = scan.nextInt();
            if (secim == 1) {
                System.out.print("\nYeni Şifrenizi Giriniz : ");
                newPassword = scan.next();
                if (newPassword.equals("admin") || newPassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                }else{
                    System.out.println("Şifre oluşturuldu");
                }
            }
        }else{
            System.out.println("Giriş Başarılı!");
        }
        
    }
}

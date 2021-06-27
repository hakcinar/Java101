/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication42;

import java.util.Random;

/**
 *
 * @author Akcinar Ailesi
 */
public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    boolean start;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
        
    }
    public void whoStarts(Fighter f1,Fighter f2,boolean a){
    Random rd=new Random();
    a=rd.nextBoolean();
    if(a==true){
        System.out.println("Fighter 1 starts");
    }
    else{System.out.println("Fighter 2 starts");}
    }
    

    public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " +  this.damage + " hasar vurdu.");

        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }

        if (foe.health - this.damage < 0)
            return 0;

        return foe.health - this.damage;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }
}

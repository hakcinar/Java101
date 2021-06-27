/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarycalc;

/**
 *
 * @author Akcinar Ailesi
 */
public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
public Employee(String name,int salary,int workHours,int hireYear){
this.hireYear=hireYear;
this.workHours=workHours;
this.salary=salary;
this.name=name;
}
public double tax(){    
    double tax;
   if(this.salary>1000){
       tax=this.salary*0.03;
   }
   else{tax=0;
   }
   return tax;
}
public double bonus(){
return this.workHours*30;
}
    public double raiseSalary(){
        int tmp = 2021 - this.hireYear;
        double zam = 0;
        if (tmp < 10) {
            zam = this.salary * 0.05;
        }else if(tmp > 9 && tmp < 20){
            zam = this.salary * 0.10;
        }else if(tmp > 19){
            zam = this.salary * 0.15;
        }
        return zam;
    }
      @Override
    public String toString(){
       return "ADI:"+this.name+"Maaşı:"+this.salary+"Çalışma saati:"+this.workHours+"Başlangıç Yılı"+this.hireYear+"Vergi:"+this.tax()+"Bonus:"+this.bonus()+"Maaş Artışı:"+this.raiseSalary()+"TOPLAM Maaş:"+(this.salary - this.tax() + this.bonus() + "\nToplam Maaş : " + (this.salary +  this.raiseSalary()));
    }
}

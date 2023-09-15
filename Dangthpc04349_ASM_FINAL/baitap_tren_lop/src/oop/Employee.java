/*

 */
package oop;

import java.util.Scanner;

/**
 * @author dangthpc04349
 */
public class Employee {
    public String name;
    public double salary;
    //nhap
    public void inp(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        this.name = in.nextLine();
        System.out.println("Nhap so luong: ");
        this.salary = in.nextDouble();
    }
    public void setInfo(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public double incomeTax() {
        if(this.salary<5000000)
            return 0;
        return (this.salary - 5000000) *10/100;
    }
    //xuat
    public void out(){
        System.out.println("----------------------");
        System.out.println("Ten NV: "+this.name);
        System.out.println("Luong: "+this.salary);
        System.out.println("Thue: "+incomeTax());
    }
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.inp();
        employee.out();
    }
}

/*
8. Nhập vào 3 số nguyên dương. Kiểm tra xem 3 số đó có lập thành tam giác không? 
Nếu có hãy cho biết tam giác đó thuộc loại nào? (Cân, vuông, đều, …).
 */
package bai_tap_them;

/**
 *
 * @author dangt
 */
import java.util.*;
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Nhap canh a: ");
        a=sc.nextInt();
        System.out.print("Nhap canh b: ");
        b=sc.nextInt();
        System.out.print("Nhap canh c: ");
        c=sc.nextInt();
        if(a<0)System.out.println("Canh a da sai!");
        else if(b<0)System.out.println("Canh b da sai!");
        else if(c<0)System.out.println("Canh c da sai!");
        else {
            if(a+b>c && a+c>b && b+c>a){
                if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a)System.out.println("La tam giac vuong!");
                else if(a==b && a==c && b==c)System.out.println("La tam giac deu!");
                else if(a==b || a==c || b==c)System.out.println("La tam giac can!");
                else if(a*a+b*b==c*c &&(a==b || a==c || b==c) || a*a+c*c==b*b &&(a==b || a==c || b==c) || b*b+c*c==a*a &&(a==b || a==c || b==c))
                    System.out.println("La tam giac vuong can!");
                else System.out.println("La tam giac thuong!");
            }else System.out.println("Khong la tam giac!");
        }   
    }
}
/*
4. Nhập vào giờ, phút, giây. Kiểm tra xem giờ, phút, giây đó có hợp lệ hay không? 
In kết quả ra màn hình.
 */
package bai_tap_them;

/**
 *
 * @author dangthpc04349
 */
import java.util.*;
public class Bai4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        System.out.print("Nhap vao gio: ");
        a=in.nextInt();
        System.out.print("Nhap vao phut: ");
        b=in.nextInt();
        System.out.print("Nhap vao giay: ");
        c=in.nextInt();
        //bắt đầu kiểm tra
        if(a<0 || a>24)System.out.println("Ban da nhap sai gio! ");
        else if(b<0 || b>60)System.out.println("Ban da nhap sai phut! ");
        else if(c<0 || c>60)System.out.println("Ban da nhap sai giay! ");
        else {
            System.out.println("Nhap hop le!");
            System.out.printf("\t\t%dh:%d':%ds\n",a,b,c);
        }
    }
}

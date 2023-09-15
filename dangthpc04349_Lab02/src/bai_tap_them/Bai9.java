/*
9. Viết chương trình nhập vào số nguyên dương n. 
    Kiểm tra xem n có phải là số chính phương hay không? 
(số chính phương là số khi lấy căn bặc 2 có kết quả là nguyên).
 */
package bai_tap_them;

/**
 * @author dangthpc04349
 */
import java.util.*;
public class Bai9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Nhap vao so can kiem tra: ");
        n=in.nextInt();
        if(n<0)System.out.println("Vui long nhap so nguyen duong!");
        else {
            if(Math.sqrt(n)==(int)Math.sqrt(n))System.out.println(n + " la so chinh phuong!");
            else System.out.println(n + " khong la so chinh phuong!");
        }
    }
}

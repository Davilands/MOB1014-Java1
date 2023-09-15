/*
1. Nhập vào hai số nguyên a, b. In ra màn hình giá trị lớn nhất.
2. Cho ba số a, b, c đọc vào từ bàn phím. Hãy tìm giá trị lớn nhất của ba số trên và in ra kết quả.
 */
package bai_tap_them;

/**
 *
 * @author dangthpc04349
 */
import java.util.*;
public class Bai1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.print("Nhap a: ");
        a=in.nextInt();
        System.out.print("Nhap b: ");
        b=in.nextInt();
        int max=a>b?a:b;
        System.out.println("Gia tri lon nhat giua " + a + " va " + b + " la: " + max);
    }
}

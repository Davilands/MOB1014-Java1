/*
3. Cho ba số a, b, c đọc vào từ bàn phím. Hãy in ra màn hình theo thứ tự tăng dần các số. 
(Chỉ được dùng thêm hai biến phụ).
*/
package bai_tap_them;

/**
 *
 * @author dangthpc04349
 */
import java.util.*;
public class Bai3 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Nhap a: ");
    int a=in.nextInt();
    System.out.print("Nhap b: ");
    int b=in.nextInt();
    System.out.print("Nhap c: ");
    int c=in.nextInt();
    int max,min;
        if (b>c){   //tìm max và min của b và c
            max=b;
            min=c;
        }
        else{
            max=c;
            min=b;
        }
        if(a>max)  // bắt đầu xuất tăng dần
            System.out.printf("%d, %d, %d \n", min, max, a);
        else {
            if(a>min)
                System.out.printf("%d, %d, %d \n", min, a, max);
            else
                System.out.printf("%d, %d, %d \n", a, min, max);
        }
    }
}

/*
7. Viết chương trình tính tiền cước TAXI. Biết rằng:
km đầu tiên là 13000đ.
Mỗi km tiếp theo là 12000đ.
Nếu lớn hơn 30km thì mỗi km thêm sẽ là 11000đ.
Hãy nhập số km sau đó in ra số tiền phải trả.
 */
package bai_tap_them;

/**
 *
 * @author dangthpc04349
 */
import java.util.*;
public class Bai7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b;
        System.out.print("Nhap vao so km: ");
        a=in.nextInt();
        if(a>0){
            if(a==1)System.out.println("Tien: 13000 VND");
            else if(a>1 && a<=30)System.out.println("Tien: "+(13000+29*120000)+" VND");
            else {
                b=a-30;
                System.out.println("Tien: "+(13000+29*12000+b*11000)+" VND");
            }
        }else System.out.println("Vui long nhap km lon hon 0!");   
    }
}

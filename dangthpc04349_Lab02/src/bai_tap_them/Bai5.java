/*
5. Viết chương trình nhập vào ngày, tháng, năm hợp lệ. Cho biết năm này có phải là năm nhuận hay không? In kết quả ra màn hình.
 */
package bai_tap_them;

/**
 *
 * @author dangthpc04349
 */
import java.util.*;
public class Bai5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        System.out.print("Nhap ngay: ");
        a=in.nextInt();
        System.out.print("Nhap thang: ");
        b=in.nextInt();
        System.out.print("Nhap nam: ");
        c=in.nextInt();
        //kiểm tra xem người dùng nhập đúng hay không
        boolean check=true;
        if (b==2) {
           if (c%4==0 && a>29) 
               check=false;
           else if(c%4!=0 && a>28)
               check=false;
        }
        else if (b==4||b==6||b==9||b==11) {
            if (a>30)
                check = false;
        }
        else {
            if (a>31) 
                check = false;
        }
        if (check==false) {
            System.out.println("Ban da nhap sai du lieu, Vui long nhap lai!");
        }
        else {
            System.out.printf("%d/%d/%d",a,b,c);
            if(c%400==0 || ( c%4==0 && c%100!=0))System.out.println(" - la nam nhuan");
            else System.out.println(" - khong la nam nhuan");
        }
    }
}
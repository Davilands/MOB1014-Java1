/*
6. Viết chương trình tính diện tích và chu vi các hình: tam giác, hình vuông, hình chữ nhật và hình tròn với những thông tin cần được nhập từ bàn phím. 
(Lưu ý: sử dụng cấu trúc switch....case để thực hiện sự lựa chọn các hình thực hiện biên dịch chương trình)..
 */
package bai_tap_them;

/**
 *
 * @author dangthpc04349
 */
import java.util.*;
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choose,a,b,c;
        final double n=3.14;
    do{
        System.out.println("----------MENU----------");
        System.out.println("1.Dien tich, chu vi hinh chu nhat");
        System.out.println("2.Dien tich, chu vi hinh vuong");
        System.out.println("3.Dien tich, chu vi hinh tam giac");
        System.out.println("4.Dien tich, chu vi hinh tron");
        System.out.println("0.Thoat khoi chuong trinh");
        System.out.print("Nhap lua chon cua ban: ");
        choose=sc.nextInt();
        System.out.println("------------------------");
        switch(choose){
            case 1:
                System.out.println("Dien tich hinh chu nhat");
                System.out.print("Nhap chieu dai: ");
                a=sc.nextInt();
                System.out.print("Nhap chieu rong: ");
                b=sc.nextInt();
                System.out.println("Dien tich hinh chu nhat: "+a*b);
                System.out.println("Chu vi hinh chu nhat: "+(a+b*2));
                break;
            case 2:
                System.out.println("Dien tich hinh vuong");
                System.out.print("Nhap vao canh: ");
                a=sc.nextInt();
                System.out.println("Dien tich hinh vuong: "+a*a);
                System.out.println("Chu vi hinh vuong: "+(4*a));
                break;
            case 3:
                System.out.println("Dien tich hinh tam giac");
                System.out.print("Nhap chieu dai canh thu nhat: ");
                a=sc.nextInt();
                System.out.print("Nhap chieu dai canh thu hai: ");
                b=sc.nextInt();
                System.out.print("Nhap chieu dai canh thu ba: ");
                c=sc.nextInt();
                int p=a+b+c;
                double s = Math.sqrt(p * (p - a) * (p - b) * ( p - c)); 
                System.out.println("Dien tich tam giac: "+s);
                System.out.println("Chu vi Hinh tam giac: "+p);
                break;
            case 4:
                System.out.println("Dien tich hinh tron");
                System.out.print("Nhap ban kinh: ");
                a=sc.nextInt();
                System.out.println("Dien tich hinh tron: "+a*a*n);
                System.out.println("Chu vi hinh tron: "+(2*a*3.14));
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Vui long nhap lua chon dung!");
        }                
    }while(true);
    }
}

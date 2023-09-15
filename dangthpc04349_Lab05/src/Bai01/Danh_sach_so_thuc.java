package Bai01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author dangthpc04349
 */
public class Danh_sach_so_thuc {
    private ArrayList <Double> arrL = new ArrayList <Double> ();
    
    public void nhap() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập danh sách số thực! ");
        double x;
        String chose;
        while (true) {
            System.out.print("Mời bạn nhập dữ liệu: ");
            x = in.nextDouble();
            arrL.add(x);
            in.nextLine();
            System.out.println("\tBạn có muốn nhập tiếp không? (Y/N)");
            System.out.print("Lựa chọn bạn là: ");  
            //chose = in.nextLine();
            if (in.nextLine().equalsIgnoreCase("N"))
                break;
        }
    }
    
    public void xuat() {
        System.out.println("\n-----------------------");
        System.out.print("Danh sách vừa nhập là: ");
        double tong = 0;
        for (Double i : arrL) {
            System.out.print(i + "\t");
        }
    }
    
    public void tong() {
        double tong = 0;
        for (Double i : arrL) {
            tong+=i;
        }
        //System.out.println("\n-----------------------");
        System.out.println("\nTổng: " + tong);
    }
}

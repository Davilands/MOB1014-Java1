package Bai03;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.*;
/**
 * @author dangthpc04349
 */
public class Danh_sach_san_pham {
    
    private ArrayList <San_pham> arrL = new ArrayList <San_pham> ();
    
    public void nhap() {
        Scanner in = new Scanner(System.in);
        String name;
        int i = 0;
        System.out.println("\tNhập danh sách sản phẩm! ");
        while (true) {
            i++;
            System.out.printf("Nhập tên sản phẩm thứ %d: ",i);
            name = in.nextLine();
            //arrL.add(name);
            //in.nextLine();
            System.out.print("Nhập giá: ");
            double gia = in.nextDouble();
            arrL.add(new San_pham(name,gia));
            in.nextLine();
            System.out.println("\tBạn có muốn nhập tiếp không? (Y/N)");
            System.out.print("Lựa chọn bạn là: ");  
            //chose = in.nextLine();
            if (in.nextLine().equalsIgnoreCase("N"))
                break;
        }
    }
    
    public void xuat () {
        int d=0;
        System.out.println("--------------------");
        System.out.println("Danh sách sản phẩm!");
        System.out.println("Tên - Giá");
        for( San_pham i:arrL) {
            d++;
            System.out.println(d + ": " + i.getName() + " - " + i.getGia());
        }
    }
    
//    public void sap_xep() {
//        Comparator<San_pham> comp = new Comparator<San_pham>(){
//            @Override
//            public int compare(San_pham o1, San_pham o2) {
//                return Double.compare(o1.getGia(), o2.getGia());
//            }
//        };
//        Collections.sort(arrL, comp);
//        xuat();
//    }
    
    public void sap_xep(){
        Collections.sort(arrL, (a,b)-> (int) (b.getGia()-a.getGia()));
        xuat();
    }
    
    public void xoa() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm muốn xóa: ");
        String name = in.nextLine();
        
    }
    
    public void tim_xoa(){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        String ten=in.nextLine();
        San_pham n = null;
        for(San_pham sp:arrL){
            if(sp.getName().equals(ten)){
                n=sp;
            }
        }
        if(n!=null){
            arrL.remove(n);
            xuat();
        }
        else System.out.println("Không tìm thấy sản phẩm cần xóa!");
    }
    
    public void xuat_tb() {
        double tb = 0;
        for(San_pham sp:arrL) {    
            tb += sp.getGia();
        }
        System.out.println("Trung bình các sản phẩm là: " + tb/arrL.size());
    }
    
    public void menu() {
        Scanner in = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("\t\t\t\tMENU CHUONG TRINH");
            System.out.println("\t\t+--------------------------------------------------+");
            System.out.println("\t\t|    Nhập 1: Nhập danh sách sản phẩm               |");
            System.out.println("\t\t|    Nhập 2: Hiển thị danh sách giảm dần theo giá  |");
            System.out.println("\t\t|    Nhập 3: Tìm và xóa sản phầm theo tên          |");
            System.out.println("\t\t|    Nhập 4: Xuất giá trung bình các sản phẩm      |");
            System.out.println("\t\t|    Nhập 0: Thoát khỏi MENU                       |");
            System.out.println("\t\t+--------------------------------------------------+");
            System.out.print("Lựa chọn của bạn là: ");
            chon = in.nextInt();
            switch (chon) {
                case 0:
                    break;
                case 1:
                    nhap();
                    break;
                case 2: 
                    sap_xep();
                    break;
                case 3:
                    tim_xoa();
                    break;
                case 4:
                    xuat_tb();
                    break;
                default: 
                    System.out.println("Mời bạn nhập từ 0 -> 4");
            }
        }while(chon !=0);
    }
    
}

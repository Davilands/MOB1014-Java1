
package Bai02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author dangthpc04349
 */
public class Danh_sach_ho_ten {
    
    private ArrayList <String> arrL = new ArrayList <String> ();
    
    public void nhap() {
        Scanner in = new Scanner(System.in);
        String name;
        System.out.println("\tNhập danh sách họ tên! ");
        while (true) {
            System.out.print("Nhập họ tên: ");
            name = in.nextLine();
            arrL.add(name);
            //in.nextLine();
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
        for( String i:arrL) {
            d++;
            System.out.println(d + ": " + i);
            
        }
    }
    
    public void rand() {
        Collections.shuffle(arrL);
        xuat();
    }
    
    public void sap_xep() {
        Collections.sort(arrL);
        Collections.reverse(arrL);
        xuat();
    }
    
    public void xoa() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào tên cần xóa: ");
        String ten = in.nextLine();
        for(String i:arrL) {
            if (i.equalsIgnoreCase(ten)) {
                arrL.remove(i);
                System.out.println("Xóa họ tên thành công!");
                break;
            }
        }
        
    }
    
    public void menu() {
        Scanner in = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("\t\t\t\tMENU CHUONG TRINH");
            System.out.println("\t\t+--------------------------------------------+");
            System.out.println("\t\t|    Nhập 1: Nhập danh sách họ tên           |");
            System.out.println("\t\t|    Nhập 2: Hiển thị danh sách họ tên       |");
            System.out.println("\t\t|    Nhập 3: Hiển thị danh sách ngẫu nhiên   |");
            System.out.println("\t\t|    Nhập 4: Sắp xếp giảm dần                |");
            System.out.println("\t\t|    Nhập 5: Tìm và xóa họ tên               |");
            System.out.println("\t\t|    Nhập 0: Thoát khỏi MENU                 |");
            System.out.println("\t\t+--------------------------------------------+");
            System.out.print("Lựa chọn của bạn là: ");
            chon = in.nextInt();
            switch (chon) {
                case 0:
                    break;
                case 1:
                    nhap();
                    break;
                case 2: 
                    xuat();
                    break;
                case 3:
                    rand();
                    break;
                case 4:
                    sap_xep();
                    break;
                case 5:
                    xoa();
            }
        }while(chon !=0);
    }
}

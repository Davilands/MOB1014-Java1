package dangthpc04349_lab01;

/*
    Nhập các cột điểm Java1, JavaScript, TA1.2, 
        Tính điểm TB (TA hệ số 2)
 */
import java.util.*;
public class Bai5_Lab01 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("\tCHUONG TRINH NHAP VAO DIEM SINH VIEN");
    System.out.print("Nhap diem Java 1: ");
        double java=in.nextDouble();
    System.out.print("NHap diem JavaScript: ");
    double js=in.nextDouble();
    System.out.print("Nhap diem Tieng Anh 1.1: ");
    double ta=in.nextDouble();
     //tinh diem trung binh
     double dtb=(java + js + ta*2) / 4;
     System.out.println("Diem trung binh cua sinh vien la: "+dtb);
    }
}

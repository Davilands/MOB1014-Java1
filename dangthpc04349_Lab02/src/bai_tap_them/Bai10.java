/*
10. Ví dụ cơ bản về lệnh IF        Nhập vào điểm của một sinh viên (0<=điểm<=10)
        Xuất ra màn hình xếp loại học lực của sinh viên, biết rằng:
               - Nếu điểm>=9 => xếp loại "xuất sắc"
               - Nếu điểm>=8 => xếp loại "giỏi"
               - Nếu điểm>=7 => xếp loại "khá"
               - Nếu điểm>=5 => xếp loại "trung bình"
               - Ngược lại => xếp loại "yếu"
 */

package bai_tap_them;

/**
 *
 * @author dangthpc04349
 */
import java.util.*;
public class Bai10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float a;
        System.out.print("Nhap vao diem: ");
        a=in.nextFloat();
        if(a<0 || a>10)System.out.println("Vui long nhap diem trong doan va [0;10]!");
        else {
            System.out.println("Diem: "+a);
            System.out.print("Xep loai: ");
            if(a>=9)System.out.println("Xuat sac!");
            else if(a>=8)System.out.println("Gioi!");
            else if(a>=7)System.out.println("Kha!");
            else if(a>5)System.out.println("Trung binh!");
            else System.out.println("Yeu!");
        }
    }
}

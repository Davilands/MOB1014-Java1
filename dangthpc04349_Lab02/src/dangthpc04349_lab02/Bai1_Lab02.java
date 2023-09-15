/*
giải phương trình bậc nhất
 */
package dangthpc04349_lab02;

/**
 *
 * @author dangthpc04349
 */
import java.util.*;
public class Bai1_Lab02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("CHUONG TRINH GIAI PHUONG TRINH BAC NHAT!");
        System.out.println("\t\tAx + B = 0");
        try {
        System.out.print("Nhap vao he so a: ");
        float a = in.nextFloat();
        System.out.print("Nhap vao he so b: ");
        float b = in.nextFloat();
        
        if (a == 0) {
            if (b == 0)
                System.out.println("Phuong trinh co vo so nghiem!");
            else
                System.out.println("Phuong trinh vo nghiem!");
        } else {
            float x = -b / a;
            System.out.printf("Phuong trinh co nghiem: \n\tx = %.2f \n", x);
        }
        }catch (Exception e) {
            System.out.println("Vui long nhap so!");
        }
    }    
}

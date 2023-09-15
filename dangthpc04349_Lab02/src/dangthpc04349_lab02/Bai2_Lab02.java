/*
Giải phương trình bậc hai
*/
package dangthpc04349_lab02;

/**
 *
 * @author dangthpc04349
 */
import java.util.*;
public class Bai2_Lab02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("CHUONG TRINH GIAI PHUONG TRINH BAC HAI!");
        System.out.println("\t\tAx^2 + Bx + C = 0\n");
        try {
        System.out.print("\tNhap vao he so a: ");
        Double a = in.nextDouble();
        System.out.print("\tNhap vao he so b: ");
        Double b = in.nextDouble();
        System.out.print("\tNhap vao he so c: ");
        Double c = in.nextDouble();
        solve_the_equation_2(a, b, c);
        }catch (Exception e) {
            System.out.println("Vui long nhap so!");
        }
    }
    
    public static void solve_the_equation_1(Double a, Double b) {   
    //phương thức giải phương trình bậc nhất
        if (a == 0) {
            if (b == 0)
                System.out.println("Phuong trinh co vo so nghiem!");
            else
                System.out.println("Phuong trinh vo nghiem!");
        } else {
            Double x = -b / a;
            System.out.printf("Phuong trinh co nghiem: \n\tx = %.2f", x);
        }
    }

    public static void solve_the_equation_2(Double a, Double b, Double c) {
    //phương thức giải phương trình bậc hai
        if (a != 0) {
            Double delta = Math.pow(b, 2) - 4 * a * c;      //tính delta
            //tiến hành biện luận DELTA
            if (delta < 0)
                System.out.println("Phuong trinh vo nghiem!");
            else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: \n\t\tx1 va x2 = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co hai nghiem phan biet: ");
                System.out.printf("\t\tx1 = %.2f\n\t\tx2 = %.2f", x1, x2);
            }
        } else
            solve_the_equation_1(b, c); //gọi lại phuoeng thức giải ptbn nếu a=0
    }

}

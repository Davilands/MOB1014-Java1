package dangthpc04349_lab01;

import java.util.*;

public class Phuong_Trinh_Bac_Hai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("CHUONG TRINH GIAI PHUONG TRINH BAC HAI!");
        System.out.println("\t\tAx^2 + Bx + C = 0\n");
        System.out.print("\tNhap vao he so a: ");
        Double a = in.nextDouble();
        System.out.print("\tNhap vao he so b: ");
        Double b = in.nextDouble();
        System.out.print("\tNhap vao he so c: ");
        Double c = in.nextDouble();
        solve_the_equation_2(a, b, c);
    }
    //Phương thức giải PT bậc 1
    public static void solve_the_equation_1(Double a, Double b) {
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
    //phương thức giải ptb2
    public static void solve_the_equation_2(Double a, Double b, Double c) {
        if (a != 0) {
            Double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0)
                System.out.println("Phuong trinh vo nghiem!");
            else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: \n\t\tx1 va x2 = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co hai nghiem phan biet: ");
                System.out.printf("\t\tx1 = %.2f\n\t\tx2 = %.2f \n", x1, x2);
            }
        } else
            solve_the_equation_1(b, c);
    }
}
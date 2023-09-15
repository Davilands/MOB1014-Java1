package dangthpc04349_lab01;
/*
            Dangthpc04349_Lab01_Bai3
Tính thể tích khối lập phương với chiều dài cạnh nhập từ bàn phím
        V = cạnh ^ 3
*/
import java.util.*;

public class Bai3_Lab01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double side;
        System.out.println("CHUONG TRINH TINH THE TICH KHOI LAP PHUONG!");
        do {
            System.out.print("Nhap vao chieu dai canh cua khoi lap phuong (cm): ");
            side = in.nextDouble();
            if (side < 0)
                System.out.println("\t\tERROR\nVui long nhap lai chieu dai duong!");
        } while (side < 0);
        // tinh the tich
        double v = Math.pow(side, 3);
        // double v = side*slide*slide;
        System.out.println("The tich khoi lap phuong: \n\tV = " + v + " cm^3");
    }
}

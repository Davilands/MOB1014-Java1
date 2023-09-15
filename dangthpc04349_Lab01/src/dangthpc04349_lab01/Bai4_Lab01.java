package dangthpc04349_lab01;
/*
            Dangthpc04349_Lab01_Bai4
Tính DELTA và căn bậc hai DELTA với hệ số a,b,c của PTB2 nhập từ bàn phím
*/
import java.util.*;

public class Bai4_Lab01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\tCHUONG TRINH TINH DELTA VA CAN BAC HAI CUA DELTA!");
        System.out.print("Nhap vao he so a: ");
        Double a = in.nextDouble();
        System.out.print("Nhap vao he so b: ");
        Double b = in.nextDouble();
        System.out.print("Nhap vao he so c: ");
        Double c = in.nextDouble();
        Double delta = Math.pow(b, 2) - 4 * a * c;
        Double square_root = 0.0;
        //
        System.out.println("1. Gia tri cua Delta: \n\tDelta = " + delta);
        if (delta >= 0)
            // nếu delta > 0 thì tính căn bậc 2 (căn bậc hai không tồn
            // tại số âm)
            square_root = Math.sqrt(delta);
        System.out.println("2. Gia tri can bac hai cua Delta: ");
        if (delta >= 0)
            System.out.println("\tSquare root of Delta: " + square_root);
        else
            System.out.println("\tGia tri Delta am nen khong the tinh can bac hai!");
        
    }
}
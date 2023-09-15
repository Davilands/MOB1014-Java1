package dangthpc04349_lab01;
/*
        Dangthpc04349_Lab01_Bai2
Tính diện tích, chu vi và cạnh nhỏ nhất của HCN với 2 cạnh nhập từ bàn phím 
*/

import java.util.*;

public class Bai2_Lab01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double rectangle_length;    //chieu dai HCN
        Double rectangle_width;     //chieu rong HCN
        System.out.println("\tCHUONG TRINH NHAP VAO THONG SO HINH CHU NHAT");
        // nhap chieu dai
        do {
            System.out.print("Nhap vao chieu dai cua Hinh chu nhat (cm): ");
            rectangle_length = in.nextDouble();
            if (rectangle_length < 0)
                System.out.println("\t\tERROR\nVui long nhap lai chieu dai duong!");
        } while (rectangle_length < 0);
        // nhap chieu rong
        do {
            System.out.print("Nhap vao chieu rong cua Hinh chu nhat (cm): ");
            rectangle_width = in.nextDouble();
            if (rectangle_width < 0)
                System.out.println("\t\tERROR\nVui long nhap lai chieu rong duong!");
        } while (rectangle_width < 0);
        // tinh chu vi HCN
        Double c = (rectangle_length + rectangle_width) * 2;                    //chu vi HCN = (dài + rộng)*2
        Double s = rectangle_length * rectangle_width;                          //diện tích HCN = (dài * rộng)
        Double smallest_side = Math.min(rectangle_length, rectangle_width);     //cạnh nhỏ nhất
        // xuat ket qua ra man hinh
        System.out.printf("1.Chu vi HCN :\n\tc = %.1f cm\n",c);
        System.out.println("2.Dien tich HCN : \n\ts = " + s + " cm^2");
        System.out.println("3.Canh be nhat : \n\tcanh nho nhat = " + smallest_side + " cm");
    }
}
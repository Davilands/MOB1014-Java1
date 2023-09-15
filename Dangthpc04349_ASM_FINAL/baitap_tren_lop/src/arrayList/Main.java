
package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Double> arrL = new ArrayList <Double> ();
         double x;
        while (true) {
            System.out.println("Mời bạn nhập dữ liệu: ");
            x = in.nextDouble();
            arrL.add(x);
            System.out.println("Bạn có muốn nhập tiếp không? (1.Có & 0.Không)");
            int chose = in.nextInt();
            if (chose == 0) 
                break;
        }
        double tong = 0;
        System.out.println(arrL);
        for (int i=0; i<arrL.size(); i++) {
            double tam = arrL.get(i);
            tong += tam;
        }
        System.out.println("-----------------------");
        System.out.println("\nTổng: " + tong);
    }
    
    
}

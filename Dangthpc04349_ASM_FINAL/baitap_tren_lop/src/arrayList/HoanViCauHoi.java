package arrayList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 * @author dangt
 */
public class HoanViCauHoi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <String> arrL = new ArrayList <String> ();
        int i = 1;
        while (i<=5) {
            System.out.printf("Nhập câu hỏi %d: ",i);
            String qs = in.nextLine();
            arrL.add(qs);
            i++;
        }
        System.out.println(arrL);
        Collections.shuffle(arrL);
        for (String ch: arrL) {
            System.out.println(ch);
        }
    }
}

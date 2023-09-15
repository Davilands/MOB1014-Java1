/*
 *  Viết chương trình nhập vào kí tự cần kiểm tra, xuất ra màn hình kí tự đó thuộc nguyên âm hay phụ âm. 
*/
package bai_tap_them;
/**
 * @author dangthpc04349
 */
import java.util.*;
public class bai1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào ký tự cần kiểm tra: ");
        char ch = in.next().charAt(0);
        //chuyển ký tự về chữ cái thường
        if (ch>='A' && ch<='Z') {
            ch+=32;
        }
        System.out.println("ket qua: "+ch);   
    }
}

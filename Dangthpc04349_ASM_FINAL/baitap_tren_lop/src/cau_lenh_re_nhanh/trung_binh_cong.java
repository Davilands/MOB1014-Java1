/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau_lenh_re_nhanh;

/**
 *
 * @author dangt
 */
import java.util.*;
public class trung_binh_cong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Tính trung bình cộng các số chia hết cho 3 từ x -> y");
        System.out.print("Nhập vào x: ");
        int x=in.nextInt();
        System.out.print("Nhập vào y: ");
        int y=in.nextInt();
        int sum=0,d=0;
        for (int i=x; i<y; i++) {
            if (i%3==0){
             sum+=i;
             d++;
            }
        }
        System.out.println("TBC: "+(sum/(double)d));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau_lenh_re_nhanh;

/**
 * @author dangt
 */
import java.util.*;
public class Read_Mark {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int tiepTuc;
        System.out.println("Nhập điểm từ 0 --> 10");
        double mark;
        do {
            System.out.print("Nhập điểm: ");
            mark=in.nextDouble();
            if(mark<0 ||mark>10) {
                System.out.println("Không hợp lệ!");
                continue;
            }
            System.out.println("Bạn có muốn tiếp tục không? (1: có, 0: không): ");
            tiepTuc=in.nextInt();
            if (tiepTuc==0) 
                break;
            else if (tiepTuc==1) 
                continue;
        }while(true);
    }
}

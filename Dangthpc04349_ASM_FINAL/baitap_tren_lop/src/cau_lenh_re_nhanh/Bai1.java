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
public class Bai1 {
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

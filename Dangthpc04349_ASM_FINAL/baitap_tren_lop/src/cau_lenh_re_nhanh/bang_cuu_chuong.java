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
public class bang_cuu_chuong {
    
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Bảng cửu chương!");
        System.out.print("Nhập vào số N: ");
        int n=in.nextInt();
        for (int i=1; i<=10; i++) {
            System.out.printf("%d x %d = %d \n",n,i,(n*i));
        }
    }
}

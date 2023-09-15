/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang_ARRAY;

/**
 * @author dangt
 */
import java.util.*;
public class Phuong_Thuc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap mang!");
        
        // nhap so phan tu
        System.out.print("Nhap vao so phan tu mang N = ");
        int n = in.nextInt();
      
        //nhap mang
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "]: ");
            a[i] = in.nextInt();
        }
        String s = Arrays.toString(a);
        System.out.println("Sau khi chuyen thanh chuoi: "+s);
        
        //sắp xếp tăng dần
        Arrays.sort(a);
        String tangdan= Arrays.toString(a);
        System.out.println("Tang dan: "+tangdan);
    }
    
}

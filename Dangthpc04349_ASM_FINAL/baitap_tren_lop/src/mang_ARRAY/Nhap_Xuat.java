
package mang_ARRAY;

import java.util.Scanner;
/**
 * @author dangthpc04349
 */
public class Nhap_Xuat {
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
        //xuat mang
        int s=0;    //tổng chẵn
        int tong=0;  //tổng các ptu trong mảng
        System.out.print("Mang ban vua nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.print("  " + a[i]);
            if (a[i]%2==0)  
                s+=a[i];
            tong+=a[i];
        }
        System.out.println("");
        //xuất tổng số chẵn
        System.out.println("Tong cac phan tu chan cua mang la: "+s);
        //xuất TB cộng
        System.out.println("TBC cac phan tu trong mang: "+((float)tong/n));
        //xuất lập phương
        System.out.print("Lap phuong cac phan tu: ");
        for (int i = 0; i < n; i++) {
            System.out.print("  " +Math.pow(a[i],3));
        }
        System.out.println("");
    }

    
    
    
    
    
    
    
    
    
    // dùng phương thức
    public static void nhap(int a[], int n) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "]: ");
            a[i] = in.nextInt();
        }
    }
    
    public static void xuat(int a[], int n) {

        System.out.println("Mang ban vua nhap la:");
        for (int i = 0; i < n; i++) {
            System.out.print("  " + a[i]);
        }
    }
}

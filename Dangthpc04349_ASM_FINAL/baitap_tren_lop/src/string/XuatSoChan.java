/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;

import java.util.Scanner;

/**
 *
 * @author dangt
 */
public class XuatSoChan {
    public static void main(String[] args) {
        String x = "Nguyễn_Xuân_Phúc"; int i = x.lastIndexOf("_") + 1; String y = x.substring(i);
        System.out.println(y);
    }
    
}

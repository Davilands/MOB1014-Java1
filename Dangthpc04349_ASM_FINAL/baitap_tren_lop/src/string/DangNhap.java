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
public class DangNhap {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasword() {
        return password;
    }

    public void setPasword(String pasword) {
        this.password = pasword;
    }
    public DangNhap() {
    }
    //
    public void nhap() {
        Scanner in = new Scanner (System.in);
        System.out.print("username: ");
        this.username = in.nextLine();
        System.out.print("password: ");
        this.password = in.nextLine();
    }
    public void xuat() {
        if (check(this.username, this.password)==true)
            System.out.println("Login");
        else
            System.out.println("Error");
       
    }
    //
    public boolean check(String u, String p) {
        if (u.equalsIgnoreCase("hello") && p.length()>6 )
            return true;
        return false;
    }
    public static void main(String[] args) {
        DangNhap login = new DangNhap();
        login.nhap();
        login.xuat();
    }
}

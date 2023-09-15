/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai02;

/**
 *
 * @author dangt
 */
public class San_pham {
    private String name;
    private double price;
    private String company;

    public San_pham(String name, double price, String company) {
        this.name = name;
        this.price = price;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCompany(String company) {
        this.company = company;
    }
     
    
}

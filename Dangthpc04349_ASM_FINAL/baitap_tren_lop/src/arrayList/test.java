/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayList;

import java.util.ArrayList;

/**
 *
 * @author dangt
 */
public class test {
    public static void main(String[] args) {
          ArrayList a1 = new ArrayList(); a1.add(3); a1.add(4); ArrayList a2 = new ArrayList(); a2.add(4); a2.add(5); a1.retainAll(a2);
          System.out.println(a1);
    }
}

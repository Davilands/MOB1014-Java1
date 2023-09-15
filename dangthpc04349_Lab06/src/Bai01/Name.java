
package Bai01;

import java.util.Scanner;

/**
 *
 * @author dangthpc04349
 */
public class Name {
    
    private String name ;
    private String lastName;
    private String firstName ;
    private String middleName;
    
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    
    
    public void input() {
        Scanner in = new Scanner(System.in);
        
        //input
        System.out.print("Nhập vào họ và tên: ");
        this.name = in.nextLine();
        
    }
    
    public void xuly() {
        int a = name.indexOf(" ");
        this.lastName = name.substring(0, a).toUpperCase();
        int b = name.lastIndexOf(" ");
        this.firstName = name.substring(b+1).toUpperCase();
        this.middleName = name.substring(a+1, b);
        
    }
    
    public void output() {
        System.out.println("Họ: " + this.lastName);
        System.out.println("Tên đệm: " + this.middleName);
        System.out.println("Tên: " + this.firstName);
    }
}

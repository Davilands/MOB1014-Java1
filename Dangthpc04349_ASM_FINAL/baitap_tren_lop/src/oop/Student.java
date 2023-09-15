package oop;
import java.util.Scanner;
/**
 * @author dangthpc04349
 */
public class Student {
    String name;
    double mark;
    //nhập
    public void inp(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ten sinh vien: ");
        this.name = in.nextLine();
        System.out.println("Diem sinh vien: ");
        this.mark = in.nextDouble();
    }
    //xuất
    public void out () {
        System.out.println("Ten: "+this.name);
        System.out.println("Diem: "+this.mark);
        System.out.println("Xep loai: "+level(this.mark));
    }
    //xếp loại
    public static String level (double mark) {
        String level = "";
        if (mark >= 9)
            level = "Xuat sac";
        else if (mark >= 8)
            level = "Gioi";
        else if (mark >= 6)
            level = "Kha";
        else if (mark >= 5)
            level = "Trung binh";
        else if (mark >= 3)
            level = "Yeu";
        else
            level = "Kem";
        return level;
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.inp();
        student.out();
    }
}

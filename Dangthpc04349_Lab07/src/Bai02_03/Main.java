package Bai02_03;

import java.util.Scanner;

/**
 *
 * @author Dangthpc04349
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Listsinhvien code = new Listsinhvien();
        String choose;
        do{
            System.out.println("Menu");
            System.out.println("1.Nhập danh sách sinh viên");
            System.out.println("2.Xuất danh sách sinh viên");
            System.out.println("3.xuất danh sách sinh viên có học lực giỏi ");
            System.out.println("4.Sắp xếp danh sách sinh viên theo điểm");
            System.out.println("5.Két thúc chương trình ");
            System.out.print("Nhập lựa chọn của bạn: ");
            choose=sc.nextLine();
            switch(choose){
                case "1":
                    code.input();
                    break;
                case "2":
                    code.output();
                    break;
                case "3":
                    code.ouputHocLuc();
                    break;
                case "4":
                    code.sorts();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập sai vui lòng nhập lại!");
            }
        }while(choose!=null);
        
    }
}

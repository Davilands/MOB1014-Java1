
package Bai03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dangthpc04349
 */
public class List_sinh_vien {
    private ArrayList<Sinh_vien> list =new ArrayList <>();
    private Scanner in = new Scanner(System.in);
    private String name;
    private String email;
    private String cmnd;
    private String numberPhone;
    public void input(){
        System.out.print("Nhập vào số lượng sinh viên: ");
        int n=in.nextInt();
        in.nextLine();
        for(int i=1;i<=n;i++){
            System.out.printf("Nhập họ và tên sinh viên thứ %d: ",i);
            name = in.nextLine();
            System.out.printf("Nhập email sinh viên thứ %d: ",i);
            email = in.nextLine();
            System.out.printf("Nhập cmnd sinh viên thứ %d: ",i);
            cmnd = in.nextLine();
            System.out.printf("Nhập số điện thoại sinh viên thứ %d: ",i);
            numberPhone = in.nextLine();
            list.add(new Sinh_vien(name,email,cmnd,numberPhone));
        }
        
    }
    public void output(){
        String x=null,y=null,z=null;
        String patternEmail="[a-zA-Z0-9]+[._a-zA-Z0-9!#$%&'*+-/=?^_`{|}~]*[a-zA-Z]*@[a-zA-Z0-9]{2,8}.[a-zA-Z.]{2,6}";
        String  patternCmnd="0123\\d{6}";
        String patternNumberPhone="0[0-9]{9,10}";
        
        System.out.println("Danh sách vừa nhập: ");
        for(Sinh_vien sv:list){
            if(!sv.getEmail().matches(patternEmail))x="Sai email";
            else x=sv.getEmail();
            if(!sv.getCmnd().matches(patternCmnd))y="Sai cmnd";
            else y=sv.getCmnd();
            if(!sv.getNumberPhone().matches(patternNumberPhone))z="Sai sdt";
            else z=sv.getNumberPhone();
            System.out.printf("| %2s | %2s | %2s | %2s |\n",sv.getName(),x,y,z);
        }
    }
}

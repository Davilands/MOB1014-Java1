package Bai02;

/**
 *
 * @author dangthpc04349
 */


import java.util.ArrayList;
import java.util.Scanner;

public class List_san_pham {
    private ArrayList<San_pham> list=new ArrayList<>();
    private String name;
    private double price;
    private String company;
    private Scanner in = new Scanner(System.in);
    public void input(){
        int n;
        System.out.print("Nhập số lượng sản phẩm: ");
        n=in.nextInt();
        in.nextLine();
        for(int i=1;i<=n;i++){
            System.out.printf("Nhập vào tên sản phẩm thứ %d: ",i);
            name=in.nextLine();
            System.out.printf("Nhập vào hãng sản phẩm thứ %d: ",i);
            company=in.nextLine();
            System.out.printf("Nhập giá sản phẩm thứ %d: ",i);
            do{
                price=in.nextDouble();
                if(price<0 )System.out.print("Nhập sai vui lòng nhập lại: ");
            }while(price<0 );
            list.add(new San_pham(name,price,company));
            in.nextLine();
        }
    }
    public void output(){
       System.out.println("-----------------");
        System.out.println("Kết quả tìm kiếm là: ");
        int count = 0;
        for( San_pham sp:list ){
            if(sp.getCompany().equalsIgnoreCase("nokia")) {
                System.out.printf("%2s | %2s | %2.2f \n",sp.getName(),sp.getCompany(),sp.getPrice());
                count ++;
            }
        }
        if (count > 0) 
            System.out.printf("Tồn tại %d sản phẩm của hãng Nokia\n",count);
        else
            System.out.println("Không tồn tại sản phẩm của hãng Nokia!");
    }
}

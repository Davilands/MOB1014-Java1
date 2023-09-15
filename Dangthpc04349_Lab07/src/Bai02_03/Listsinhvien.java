package Bai02_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author dangthpc04349
 */
public class Listsinhvien {
    private ArrayList<Sinhvienfpoly> SV=new ArrayList<>();
    private Scanner sc=new Scanner(System.in);
    public void input(){
        int n;
        String nganh;
        System.out.print("Nhập vào số lượng sinh viên: ");
        n=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            System.out.printf("Nhập vào họ và tên sinh viên thứ %d: ",i);
            String hoTen=sc.nextLine();
            while(true){
                System.out.printf("Nhập ngành học sinh viên thứ %d (IT/Biz): ",i);
                nganh=sc.nextLine();
                if(nganh.equalsIgnoreCase("IT") || nganh.equalsIgnoreCase("Biz"))
                    break;
            }
            if(nganh.equalsIgnoreCase("IT")){
                System.out.printf("Nhập điểm java sinh viên thứ %d: ",i);
                double java=sc.nextDouble();
                System.out.printf("Nhập điểm HTML sinh viên thứ %d: ",i);
                double html=sc.nextDouble();
                System.out.printf("Nhập điểm CSS sinh viên thứ %d: ",i);
                double css=sc.nextDouble();
                SV.add(new SinhvienIT(java, html, css, hoTen, nganh));
            }
            else if(nganh.equalsIgnoreCase("Biz")){
                System.out.printf("Nhập điểm Markertting sinh viên thứ %d: ",i);
                double marketting=sc.nextDouble();
                System.out.printf("Nhập điểm Sales sinh viên thứ %d: ",i);
                double sales=sc.nextDouble();
                SV.add(new SinhvienBiz(marketting, sales, hoTen, nganh));
            }
            sc.nextLine();
        }
    }
    public void output(){
            for(Sinhvienfpoly sv:SV){
                if(sv instanceof SinhvienIT){
                    System.out.println("----------------------------------------------------------");
                    System.out.printf("|  %3s |  %3s    |   %2.2f   |  %2.2f  |  %2.2f |  %2s  |\n",sv.hoTen,sv.nganh.toUpperCase(),((SinhvienIT) sv).getJava(),((SinhvienIT) sv).getHtml(),((SinhvienIT) sv).getCss(),sv.getHocLuc());
                    System.out.println("----------------------------------------------------------");
                }
                else if(sv instanceof SinhvienBiz){
                    System.out.println("----------------------------------------------------------");
                    System.out.printf("|  %3s |  %3s    |   %2.2f   |  %2.2f  |  %2s  |\n",sv.hoTen,sv.nganh.toUpperCase(),((SinhvienBiz) sv).getDiemMarketting(),((SinhvienBiz) sv).getSales(),sv.getHocLuc());
                    System.out.println("----------------------------------------------------------");
                }
            }
    }
    public void ouputHocLuc(){
        String Hl="Giỏi";
        for(Sinhvienfpoly sv:SV){
                if(sv instanceof SinhvienIT && sv.getHocLuc().equalsIgnoreCase(Hl)){
                    System.out.println("----------------------------------------------------------");
                    System.out.printf("|  %3s |  %3s    |   %2.2f   |  %2.2f  |  %2.2f |  %2s  |\n",sv.hoTen,sv.nganh.toUpperCase(),((SinhvienIT) sv).getJava(),((SinhvienIT) sv).getHtml(),((SinhvienIT) sv).getCss(),sv.getHocLuc());
                    System.out.println("----------------------------------------------------------");
                }
                else if(sv instanceof SinhvienBiz && sv.getHocLuc().equalsIgnoreCase(Hl)){
                    System.out.println("----------------------------------------------------------");
                    System.out.printf("|  %3s |  %3s    |   %2.2f   |  %2.2f  |  %2s  |\n",sv.hoTen,sv.nganh.toUpperCase(),((SinhvienBiz) sv).getDiemMarketting(),((SinhvienBiz) sv).getSales(),sv.getHocLuc());
                    System.out.println("----------------------------------------------------------");
                }
            }
        
    }
    
        public void sorts(){
        Comparator<Sinhvienfpoly> comp;
        comp = new Comparator<Sinhvienfpoly>() {
            
            @Override
            public int compare(Sinhvienfpoly o1, Sinhvienfpoly o2) {
                return Double.compare(o2.getDiem(), o1.getDiem());
            }
        };
        Collections.sort(SV, comp);
        for(Sinhvienfpoly sv:SV){
           if(sv instanceof SinhvienIT){
                    System.out.println("----------------------------------------------------------");
                    System.out.printf("|  %3s |  %3s    |   %2.2f   |  %2.2f  |  %2.2f |  %2s  |\n",sv.hoTen,sv.nganh.toUpperCase(),((SinhvienIT) sv).getJava(),((SinhvienIT) sv).getHtml(),((SinhvienIT) sv).getCss(),sv.getHocLuc());
                    System.out.println("----------------------------------------------------------");
                }
                else if(sv instanceof SinhvienBiz){
                    System.out.println("----------------------------------------------------------");
                    System.out.printf("|  %3s |  %3s    |   %2.2f   |  %2.2f  |  %2s  |\n",sv.hoTen,sv.nganh.toUpperCase(),((SinhvienBiz) sv).getDiemMarketting(),((SinhvienBiz) sv).getSales(),sv.getHocLuc());
                    System.out.println("----------------------------------------------------------");
                }
        }
    
    }
}

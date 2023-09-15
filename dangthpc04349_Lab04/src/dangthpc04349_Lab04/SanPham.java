package dangthpc04349_Lab04;

import java.util.Scanner;

/**
 * @author dangthpc04349
 */
public class SanPham {
    private String ten_san_pham;
    private double don_gia;
    private double giam_gia;
    
    //
    public String getTen_san_pham() {
        return ten_san_pham;
    }

    public double getDon_gia() {
        return don_gia;
    }

    public double getGiam_gia() {
        return giam_gia;
    }

    public void setTen_san_pham(String ten_san_pham) {
        this.ten_san_pham = ten_san_pham;
    }

    public void setDon_gia(double don_gia) {
        this.don_gia = don_gia;
    }

    public void setGiam_gia(double giam_gia) {
        this.giam_gia = giam_gia;
    }
    
    //bài1
    public SanPham(String ten_san_pham, double don_gia, double giam_gia){
        this.ten_san_pham = ten_san_pham;
        this.don_gia = don_gia;
        this.giam_gia = giam_gia;
    }
    //bài2
    public SanPham(){
    }
    //bài3
    public SanPham(String ten_san_pham, double don_gia){
        this.ten_san_pham = ten_san_pham;
        this.don_gia = don_gia;
        this.giam_gia = 0;
    }
    
    private double getthue_nhap_khau(){
        return don_gia * 0.1;
    }
    public void nhap(){
         Scanner s = new Scanner(System.in);
         
         System.out.print("Nhập Tên Sán Phẩm: ");
         ten_san_pham = s.nextLine();
         
         System.out.print("Nhập Đơn Giá: ");
         don_gia = s.nextDouble();
         
         System.out.print("Nhập Giảm Giá: ");
         giam_gia = s.nextDouble();  
    }
    public void xuat(){
        System.out.println("Tên sản phẩm: "+this.ten_san_pham);
        System.out.println("Đơn giá: "+this.don_gia);
        System.out.println("Giảm giá: "+this.giam_gia);
        System.out.println("Thuế Nhập Khẩu: "+getthue_nhap_khau());
    }
}

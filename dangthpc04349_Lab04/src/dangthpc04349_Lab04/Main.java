package dangthpc04349_Lab04;
/**
 * @author dangthpc04349
 */
public class Main {

    public static void main(String[] args) {
        
        //bài1
        SanPham sp1 = new SanPham("Coca Cola",500,20);
        System.out.println("------------Sản phẩm 1------------------");
        sp1.xuat();
        
        //bài2
        System.out.println("\n\n------------Sản phẩm 2------------------");
        SanPham sp2 = new SanPham();
        sp2.nhap();
        sp2.xuat();
        
        //bài3
        System.out.println("\n\n------------Sản phẩm 3------------------");
        SanPham sp3 = new SanPham("Laptop DELL",12000000);
        sp3.xuat();
    }
    
}

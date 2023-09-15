package Bai01;

/**
 *
 * @author dangthpc04349
 */
public class Vuong extends Chu_nhat {
    private double canh;
    public Vuong() {
        super();
    }
    
    public Vuong(double canh) {
        super(canh,canh);
        this.canh = canh;
    }
    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.printf("Cạnh: %.2f\nChu vi: %.2f\nDiện tích: %.2f\n",this.canh,super.getChuVi(),super.getDienTich());
    }
    
    
}

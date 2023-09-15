package Bai01;

/**
 *
 * @author dangthpc04349
 */
public class Chu_nhat {
    private double dai;
    private double rong;
    public Chu_nhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public Chu_nhat() {
    }
    public double getDienTich(){
        return (this.dai * this.rong);
    }
    public double getChuVi(){
        return (this.dai+this.rong)*2;
    }

    public void output(){
        System.out.printf("Chiều dài: %.2f\nChiều rộng: %.2f\nChu vi: %.2f\nDiện tích: %.2f\n",this.dai,this.rong,getChuVi(),getDienTich());
    }
}

package Bai03;

/**
 * @author dangthpc04349
 */
public class San_pham {
    
    private String name;
    private double gia;
    
    public San_pham() {
        this.name = null;
        this.gia = 0;
    }

    public San_pham(String name, double gia) {
        this.name = name;
        this.gia = gia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    
}

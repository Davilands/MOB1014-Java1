package Bai02_03;

/**
 *
 * @author dangthpc04349
 */
public class SinhvienBiz extends Sinhvienfpoly{
    Double diemMarketting,sales;
    @Override
    double getDiem() {
        return (this.diemMarketting*2+this.sales)/3;
    }

    public SinhvienBiz() {
    }

    public SinhvienBiz(Double diemMarketting, Double sales,String hoTen,String nganh ) {
        super(hoTen,nganh);
        this.diemMarketting = diemMarketting;
        this.sales = sales;
    }

    public Double getDiemMarketting() {
        return diemMarketting;
    }

    public void setDiemMarketting(Double diemMarketting) {
        this.diemMarketting = diemMarketting;
    }

    public Double getSales() {
        return sales;
    }

    public void setSales(Double sales) {
        this.sales = sales;
    }
    
    
}

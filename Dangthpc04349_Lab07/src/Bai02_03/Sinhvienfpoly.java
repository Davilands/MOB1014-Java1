package Bai02_03;

/**
 *
 * @author dangthpc04349
 */
    abstract public class Sinhvienfpoly {
    String hoTen;
    String nganh;

    public Sinhvienfpoly() {
    }

    public Sinhvienfpoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    
    abstract double getDiem();
    public String getHocLuc(){
        if(this.getDiem()>=0 && this.getDiem()<=10){
            if(this.getDiem()<5)return "Yếu";
            else if(this.getDiem()<=6.5) return "Trung bình";
            else if(this.getDiem()<=7.5) return "Khá";
            else if(this.getDiem()<9) return "Giỏi";
            else return "Xuất sắc";
        }
        else return "Điểm sai";
    }

}

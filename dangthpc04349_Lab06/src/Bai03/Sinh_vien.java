
package Bai03;

/**
 *
 * @author dangthpc04349
 */
public class Sinh_vien {
    private String name;
    private String email;
    private String cmnd;
    private String numberPhone;
    public Sinh_vien(String name, String email, String cnmnd, String numberPhone) {
        this.name = name;
        this.email = email;
        this.cmnd = cnmnd;
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
            return email;
    }

    public String getCmnd() {
            return cmnd; 
        
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCmnd(String cnmnd) {
        this.cmnd = cmnd;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }
}

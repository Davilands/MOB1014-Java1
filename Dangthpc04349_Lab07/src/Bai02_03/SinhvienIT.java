package Bai02_03;

/**
 *
 * @author dangthpc04349
 */
public class SinhvienIT extends Sinhvienfpoly{
    Double java,html,css;

    public SinhvienIT(Double java, Double html, Double css,String hoTen,String nganh) {
        super(hoTen,nganh);
        this.java = java;
        this.html = html;
        this.css = css;
    }

    public SinhvienIT() {
    }

    public Double getJava() {
        return java;
    }

    public void setJava(Double java) {
        this.java = java;
    }

    public Double getHtml() {
        return html;
    }

    public void setHtml(Double html) {
        this.html = html;
    }

    public Double getCss() {
        return css;
    }

    public void setCss(Double css) {
        this.css = css;
    }
    
    @Override
    double getDiem() {
        return (this.java*2+this.html+this.css)/4;
    }
    
}

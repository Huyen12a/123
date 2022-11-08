
package DangNhap;


public class DangNhap {
    private String tentk;
    private String mk;

    public DangNhap(String tentk, String mk) {
        this.tentk = tentk;
        this.mk = mk;
    }

    public DangNhap() {
    }

    public String getTentk() {
        return tentk;
    }

    public void setTentk(String tentk) {
        this.tentk = tentk;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DangNhap;


public class DANGKY {
    private String manguoidung;
    private String email;
    private String diachi;
    private int gioitinh;
    private String mk;
    private String mklai;

    public DANGKY() {
    }

    public DANGKY(String manguoidung, String email, String diachi, int gioitinh, String mk, String mklai) {
        this.manguoidung = manguoidung;
        this.email = email;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.mk = mk;
        this.mklai = mklai;
    }

    public String getManguoidung() {
        return manguoidung;
    }

    public void setManguoidung(String manguoidung) {
        this.manguoidung = manguoidung;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public String getMklai() {
        return mklai;
    }

    public void setMklai(String mklai) {
        this.mklai = mklai;
    }
    
    
}

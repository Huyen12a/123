/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

import java.io.Serializable;

/**
 *
 * @author Asus
 */
public class NewClass implements Serializable{
    private String maloaisach;
    private String masach;
    private String tensach;
    private int soluong;

    public NewClass() {
    }

    public NewClass(String maloaisach, String masach, String tensach, int soluong) {
        this.maloaisach = maloaisach;
        this.masach = masach;
        this.tensach = tensach;
        this.soluong = soluong;
    }

    public String getMaloaisach() {
        return maloaisach;
    }

    public void setMaloaisach(String maloaisach) {
        this.maloaisach = maloaisach;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    
}

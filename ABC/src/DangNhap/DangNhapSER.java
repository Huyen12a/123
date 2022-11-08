/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DangNhap;

import java.util.ArrayList;


public class DangNhapSER {
    private ArrayList<DangNhap>ds;
    public DangNhapSER()
    {
        this.ds = new ArrayList<>();
    }

    public ArrayList<DangNhap> getDs() {
        return ds;
    }

    public void setDs(ArrayList<DangNhap> ds) {
        this.ds = ds;
    }
    public void insert(DangNhap n)
    {
        this.ds.add(n);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DangNhap;

import java.util.ArrayList;


public class DANGKYSER {
    private ArrayList<DANGKY>ds;
    public DANGKYSER()
    {
        this.ds = new ArrayList<>();
        
    }
    public void insert(DANGKY n)
    {
        this.ds.add(n);
    }
    public void update(int ViTri , DANGKY n)
    {
        this.ds.set(ViTri, n);
    }
    public void delete(int ViTri)
    {
        this.ds.remove(ViTri);
    }

    public ArrayList<DANGKY> getDs() {
        return ds;
    }

    public void setDs(ArrayList<DANGKY> ds) {
        this.ds = ds;
    }
    
    
}

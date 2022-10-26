/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class NewClassSER {
    
    private ArrayList<NewClass> ds;
    public  NewClassSER()
    {
        this.ds = new ArrayList<>();
    }
    public void insert(NewClass n)
    {
        this.ds.add(n);
    }
    public void delete(int ViTri)
    {
        this.ds.remove(ViTri);
    }
    public void update(int ViTri, NewClass n)
    {
        this.ds.set(ViTri, n);
        
    }

    public ArrayList<NewClass> getDs() {
        return ds;
    }

    public void setDs(ArrayList<NewClass> ds) {
        this.ds = ds;
    }
    
}

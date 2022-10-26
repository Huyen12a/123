/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class NewJFrame extends javax.swing.JFrame implements  Runnable{

    private  NewClassSER NewClassSER;
    private  String filename = "aaaa";
    public NewJFrame() {
        initComponents();
        Thread t1 = new Thread(this);
        t1.start();
        this.NewClassSER= new NewClassSER();
        NewClass sv = new NewClass("TIN HOC", "MA1", "TEN1", 12);
        this.NewClassSER.insert(sv);
        this.loadtable();
        this.clearform();
    }
    public void loadtable()
    {
        DefaultTableModel dtm = (DefaultTableModel) this.BANG.getModel();
        ArrayList<NewClass> ds = this.NewClassSER.getDs();
        while(dtm.getRowCount()>0)
        {
            dtm.removeRow(0);
        }
        for(NewClass n : ds)
        {
            Object[] rowdata = new Object[]
            {
            n.getMaloaisach(),
            n.getMasach(),
            n.getTensach(),
            n.getSoluong()
            };dtm.addRow(rowdata);
        }
    }
    public void clearform()
    {
        this.txtmaloisach.setSelectedIndex(0);
        this.txtmasach.setText("");
        this.txttensach.setText("");
        this.txtsoluong.setText("");
    }
    private  NewClass getformdata()
    {
        String maloaisach = this.txtmaloisach.getSelectedItem().toString();
        String masach = this.txtmasach.getText();
        String tensach = this.txttensach.getText();
        String soluong = this.txtsoluong.getText();
        
        if(masach.trim().length()==0 ||tensach.trim().length()==0 || soluong.trim().length()==0 )
        {
            JOptionPane.showMessageDialog(this, "khong duoc de chong");
            return null;
        }
        try
        {
            if(Integer.valueOf(soluong)<=0)
            {
                JOptionPane.showMessageDialog(this, "so luong la so nguyen lon hon 0");
                return null;
            }
        }catch(NumberFormatException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "so luong la so nguyen");
            return null;
        }
        NewClass sv = new NewClass(maloaisach, masach, tensach, Integer.valueOf(soluong));
        return sv;
        
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TIM = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtmaloisach = new javax.swing.JComboBox<>();
        txtmasach = new javax.swing.JTextField();
        txttensach = new javax.swing.JTextField();
        txtsoluong = new javax.swing.JTextField();
        THEM = new javax.swing.JButton();
        XOAFORM = new javax.swing.JButton();
        XOA = new javax.swing.JButton();
        DOCFILE = new javax.swing.JButton();
        GHIFILE = new javax.swing.JButton();
        THOAT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BANG = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TIM.setText("ma loai sach");

        jLabel2.setText("masach");

        jLabel3.setText("ten sach");

        jLabel4.setText("so luong");

        txtmaloisach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TIN HOC", "TOAN HOC", "VAN HOC", " " }));

        txtmasach.setText("jTextField1");

        txttensach.setText("jTextField2");

        txtsoluong.setText("jTextField3");

        THEM.setText("ADD");
        THEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THEMActionPerformed(evt);
            }
        });

        XOAFORM.setText("CLEAR");
        XOAFORM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XOAFORMActionPerformed(evt);
            }
        });

        XOA.setText("DELETE");
        XOA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XOAActionPerformed(evt);
            }
        });

        DOCFILE.setText("OPENFILE");
        DOCFILE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOCFILEActionPerformed(evt);
            }
        });

        GHIFILE.setText("SAVEFILE");
        GHIFILE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GHIFILEActionPerformed(evt);
            }
        });

        THOAT.setText("EXIT");
        THOAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THOATActionPerformed(evt);
            }
        });

        BANG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ma loai sach", "masach", "tensach", "soluong"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BANG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BANGMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BANG);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TIM)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmaloisach, 0, 154, Short.MAX_VALUE)
                            .addComponent(txtmasach)
                            .addComponent(txttensach)
                            .addComponent(txtsoluong))
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(THOAT)
                    .addComponent(GHIFILE)
                    .addComponent(THEM)
                    .addComponent(XOAFORM)
                    .addComponent(XOA)
                    .addComponent(DOCFILE))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TIM)
                    .addComponent(txtmaloisach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmasach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttensach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(THEM)
                .addGap(18, 18, 18)
                .addComponent(XOAFORM)
                .addGap(18, 18, 18)
                .addComponent(XOA)
                .addGap(26, 26, 26)
                .addComponent(DOCFILE)
                .addGap(28, 28, 28)
                .addComponent(GHIFILE)
                .addGap(18, 18, 18)
                .addComponent(THOAT)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void THEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THEMActionPerformed
        NewClass sv = this.getformdata();
        if(sv==null)
        {
            return;
        }
        this.NewClassSER.insert(sv);
        this.loadtable();
        this.clearform();
        JOptionPane.showMessageDialog(this,"them thanh cong");
    }//GEN-LAST:event_THEMActionPerformed

    private void BANGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BANGMouseClicked
       int row = this.BANG.getSelectedRow();
       if(row==-1)
       {
           return;
       }
       String maloaisach = this.BANG.getValueAt(row, 0).toString();
       String masach = this.BANG.getValueAt(row, 1).toString();
       String tensach = this.BANG.getValueAt(row, 2).toString();
       String soluong = this.BANG.getValueAt(row, 3).toString();
       
       this.txtmaloisach.setSelectedItem(maloaisach);
       this.txtmasach.setText(masach);
       this.txttensach.setText(tensach);
       this.txtsoluong.setText(soluong);
    }//GEN-LAST:event_BANGMouseClicked

    private void XOAFORMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XOAFORMActionPerformed
       this.clearform();
    }//GEN-LAST:event_XOAFORMActionPerformed

    private void XOAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XOAActionPerformed
       int row = this.BANG.getSelectedRow();
       if(row==-1)
       {
           return;
       }
       int xacnhan = JOptionPane.showConfirmDialog(this, "ban co muon xoa ko");
               if(xacnhan!=JOptionPane.YES_OPTION)
               {
                   return;
               }
               this.NewClassSER.delete(row);
               this.loadtable();
               this.clearform();
               JOptionPane.showMessageDialog(this, "xoa thanh cong");
    }//GEN-LAST:event_XOAActionPerformed

    private void DOCFILEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOCFILEActionPerformed
       try
       {
           FileInputStream fos = new FileInputStream(this.filename);
           ObjectInputStream oos= new ObjectInputStream(fos);
           ArrayList<NewClass> ds = (ArrayList<NewClass>)oos.readObject();
           this.NewClassSER.setDs(ds);
           System.out.println();
           oos.close();
           
       }
       catch(FileNotFoundException e)
       {
           e.printStackTrace();
       }catch(IOException e)
       {
           e.printStackTrace();
       }catch(ClassNotFoundException e)
       {
           e.printStackTrace();
       }
       this.loadtable();
       JOptionPane.showMessageDialog(this, "doc thanh cong");
               
    }//GEN-LAST:event_DOCFILEActionPerformed

    private void GHIFILEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GHIFILEActionPerformed
         int xacnhan = JOptionPane.showConfirmDialog(this, "ban co muon thoat va ghi file ko");
               if(xacnhan!=JOptionPane.YES_OPTION)
               {
                   return;
               }
               FileOutputStream fos = null;
               ObjectOutputStream oos = null;
               ArrayList<NewClass> ds = this.NewClassSER.getDs();
               try
               {
                   fos = new FileOutputStream(this.filename);
                   oos = new ObjectOutputStream(fos);
                   oos.writeObject(ds);
                   oos.close();
                   JOptionPane.showMessageDialog(this, "ghi thanh cong");
                   
               }catch(FileNotFoundException e)
               {
                   e.printStackTrace();
               }catch(IOException e)
               {
                   e.printStackTrace();
               }
               System.exit(0);
    }//GEN-LAST:event_GHIFILEActionPerformed

    private void THOATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THOATActionPerformed
         System.exit(0);
    }//GEN-LAST:event_THOATActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BANG;
    private javax.swing.JButton DOCFILE;
    private javax.swing.JButton GHIFILE;
    private javax.swing.JButton THEM;
    private javax.swing.JButton THOAT;
    private javax.swing.JLabel TIM;
    private javax.swing.JButton XOA;
    private javax.swing.JButton XOAFORM;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> txtmaloisach;
    private javax.swing.JTextField txtmasach;
    private javax.swing.JTextField txtsoluong;
    private javax.swing.JTextField txttensach;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while(true)
        {
         
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

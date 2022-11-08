/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DangNhap;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class JFrameDangNhap extends javax.swing.JFrame {

 private  DangNhapSER newClassSER;
    public JFrameDangNhap() {
        initComponents();
        this.newClassSER = new DangNhapSER();
        DangNhap sv = new DangNhap("ABC","12345");
        DangNhap sv1 = new DangNhap("ABCD","123456");
        DangNhap sv2 = new DangNhap("ABCD","1234567");
        this.newClassSER.insert(sv);
        this.newClassSER.insert(sv1);
        this.newClassSER.insert(sv2);
        ArrayList<DangNhap> ds  = this.newClassSER.getDs();
        
    }
    private  DangNhap getformdata()
    {
        String tentk = this.tentk.getText().trim();
        String mk = String.valueOf(this.mk.getPassword()).trim();
        if(tentk.length()==0 || mk.length()==0)
        {
            JOptionPane.showMessageDialog(this, "TÊN TÀI KHOẢN MẬT KHẨU KHÔNG ĐƯỢC ĐỂ CHỐNG");
            return null;
        }
        DangNhap sv = new DangNhap(tentk, mk);
        return sv;
        
    }
    
    
    private DangNhap tentk(String tentk)
   {
       ArrayList<DangNhap> ds  = this.newClassSER.getDs();
       for(DangNhap n : ds)
       {
           if(n.getTentk().equalsIgnoreCase(tentk))
           {
               return n;
           }
       }return null;
   }
    
    
    
       private DangNhap mk(String mk)
   {
       ArrayList<DangNhap> ds  = this.newClassSER.getDs();
       for(DangNhap n : ds)
       {
           if(n.getMk().equalsIgnoreCase(mk))
           {
               return n;
           }
       }return null;
   }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mk = new javax.swing.JPasswordField();
        tentk = new javax.swing.JTextField();
        QUENMK = new javax.swing.JButton();
        DANGNHAP = new javax.swing.JButton();
        DANGKI = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ĐĂNG NHẬP");

        jLabel2.setText("TÊN TÀI KHOẢN");

        jLabel3.setText("MẬT KHẨU");

        QUENMK.setText("QUÊN MK");

        DANGNHAP.setText("ĐĂNG NHẬP");
        DANGNHAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DANGNHAPActionPerformed(evt);
            }
        });

        DANGKI.setText("ĐĂNG KÍ");

        EXIT.setText("EXIT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EXIT)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(QUENMK)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mk)
                            .addComponent(tentk)
                            .addComponent(DANGNHAP))
                        .addGap(42, 42, 42)
                        .addComponent(DANGKI))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tentk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QUENMK)
                    .addComponent(DANGNHAP)
                    .addComponent(DANGKI))
                .addGap(28, 28, 28)
                .addComponent(EXIT)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DANGNHAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DANGNHAPActionPerformed
       DangNhap sv = this.getformdata();
       if(sv==null)
       {
           return;
       }
       if(tentk(sv.getTentk())!=null && mk(sv.getMk())!=null)
       {
           JOptionPane.showMessageDialog(this, "ĐĂNG NHẬP THÀNH CÔNG");
           return ;
       }
       else if (tentk(sv.getTentk())!=null && mk(sv.getMk())==null ){
           JOptionPane.showMessageDialog(this, "MẬT KHẨU KHÔNG ĐÚNG");
           return ;
       }
       else if (tentk(sv.getTentk())==null && mk(sv.getMk())!=null ){
           JOptionPane.showMessageDialog(this, "TÀI KHOẢN KHÔNG ĐÚNG");
           return ;
       }else 
               {
                   JOptionPane.showMessageDialog(this, "TÀI KHOẢN MẬT KHẨU KHÔNG ĐÚNG");
           return ; 
               }
       
     
      
       
    }//GEN-LAST:event_DANGNHAPActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameDangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DANGKI;
    private javax.swing.JButton DANGNHAP;
    private javax.swing.JButton EXIT;
    private javax.swing.JButton QUENMK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField mk;
    private javax.swing.JTextField tentk;
    // End of variables declaration//GEN-END:variables
}

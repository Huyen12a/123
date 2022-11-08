/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DangNhap;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class JFrameDangKy extends javax.swing.JFrame {

    private DANGKYSER newClassSER;

    public JFrameDangKy() {
        initComponents();
        this.newClassSER = new DANGKYSER();
        DANGKY sv = new DANGKY("MA1", "abc25@gmail.com", "Hà Nội", 1, "1212", "1212");
        this.newClassSER.insert(sv);
    }

    private DANGKY getform() {
        String ma = this.MA.getText().trim();
        String email = this.EMAIL.getText().trim();
        String diachi = this.DIACHI.getText().trim();
        int gioitinh = this.NAM.isSelected() == true ? 1 : 0;
        String mk = String.valueOf(this.MATKHAU.getPassword()).trim();
       String mklai = String.valueOf(this.MATKHAULAI.getPassword()).trim();
        if (ma.length() == 0 || email.length() == 0 || diachi.length() == 0 || mk.length() == 0 || mklai.length() == 0) {
            JOptionPane.showMessageDialog(this, "KHÔNG ĐƯỢC ĐỂ CHỐNG");
            return null;
        }
        if (ma.length() >= 10 || ma.length() <= 5) {
            JOptionPane.showMessageDialog(this, "MÃ NGƯỜI DÙNG TỪ 5 ĐẾN 10 KÍ TỰ ");
            return null;
        }
        String mail = "\\w+@(\\w+\\.\\w+){1,2}";
        Matcher matcher = Pattern.compile(mail).matcher(EMAIL.getText());
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(this, "SAI ĐỊNH DẠNG EMAIL");
            return null;
        }
        DANGKY sv = new DANGKY(mail, email, diachi, gioitinh, mk, mklai);
        return sv;

    }
    
      private DANGKY manguoidung1(String manguoidung)
   {
       ArrayList<DANGKY> ds  = this.newClassSER.getDs();
       for(DANGKY n : ds)
       {
           if(n.getManguoidung().equalsIgnoreCase(manguoidung))
           {
               return n;
           }
       }return null;
   }
      
      
        private DANGKY email1(String emaill)
   {
       ArrayList<DANGKY> ds  = this.newClassSER.getDs();
       for(DANGKY n : ds)
       {
           if(n.getEmail().equalsIgnoreCase(emaill))
           {
               return n;
           }
       }return null;
   }
        
        
          private DANGKY mklaii(String mklaii)
   {
       ArrayList<DANGKY> ds  = this.newClassSER.getDs();
       for(DANGKY n : ds)
       {
           if(n.getMklai().equalsIgnoreCase(n.getMk()))
           {
               return n;
           }
       }return null;
   }
      
      
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EMAIL = new javax.swing.JTextField();
        DIACHI = new javax.swing.JTextField();
        MA = new javax.swing.JTextField();
        NAM = new javax.swing.JRadioButton();
        NU = new javax.swing.JRadioButton();
        DANGKY = new javax.swing.JButton();
        THOAT = new javax.swing.JButton();
        MATKHAU = new javax.swing.JPasswordField();
        MATKHAULAI = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MÃ NGƯỜI DÙNG ");

        jLabel2.setText("EMAIL");

        jLabel3.setText("ĐỊA CHỈ");

        jLabel4.setText("GIỚI TÍNH");

        jLabel5.setText("MẬT KHẨU");

        jLabel6.setText(" NHẬP LẠI MẬT KHẨU ");

        MA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAActionPerformed(evt);
            }
        });

        buttonGroup1.add(NAM);
        NAM.setText("NAM");

        buttonGroup1.add(NU);
        NU.setText("NỮ");

        DANGKY.setText("ĐĂNG KÝ");
        DANGKY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DANGKYActionPerformed(evt);
            }
        });

        THOAT.setText("THOÁT");
        THOAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THOATActionPerformed(evt);
            }
        });

        MATKHAU.setText("jPasswordField1");
        MATKHAU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MATKHAUActionPerformed(evt);
            }
        });

        MATKHAULAI.setText("jPasswordField2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MATKHAU)
                                            .addComponent(MATKHAULAI)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DIACHI, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(NAM, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(NU, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MA, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(EMAIL)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(DANGKY, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(THOAT, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 158, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(MA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(DIACHI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NAM)
                    .addComponent(NU))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(MATKHAU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(MATKHAULAI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DANGKY)
                    .addComponent(THOAT))
                .addContainerGap(438, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MAActionPerformed

    private void THOATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THOATActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_THOATActionPerformed

    private void DANGKYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DANGKYActionPerformed
     DANGKY sv = this.getform();
     if(sv==null)
     {
         return;
     }
     if(manguoidung1(sv.getManguoidung())!=null && email1(sv.getEmail())!=null && mklaii(sv.getMklai())!=null )
       {
           JOptionPane.showMessageDialog(this, "ĐĂNG  KÝ  THÀNH CÔNG");
           return ;
       }
     else if(manguoidung1(sv.getManguoidung())==null && email1(sv.getEmail())!=null && mklaii(sv.getMklai())!=null )
       {
           JOptionPane.showMessageDialog(this, "MÃ NGƯỜI DÙNG ĐÃ TỒN TẠI");
           return ;
       }
       if(manguoidung1(sv.getManguoidung())!=null && email1(sv.getEmail())==null && mklaii(sv.getMklai())!=null )
       {
           JOptionPane.showMessageDialog(this, "EMAIL ĐÃ TỒN TẠI");
           return ;
       }
        if(manguoidung1(sv.getManguoidung())!=null && email1(sv.getEmail())!=null && mklaii(sv.getMklai())==null )
       {
           JOptionPane.showMessageDialog(this, "MẬT KHẨU LẠI KHÔNG TRÙNG MẬT KHẨU");
           return ;
       }
     
     
    }//GEN-LAST:event_DANGKYActionPerformed

    private void MATKHAUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MATKHAUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MATKHAUActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameDangKy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DANGKY;
    private javax.swing.JTextField DIACHI;
    private javax.swing.JTextField EMAIL;
    private javax.swing.JTextField MA;
    private javax.swing.JPasswordField MATKHAU;
    private javax.swing.JPasswordField MATKHAULAI;
    private javax.swing.JRadioButton NAM;
    private javax.swing.JRadioButton NU;
    private javax.swing.JButton THOAT;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}

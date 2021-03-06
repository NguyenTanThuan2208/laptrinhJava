package Lab3;

import javax.swing.JOptionPane;

public class bai6 extends javax.swing.JFrame {

    public bai6() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tru = new javax.swing.JButton();
        Cong = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Nhan = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Chia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tru.setText("-");
        Tru.setName("btnSub"); // NOI18N
        Tru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TruActionPerformed(evt);
            }
        });

        Cong.setText("+");
        Cong.setName("btnAdd"); // NOI18N
        Cong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CongActionPerformed(evt);
            }
        });

        jLabel1.setText("Số thứ nhất");

        Nhan.setText("x");
        Nhan.setName("btnMulti"); // NOI18N
        Nhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhanActionPerformed(evt);
            }
        });

        jTextField1.setName("txtFirst"); // NOI18N

        jTextField2.setName("txtSecond"); // NOI18N

        jLabel2.setText("Số thứ hai");

        jTextField3.setEnabled(false);
        jTextField3.setName("txtResult"); // NOI18N

        jLabel3.setText("Kết quả");

        Chia.setText("/");
        Chia.setName("btnDiv"); // NOI18N
        Chia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Tru)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Nhan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Chia)
                        .addGap(0, 121, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nhan)
                    .addComponent(Chia)
                    .addComponent(Tru)
                    .addComponent(Cong))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TruActionPerformed
        if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Moi nhap So thu 1");
            return;
        }if(jTextField2.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Moi nhap So thu 2");
            return;
        }

        String fnum=jTextField1.getText();
        String snum=jTextField2.getText();
        float result=Float.parseFloat(fnum)-Float.parseFloat(snum);
        jTextField3.setText(Float.toString(result));
    }//GEN-LAST:event_TruActionPerformed

    private void CongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CongActionPerformed
        if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Moi nhap So thu 1");
            return;
        }if(jTextField2.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Moi nhap So thu 2");
            return;
        }

        String fnum=jTextField1.getText();
        String snum=jTextField2.getText();
        float result=Float.parseFloat(fnum)+Float.parseFloat(snum);
        jTextField3.setText(Float.toString(result));
    }//GEN-LAST:event_CongActionPerformed

    private void NhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhanActionPerformed
        if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Moi nhap So thu 1");
            return;
        }if(jTextField2.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Moi nhap So thu 2");
            return;
        }

        String fnum=jTextField1.getText();
        String snum=jTextField2.getText();
        float result=Float.parseFloat(fnum)*Float.parseFloat(snum);
        jTextField3.setText(Float.toString(result));
    }//GEN-LAST:event_NhanActionPerformed

    private void ChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChiaActionPerformed
        if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Moi nhap So thu 1");
            return;
        }if(jTextField2.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Moi nhap So thu 2");
            return;
        }

        String fnum=jTextField1.getText();
        String snum=jTextField2.getText();
        float f=Float.parseFloat(fnum);
        float s=Float.parseFloat(snum);
        if(s==0){
            jTextField3.setText("Khong xac dinh");
            return;
        }
        float result=f/s;
        jTextField3.setText(Float.toString(result));

    }//GEN-LAST:event_ChiaActionPerformed

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
            java.util.logging.Logger.getLogger(bai6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bai6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bai6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bai6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bai6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Chia;
    private javax.swing.JButton Cong;
    private javax.swing.JButton Nhan;
    private javax.swing.JButton Tru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

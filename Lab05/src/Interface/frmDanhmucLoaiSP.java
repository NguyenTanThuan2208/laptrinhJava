
package Interface;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import Proccess.LoaiSP;//Lớp LoaiSP trong Proccess đã thực hiện 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.swing.JOptionPane; 
import javax.swing.table.DefaultTableModel; 
public class frmDanhmucLoaiSP extends javax.swing.JFrame {
      private final LoaiSP lsp = new LoaiSP();  
      private boolean cothem=true; 
      private final DefaultTableModel tableModel = new DefaultTableModel(); 
    //Ham do du lieu vao tableModel 
    public void ShowData() throws SQLException{         
        ResultSet result=  lsp.ShowLoaiSP();           
        try {             
            while(result.next()){ // nếu còn đọc tiếp được một dòng dữ liệu 
                String rows[] = new String[2]; 
                rows[0] = result.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã hàng) 
                rows[1] = result.getString(2); // lấy dữ liệu tai cột số 2 ứng với tên hàng                    
                tableModel.addRow(rows); // đưa dòng dữ liệu vào tableModel  
                //mỗi lần có sự thay đổi dữ liệu ở tableModel thì Jtable sẽ tự động update  
            } 
        }  
       catch (SQLException e) { 
        }  
    }   
    //Ham xoa du lieu trong tableModel 
    public void ClearData() throws SQLException{ 
         //Lay chi so dong cuoi cung 
         int n=tableModel.getRowCount()-1; 
         for(int i=n;i>=0;i--) 
            tableModel.removeRow(i);//Remove tung dong          
    }  
       //Ham xoa cac TextField 
    private void setNull() 
    { 
        //Xoa trang cac JtextField 
        this.txtMaloai.setText(null); 
        this.txtTenloai.setText(null); 
        this.txtMaloai.requestFocus();       
    } 
    //Ham khoa cac TextField 
    private void setKhoa(boolean a) 
    { 
        //Khoa hoac mo khoa cho Cac JTextField 
        this.txtMaloai. setEnabled (!a); 
        this.txtTenloai. setEnabled (!a); 
    }   
    //Ham khoa cac Button 
    private void setButton(boolean a) 
    { 
        //Vo hieu hoac co hieu luc cho cac JButton 
        this.btThem. setEnabled (a); 
        this.btXoa. setEnabled (a); 
        this.btSua. setEnabled (a); 
        this.btLuu. setEnabled (!a); 
        this.btKLuu. setEnabled (!a); 
                this.btThoat. setEnabled (a); 
    }    
    public frmDanhmucLoaiSP() throws SQLException{ 
        initComponents(); // Khởi tạo các components trên JFrame                   
        String []colsName = {"Mã Loai", "Tên loai"}; 
        // đặt tiêu đề cột cho tableModel 
        tableModel.setColumnIdentifiers(colsName);   
        // kết nối jtable với tableModel   
        jTableLoaiSP.setModel(tableModel);   
        //gọi hàm ShowData để đưa dữ liệu vào tableModel  
        ShowData();  
        //goi Ham xoa trang cac TextField 
        setNull(); 
        //Goi ham Khoa cac TextField 
        setKhoa(true); 
        //Goi vo hieu 2 button Luu, K.Luu. Mo khoa 4 button con lao  
        setButton(true); 
    } 


  


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaloai = new javax.swing.JTextField();
        txtTenloai = new javax.swing.JTextField();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btLuu = new javax.swing.JButton();
        btKLuu = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLoaiSP = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("DANH MỤC LOẠI SẢN PHẨM");

        jLabel2.setText("Mã loại:");

        jLabel3.setText("Tên loại:");

        btThem.setText("Thêm");
        btThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btThemMouseClicked(evt);
            }
        });

        btSua.setText("Sửa");
        btSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSuaMouseClicked(evt);
            }
        });

        btXoa.setText("Xóa");
        btXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btXoaMouseClicked(evt);
            }
        });

        btLuu.setText("Lưu");
        btLuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLuuMouseClicked(evt);
            }
        });

        btKLuu.setText("Không lưu");
        btKLuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btKLuuMouseClicked(evt);
            }
        });

        btThoat.setText("Thoát");
        btThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btThoatMouseClicked(evt);
            }
        });

        jTableLoaiSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã Loại", "Tên Loại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableLoaiSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLoaiSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLoaiSP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenloai, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaloai, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btThem)
                                .addGap(18, 18, 18)
                                .addComponent(btXoa)
                                .addGap(18, 18, 18)
                                .addComponent(btSua)
                                .addGap(18, 18, 18)
                                .addComponent(btLuu)
                                .addGap(18, 18, 18)
                                .addComponent(btKLuu)
                                .addGap(18, 18, 18)
                                .addComponent(btThoat)))))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtMaloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btKLuu)
                    .addComponent(btLuu)
                    .addComponent(btSua)
                    .addComponent(btXoa)
                    .addComponent(btThoat))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableLoaiSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLoaiSPMouseClicked
        // TODO add your handling code here:
        //Hien thi du lieu len cac JTextField khi Click chuot vao JTable 
        try{ 
            //Lay chi so dong dang chon 
            int row =this.jTableLoaiSP.getSelectedRow(); 
            String ml=(this.jTableLoaiSP.getModel().getValueAt(row,0)).toString(); 
            ResultSet rs= lsp.ShowLoaiSP(ml);//Goi ham lay du lieu theo ma loai 
            if(rs.next())//Neu co du lieu 
            { 
             this.txtMaloai.setText(rs.getString("Maloai")); 
             this.txtTenloai.setText(rs.getString("Tenloai")); 
            } 
        } 
     catch (SQLException e) { 
        } 
    }//GEN-LAST:event_jTableLoaiSPMouseClicked

    private void btThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThoatMouseClicked
        // TODO add your handling code here:
         this.dispose(); 
    }//GEN-LAST:event_btThoatMouseClicked

    private void btXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXoaMouseClicked
        // TODO add your handling code here:
             String ml=txtMaloai.getText(); 
        try { 
            if(ml.length()==0)              
                JOptionPane.showMessageDialog(null,"Chon 1 loai SP de xoa", "Thong bao",1); 
            else 
            { 
                if(JOptionPane.showConfirmDialog(null, "Ban muon xoa loai " + ml + "  nay hay khong?","Thong bao",2)==0) 
                {     
                    lsp.DeleteData(ml);//goi ham xoa du lieu theo ma loai 
                    ClearData();//Xoa du lieu trong tableModel 
                    ShowData();//Do du lieu vao table Model 
                    setNull();//Xoa trang Textfield 
                } 
             } 
        }  
        catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null,"Xóa thất bại","Thong bao",1); 
        } 
    }//GEN-LAST:event_btXoaMouseClicked

    private void btSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSuaMouseClicked
        // TODO add your handling code here:
        String ml=txtMaloai.getText(); 
        if(ml.length()==0) //Chua chon Ma loai              
                JOptionPane.showMessageDialog(null,"Vui long chon loi can sua", "Thong bao",1); 
                else 
        { 
            setKhoa(false);//Mo khoa cac TextField 
            this.txtMaloai.enable(false); 
            setButton(false); //Khoa cac Button 
            cothem=false; //Gan cothem=false de ghi nhan trang thai la sua 
        } 
    }//GEN-LAST:event_btSuaMouseClicked

    private void btThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThemMouseClicked
        // TODO add your handling code here:
        setNull();//Xoa trang TextField 
        setKhoa(false);//Mo khoa TextField 
        setButton(false);//Goi ham khoa cac Button 
        cothem=true;//Gan cothem = true de ghi nhan trang thai them moi
    }//GEN-LAST:event_btThemMouseClicked

    private void btLuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLuuMouseClicked
        // TODO add your handling code here:
              String ml=txtMaloai.getText(); 
        String tl=txtTenloai.getText(); 
         if(ml.length()==0 || tl.length()==0)              
                JOptionPane.showMessageDialog(null, "Vui long nhap Ma loai va ten loai","Thong bao",1); 
         else 
            if(ml.length()>2 || tl.length()>30)              
                JOptionPane.showMessageDialog(null, "Ma loai chi 2 ky tu, ten loai la 20","Thong bao",1); 
            else    
            { 
              try { 
                if(cothem==true)    //Luu cho tthem moi            
                    lsp.InsertData(ml, tl); 
                else                //Luu cho sua 
                    lsp.EditData(ml, tl); 
                ClearData(); //goi ham xoa du lieu tron tableModel 
                ShowData(); //Do lai du lieu vao Table Model 
              } 
              catch (SQLException ex) { 
                   JOptionPane.showMessageDialog(null,"Cap nhat that bai", "Thong bao",1); 
              }             
             setKhoa(false); 
             setButton(true); 
         } 
    }//GEN-LAST:event_btLuuMouseClicked

    private void btKLuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btKLuuMouseClicked
        // TODO add your handling code here:
        setNull(); 
        setKhoa(true); 
        setButton(true);
    }//GEN-LAST:event_btKLuuMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
        /* Set the Nimbus look and feel */
        frmDanhmucLoaiSP f = new frmDanhmucLoaiSP(); 
        f.setVisible(true); //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(frmDanhmucLoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDanhmucLoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDanhmucLoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDanhmucLoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

//Code tu sinh khi thiet ke giao dien va cac code khac ở đây……. 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btKLuu;
    private javax.swing.JButton btLuu;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLoaiSP;
    private javax.swing.JTextField txtMaloai;
    private javax.swing.JTextField txtTenloai;
    // End of variables declaration//GEN-END:variables
}

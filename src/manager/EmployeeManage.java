/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import clerk.*;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class EmployeeManage extends javax.swing.JFrame {

    
    /**
     * Creates new form RegisterStudent
     */
    public EmployeeManage() {
        initComponents();
        loadAllSchedules();
        lbldate.setText(LocalDate.now()+"");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        grpwritten = new javax.swing.ButtonGroup();
        grptrial = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        btnadd = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        txtid = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtdesig = new javax.swing.JTextField();
        btndelete = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        txtnic = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtconno = new javax.swing.JTextField();
        btnregister = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnupdatew = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        btnclear1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnadd.setBackground(new java.awt.Color(0, 0, 102));
        btnadd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnadd.setText("New Employee");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel4.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 100, 180, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setText("NIC");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 50, 30));

        txtname.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtname.setToolTipText("");
        txtname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnameFocusGained(evt);
            }
        });
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel4.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 370, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel11.setText("Full Name");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 100, 30));

        tbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp ID", "Name", "Address", "NIC", "Contact", "Designation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 950, 220));

        txtid.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtid.setToolTipText("");
        txtid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtidFocusGained(evt);
            }
        });
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel4.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 120, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel12.setText("Employee ID");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, 30));

        txtdesig.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtdesig.setToolTipText("");
        txtdesig.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdesigFocusGained(evt);
            }
        });
        txtdesig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdesigActionPerformed(evt);
            }
        });
        jPanel4.add(txtdesig, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 140, 30));

        btndelete.setBackground(new java.awt.Color(255, 255, 255));
        btndelete.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 260, 120, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel13.setText("Designation");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 120, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel14.setText("Address");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 80, 30));

        txtaddress.setColumns(20);
        txtaddress.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtaddress.setRows(5);
        jScrollPane2.setViewportView(txtaddress);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 370, 140));

        txtnic.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtnic.setToolTipText("");
        txtnic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnicFocusGained(evt);
            }
        });
        txtnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnicActionPerformed(evt);
            }
        });
        jPanel4.add(txtnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 220, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel15.setText("Contact No");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 110, 30));

        txtconno.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtconno.setToolTipText("");
        txtconno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtconnoFocusGained(evt);
            }
        });
        txtconno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconnoActionPerformed(evt);
            }
        });
        jPanel4.add(txtconno, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 140, 30));

        btnregister.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnregister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        jPanel4.add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 50, 40));

        btnclear.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear2.png"))); // NOI18N
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel4.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 320, 60, 40));

        btnupdatew.setBackground(new java.awt.Color(255, 255, 255));
        btnupdatew.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnupdatew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update2.png"))); // NOI18N
        btnupdatew.setText("Update");
        btnupdatew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatewActionPerformed(evt);
            }
        });
        jPanel4.add(btnupdatew, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 210, 120, 40));

        jPanel3.setBackground(new java.awt.Color(0, 102, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(1030, 51));

        jLabel1.setBackground(new java.awt.Color(0, 102, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/contact.png"))); // NOI18N
        jLabel1.setText("Manage Employees");
        jLabel1.setMinimumSize(new java.awt.Dimension(1030, 51));
        jLabel1.setPreferredSize(new java.awt.Dimension(1030, 51));

        lbldate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbldate.setForeground(new java.awt.Color(255, 255, 255));
        lbldate.setText("Date");

        btnclear1.setBackground(new java.awt.Color(0, 0, 0));
        btnclear1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnclear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        btnclear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 409, Short.MAX_VALUE)
                .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnclear1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnclear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbldate))))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1040, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusGained
    }//GEN-LAST:event_txtnameFocusGained

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed

    }//GEN-LAST:event_txtnameActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        AddEmployee frm=new AddEmployee();
        frm.show();
        this.hide();
    }//GEN-LAST:event_btnaddActionPerformed

    private void txtidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidFocusGained
        
    }//GEN-LAST:event_txtidFocusGained

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        search();
    }//GEN-LAST:event_txtidActionPerformed

    private void txtdesigFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdesigFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdesigFocusGained

    private void txtdesigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdesigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdesigActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        int row=tbl.rowAtPoint(evt.getPoint());
        txtid.setText(String.valueOf(tbl.getValueAt(row, 0)));
        txtname.setText(String.valueOf(tbl.getValueAt(row, 1)));
        txtaddress.setText(String.valueOf(tbl.getValueAt(row, 2)));
        txtnic.setText(String.valueOf(tbl.getValueAt(row,3)));
        txtconno.setText(String.valueOf(tbl.getValueAt(row,4)));
        txtdesig.setText(String.valueOf(tbl.getValueAt(row,5)));
    }//GEN-LAST:event_tblMouseClicked

    private void txtnicFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnicFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnicFocusGained

    private void txtnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnicActionPerformed

    private void txtconnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtconnoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconnoFocusGained

    private void txtconnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconnoActionPerformed

    private void search(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersms", "root","");
            String SQL="SELECT * FROM employee WHERE empID=?";
            PreparedStatement pstm=conn.prepareStatement(SQL);
            pstm.setObject(1,txtid.getText());
            ResultSet rst=pstm.executeQuery();
            txtname.setText(rst.getString(2));
            txtaddress.setText(rst.getString(3));
            txtnic.setText(rst.getString(4));
            txtconno.setText(rst.getInt(5)+"");
            txtdesig.setText(rst.getString(6));
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmployeeManage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeManage.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnclearActionPerformed

    private void clearForm(){
        txtid.setText("");
        txtnic.setText("");
        txtname.setText("");
        txtaddress.setText("");
        txtconno.setText("");
        txtdesig.setText("");
    }
    private void btnupdatewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatewActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersms", "root","");
            String SQL="UPDATE employee SET fullName=?, address=?, nic=?, contactNo=?, designation=? WHERE empID=?";
            PreparedStatement pstm=conn.prepareStatement(SQL);
            pstm.setObject(6,txtid.getText());
            pstm.setObject(1, txtname.getText());
            pstm.setObject(2,txtaddress.getText());
            pstm.setObject(3,txtnic.getText());
            pstm.setObject(4, txtconno.getText());
            pstm.setObject(5,txtdesig.getText());
            if (pstm.executeUpdate()>0) {
                JOptionPane.showMessageDialog(this, "Employee Details Updated Successfully!!!");
                loadAllSchedules();
                clearForm();
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentExam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnupdatewActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        search();
    }//GEN-LAST:event_btnregisterActionPerformed

    private void btnclear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclear1ActionPerformed
        manager.DashboardManager frm=new manager.DashboardManager();
        frm.show();
        this.hide();
    }//GEN-LAST:event_btnclear1ActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersms","root","");
            String sql="DELETE FROM employee WHERE empID=?";
            PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.setObject(1, txtid.getText());
            if (pstm.executeUpdate()>0) {
                JOptionPane.showMessageDialog(this, "Employee Deleted Successfully!!!");
                loadAllSchedules();
                clearForm();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmployeeManage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeManage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void loadAllSchedules(){
        DefaultTableModel dtm=(DefaultTableModel)tbl.getModel();
        dtm.setRowCount(0);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersms", "root","");
            String sql="SELECT * FROM employee";
            PreparedStatement pstm=conn.prepareStatement(sql);
            ResultSet rst=pstm.executeQuery(); 
            while (rst.next()) {
                Object [] rowData={rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6)};
                dtm.addRow(rowData);
            }  
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
            java.util.logging.Logger.getLogger(EmployeeManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeManage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnclear1;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnregister;
    private javax.swing.JButton btnupdatew;
    private javax.swing.ButtonGroup grptrial;
    private javax.swing.ButtonGroup grpwritten;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbldate;
    private javax.swing.JTable tbl;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtconno;
    private javax.swing.JTextField txtdesig;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnic;
    // End of variables declaration//GEN-END:variables
}

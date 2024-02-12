/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.sql.ResultSet;
import java.util.Vector;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.MySQL;

/**
 *
 * @author Navod Madusanka
 */
public class Driver extends javax.swing.JFrame {
    
    Car_Renting cr;

    /**
     * Creates new form owner
     */
    public Driver() {
        initComponents();
        loadCity();
        loadTable();
    }
    
    public Driver(Car_Renting parent,boolean model) {
        this.cr = parent;
        initComponents();
        loadCity();
        loadTable();
    }

    public void loadTable() {
        try {
            ResultSet rs = MySQL.search("SELECT * FROM `driver` INNER JOIN `city` ON `driver`.`city_id` = `city`.`id` ORDER BY `fname` ASC");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("nic"));
                v.add(rs.getString("fname") + " " + rs.getString("lname"));
                v.add(rs.getString("mobile"));
                v.add(rs.getString("email"));
                v.add(rs.getString("address"));
                v.add(rs.getString("name"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resetFields() {
        jTextField1.setText("");
        jTextField1.grabFocus();
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jComboBox1.setSelectedIndex(0);
        jButton1.setEnabled(true);
        jTextField1.setEnabled(true);
        jButton2.setEnabled(false);
    }

    public void loadCity() {
        try {
            ResultSet rs = MySQL.search("SELECT * FROM `city`");
            Vector v = new Vector();
            v.add("Select");
            while (rs.next()) {
                v.add(rs.getString("name"));
            }
            DefaultComboBoxModel dcm = new DefaultComboBoxModel(v);
            jComboBox1.setModel(dcm);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Owner");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Driver Registration :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("NIC Number");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("First Name");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Last Name");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Mobile");

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Email");

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Address");

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("City");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Update");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mobile", "Email", "Address", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:

        String text = jTextField4.getText() + evt.getKeyChar();

        if (evt.isControlDown()) {
            evt.consume();
        } else {

            if (text.length() == 1) {
                if (!text.equals("0")) {
                    evt.consume();
                }
            } else if (text.length() == 2) {
                if (!text.equals("07")) {
                    evt.consume();
                }
            } else if (text.length() == 3) {
                if (!Pattern.compile("07[01245678]").matcher(text).matches()) {
                    evt.consume();
                }
            } else if (text.length() <= 10) {
                if (!Pattern.compile("07[01245678][0-9]+").matcher(text).matches()) {
                    evt.consume();
                }
            } else {
                evt.consume();
                jTextField4.setEnabled(false);
            }

        }

    }//GEN-LAST:event_jTextField4KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String nic = jTextField1.getText();
        String fname = jTextField2.getText();
        String lname = jTextField3.getText();
        String mobile = jTextField4.getText();
        String email = jTextField5.getText();
        String address = jTextField6.getText();
        String city = jComboBox1.getSelectedItem().toString();

        if (nic.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please Enter the NIC Number", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextField1.grabFocus();
        } else if (fname.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please Enter the First name", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextField2.grabFocus();
        } else if (lname.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please Enter the last name", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextField3.grabFocus();
        } else if (mobile.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please Enter the Mobile Number", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextField4.grabFocus();
        } else if (email.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please Enter the Email Address", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextField5.grabFocus();
        } else if (!Pattern.compile("\\b[a-z0-9._%-]+@[a-z0-9.-]+\\.[a-z]{2,4}\\b").matcher(email).matches()) {
            JOptionPane.showMessageDialog(this, "Invalied Email Address", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextField5.grabFocus();
        } else if (address.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please Enter the Address", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextField6.grabFocus();
        } else if (city.equals("Select")) {
            JOptionPane.showMessageDialog(this, "Please Select the City", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextField6.grabFocus();
        } else {
            try {
                ResultSet rs = MySQL.search("SELECT * FROM `driver` WHERE `nic` = '" + nic + "'");
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "This Diver is already excits", "Warning", JOptionPane.WARNING_MESSAGE);
                    resetFields();
                } else {

                    ResultSet cityrs = MySQL.search("SELECT `id` FROM `city` WHERE `name` = '" + city + "'");
                    String city_id = "";
                    if (cityrs.next()) {
                        city_id = cityrs.getString("id");
                    }

                    MySQL.iud("iNSERT INTO `driver` (`nic`,`fname`,`lname`,`mobile`,`email`,`address`,`city_id`) VALUES('" + nic + "','" + fname + "','" + lname + "','" + mobile + "','" + email + "','" + address + "','" + city_id + "')");
                    resetFields();
                    loadTable();
                    JOptionPane.showMessageDialog(this, "New Driver Added", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        String search = jTextField7.getText();

        try {
            ResultSet rs = MySQL.search("SELECT * FROM `driver` INNER JOIN `city` ON `driver`.`city_id` = `city`.`id` WHERE `nic` = '" + search + "' ORDER BY `fname` ASC");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("nic"));
                v.add(rs.getString("fname") + " " + rs.getString("lname"));
                v.add(rs.getString("mobile"));
                v.add(rs.getString("email"));
                v.add(rs.getString("address"));
                v.add(rs.getString("name"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
        // TODO add your handling code here:

        String search = jTextField7.getText();
        if (search.isBlank()) {
            loadTable();
        }

    }//GEN-LAST:event_jTextField7KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        int selectedrow = jTable1.getSelectedRow();

        if (evt.getClickCount() == 1) {
            jTextField1.setText(jTable1.getValueAt(selectedrow, 0).toString());
            String fnameandlnmae = jTable1.getValueAt(selectedrow, 1).toString();
            String[] name = fnameandlnmae.split(" ");
            jTextField2.setText(name[0]);
            jTextField3.setText(name[1]);
            jTextField4.setText(jTable1.getValueAt(selectedrow, 2).toString());
            jTextField5.setText(jTable1.getValueAt(selectedrow, 3).toString());
            jTextField6.setText(jTable1.getValueAt(selectedrow, 4).toString());
            jComboBox1.setSelectedItem(jTable1.getValueAt(selectedrow, 5));
            jButton1.setEnabled(false);
            jTextField1.setEnabled(false);
            jButton2.setEnabled(true);
        }else if (evt.getClickCount() == 2) {
            cr.jLabel7.setText(jTable1.getValueAt(selectedrow, 0).toString());
            this.dispose();
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        String nic = jTextField1.getText();
        String fname = jTextField2.getText();
        String lname = jTextField3.getText();
        String mobile = jTextField4.getText();
        String email = jTextField5.getText();
        String address = jTextField6.getText();
        String city = jComboBox1.getSelectedItem().toString();

        if (nic.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please Enter the NIC Number", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextField1.grabFocus();
        } else if (fname.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please Enter the First name", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextField2.grabFocus();
        } else if (lname.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please Enter the last name", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextField3.grabFocus();
        } else if (mobile.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please Enter the Mobile Number", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextField4.grabFocus();
        } else if (email.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please Enter the Email Address", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextField5.grabFocus();
        } else if (!Pattern.compile("\\b[a-z0-9._%-]+@[a-z0-9.-]+\\.[a-z]{2,4}\\b").matcher(email).matches()) {
            JOptionPane.showMessageDialog(this, "Invalied Email Address", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextField5.grabFocus();
        } else if (address.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please Enter the Address", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextField6.grabFocus();
        } else if (city.equals("Select")) {
            JOptionPane.showMessageDialog(this, "Please Select the City", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextField6.grabFocus();
        } else {
            try {
                ResultSet cityrs = MySQL.search("SELECT `id` FROM `city` WHERE `name` = '" + city + "'");
                String city_id = "";
                if (cityrs.next()) {
                    city_id = cityrs.getString("id");
                }

                MySQL.iud("UPDATE `driver` SET `fname` = '"+fname+"', `lname` = '"+lname+"', `mobile` = '"+mobile+"', `email` = '"+email+"', `address` = '"+address+"', `city_id` = '"+city_id+"' WHERE `nic` = '"+nic+"'");
                resetFields();
                loadTable();
                JOptionPane.showMessageDialog(this, "Driver updated", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Driver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}

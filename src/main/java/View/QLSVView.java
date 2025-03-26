/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.*;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import Controller.*;
import database.DatabaseConnection;
import database.ThiSinhDAO;

//import java.awt.Font;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.Action;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public final class QLSVView extends javax.swing.JFrame {


    public QLSVView() {
        initComponents();
        myinit();
    }

    public void myinit() {

        ArrayList<Tinh> listTinh=Tinh.getDSTinh();
        for (Tinh t : listTinh) {
            BPValueFind.addItem(t.getTenTinh());
            BPValue2.addItem(t.getTenTinh());
        }
        sexGroup = new ButtonGroup();
        sexGroup.add(radiobtnM);
        sexGroup.add(radiobtnF);

//        qlController
        Action controllerQL = new qlController(this);
        addBtn1.addActionListener(controllerQL);
        saveBtn1.addActionListener(controllerQL);
        removeBtn1.addActionListener(controllerQL);
        updateBtn1.addActionListener(controllerQL);
        cancelBtn.addActionListener(controllerQL);
        btnFind.addActionListener(controllerQL);
        menuOpen.addActionListener(controllerQL);
        menuSave.addActionListener(controllerQL);
        menuExit.addActionListener(controllerQL);
        menuAboutMe.addActionListener(controllerQL);
    }

    public void clearForm() {
        IDValue.setText("");
        dateValue.setText("");
        nameValue.setText("");
        BPValue2.setSelectedIndex(0);
        mathValue.setText("");
        physicalValue.setText("");
        chemistryValue.setText("");
        sexGroup.clearSelection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        studentListLB = new javax.swing.JLabel();
        BPValueFind = new javax.swing.JComboBox<>();
        btnFind = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        IDLabelFind = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        BPLabelFind = new javax.swing.JLabel();
        IDLabelA = new javax.swing.JLabel();
        nameLabelA = new javax.swing.JLabel();
        BPLabelA = new javax.swing.JLabel();
        dateLabelA = new javax.swing.JLabel();
        sexLabelA = new javax.swing.JLabel();
        mathLabel = new javax.swing.JLabel();
        physicalLabel = new javax.swing.JLabel();
        chemistryLabel = new javax.swing.JLabel();
        IDValueFind = new javax.swing.JTextField();
        IDValue = new javax.swing.JTextField();
        nameValue = new javax.swing.JTextField();
        dateValue = new javax.swing.JTextField();
        mathValue = new javax.swing.JTextField();
        physicalValue = new javax.swing.JTextField();
        chemistryValue = new javax.swing.JTextField();
        radiobtnF = new javax.swing.JRadioButton();
        radiobtnM = new javax.swing.JRadioButton();
        BPValue2 = new javax.swing.JComboBox<>();
        cancelBtn = new javax.swing.JButton();
        addBtn1 = new javax.swing.JButton();
        removeBtn1 = new javax.swing.JButton();
        updateBtn1 = new javax.swing.JButton();
        saveBtn1 = new javax.swing.JButton();
        menuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuOpen = new javax.swing.JMenuItem();
        menuSave = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuAboutMe = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentListLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studentListLB.setText("Student List");
        jPanel2.add(studentListLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 90, 30));

        BPValueFind.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BPValueFind.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BPValueFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPValueFindActionPerformed(evt);
            }
        });
        jPanel2.add(BPValueFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 11, 120, 30));

        btnFind.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnFind.setLabel("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        jPanel2.add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 15, 90, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 640, 10));

        IDLabelFind.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IDLabelFind.setText("StudentID");
        jPanel2.add(IDLabelFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 15, -1, 30));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        studentTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Place", "Date", "Sex", "Math", "Physicsal", "Chemistry"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(studentTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 610, 140));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 640, 10));

        BPLabelFind.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BPLabelFind.setText("BirthPlace");
        jPanel2.add(BPLabelFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, -1, 30));

        IDLabelA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IDLabelA.setText("ID");
        jPanel2.add(IDLabelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 30));

        nameLabelA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLabelA.setText("Name");
        jPanel2.add(nameLabelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 30));

        BPLabelA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BPLabelA.setText("BirthPlace");
        jPanel2.add(BPLabelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 30));

        dateLabelA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dateLabelA.setText("Date");
        jPanel2.add(dateLabelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 30));

        sexLabelA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sexLabelA.setText("Sex");
        jPanel2.add(sexLabelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        mathLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mathLabel.setText("Math");
        jPanel2.add(mathLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, 30));

        physicalLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        physicalLabel.setText("Physical");
        jPanel2.add(physicalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, 30));

        chemistryLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chemistryLabel.setText("Chemistry");
        jPanel2.add(chemistryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, 30));

        IDValueFind.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IDValueFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDValueFindActionPerformed(evt);
            }
        });
        jPanel2.add(IDValueFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 15, 130, -1));

        IDValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IDValue.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel2.add(IDValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 170, -1));

        nameValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameValue.setToolTipText("");
        nameValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameValueActionPerformed(evt);
            }
        });
        jPanel2.add(nameValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 170, -1));

        dateValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateValue.setText("--/--/----");
        dateValue.setToolTipText("");
        jPanel2.add(dateValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 170, -1));

        mathValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(mathValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 170, -1));

        physicalValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(physicalValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 170, -1));

        chemistryValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(chemistryValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 170, -1));

        radiobtnF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radiobtnF.setText("Female");
        radiobtnF.setActionCommand("Male");
        radiobtnF.setAutoscrolls(true);
        radiobtnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnFActionPerformed(evt);
            }
        });
        jPanel2.add(radiobtnF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, -1));

        radiobtnM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radiobtnM.setText("Male");
        radiobtnM.setAutoscrolls(true);
        radiobtnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnMActionPerformed(evt);
            }
        });
        jPanel2.add(radiobtnM, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        BPValue2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BPValue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPValue2ActionPerformed(evt);
            }
        });
        jPanel2.add(BPValue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 170, 30));

        cancelBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel2.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 408, 90, 32));

        addBtn1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        addBtn1.setText("Add");
        addBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(addBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 408, 90, 32));

        removeBtn1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        removeBtn1.setText("Remove");
        removeBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(removeBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 408, 90, 32));

        updateBtn1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        updateBtn1.setText("Update");
        updateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(updateBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 408, 90, 32));

        saveBtn1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        saveBtn1.setText("Save");
        saveBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(saveBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 408, 90, 32));

        menuBar1.setBackground(new java.awt.Color(255, 204, 204));
        menuBar1.setName("menuBar1"); // NOI18N

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        menuOpen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuOpen.setText("Open");
        menuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpenActionPerformed(evt);
            }
        });
        jMenu1.add(menuOpen);

        menuSave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuSave.setText("SaveFile");
        menuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaveActionPerformed(evt);
            }
        });
        jMenu1.add(menuSave);

        menuExit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuExit.setText("Exit");
        jMenu1.add(menuExit);

        menuBar1.add(jMenu1);

        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenu2.setLabel("About");

        menuAboutMe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuAboutMe.setText("About Me");
        jMenu2.add(menuAboutMe);

        menuBar1.add(jMenu2);

        setJMenuBar(menuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuOpenActionPerformed

    private void menuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSaveActionPerformed

    private void BPValueFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPValueFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BPValueFindActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFindActionPerformed

    private void radiobtnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtnFActionPerformed

    private void radiobtnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtnMActionPerformed

    private void nameValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameValueActionPerformed

    private void IDValueFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDValueFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDValueFindActionPerformed

    private void BPValue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPValue2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BPValue2ActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void addBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBtn1ActionPerformed

    private void removeBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeBtn1ActionPerformed

    private void updateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateBtn1ActionPerformed

    private void saveBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveBtn1ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(QLSVView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSVView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSVView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSVView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            DatabaseConnection db = DatabaseConnection.getInstance();
            Connection conn = db.getConnectionn();

            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new QLSVView().setVisible(true);
                }
            });

            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                db.disconnect();
            }));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BPLabelA;
    private javax.swing.JLabel BPLabelFind;
    private javax.swing.JComboBox<String> BPValue2;
    private javax.swing.JComboBox<String> BPValueFind;
    private javax.swing.JLabel IDLabelA;
    private javax.swing.JLabel IDLabelFind;
    private javax.swing.JTextField IDValue;
    private javax.swing.JTextField IDValueFind;
    private javax.swing.JButton addBtn1;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel chemistryLabel;
    private javax.swing.JTextField chemistryValue;
    private javax.swing.JLabel dateLabelA;
    private javax.swing.JTextField dateValue;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel mathLabel;
    private javax.swing.JTextField mathValue;
    private javax.swing.JMenuItem menuAboutMe;
    private javax.swing.JMenuBar menuBar1;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuOpen;
    private javax.swing.JMenuItem menuSave;
    private javax.swing.JLabel nameLabelA;
    private javax.swing.JTextField nameValue;
    private javax.swing.JLabel physicalLabel;
    private javax.swing.JTextField physicalValue;
    private javax.swing.JRadioButton radiobtnF;
    private javax.swing.JRadioButton radiobtnM;
    private javax.swing.JButton removeBtn1;
    private javax.swing.JButton saveBtn1;
    private javax.swing.JLabel sexLabelA;
    private javax.swing.JLabel studentListLB;
    private javax.swing.JTable studentTable;
    private javax.swing.JButton updateBtn1;
    // End of variables declaration//GEN-END:variables
    private ButtonGroup sexGroup;

    public JComboBox<String> getBPValue2() {
        return BPValue2;
    }

    public JComboBox<String> getBPValueFind() {
        return BPValueFind;
    }

    public JTextField getIDValue() {
        return IDValue;
    }

    public JTextField getIDValueF() {
        return IDValueFind;
    }

    public JTextField getChemistryValue() {
        return chemistryValue;
    }

    public JTextField getDateValue() {
        return dateValue;
    }

    public JTextField getMathValue() {
        return mathValue;
    }

    public JTextField getNameValue() {
        return nameValue;
    }

    public JTextField getPhysicalValue() {
        return physicalValue;
    }

    public JRadioButton getRadiobtnF() {
        return radiobtnF;
    }

    public JRadioButton getRadiobtnM() {
        return radiobtnM;
    }

    public ButtonGroup getSexGroup() {
        return sexGroup;
    }

    public void setBPValue2(String BPValue2) {
        this.BPValue2.setSelectedItem(BPValue2);
    }

    public void setBPValueF(JLabel BPValueF) {
        this.BPLabelFind = BPValueF;
    }

    public void setIDValue(String IDValue) {
        this.IDValue.setText(IDValue);
    }

    public void setIDValueF(JTextField IDValueF) {
        this.IDValueFind = IDValueF;
    }

    public void setChemistryValue(String chemistryValue) {
        this.chemistryValue.setText(chemistryValue);
    }

    public void setDateValue(String dateValue) {
        this.dateValue.setText(dateValue);
    }

    public void setMathValue(String mathValue) {
        this.mathValue.setText(mathValue);
    }

    public void setNameValue(String nameValue) {
        this.nameValue.setText(nameValue);
    }

    public void setPhysicalValue(String physicalValue) {
        this.physicalValue.setText(physicalValue);
    }

    public ThiSinh collectFormData() {
        String id = this.getIDValue().getText();
        String name = this.getNameValue().getText();
        Tinh BP = Tinh.getTinhById(this.getBPValue2().getSelectedIndex());
        Float chemistry = Float.valueOf(this.getChemistryValue().getText());
        Float math = Float.valueOf(this.getMathValue().getText());
        Float physical = Float.valueOf(this.getPhysicalValue().getText());
        Date date = new Date(this.getDateValue().getText());
        boolean bsex = true;
        if (this.getRadiobtnF().isSelected()) {
            bsex = false;
        }
        ThiSinh ts = new ThiSinh(id, name, BP, date, bsex, math, physical, chemistry);
        return ts;
    }

    public void addTSToTable(ThiSinh ts) {
        DefaultTableModel modelTable = (DefaultTableModel) studentTable.getModel();

        modelTable.addRow(new Object[]{ts.getMaThiSinh(),
            ts.getTenThiSinh(),
            ts.getQueQuan().getTenTinh(),
            ts.getNgaySinh().getDate() + "/" + (ts.getNgaySinh().getMonth() + 1) + "/"
            + (ts.getNgaySinh().getYear() + 1900) + "" ,
            ts.isGioiTinh() ? "Male" : "Female",
            ts.getDiemMon1(),
            ts.getDiemMon2(),
            ts.getDiemMon3()
        });
    }

    public void addOrUpdateTS(ThiSinh ts) {
        DefaultTableModel modelTable = (DefaultTableModel) studentTable.getModel();
        ThiSinhDAO dao = new ThiSinhDAO();

        if (dao.selectByID(ts.getMaThiSinh()).isEmpty()) {
            dao.insertDB(ts);
            addTSToTable(ts);
        } else {
            dao.updateDB(ts);
            int rowCount = modelTable.getRowCount();
            for (int i = 0; i < rowCount; i++) {
                String id = (String) modelTable.getValueAt(i, 0);
                if (id.equals(ts.getMaThiSinh())) {
                    modelTable.setValueAt(ts.getMaThiSinh(), i, 0);
                    modelTable.setValueAt(ts.getTenThiSinh(), i, 1);
                    modelTable.setValueAt(ts.getQueQuan().getTenTinh(), i, 2);
                    modelTable.setValueAt(ts.getNgaySinh().getDate() + "/" + (ts.getNgaySinh().getMonth() + 1) + "/"
                            + (ts.getNgaySinh().getYear() + 1900) + "",i, 3);
                    modelTable.setValueAt(ts.isGioiTinh() ? "Male" : "Female", i, 4);
                    modelTable.setValueAt(ts.getDiemMon1(), i, 5);
                    modelTable.setValueAt(ts.getDiemMon2(), i, 6);
                    modelTable.setValueAt(ts.getDiemMon3(), i, 7);
                    break;
                }
            }
        }
    }

    public ThiSinh getSelectedTS() {
        DefaultTableModel model_table = (DefaultTableModel) studentTable.getModel();
        int i_row = studentTable.getSelectedRow();

        String id = (String) model_table.getValueAt(i_row, 0);
        String name = model_table.getValueAt(i_row, 1) + "";
        Tinh BP = Tinh.getTinhByTen(model_table.getValueAt(i_row, 2) + "");
        String s_ngaySinh = model_table.getValueAt(i_row, 3) + "";
        Date date = new Date(s_ngaySinh);
        String textGioiTinh = model_table.getValueAt(i_row, 4) + "";
        boolean bsex = textGioiTinh.equals("Nam");
        float math = Float.parseFloat(model_table.getValueAt(i_row, 5) + "");
        float physical = Float.parseFloat(model_table.getValueAt(i_row, 6) + "");
        float chemistry = Float.parseFloat(model_table.getValueAt(i_row, 7) + "");

        return new ThiSinh(id, name, BP, date, bsex, math, physical, chemistry);
    }

    public void showSelectedTS() {
        DefaultTableModel modelTable = (DefaultTableModel) studentTable.getModel();
        int rIndex = studentTable.getSelectedRow();
        String id = (String) modelTable.getValueAt(rIndex, 0);
        String name = (String) modelTable.getValueAt(rIndex, 1);
        String BP = (String) modelTable.getValueAt(rIndex, 2);
        String date = (String) modelTable.getValueAt(rIndex, 3);
        String sex = (String) modelTable.getValueAt(rIndex, 4);
        String math = modelTable.getValueAt(rIndex, 5) + "";
        String physical = modelTable.getValueAt(rIndex, 6) + "";
        String chemistry = modelTable.getValueAt(rIndex, 7) + "";

        if (sex.equals("Male")) {
            this.radiobtnM.setSelected(true);
        } else {
            this.radiobtnF.setSelected(true);
        }
        this.setIDValue(id);
        this.setNameValue(name);
        this.setBPValue2(BP);
        this.setDateValue(date);
        this.setMathValue(math);
        this.setPhysicalValue(physical);
        this.setChemistryValue(chemistry);
    }

    public void removeTS() {

        int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắn chắn xóa dòng đã chọn?");
        DefaultTableModel modelTable = (DefaultTableModel) studentTable.getModel();
        int rIndex = studentTable.getSelectedRow();

        if (luaChon == JOptionPane.YES_OPTION) {
            ThiSinh ts = this.getSelectedTS();
            int ok = new ThiSinhDAO().deleteDB(ts);
            modelTable.removeRow(rIndex);
        }

    }

    public void Finding() {
        String idF = this.getIDValueF().getText();
        int bpFIndex = this.getBPValueFind().getSelectedIndex();
        DefaultTableModel modelTable = (DefaultTableModel) studentTable.getModel();
        modelTable.getDataVector().removeAllElements();
        modelTable.fireTableDataChanged();

        ThiSinhDAO dao = new ThiSinhDAO();
        ArrayList<ThiSinh> resultList;
        if (idF.isEmpty() && bpFIndex == 0) {
            resultList = dao.selectAllDB();
        } else if (!idF.isEmpty()) {
            resultList = dao.selectByID(idF);
        } else {
            Tinh bpF = Tinh.getTinhById(bpFIndex);
            resultList = dao.selectByCondition(" \"TinhID\" = " + bpF.getMaTinh());
        }

        for (ThiSinh ts : resultList) {
            addTSToTable(ts);
        }
    }

    public void AboutMe() {
        JOptionPane.showConfirmDialog(null, "Welcome to our tool!!!!!!!!", null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

    }

    public void Exit() {
        int choose = JOptionPane.showConfirmDialog(null, "Do you want to Exit ?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choose == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

//    private void saveFile(String path) {
//        try {
//            this.model.setTenFile(path);
//            FileOutputStream fos = new FileOutputStream(path);
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            for (Object ts : this.model.getDsThiSinh()) {
//                oos.writeObject((ThiSinh) ts);
//            }
//            oos.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void SaveFile() {
//        if (this.model.getTenFile().length() > 0) {
//            saveFile(this.model.getTenFile());
//        } else {
//            JFileChooser fc = new JFileChooser();
//            int returnVal = fc.showSaveDialog(this);
//            if (returnVal == JFileChooser.APPROVE_OPTION) {
//                File file = fc.getSelectedFile();
//                saveFile(file.getAbsolutePath());
//            }
//        }
//    }
//
//
//    public void openFile(File file) {
//        ArrayList ds = new ArrayList();
//        try {
//            this.model.setTenFile(file.getAbsolutePath());
//            FileInputStream fis = new FileInputStream(file);
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            ThiSinh ts = null;
//            while ((ts = (ThiSinh) ois.readObject()) != null) {
//                ds.add(ts);
//            }
//            ois.close();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        this.model.setDsThiSinh(ds);
//    }
//
//    public void Open() {
//        JFileChooser fc = new JFileChooser();
//        int returnVal = fc.showOpenDialog(this);
//        if (returnVal == JFileChooser.APPROVE_OPTION) {
//            File file = fc.getSelectedFile();
//            openFile(file);
//            DefaultTableModel modelTable = (DefaultTableModel) studentTable.getModel();
//            modelTable.getDataVector().removeAllElements();
//            modelTable.fireTableDataChanged();
//            for (Object ts : this.model.getDsThiSinh()) {
//                this.addTSToTable((ThiSinh) ts);
//            }
//        }
//    }
}

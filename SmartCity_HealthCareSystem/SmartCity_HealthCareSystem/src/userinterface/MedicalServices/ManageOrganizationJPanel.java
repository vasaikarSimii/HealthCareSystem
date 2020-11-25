/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MedicalServices;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author jshar
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel rightPanel) {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnDonor = new javax.swing.JButton();
        btnVaccines = new javax.swing.JButton();
        btnLab = new javax.swing.JButton();
        btnPharmacy = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Organization Name", "Organization Type"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnDonor.setText("Donor");
        btnDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonorActionPerformed(evt);
            }
        });

        btnVaccines.setText("Vaccines");
        btnVaccines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaccinesActionPerformed(evt);
            }
        });

        btnLab.setText("Laboratory");

        btnPharmacy.setText("Pharmacy");
        btnPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPharmacyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnVaccines, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLab, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnPharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(505, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVaccines, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLab, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(391, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVaccinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaccinesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVaccinesActionPerformed

    private void btnPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPharmacyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPharmacyActionPerformed

    private void btnDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonorActionPerformed
        // TODO add your handling code here:
//        UserHospitalOptionsPanel userHospitalOptionsPanel = new UserHospitalOptionsPanel(rightPanel);
//        rightPanel.add("userHospitalOptionsPanel",userHospitalOptionsPanel);
//        CardLayout layout=(CardLayout)rightPanel.getLayout();
//        layout.next(rightPanel);
    }//GEN-LAST:event_btnDonorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDonor;
    private javax.swing.JButton btnLab;
    private javax.swing.JButton btnPharmacy;
    private javax.swing.JButton btnVaccines;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MedicalServicesEnterprise;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author jshar
 */
public class MedicalServicesWorkArea extends javax.swing.JPanel {

    
    JPanel userProcessContainer;
    Enterprise enterprise;
    Network network;
    Organization organization;
    EcoSystem system;
    UserAccount account;
    OrganizationDirectory directory;
    
    /**
     * Creates new form MedicalServicesWorkArea
     */
    public MedicalServicesWorkArea(JPanel userProcessContainer,Enterprise enterprise){
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
    }
//    public MedicalServicesWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
//        initComponents();
//        this.userProcessContainer = userProcessContainer;
//        this.account = account;
//        this.organization = organization;
//        this.enterprise = enterprise;
//        this.network = network;
//        this.system = system;
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        ManageOrganizationBtn = new javax.swing.JButton();
        btnLaboratory = new javax.swing.JButton();
        btnVaccines = new javax.swing.JButton();
        btnDonors = new javax.swing.JButton();
        btnPharmacy = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1400, 800));

        jSplitPane1.setDividerLocation(250);
        jSplitPane1.setDividerSize(1);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        ManageOrganizationBtn.setBackground(new java.awt.Color(255, 255, 255));
        ManageOrganizationBtn.setText("Manage All Organizations");
        ManageOrganizationBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        ManageOrganizationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageOrganizationBtnActionPerformed(evt);
            }
        });

        btnLaboratory.setBackground(new java.awt.Color(255, 255, 255));
        btnLaboratory.setText("Laboratory");
        btnLaboratory.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnLaboratory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaboratoryActionPerformed(evt);
            }
        });

        btnVaccines.setBackground(new java.awt.Color(255, 255, 255));
        btnVaccines.setText("Vaccines");
        btnVaccines.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnVaccines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaccinesActionPerformed(evt);
            }
        });

        btnDonors.setBackground(new java.awt.Color(255, 255, 255));
        btnDonors.setText("Donors");
        btnDonors.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnDonors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonorsActionPerformed(evt);
            }
        });

        btnPharmacy.setBackground(new java.awt.Color(255, 255, 255));
        btnPharmacy.setText("Pharmacy");
        btnPharmacy.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPharmacyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLaboratory, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVaccines, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDonors, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageOrganizationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(ManageOrganizationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLaboratory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVaccines, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDonors, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        rightPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ManageOrganizationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageOrganizationBtnActionPerformed
        // TODO add your handling code here:
        // NGOAdminManageSceneJPanel manageScene = new NGOAdminManageSceneJPanel( rightSystemAdminPanel,  enterprise,  system,  organization,  network, account);

        //ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(rightPanel ,system, organization,  network, enterprise, account);
        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(rightPanel);
        rightPanel.add("manageOrganizationJPanel",manageOrganizationJPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
       
    }//GEN-LAST:event_ManageOrganizationBtnActionPerformed

    private void btnLaboratoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaboratoryActionPerformed
        // TODO add your handling code here:
       // CreateLaboratoryJPanel createLaboratoryJPanel = new CreateLaboratoryJPanel(rightPanel,system, organization,  network, enterprise, account);
      CreateLaboratoryJPanel createLaboratoryJPanel = new CreateLaboratoryJPanel(rightPanel);
        rightPanel.add("createLaboratoryJPanel",createLaboratoryJPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnLaboratoryActionPerformed

    private void btnVaccinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaccinesActionPerformed
        // TODO add your handling code here:
        //CreateVaccinesJPanel createVaccinesJPanel = new CreateVaccinesJPanel(rightPanel,system, organization,  network, enterprise, account);
        CreateVaccinesJPanel createVaccinesJPanel = new CreateVaccinesJPanel(rightPanel);
        rightPanel.add("createVaccinesJPanel",createVaccinesJPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnVaccinesActionPerformed

    private void btnDonorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonorsActionPerformed
        // TODO add your handling code here:
        //CreateDonorJPanel createDonorJPanel = new CreateDonorJPanel(rightPanel,system, organization,  network, enterprise, account);
        CreateDonorJPanel createDonorJPanel = new CreateDonorJPanel(rightPanel);
        rightPanel.add("createDonorJPanel",createDonorJPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnDonorsActionPerformed

    private void btnPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPharmacyActionPerformed
        // TODO add your handling code here:
        //CreatePharmacyJPanel createPharmacyJPanel = new CreatePharmacyJPanel(rightPanel,system, organization,  network, enterprise, account);
        CreatePharmacyJPanel createPharmacyJPanel = new CreatePharmacyJPanel(rightPanel);
        rightPanel.add("createPharmacyJPanel",createPharmacyJPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnPharmacyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageOrganizationBtn;
    private javax.swing.JButton btnDonors;
    private javax.swing.JButton btnLaboratory;
    private javax.swing.JButton btnPharmacy;
    private javax.swing.JButton btnVaccines;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel rightPanel;
    // End of variables declaration//GEN-END:variables
}

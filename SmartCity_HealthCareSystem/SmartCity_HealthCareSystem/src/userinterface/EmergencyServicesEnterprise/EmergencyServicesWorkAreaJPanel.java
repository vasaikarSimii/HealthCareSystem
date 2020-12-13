/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EmergencyServicesEnterprise;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JPanel;
import userinterface.dbConn;

/**
 *
 * @author Seemin
 */
public class EmergencyServicesWorkAreaJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Enterprise enterprise;
    Network network;
    Organization organization;
    EcoSystem system;
    UserAccount account;
    OrganizationDirectory directory;
    Connection conn= dbConn.getConn();
    PreparedStatement pst =null;
    ResultSet rs= null;
    
    /**
     * Creates new form CommunityServicesWorkAreaJPanel
     */
   
//EmergencyServicesWorkAreaJPanel(JPanel userProcessContainer, EcoSystem system, Organization organization, Network network, Enterprise enterprise, UserAccount account) {
//       initComponents();
//        this.userProcessContainer = userProcessContainer;
//        this.account = account;
//        this.organization = organization;
//        this.enterprise = enterprise;
//        this.network = network;
//        this.system = system;
//        populateTable();
//        
//    }
        String net_name=null;
        String emer_name=null;
    
    public EmergencyServicesWorkAreaJPanel(JPanel userProcessContainer, String net_name, String emer_name) {
        initComponents();  
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.net_name=net_name;
        this.emer_name=emer_name;
        populateTable();
    }

   
    public void populateTable(){
       //connect from database -- query
   }
    
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
        ManageDoctorsBtn = new javax.swing.JButton();
        btnOrganization = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jSplitPane1.setDividerLocation(250);
        jSplitPane1.setDividerSize(1);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        ManageOrganizationBtn.setBackground(new java.awt.Color(255, 255, 255));
        ManageOrganizationBtn.setText("Manage Ambulance Dept");
        ManageOrganizationBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        ManageOrganizationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageOrganizationBtnActionPerformed(evt);
            }
        });

        ManageDoctorsBtn.setBackground(new java.awt.Color(255, 255, 255));
        ManageDoctorsBtn.setText("Manage Fire Dept");
        ManageDoctorsBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        ManageDoctorsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageDoctorsBtnActionPerformed(evt);
            }
        });

        btnOrganization.setBackground(new java.awt.Color(255, 255, 255));
        btnOrganization.setText("Manage Organization");
        btnOrganization.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrganizationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ManageDoctorsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageOrganizationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btnOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManageOrganizationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManageDoctorsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(502, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        rightPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icon/EmergencyServ.gif"))); // NOI18N
        rightPanel.add(jLabel1, "card2");

        jSplitPane1.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ManageOrganizationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageOrganizationBtnActionPerformed
        // TODO add your handling code here:

        Ambulance ambulance=new Ambulance(rightPanel,net_name);
        rightPanel.add("Ambulance",ambulance);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);

    }//GEN-LAST:event_ManageOrganizationBtnActionPerformed

    private void ManageDoctorsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageDoctorsBtnActionPerformed
        // TODO add your handling code here:

        // CreateDoctorJPanel = new CreateDoctorJPanel(rightPanel,system, organization,  network, enterprise, account);

        FireDept fireDept = new FireDept(rightPanel,net_name);
        rightPanel.add("FireDept",fireDept);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_ManageDoctorsBtnActionPerformed

    private void btnOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrganizationActionPerformed
        // TODO add your handling code here:
        ManageOrganizationJPanel man = new ManageOrganizationJPanel(rightPanel,net_name);
        rightPanel.add("man",man);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnOrganizationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageDoctorsBtn;
    private javax.swing.JButton ManageOrganizationBtn;
    private javax.swing.JButton btnOrganization;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel rightPanel;
    // End of variables declaration//GEN-END:variables
}

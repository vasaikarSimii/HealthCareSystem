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
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.proteanit.sql.DbUtils;
import userinterface.dbConn;

/**
 *
 * @author seemin
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    Network network;
    Organization organization;
    EcoSystem system;
    UserAccount account;
    OrganizationDirectory directory;
     Connection conn = dbConn.getConn();
    ResultSet rs = null;
    PreparedStatement pst = null;
     String net_name=null;
    String emer_name=null;
   
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer,String net_name,String emer_name){
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
         this.net_name=net_name;
        this.emer_name=emer_name;
        System.out.println("4"+emer_name);
        initComponents();
     //   populateCombo();
        populateTable();
    }
    
    
//    public ManageOrganizationJPanel(JPanel userProcessContainer, EcoSystem system, Organization organization, Network network, Enterprise enterprise, UserAccount account) {
//        initComponents();
//        this.userProcessContainer = userProcessContainer;
//        this.account = account;
//        this.organization = organization;
//        this.enterprise = enterprise;
//        this.network = network;
//        this.system = system;
//        populateTable();
//        populateCombo();
//    }

   
    
    
    private void populateTable() {
        try{
        String sql ="select * from manage_medical where org_net='"+net_name+"'";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
    finally {
            
            try{
                rs.close();
                pst.close();
                
            }
            catch(Exception e){
                
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        OrganizationNametxt = new javax.swing.JTextField();
        addJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        OrganizationNametxt1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setBackground(new java.awt.Color(204, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Organization Name", "Organization Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Organization Type ");

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT", "Pharmacy", "Laboratory", "Blood Donor Camp", " ", " " }));

        jLabel2.setText("Organization Name ");

        OrganizationNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrganizationNametxtActionPerformed(evt);
            }
        });

        addJButton.setText("Add Organization");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MANAGE VACCINES ORGANIZATION");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icon/UserHospitalOption.gif"))); // NOI18N

        jLabel4.setText("Organization ID ");

        OrganizationNametxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrganizationNametxt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(organizationJComboBox, 0, 173, Short.MAX_VALUE)
                            .addComponent(OrganizationNametxt1)
                            .addComponent(OrganizationNametxt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(445, Short.MAX_VALUE)
                        .addComponent(addJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(OrganizationNametxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(OrganizationNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addJButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

       String type = organizationJComboBox.getSelectedItem().toString();
        String id=OrganizationNametxt1.getText();
        String name=OrganizationNametxt.getText();
        
        if(id.isEmpty() || name.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Fields cannot be empty");
        }
        
       try {
        String sql = " insert into manage_medical values(?,?,?,?,?)";

                pst = conn.prepareStatement(sql);
                pst.setString(1, id);
                pst.setString(2, type);
                pst.setString(3, name);
                 pst.setString(4, net_name);
                pst.setString(5, emer_name);
                
                
                
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Organisation Added successfuly");
                populateTable();
                OrganizationNametxt1.setText("");
                OrganizationNametxt.setText("");
                
        }
        catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Organization ID must be unique");
        }finally{
            try {
              //  rs.close();
                pst.close();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            }
        populateTable();
    }//GEN-LAST:event_addJButtonActionPerformed

    private void OrganizationNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrganizationNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrganizationNametxtActionPerformed

    private void OrganizationNametxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrganizationNametxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrganizationNametxt1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField OrganizationNametxt;
    private javax.swing.JTextField OrganizationNametxt1;
    private javax.swing.JButton addJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox organizationJComboBox;
    // End of variables declaration//GEN-END:variables
}

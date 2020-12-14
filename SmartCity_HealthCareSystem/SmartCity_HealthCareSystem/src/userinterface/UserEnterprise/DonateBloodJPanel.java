/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.UserEnterprise;

import Business.EcoSystem;
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
 * @author jshar
 */
public class DonateBloodJPanel extends javax.swing.JPanel {

    JPanel userProcessInterface;
    EcoSystem ecosystem;
    Connection conn = dbConn.getConn();
    ResultSet rs = null;
    PreparedStatement pst = null;
     String a=null;
    String b=null;
     String c=null;
    String d=null;
    String e=null;
    String f=null;
    String f_name=null;
            String l_name=null;
            String gender=null;
            String address=null;
            String email=null;
            String phone=null;
            String blood=null;
            String weight=null;
            String height=null;
            String username=null;
            String age=null;
    /**
     * Creates new form DonateBloodJPanel
     */
    public DonateBloodJPanel(JPanel userProcessInterface, String f_name,String l_name,String gender,String address,String email,String phone,String blood,String weight,String height,String username,String age) {
        initComponents();
        this.userProcessInterface = userProcessInterface;
   //     this.ecosystem = ecosystem;
        this.f_name=f_name;
        this.l_name=l_name;
        this.gender=gender;
        this.address=address;
        this.email=email;
        this.phone=phone;
        this.blood=blood;
        this.weight=weight;
        this.height=height;
        this.username=username;
        this.age=age;
        this.userProcessInterface = userProcessInterface;
        populateTable();
        
    }
    public void populateTable(){
       //connect from database -- query
         try{
        String sql ="select donor_org,donor_location,donor_net,donor_enter from manage_donor";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        tblNearestHospital.setModel(DbUtils.resultSetToTableModel(rs));
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
        tblNearestHospital = new javax.swing.JTable();
        btnGenerateRequest = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1400, 700));

        tblNearestHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Donor Camp Name", "Requirement", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNearestHospital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNearestHospitalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNearestHospital);

        btnGenerateRequest.setText("Send Request");
        btnGenerateRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateRequestActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DONATE BLOOD");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icon/bloodDonateUser.gif"))); // NOI18N

        btnBack1.setText("<<Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnGenerateRequest))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnBack1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1064, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btnGenerateRequest)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblNearestHospitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNearestHospitalMouseClicked
        // TODO add your handling code here:
        System.out.println("EEEEEEEEEE");
        int selectedRow = tblNearestHospital.getSelectedRow();
        System.out.println("FFFFFFFFFFFFFFF");
        if (selectedRow>=0){
            System.out.println("GGGGGGGGG");
            a= (String) tblNearestHospital.getValueAt(selectedRow,0);
            System.out.println("");
            b= (String) tblNearestHospital.getValueAt(selectedRow,1);
            c=(String) tblNearestHospital.getValueAt(selectedRow,2);
            d= (String) tblNearestHospital.getValueAt(selectedRow,3);
//            e=(String) tblNearestHospital.getValueAt(selectedRow,4);
//            f= (String) tblNearestHospital.getValueAt(selectedRow,5);
            
          //  k=(String) jTable1.getValueAt(selectedRow,10);
         //   l= (String) jTable1.getValueAt(selectedRow,11);
            System.out.println(selectedRow+"  "+a);
            System.out.println(selectedRow+"  "+f);
        }
    }//GEN-LAST:event_tblNearestHospitalMouseClicked

    private void btnGenerateRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateRequestActionPerformed
        // TODO add your handling code here:
        try {
            
            int selectedRow = tblNearestHospital.getSelectedRow();
            
            if(selectedRow < 0) {
                JOptionPane.showMessageDialog(this, "Please select row from the table");
                return;
            }
        String sql = " insert into donor_request values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

                pst = conn.prepareStatement(sql);
                pst.setString(1, f_name);
                pst.setString(2, l_name);
                pst.setString(3, gender);
                pst.setString(4, address);
                pst.setString(5, email);
                pst.setString(6, phone);
                pst.setString(7, blood);
                pst.setString(8, weight);
                pst.setString(9, height);
                pst.setString(10, username);
               // pst.setString(11, password);
                pst.setString(11, age);
                pst.setString(12, a);
                pst.setString(13, b);
                pst.setString(14, c);
                pst.setString(15, d);
                pst.setString(16, "Pending");
                //add image to Db
               //pst.setBlob(13, i1);
                
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Request Sent successfuly");
                
                
                
        }
        catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "You have already donated blood to this organisation");
        }finally{
            try {
              //  rs.close();
                pst.close();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            }

    }//GEN-LAST:event_btnGenerateRequestActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        userProcessInterface.remove(this);
        CardLayout layout = (CardLayout) userProcessInterface.getLayout();
        layout.previous(userProcessInterface);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnGenerateRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNearestHospital;
    // End of variables declaration//GEN-END:variables
}

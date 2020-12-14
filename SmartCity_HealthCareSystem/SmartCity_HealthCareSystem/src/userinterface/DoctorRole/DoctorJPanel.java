/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

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
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.proteanit.sql.DbUtils;
import userinterface.dbConn;
/**
 *
 * @author Seemin
 */
public class DoctorJPanel extends javax.swing.JPanel {

   private JPanel userProcessContainer;
    private EcoSystem ecosystem;
     Connection conn = dbConn.getConn();
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    ResultSet rs1 = null;
    PreparedStatement pst1 = null;
    
    ResultSet rs2 = null;
    PreparedStatement pst2 = null;

    /**
     *
     * Creates new form ManageNetworkJPanel
     */
    String doc_name=null;
    String special=null;
    String location=null;
    String doc_net=null;
    String doc_enter=null;
    String name=null;
    String a=null;
    String b=null;
    String date=null;
    String patName = null;
    String patResult = null;
    String patEmail = null;
    String patDate = null;
    String sym = null;
    String age = null;
    String enter = null;
    
    public DoctorJPanel(JPanel userProcessContainer,String doc_name,String special,String location,String doc_net,String doc_enter,String name) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
       this.doc_name=doc_name;
       this.special=special;
       this.location=location;
       this.doc_net=doc_net;
       this.doc_enter=doc_enter;
       this.name=name;
       jXDatePicker1.setVisible(false);
        jLabel2.setVisible(false);
        boxSlot.setVisible(false);
       populateTable();
       populateWorkTable();
    }
    public void populateTable(){
       //connect from database -- query
       try{
        String sql ="select p_name,p_id,p_age,p_sym,d_enter from appointment where d_id='"+name+"' AND status='" + "NA"+ "'";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        tblPatientProfile.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
        System.out.println("77777777777");
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
    
    public void populateWorkTable(){
       //connect from database -- query
       try{
        String sql ="select * from appoint_status where doctor_id='"+name+"'";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        tblWorkArea.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
        System.out.println("77777777777");
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

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatientProfile = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        VaccinejComboBox = new javax.swing.JComboBox<>();
        testingjComboBox = new javax.swing.JComboBox<>();
        btnGenerate = new javax.swing.JButton();
        btnTest = new javax.swing.JButton();
        btnVaccineRequest = new javax.swing.JButton();
        Testingtxt = new javax.swing.JLabel();
        vaccinetxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnDeny = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblWorkArea = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        boxSlot = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1400, 700));
        setVerifyInputWhenFocusTarget(false);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MANAGE DOCTOR ROLE");

        tblPatientProfile.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient Name", "Age", "Symptoms"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPatientProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientProfileMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPatientProfile);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DIAGNOSIS DETAILS"));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jCheckBox3.setText("Pharmacy");

        jCheckBox5.setText("Vaccine");

        jCheckBox2.setText("Testing");

        VaccinejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Meningocacal", "Flu Shot", "MMR", "TDC", "Rubella", "Hepatatis" }));

        testingjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ECG", "CBC", "CitiScan", "X-Ray", "Endoscopy", "Sonography" }));

        btnGenerate.setText("Generate Prescriptions");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        btnTest.setText("Confirm Request");
        btnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestActionPerformed(evt);
            }
        });

        btnVaccineRequest.setText("Confirm Request");
        btnVaccineRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaccineRequestActionPerformed(evt);
            }
        });

        Testingtxt.setBackground(new java.awt.Color(255, 255, 255));
        Testingtxt.setText("Tests");
        Testingtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        vaccinetxt.setBackground(new java.awt.Color(255, 255, 255));
        vaccinetxt.setText("Vaccines");
        vaccinetxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCheckBox2)
                        .addComponent(jCheckBox5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VaccinejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(testingjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Testingtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vaccinetxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTest)
                            .addComponent(btnVaccineRequest)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGenerate))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Testingtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox2)
                        .addComponent(testingjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTest)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox5)
                    .addComponent(VaccinejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVaccineRequest)
                    .addComponent(vaccinetxt))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(btnGenerate))
                .addContainerGap())
        );

        btnDeny.setText("Deny Appointment");
        btnDeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenyActionPerformed(evt);
            }
        });

        btnAccept.setText("Accept Appointment");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        tblWorkArea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient Name", "Accepted/Denied", "Status", "Next Steps"
            }
        ));
        tblWorkArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblWorkAreaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblWorkArea);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jCheckBox1.setText("Give Appointment");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Date:");

        jXDatePicker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker1ActionPerformed(evt);
            }
        });

        boxSlot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", " " }));

        jLabel3.setText("APPOINTMENT DETAILS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jCheckBox1)
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boxSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boxSlot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(106, 106, 106)
                            .addComponent(btnDeny, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(104, 104, 104)
                            .addComponent(btnAccept)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel6)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAccept)
                                    .addComponent(btnDeny))
                                .addGap(81, 81, 81)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(402, 402, 402))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel1.getAccessibleContext().setAccessibleName("APPOINTMENT DETAILS");
    }// </editor-fold>//GEN-END:initComponents

    private void tblPatientProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientProfileMouseClicked
        // TODO add your handling code here:
        try {
            int selectedRow = tblPatientProfile.getSelectedRow();
            if (selectedRow>=0){
                a= (String) tblPatientProfile.getValueAt(selectedRow,0);
                b= (String) tblPatientProfile.getValueAt(selectedRow,1);
                sym = (String) tblPatientProfile.getValueAt(selectedRow,3);
                age = (String) tblPatientProfile.getValueAt(selectedRow,2);
                enter = (String) tblPatientProfile.getValueAt(selectedRow,4);
                System.out.println(selectedRow+"  "+a);
                System.out.println(selectedRow+"  "+b);
                

                String sql = "select * from manage_doc where doc_name ='" + a + "' AND special='" + b + "'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                System.out.println("55555555555");
                if (rs.next()) {

                }

            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please Select a Row!!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            try {
                pst.close();
                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_tblPatientProfileMouseClicked

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        try{

            String acc="Accepted";
            
            String slot = boxSlot.getSelectedItem().toString();
            
            String sql2 = "select 1 from appoint_status where date='" + date + "' AND time_slot ='" + slot + "' AND doctor_id='" + name + "'";
            pst1=conn.prepareStatement(sql2);
            rs1 = pst1.executeQuery();
            
            if(rs1.next()) {
                JOptionPane.showMessageDialog(null,"Date and Time slot must be different");
                return;
            }
            
            
            String sql1 = " insert into appoint_status values(?,?,?,?,?,?,?,?,?)";

            pst = conn.prepareStatement(sql1);


            System.out.println("Date " + date);
            System.out.println("1");
//            String sql2 = "if exists (select 1 from appoint_status where date='" + date + "' AND time_slot ='" + slot + "' AND doctor_id='" + name + "')";
             System.out.println("2");
//             pst1 = conn.prepareStatement(sql2);
             System.out.println("3");
//            rs = pst.executeQuery();
             System.out.println("4");
//            if (rs.next()) {
//                     System.out.println("5");
//                    JOptionPane.showMessageDialog(null,"Date and Time slot must be different");
//                    return;
//                }
            

            
            

            pst.setString(1, b);
            pst.setString(2, a);
            pst.setString(3,name );
            pst.setString(4,acc);
            pst.setString(5,date );
            pst.setString(6, slot);
            pst.setString(7, sym);
            pst.setString(8, age);
            pst.setString(9, enter);
            pst.executeUpdate();
            
            String acc1 = "True";
            System.out.println("ID" + b);
            System.out.println("Symptom" + sym);
            String sql3 = "update appointment set status='" +acc1+"' where p_id='" + b + "' AND p_sym='" +sym+ "'";
            pst2 = conn.prepareStatement(sql3);
            if(pst2.execute()) {
                System.out.println("Working");
            }
            else {
                System.out.println("NOt Working");
            }
            
           
            JOptionPane.showMessageDialog(null, "Appointment Status Updated successfuly");
            populateWorkTable();
            populateTable();

        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            try {
                pst.close();
                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_btnAcceptActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        jXDatePicker1.setVisible(true);
        jLabel2.setVisible(true);
        boxSlot.setVisible(true);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btnDenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenyActionPerformed
        // TODO add your handling code here:
        try{

//            String sql1 = " insert into appoint_status values(?,?,?,?,?)";
//            String sql1 = " insert into testing_status values(?,?,?,?,?,?,?,?,?)";
//            pst = conn.prepareStatement(sql1);
//
//            String acc="Denied";
//            date="NA";
//            pst.setString(5,date );
//
//            pst.setString(1, b);
//            pst.setString(2, a);
//            pst.setString(3,name );
//            pst.setString(4,acc);

            String sql1 = " insert into appoint_status values(?,?,?,?,?,?,?,?,?)";

            pst = conn.prepareStatement(sql1);

            String acc="Denied";

//            System.out.println("Date " + date);

            pst.setString(1, b);
            pst.setString(2, a);
            pst.setString(3,name );
            pst.setString(4,acc);
            pst.setString(5,"NA");
            pst.setString(6, "NA");
            pst.setString(7, sym);
            pst.setString(8, age);
            pst.setString(9, enter);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Appointment Status Updated successfuly");
            populateWorkTable();
            
            
            

        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            try {
                pst.close();
                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnDenyActionPerformed

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        // TODO add your handling code here:
        if(jCheckBox3.isSelected())
        {
         int selectedRow = tblWorkArea.getSelectedRow();
                
                if(selectedRow < 0) {
                    JOptionPane.showMessageDialog(null,"Please select a row..!!");
                    return;
                }
                
                String temp_name = (String) tblWorkArea.getValueAt(selectedRow, 1);
                String temp_id =  (String) tblWorkArea.getValueAt(selectedRow, 0);   
            
        PresciptionJpanel pj=new PresciptionJpanel(userProcessContainer,doc_name,doc_net,doc_enter,name,temp_id,temp_name);
        userProcessContainer.add("pj",pj);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        else{
            JOptionPane.showMessageDialog(null, "Tick Pharmacy BOX to continue");
        }
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void jXDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker1ActionPerformed
        // TODO add your handling code here:
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        jXDatePicker1.setFormats(dateFormat);

        date = dateFormat.format(jXDatePicker1.getDate()).toString();
        JFormattedTextField editor = jXDatePicker1.getEditor();
        Date dateInDatePicker = (Date) editor.getValue();
        System.out.println(date);
    }//GEN-LAST:event_jXDatePicker1ActionPerformed

    private void btnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestActionPerformed
        // TODO add your handling code here:
        
        
         if(jCheckBox2.isSelected())
            {
                int selectedRow = tblWorkArea.getSelectedRow();
                
                if(selectedRow < 0) {
                    JOptionPane.showMessageDialog(null,"Please select a row..!!");
                    return;
                }
                
                String temp_name = (String) tblWorkArea.getValueAt(selectedRow, 1);
                String temp_id =  (String) tblWorkArea.getValueAt(selectedRow, 0);
                
                String test=testingjComboBox.getSelectedItem().toString();
        try{
           
//            String sql1 = " insert into testing values(?,?,?,?,?,?)";
            String sql1 = " insert into testing_status values(?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql1);

            String acc="Accepted";
            pst.setString(5,date);
             pst.setString(6, test);

            System.out.println("Date " + date);

            pst.setString(1, temp_id);
            pst.setString(2, temp_name);
            pst.setString(3,name );
            pst.setString(4,doc_name);
            pst.setString(7, "NA");
             pst.setString(8, "NA");
             pst.setString(9, "NA");
            pst.setString(10, "NA");
            pst.setString(11, "NA");
            pst.setString(12, "NA");

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Testing Request Generated successfuly");
            populateWorkTable();
            

        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            try {
                pst.close();
                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
            }
         else{
              JOptionPane.showMessageDialog(null, "Tick Testing BOX to continue");
         }
    }//GEN-LAST:event_btnTestActionPerformed

    private void btnVaccineRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaccineRequestActionPerformed
        // TODO add your handling code here:
        if(jCheckBox5.isSelected())
            {
              
                int selectedRow = tblWorkArea.getSelectedRow();
                
                if(selectedRow < 0) {
                    JOptionPane.showMessageDialog(null,"Please select a row..!!");
                    return;
                }
                
                String temp_name = (String) tblWorkArea.getValueAt(selectedRow, 1);
                String temp_id =  (String) tblWorkArea.getValueAt(selectedRow, 0);
                
            String vaccine=VaccinejComboBox.getSelectedItem().toString();
        try{
           
//            String sql1 = " insert into vaccine values(?,?,?,?,?,?)";
            String sql1 = " insert into vaccine_status values(?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql1);

           // String acc="Accepted";
//            pst.setString(5,date );
//             pst.setString(6, vaccine);
//
//            System.out.println("Date " + date);
//
//            pst.setString(1, b);
//            pst.setString(2, a);
//            pst.setString(3,name );
//            pst.setString(4,doc_name);

              pst.setString(1,temp_id);
            pst.setString(2, temp_name);
            pst.setString(3,name);
            pst.setString(4,doc_name);
            pst.setString(5, date);
            pst.setString(6, vaccine);
            pst.setString(7, "NA");
             pst.setString(8, "NA");
             pst.setString(9, "NA");
            pst.setString(10, "NA");
            pst.setString(11, "NA");
            pst.setString(12, "NA");

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Vaccine Request Generated successfuly");
            populateWorkTable();
            

        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            try {
                pst.close();
                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
            }
         else{
              JOptionPane.showMessageDialog(null, "Tick Vaccine BOX to continue");
         }
    }//GEN-LAST:event_btnVaccineRequestActionPerformed

    private void tblWorkAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWorkAreaMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblWorkArea.getSelectedRow();
        if (selectedRow>=0){
            patEmail = (String) tblWorkArea.getValueAt(selectedRow,0);
            patName =  (String) tblWorkArea.getValueAt(selectedRow,0);
            patResult = (String) tblWorkArea.getValueAt(selectedRow,1);
            patDate = (String) tblWorkArea.getValueAt(selectedRow,2);
        }  
    }//GEN-LAST:event_tblWorkAreaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Testingtxt;
    private javax.swing.JComboBox<String> VaccinejComboBox;
    private javax.swing.JComboBox<String> boxSlot;
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnDeny;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnTest;
    private javax.swing.JButton btnVaccineRequest;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JTable tblPatientProfile;
    private javax.swing.JTable tblWorkArea;
    private javax.swing.JComboBox<String> testingjComboBox;
    private javax.swing.JLabel vaccinetxt;
    // End of variables declaration//GEN-END:variables
}

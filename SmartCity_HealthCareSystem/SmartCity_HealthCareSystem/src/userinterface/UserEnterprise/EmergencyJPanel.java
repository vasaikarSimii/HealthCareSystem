/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.UserEnterprise;

import Business.EcoSystem;
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
public class EmergencyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmergencyJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
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
            ResultSet rs = null;
            Connection conn = dbConn.getConn();
    PreparedStatement pst = null;
     
    /**
     * Creates new form UserMainPanel
     */
    public EmergencyJPanel(JPanel userProcessContainer,String f_name,String l_name,String gender,String address,String email,String phone,String blood,String weight,String height,String username,String age) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
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
      //  this.ecosystem = ecosystem;
        populateTable();
        populateTable1();
    }
    
    public void populateTable(){
      try{
        String sql ="select * from ambulance_report where informer_id='"+username+"'";
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
    
    public void populateTable1(){
      try{
        String sql ="select * from fire_report where informer_id='"+username+"'";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        jTable2.setModel(DbUtils.resultSetToTableModel(rs));
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

        jLabel1 = new javax.swing.JLabel();
        txtTotalInjury = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("How many people are injured ?");

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel5.setText("Location");

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });

        jLabel6.setText("Alternate Phone Number:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("EMERGENCY SERVICES");

        jCheckBox1.setText("Yes");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Notify Fire Dept");

        jLabel9.setText("Notify Ambulance Dept");

        jCheckBox2.setText("Yes");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ambulance Company Name", "Location", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icon/EmergencyServices.gif"))); // NOI18N

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CHECK REQUEST STATUS AMBULANCE");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CHECK REQUEST STATUS FIRE DEPARTMENT");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ambulance Company Name", "Location", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTotalInjury)
                                        .addComponent(txtLocation)
                                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                                    .addComponent(jCheckBox2)
                                    .addComponent(jCheckBox1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(129, 129, 129))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalInjury, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jCheckBox2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jCheckBox1))
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirm))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(120, 120, 120))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        if(txtLocation.getText().isEmpty() || txtTotalInjury.getText().isEmpty() || txtPhoneNumber.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty");
            return;
        }
        
        String injury=txtTotalInjury.getText();
        String incident_location=txtLocation.getText();
        String mobile=txtPhoneNumber.getText();
        if(jCheckBox1.isSelected())
        {
             try{
           // String symp=jTextField1.getText();
        String sql1 = " insert into ambulance_report values(?,?,?,?,?,?,?,?,?,?)";

            pst = conn.prepareStatement(sql1);

            String patient_name=f_name+" "+l_name;
            pst.setString(5,phone );
            pst.setString(6,mobile );
            pst.setString(7, "NA");
            pst.setString(8, "NA");
            pst.setString(9, "NA");
            pst.setString(10, "NA");
            pst.setString(1, username);
            pst.setString(2, patient_name);
            pst.setString(3,injury );
            pst.setString(4, incident_location);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Incident Reported successfuly");
            populateTable();
            txtLocation.setText("");
            txtPhoneNumber.setText("");
            txtTotalInjury.setText("");
            jCheckBox1.setSelected(false);
//            jCheckBox2.setSelected(false);
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "You have already informed Ambulance for this location");
        } finally {
            try {
                pst.close();
                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
            
        }
        else
        {
             JOptionPane.showMessageDialog(null, "Incident Reported NOT reported to Ambulance ");
        }
        if(jCheckBox2.isSelected())
        {
            try{
         //   String symp=jTextField1.getText();
        String sql1 = " insert into fire_report values(?,?,?,?,?,?,?,?,?,?)";

            pst = conn.prepareStatement(sql1);

            String patient_name=f_name+" "+l_name;
            pst.setString(5,phone );
            pst.setString(6,mobile );
            pst.setString(7, "NA");
            pst.setString(8, "NA");
            pst.setString(9, "NA");
            pst.setString(10, "NA");
            pst.setString(1, username);
            pst.setString(2, patient_name);
            pst.setString(3,injury );
            pst.setString(4, incident_location);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Incident Reported to Fire Departmwnt successfuly");
            txtLocation.setText("");
            populateTable();
            txtPhoneNumber.setText("");
            txtTotalInjury.setText("");
            jCheckBox2.setSelected(false);
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "You have already informed Fire Department for this location");
        } finally {
            try {
                pst.close();
                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        }
         else
        {
             JOptionPane.showMessageDialog(null, "Incident NOT reported to Fire Department ");
        }
        
        populateTable();
        populateTable1();
        
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtTotalInjury;
    // End of variables declaration//GEN-END:variables
}

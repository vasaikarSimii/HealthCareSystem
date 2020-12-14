/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.UserEnterprise;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.TableColumn;
import net.proteanit.sql.DbUtils;
import userinterface.dbConn;

/**
 *
 * @author jshar
 */
public class DoctorAppointmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorAppointmentJPanel
     */
    JPanel userProcessContainer;
    Connection conn = dbConn.getConn();
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    PreparedStatement pst1 = null;
    
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
            String id=null; 
               String d_enter=null;
            String a=null;
            String b=null;
               
    public DoctorAppointmentJPanel(JPanel userProcessContainer, String f_name,String l_name,String gender,String address,String email,String phone,String blood,String weight,String height,String username,String age) {
        initComponents();
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
        this.userProcessContainer = userProcessContainer;
        populateTable();
    }
 public void populateTable(){
      try{
        String sql ="select doc_name,special,location,doc_enter from manage_doc ";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        tblDoctorList.setModel(DbUtils.resultSetToTableModel(rs));
        String[] stringlist = {"Doctor Name","Specialization","Location","Enterprise"};
        for(int i = 0; i < stringlist.length; i++) {
            TableColumn column1 = tblDoctorList.getTableHeader().getColumnModel().getColumn(i);
            column1.setHeaderValue(stringlist[i]);
            }
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
        tblDoctorList = new javax.swing.JTable();
        btnConfirmAppointment = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tblDoctorList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Doctor Name", "Specialization", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDoctorList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDoctorListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDoctorList);

        btnConfirmAppointment.setBackground(new java.awt.Color(0, 153, 153));
        btnConfirmAppointment.setText("Confirm");
        btnConfirmAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmAppointmentActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Please describe your problem?");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DOCTOR APPOINTMENT");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icon/doctorall.gif"))); // NOI18N

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnBack)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnConfirmAppointment)
                                .addGap(230, 230, 230)))
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnBack)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirmAppointment))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel2)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnConfirmAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmAppointmentActionPerformed
        // TODO add your handling code here:
        try{
            
            int selectedRow = tblDoctorList.getSelectedRow();
            
            if(selectedRow < 0) {
                JOptionPane.showMessageDialog(this, "Please select row from the table");
                return;
            }
            
            System.out.println("++++" + a);
            System.out.println("++++" + username);
            String sql4 = "select 1 from appointment where d_id = '" + id + "' AND status = 'NA' AND p_id ='" + username + "'";
            pst1 = conn.prepareStatement(sql4);
            rs=pst1.executeQuery();
            
            if(rs.next()) {
                JOptionPane.showMessageDialog(null,"Already pending request by user for the same Doctor");
                return;
            }
            
           String sql5 = "select time_slot, date from appoint_status where pat_id = '"+ username + "' AND doctor_id='" + id + "' ORDER BY date,time_slot DESC LIMIT 1";
            pst1 = conn.prepareStatement(sql5);
            rs=pst1.executeQuery();
            
             
            
            if(rs.next()) {
                String date = rs.getString("date") + " " + rs.getString("time_slot");
                System.out.println("Date 1 " + date);
                String pattern = "dd/MM/yyyy HH:mm";
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

                String date1 = simpleDateFormat.format(new Date());
                System.out.println("Date 2 " + date1);
                if(date.compareTo(date1) > 0) {
                    JOptionPane.showMessageDialog(null,"You already have a appointment with doctor on " + date);
                    return;
                }
            }
            
            
            
            String symp=jTextField1.getText();
            
            if(symp.isEmpty()) {
                JOptionPane.showMessageDialog(null,"Fields cannot be empty");
                return;
            }
        String sql1 = " insert into appointment values(?,?,?,?,?,?,?,?)";

            pst = conn.prepareStatement(sql1);

            String patient_name=f_name+" "+l_name;
            pst.setString(5,a );
            pst.setString(6,id );
            pst.setString(7, d_enter);
            pst.setString(1, patient_name);
            pst.setString(2, username);
            pst.setString(3,age );
            pst.setString(4, symp);
            pst.setString(8,"NA");
            
            

         

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Appointment taken successfuly");
            jTextField1.setText("");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        } finally {
            try {
                pst.close();
                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnConfirmAppointmentActionPerformed

    private void tblDoctorListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDoctorListMouseClicked
        // TODO add your handling code here:
        try { 
        int selectedRow = tblDoctorList.getSelectedRow();
        if (selectedRow>=0){
         a= (String) tblDoctorList.getValueAt(selectedRow,0);
         b= (String) tblDoctorList.getValueAt(selectedRow,1);
            System.out.println(selectedRow+"  "+a);
             System.out.println(selectedRow+"  "+b);
              
            String sql = "select * from manage_doc where doc_name ='" + a + "' AND special='" + b + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            System.out.println("55555555555");
            if (rs.next()) {
                
                id=rs.getString("usern");
               d_enter=rs.getString("doc_enter");
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
    }//GEN-LAST:event_tblDoctorListMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirmAppointment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblDoctorList;
    // End of variables declaration//GEN-END:variables
}

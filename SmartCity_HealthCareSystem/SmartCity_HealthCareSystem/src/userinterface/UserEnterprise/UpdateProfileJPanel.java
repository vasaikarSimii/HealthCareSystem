/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.UserEnterprise;

import Business.EcoSystem;
import Business.Population.PeopleDirectory;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.dbConn;

/**
 *
 * @author seemin
 */
public class UpdateProfileJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private PeopleDirectory peopleDirectory;
    
    Connection conn = dbConn.getConn();
    ResultSet rs = null;
    PreparedStatement pst = null;
   

    
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
            private String filename = null;
            byte[] finalfile = null;
    /**
     * Creates new form MedicalServicesJPanel
     */
    public UpdateProfileJPanel(JPanel userProcessContainer,String f_name,String l_name,String gender,String address,String email,String phone,String blood,String weight,String height,String username,String age) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.ecosystem = ecosystem;
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
        txtFirstName.setText(f_name);
        txtLastName.setText(l_name);
        txtAddress.setText(address);
        txtPhoneNumber.setText(phone);
        txtEmail.setText(email);
        txtWeight.setText(weight);
        txtHeight.setText(height);
        txtHeight1.setText(age);
        boxBloodGroup.setSelectedItem(blood);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        rBtnMale = new javax.swing.JRadioButton();
        rBtnFemale = new javax.swing.JRadioButton();
        rBtnOthers = new javax.swing.JRadioButton();
        txtWeight = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        boxBloodGroup = new javax.swing.JComboBox<String>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtHeight1 = new javax.swing.JTextField();
        pic1Lbl = new javax.swing.JLabel();
        BroswePic1Btn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Last Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 82, -1));

        jLabel3.setText("First Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel4.setText("Gender:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel5.setText("Email Address:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel6.setText("Address:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jLabel7.setText("Phone Number:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jLabel8.setText("Weight:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        jLabel9.setText("Blood Group:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        jLabel10.setText("Height:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 171, -1));
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 171, -1));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 165, -1));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 165, -1));
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 165, -1));

        rBtnMale.setText("Male");
        rBtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnMaleActionPerformed(evt);
            }
        });
        add(rBtnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        rBtnFemale.setText("Female");
        rBtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnFemaleActionPerformed(evt);
            }
        });
        add(rBtnFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        rBtnOthers.setText("Others");
        rBtnOthers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnOthersActionPerformed(evt);
            }
        });
        add(rBtnOthers, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));
        add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 60, -1));

        jLabel11.setBackground(new java.awt.Color(204, 204, 255));
        jLabel11.setText("lbs");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));
        add(txtHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 60, -1));

        jLabel12.setText("cms");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        btnSubmit.setText("Update");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 580, -1, -1));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        boxBloodGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        add(boxBloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 60, -1));

        jLabel13.setText("Password:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, -1, -1));

        jLabel14.setText("Username:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, -1, -1));

        txtUsername.setEditable(false);
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 180, -1));

        txtPassword.setEditable(false);
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 180, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("UPDATE USER PROFILE");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 620, -1));

        jLabel16.setText("Age:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, -1));
        add(txtHeight1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 60, -1));

        pic1Lbl.setBackground(new java.awt.Color(0, 204, 204));
        pic1Lbl.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        pic1Lbl.setForeground(new java.awt.Color(153, 153, 153));
        pic1Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic1Lbl.setText("Pic 1");
        pic1Lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(pic1Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 160, 180));

        BroswePic1Btn.setBackground(new java.awt.Color(0, 153, 153));
        BroswePic1Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BroswePic1Btn.setText("Broswe Pic");
        BroswePic1Btn.setActionCommand("Broswe Pic ");
        BroswePic1Btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BroswePic1Btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BroswePic1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BroswePic1BtnActionPerformed(evt);
            }
        });
        add(BroswePic1Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 140, -1));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icon/userlogin.gif"))); // NOI18N
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 780, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void rBtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnMaleActionPerformed
        // TODO add your handling code here:
        if(rBtnMale.isSelected()) {
            rBtnFemale.setSelected(false);
            rBtnOthers.setSelected(false);
        }
    }//GEN-LAST:event_rBtnMaleActionPerformed

    private void rBtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnFemaleActionPerformed
        // TODO add your handling code here:
        if(rBtnFemale.isSelected()) {
            rBtnMale.setSelected(false);
            rBtnOthers.setSelected(false);
        }

    }//GEN-LAST:event_rBtnFemaleActionPerformed

    private void rBtnOthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnOthersActionPerformed
        // TODO add your handling code here:
        if(rBtnOthers.isSelected()) {
            rBtnMale.setSelected(false);
            rBtnFemale.setSelected(false);
        }
    }//GEN-LAST:event_rBtnOthersActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        //All fields will be necessary

        
     //   txtPassword.setText(pas);
        if(txtFirstName.getText().isEmpty()|| txtLastName.getText().isEmpty() || txtAddress.getText().isEmpty() ||
            txtEmail.getText().isEmpty() || txtPhoneNumber.getText().isEmpty() || txtHeight.getText().isEmpty() ||
            txtWeight.getText().isEmpty() || (rBtnFemale.isSelected() == false && rBtnMale.isSelected() == false
                && rBtnOthers.isSelected() == false) || boxBloodGroup.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty");
            return;
        }

        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();

        boolean flag ;

        flag = firstName.matches("^[a-zA-Z]+$");

        if(flag == false) {
            JOptionPane.showMessageDialog(null, "First name cannot have integer values");
            return;
        }

        flag = lastName.matches("^[a-zA-Z]+$");

        if(!flag) {
            JOptionPane.showMessageDialog(null, "Last name cannot have integer values");
            return;
        }

        String name = firstName + " " + lastName;

        String gender = "";

        if(rBtnMale.isSelected()) {
            gender = "Male";
        }
        else if(rBtnFemale.isSelected()) {
            gender = "Female";
        }
        else if(rBtnOthers.isSelected()) {
            gender = "Others";
        }

        String address = txtAddress.getText();
        if(address.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Address caanot be empty");
            return;
        }

        String email = txtEmail.getText();

        flag = email.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");

        if(!flag) {
            JOptionPane.showMessageDialog(null, "Email Address must be in format of X@Y.Z");
            return;
        }

        //        Validation for Unique EmailID

        String phoneNumber = txtPhoneNumber.getText();

        if(phoneNumber.length() != 10) {
            JOptionPane.showMessageDialog(null, "PhoneNumber must be of 10 digits");
            return;
        }
        flag = phoneNumber.matches("^[0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "Phone Number must have digits only");
            return;
        }

        //      Validation for Unique Phone Number

        String bloodGroup = "";

        if(boxBloodGroup.getSelectedIndex() == 1) {
            bloodGroup = "A+";
        }

        else if(boxBloodGroup.getSelectedIndex() == 2) {
            bloodGroup = "A-";
        }

        else if(boxBloodGroup.getSelectedIndex() == 3) {
            bloodGroup = "B+";
        }

        else if(boxBloodGroup.getSelectedIndex() == 4) {
            bloodGroup = "B-";
        }

        else if(boxBloodGroup.getSelectedIndex() == 5) {
            bloodGroup = "AB+";
        }

        else if(boxBloodGroup.getSelectedIndex() == 6) {
            bloodGroup = "AB-";
        }

        else if(boxBloodGroup.getSelectedIndex() == 7) {
            bloodGroup = "O+";
        }

        else if(boxBloodGroup.getSelectedIndex() == 8) {
            bloodGroup = "O-";
        }

        String weight = txtWeight.getText();

        flag = weight.matches("^[0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "Weight must have digits only");
            return;
        }

        String height = txtHeight.getText();

        flag = weight.matches("^[0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "Height must have digits only");
            return;
        }
        if (pic1Lbl.getIcon()==null)

        JOptionPane.showConfirmDialog(null, "Please upload photo");

        else {
            JOptionPane.showMessageDialog(null, "Person Profile has been saved successfully");
        }

        String userName = txtUsername.getText();
        String password = txtPassword.getText();
        String age=txtHeight1.getText();

        try {
            String sql = "update user_data set first_name=?,last_name=?,gender=?,address=?,email=?,phone=?,blood=?,weight=?,height=?,age=?,image=? where username='"+username+"'";

            pst = conn.prepareStatement(sql);
            pst.setString(1, firstName);
            pst.setString(2, lastName);
            pst.setString(3, gender);
            pst.setString(4, address);
            pst.setString(5, email);
            pst.setString(6, phoneNumber);
            pst.setString(7, bloodGroup);
            pst.setString(8, weight);
            pst.setString(9, height);
          //  pst.setString(10, userName);
           // pst.setString(11, password);
            pst.setString(10, age);
           pst.setBytes(11, finalfile);
            //add image to Db
            //pst.setBlob(13, i1);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "User Data Updated successfuly");

            txtAddress.setText("");
            txtPassword.setText("");
            txtEmail.setText("");
            txtFirstName.setText("");
            txtHeight.setText("");
            txtLastName.setText("");
            txtPhoneNumber.setText("");
            txtUsername.setText("");
            pic1Lbl.setIcon(null);

            txtWeight.setText("");
            txtUsername.setText("");

        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }finally{
            try {
                //  rs.close();
                pst.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
    }//GEN-LAST:event_btnBackActionPerformed

    private void BroswePic1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BroswePic1BtnActionPerformed
        // TODO add your handling code here:
JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        try {
             filename = f.getAbsolutePath();
        } catch (Exception e) {
        }

        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(pic1Lbl.getWidth(), pic1Lbl.getHeight(), Image.SCALE_DEFAULT));
        pic1Lbl.setIcon(imageicon);
        File image = null;
        try {
            image = new File(filename);
            
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[16777215];
            for (int num; (num = fis.read(buf)) != -1;) {
                bos.write(buf, 0, num);

            }
            finalfile = bos.toByteArray();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no image selected");
        }
        

    }//GEN-LAST:event_BroswePic1BtnActionPerformed
public void addImage(){
        
        JFileChooser chooser1 = new JFileChooser();
        chooser1.showOpenDialog(null);
        File file = chooser1.getSelectedFile();
        String path1 = file.getAbsolutePath();
        Image im1 = Toolkit.getDefaultToolkit().createImage(path1);
        im1 = im1.getScaledInstance(pic1Lbl.getWidth(), pic1Lbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i1 = new ImageIcon(im1);
        pic1Lbl.setIcon(i1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BroswePic1Btn;
    private javax.swing.JComboBox<String> boxBloodGroup;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel pic1Lbl;
    private javax.swing.JRadioButton rBtnFemale;
    private javax.swing.JRadioButton rBtnMale;
    private javax.swing.JRadioButton rBtnOthers;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtHeight1;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}

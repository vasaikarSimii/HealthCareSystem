/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author seemin
 */

public abstract class Role {

//    public Component createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    public enum RoleType{
        
        SystemAdmin("SystemAdmin"),
        UserRole("UserRole"),
        DoctorRole("DoctorRole"),
        CovidCareManager("CovidCareManager"),
        AmbulanceManager("AmbulanceManager"),
        DonorManager("DonorManager"),
        VaccineManager("VaccineManager"),
        PharmacyManager("PharmacyManager"),
        LaboratoryManager("LaboratoryManager"),
        HospitalAdminRole("Hospital"),
        EmergencyAdminRole("Emergency"),
        MedicalServicesAdmin("MedicalServices");
       
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
       //  public Component createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system) {
   
   
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise,
            Network network,
            EcoSystem business,
            OrganizationDirectory organizationDirectory);


    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
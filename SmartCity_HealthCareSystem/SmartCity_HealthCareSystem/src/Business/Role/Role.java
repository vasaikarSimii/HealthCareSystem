/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author seemin
 */

public abstract class Role {
    
    public enum RoleType{
        
        SystemAdmin("SystemAdmin"),
        UserRole("UserRole"),
        DoctorRole("DoctorRole"),
        PatientProfileManager("PatientProfileManager"),
        AdditionalServicesManager("AdditionalServicesManager"),
        CovidCareManager("CovidCareManager"),
        AmbulanceManager("AmbulanceManager"),
        PoliceManager("PoliceManager"),
        FireDeptManager("FireDeptManager"),
        DonorManager("DonorManager"),
        VaccineManager("VaccineManager"),
        PharmacyManager("PharmacyManager"),
        LaboratoryManager("LaboratoryManager"),
        HealthCampManager("HealthCampManager"),
        SurveyManager("SurveyManager");
       
        
        
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
    
        
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise,
            Network network,
            EcoSystem business);


    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Doctor;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
//import userinterface.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.MedicalServicesEnterprise.MedicalServicesWorkArea;

/**
 *
 * @author seemin
 */
public class MedicalServicesAdmin extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem system,OrganizationDirectory organizationDirectory) {
        System.out.println(userProcessContainer.getComponents());
        return new MedicalServicesWorkArea(userProcessContainer, enterprise);
        }
    
    
}

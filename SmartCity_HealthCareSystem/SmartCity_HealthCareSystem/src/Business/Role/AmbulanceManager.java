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
import Business.UserAccount.UserAccount;
//import userinterface.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author seemin
 */
public class AmbulanceManager extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem system) {
        System.out.println(userProcessContainer.getComponents());
        //return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
        return null;
    }
    //@Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
//        return new CompanyAdminWorkAreaJPanel(userProcessContainer, account, organization, enterprise, network, business);
//    }
//     @Override
//    public String toString(){
//        return (RoleType.CompanySupervisor.getValue());
//    }
    
}

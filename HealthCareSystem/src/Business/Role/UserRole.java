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
//import userinterface.LabAssistantRole.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.SystemAdmin.SystemAdminWorkAreaJPanel;
import userinterface.UserEnterprise.UserRoleWorkAreaJPanel;

/**
 *
 * @author seemin
 */
public class UserRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business, OrganizationDirectory organizationDirectory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem system,OrganizationDirectory organizationDirectory) {
//        System.out.println(userProcessContainer.getComponents());
//        return new UserRoleWorkAreaJPanel(userProcessContainer, system);
//    }

    
}

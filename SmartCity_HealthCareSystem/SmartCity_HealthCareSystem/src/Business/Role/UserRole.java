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
//import userinterface.LabAssistantRole.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import userinterface.UserLogin.UserRoleWorkAreaJPanel;

/**
 *
 * @author seemin
 */
public class UserRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem system) {
        System.out.println(userProcessContainer.getComponents());
        return new UserRoleWorkAreaJPanel(userProcessContainer, system);
    }

    
}

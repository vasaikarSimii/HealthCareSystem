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
//import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;


public class HospitalAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem system) {
        System.out.println(userProcessContainer.getComponents());
        //return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
        return null;
    }

    
    
}

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
//import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;


public class HospitalAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business, OrganizationDirectory organizationDirectory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  //  @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem system) {
//        return new HospitalWorkAreaJPanel(userProcessContainer, account, organization, enterprise, network, system);
//        
//    }
//        public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem system,OrganizationDirectory organizationDirectory) {
//        return new HospitalWorkAreaJPanel( userProcessContainer, account, organization, enterprise, network, system, organizationDirectory);
//        
   // }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jshar
 */
public class CovidCare extends Organization{
    
    public CovidCare() {
        super(Organization.Type.CovidCare.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
//        roles.add(new LabAssistantRole());
        //return roles;
        return roles;
    }
}

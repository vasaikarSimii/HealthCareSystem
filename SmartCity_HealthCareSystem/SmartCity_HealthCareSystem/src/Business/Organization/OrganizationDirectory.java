/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new Doctor();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PatientProfile.getValue())){
            organization = new PatientProfile();
            organizationList.add(organization);
        
        
        }
        else if (type.getValue().equals(Type.AdditionServices.getValue())){
            organization = new AdditionServices();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CovidCare.getValue())){
            organization = new CovidCare();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Ambulance.getValue())){
            organization = new Ambulance();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PoliceDepartment.getValue())){
            organization = new PoliceDepartment();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FireDepartment.getValue())){
            organization = new Insurance();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Donors.getValue())){
            organization = new Donors();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Pharmacy.getValue())){
            organization = new Pharmacy();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Laboratory.getValue())){
            organization = new Laboratory();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HealthCamps.getValue())){
            organization = new HealthCamps();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.SurveyDashboard.getValue())){
            organization = new SurveyDashboard();
            organizationList.add(organization);
        }
        
        
        return organization;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Population;

import java.util.ArrayList;

/**
 *
 * @author jshar
 */
public class PeopleDirectory {
    
   ArrayList<People> peopleDirectory;
   
   public PeopleDirectory() {
       peopleDirectory = new ArrayList();
   }

   public ArrayList<People> getPeopleDirectory() {
       return peopleDirectory;
   }

   public void setPeopleDirectory(ArrayList<People> peopleDirectory) {
       this.peopleDirectory = peopleDirectory;
   }
   
   public People newPeople(String name, String gender, String email, String phoneNumber, String bloodGroup, String address, String height, String weight) {
       
       People people = new People(name, gender, email, phoneNumber, bloodGroup, address, height, weight);
       peopleDirectory.add(people);
       System.out.println("Name " + name);
       return people;
   }
   
}

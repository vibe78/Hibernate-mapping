/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamp;

/**
 *
 * @author VIBE($)
 */
public class TeamWorkP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String fullName = "Janny";
      String email = "janny@yahoo.com";
      String mobile = "0803224232";
      String password ="1234";
      String location ="No 4Ikeja Lagos";
      
      if(DatabaseAccess.addEmployee(fullName, email, mobile, password, location)){
          System.out.println("Successful !");
      }else{
          System.out.println("Not Successful");
      }

    }
    
}
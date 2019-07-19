/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamp;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author VIBE($)
 */
public class DatabaseAccess {
    public static boolean addEmployee(String fullName, String email, String mobile, String password, String location){
        int em=0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tc =null;
        try{
            tc = session.beginTransaction();
            Employee E = new Employee(fullName,  email,  mobile,  password, location);
            em =(Integer)session.save(E);
            tc.commit();
        }catch(Exception E){
            System.out.println(E.getMessage());
            if(tc !=null){
                tc.rollback();
            }
        }
        finally{
            session.close();
        }
        
        return em>0;
    }
    
}

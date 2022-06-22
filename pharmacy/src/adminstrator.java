/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karem
 */

import java.util.ArrayList;

public class adminstrator extends person {
    
    ArrayList <patient> pa=new ArrayList();
    ArrayList <staff> st=new ArrayList();
    
    public adminstrator(String username, String password, String phonenumber, String address, String name) {
        super(username, password, phonenumber, address, name);
    }
    
public boolean add_patient_data(patient p,int genericid){
 
            if(p.Genericid != genericid){                  
            pa.add(p); 
            return true; 
            }else
            return false; 
    }
    public boolean add_staff_data(staff s, int id){
 
            if(s.getId() != id){                  
            st.add(s); 
            return true; 
            }else
             return false; 
    }
    public void view_report(String name,int expenses,int revenues,int workinghours,int salary_per_hour,int units_number,int price)
    {
       if(name=="profit")
     {
          int profit =revenues-expenses;
          System.out.println(name+" report "+" = "+profit);
     }
      else if(name=="salary")
     {
          int salary =salary_per_hour*workinghours;
          System.out.println(name +" report "+" = "+salary);
     }
       else if(name=="sales")
     {
          int sales =units_number*price;
          System.out.println(name +" report "+" = "+sales);
     } 
       else
     {
          System.out.println("please choose between valid report types");
     }
     
    }  
    public boolean view_alert(double quantity, double b)
    {
    
    if((quantity*(20/100))>=(quantity-b)&&quantity>b)
     {
         System.out.println("alert yaba");
        return true;
     }
    else
     {
         System.out.println("karim");
        return false;
        
     }
    }   

    
}

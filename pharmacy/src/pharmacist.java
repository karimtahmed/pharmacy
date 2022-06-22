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

public class pharmacist extends person{
  
    int w_hours;
    int salary;
 ArrayList<product> b =new ArrayList<>();
 ArrayList<patient> pa =new ArrayList<>();
   
    
    ArrayList<order> os = new ArrayList<>();
    public pharmacist(int w_hours,int salary,String username, String password, String phonenumber, String address, String name) {
        super(username, password, phonenumber, address, name);
        this.w_hours=w_hours;
        this.salary=salary;

    }

    public pharmacist(int w_hours, int salary, patient a, String username, String password, String phonenumber, String address, String name) {
        super(username, password, phonenumber, address, name);
        this.w_hours = w_hours;
        this.salary = salary;
     
        
    }
    
   for(int i=0;i<b.
   {
     product p1= new product("panadol","b32","777",50,2,29/11/2020);
    product p2= new product("comptrex","b442","737",10,2,29/1/2020);
    product p3= new product("profen","bh32","997",30,2,9/10/2020);
    b.add(p1);
   }
    
   public void addproduct(product a)
   {
        b.add(a) ;
   }
   
    public void incrementproduct(product a)
   {
        for(int i=0;i<b.size();i++)
        {
            if(b.get(i).code == a.code)
            {
                b.get(i).quantity = b.get(i).quantity + a.quantity ;
            }
        }
   }
    
     public boolean addpatientdata(patient a)
   {
       for(int i=0;i<pa.size();i++)
        {
            if(pa.get(i).getGenericid() == a.getGenericid())
            {
            return false ;
            }
        }
       pa.add(a) ;
       return true ;
   }
      
//      public void savepatientorder(patient a )
//   {
//       os.add(a.order);
//       this.a=a; 
//        System.out.println("order added");
//   }
      
    public double totalprice(int price, int quantity)   
    {
        double tprice;
        tprice=price*quantity;
        return tprice;
    }
    
      public boolean searchproduct(product a)
   {
       for(int i=0;i<b.size();i++)
       {
       if(b.get(i).code == a.code)
       {
           return true ;
       }
       }
       return false ;
   }
      
      public boolean deleteproduct(product a)
   {
       for(int i=0;i<b.size();i++)
       {
       if(b.get(i).code == a.code)
       {
           b.remove(a) ;
           return true ;
       }
       }
       return false ;
   }
      
    
   
    

    public int getW_hours() {
        return w_hours;
    }

    public void setW_hours(int w_hours) {
        this.w_hours = w_hours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    
  
    
}
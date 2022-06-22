
import java.util.ArrayList;
import java.util.Scanner;


public class pharmacy {
     public static void main(String[] args) {
        person p= new person ("remon","2018","xt","012","Remon");
         patient pp=new patient();
         staff s=new staff("mariam","123","helo","07775000","mariam",1,20,3);
         ArrayList<order> os = new ArrayList<>();
       //   ArrayList<product> po = new ArrayList<>();
         product pr=new product("comtrex","h20+co2","cr",20,10,31);
product fr= new product("folmux","o2+hco2","fo",15,30,30);
         order o=new order("mems",2,"xt",20,pr);
order o2= new order ("memes",2,"fo",15,fr);
if(login(p)==true){
System.out.println("login successfully");
if(pr!=null){

 
  os.add(o);
  os.add(o2);
 pp=new patient(1,"3abet",os,"7amada","2018","xa","012","7amod");
 
}
else{
System.out.println("there is no products");

}
pharmacist ph =new pharmacist(22,1000,"Mohamed22","d1222","01223030723","9th street","mohamed alaa");
    
   
    
    
    if(ph.searchproduct(p1)){
      ph.incrementproduct(p1);
    } 
    else {
      ph.addproduct(p1);
    }
    
    if(ph.deleteproduct(p1))
    {
        System.out.println("Product deleted successfully") ;
    }
        else 
        {
           System.out.println("Product wasnt deleted ") ;
        }
    if(ph.addpatientdata(pp))
    {
      
         System.out.println("Patient added successfully");
    }
    else
    {
         System.out.println("Patient is already exist");
    }

 adminstrator a = new adminstrator("mariam123", "1234", "01288589952","heliopolis","maraim");
    
    a.view_report("sales", 3000, 5000, 50, 100, 60, 65);
    System.out.println(a.view_alert(50.0,45.0));
    System.out.println(a.add_staff_data(s, 1));
    o.addOrdertopatient(pp);
    }else{
System.out.println("login failed");

}}
     
     
public static boolean login(person p){
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the username ");
String x=sc.nextLine();
System.out.println("Please enter the password ");
String y=sc.nextLine();
if(p.getUsername().equals(x) && p.getPassword().equals(y)){
return true;
}
else{
    return false;
}
} 
}


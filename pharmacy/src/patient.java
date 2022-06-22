
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karem
 */
public class patient extends person{
     int Genericid;
     String patientHistory;
    ArrayList<order> os;

    public patient(int Genericid, String patientHistory, ArrayList<order>os, String username, String password, String address, String phonenumber, String name) {
        super(username, password, address, phonenumber, name);
        this.Genericid = Genericid;
        this.patientHistory = patientHistory;
        this.os = os;
        for(int i=0;i<os.size();i++){
        this.os.get(i).addOrdertopatient(this);
        }
    }
    public patient()
    {
        super("","","","","");
        this.Genericid=0;
        this.patientHistory="";
    }

    
    public void setGenricId(int Genericid) {
        this.Genericid = Genericid;
    }

    public int getGenericid() {
        return Genericid;
    }
    

    public void setPatientHistory(String patientHistory) {
        this.patientHistory = patientHistory;
    }
    
    
  
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karem
 */

    public class order {
    private String name;
    private int quantity;
    private String code;
    private int price;   
    private product pr;
    patient ps;

    public order(String name, int quantity, String code, int price) {
        this.name = name;
        this.quantity = quantity;
        this.code = code;
        this.price = price;
    }
    
    public order(String name, int quantity, String code, int price, product pr) {
        this.name = name;
        this.quantity = quantity;
        this.code=code;
        this.price = price;
        this.pr = pr;
    }

  
void deccrementProduct(product pr){
 pr.quantity--;
  
  }

   

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPr(product pr) {
        this.pr = pr;
    }
    public void addOrdertopatient(patient ps){
        this.ps=ps;
        System.out.println("order added");
    }
        

}


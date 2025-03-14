/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thbuoi2;

abstract class person{
    public String name;
    public String address;
    public person(String name,String address){
        this.name=name;
        this.address=address;
    }
    public void setname(String name) {
        this.name = name;
    }
    
    public void setaddress(String address) {
        this.address = address;
    }
     public String getname() {
        return name;
    }
    public String getaddress() {
        return address;
    }
    public abstract void display();
        
 
   public class employee extends person{
       private final int salary;
       public employee(String name,String address,int salary){
           super(name,address);
           this.salary=salary;
       }
       @Override
       public void display(){
       System.out.println(name);
       System.out.println(address);
       System.out.println(salary);
       }
   }
}

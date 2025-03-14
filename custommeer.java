/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thbuoi2;

/**
 *
 * @author admin
 */
 public class customer extends person{
       private final  int balance;
       public customer(String name,String address,int balance){
           super(name,address);
           this.balance=balance;
       }
       @Override
       public void display(){
       System.out.println(name);
       System.out.println(address);
       System.out.println(balance);
       }
 }


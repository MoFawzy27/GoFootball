/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofootball;

/**
 *
 * @author Mohamed Fawzy
 */
public abstract class  User {
     private String userName ;
     private String email;
     private int id;
     private String password ;
     private String phoneNumber ;
     private String address ;
     /**
      * This is a parameterized constructor for class User
      * @param userName
      * @param id
      * @param password
      * @param email
      * @param phoneNumber
      * @param address 
      */
     public User (String userName, int id, String password, String email, String phoneNumber, String address)
     {
        this.userName = userName;
        this.id = id;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
     }
     /**
      * This function set the username
      * @param userName 
      */
   
      public void setuserName(String userName) 
      {
        this.userName = userName;
      }
      /**
       *    This function set the user's id
       * @param id 
       */
      public void setId(int id) 
      {
         this.id = id;
      }
      /**
       *  This function set the user's password
       * @param password 
       */

      public void setPassword(String password) 
      {
        this.password = password;
      }
      /**
       *  This function set the user's email
       * @param email 
       */
      public void setEmail(String email) 
      {
        this.email = email;
      }
      /**
       *  This function set the user's phone number
       * @param phoneNumber 
       */
      public void setPhone(String phoneNumber) 
      {
        this.phoneNumber = phoneNumber;
      }
      /**
       *  This function set the user's address
       * @param address 
       */
      public void setDefaultlocation(String address) 
      {
        this.address = address;
      }
      /**
       *  This function get the username
       * @return 
       */
      public String getuserName() 
      {
        return userName;
      }
      /**
       *  This function get the user's id
       * @return 
       */
      public int getId() 
      {
        return id;
      }
      /**
       *  This function get the user's password
       * @return 
       */
      public String getPassword() 
      {
        return password;
      }
      /**
       *  This function get the user's email
       * @return 
       */
      public String getEmail() 
      {
        return email;
      }
      /**
       *  This function get the user's phone number
       * @return 
       */
      public String getPhoneNumber() 
      {
        return phoneNumber;
      }
      /**
       *  This function get the user's address
       * @return 
       */
      public String getAddress() 
      {
        return address;
      }
 
    
}

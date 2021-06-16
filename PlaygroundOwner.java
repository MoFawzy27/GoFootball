/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofootball;

import java.util.ArrayList;

/**
 *
 * @author Mohamed Fawzy
 */
public class PlaygroundOwner extends User {
    private double balance;
    public ArrayList<Playground> playgrounds = new ArrayList<Playground>();
    /**
     * The parameterized constructor for the Playground owner
     * @param userName
     * @param id
     * @param password
     * @param email
     * @param phoneNumber
     * @param address 
     */
    public PlaygroundOwner(String userName, int id, String password, String email, String phoneNumber, String address) 
    {
        super(userName, id, password, email, phoneNumber, address);
    }
    /**
     * This function helps the playground owner to add playground
     * @param playground 
     */
    public void addPlayground(Playground playground)
    {
        if(playground.getstatus() == true)
        {
           playgrounds.add(playground);
           System.out.println("Your Playground has added successfully");
        }   
        else
            System.out.println("Sorry , Your playground has rejected . Check your information");
    }
    /**
     * This function displays the playgrounds of the playground owner
     */
    public void getPlaygrounds()
    {
        for(int i=0 ; i<playgrounds.size() ;i++)
        {
            System.out.println(playgrounds.get(i));
        }
    }
    /**
     * This function set the balance of the playground owner in his wallet
     * @param balance 
     */
    public void setBalance(double balance) 
    {
	this.balance = balance;
    }
    /**
     * This function get the balance of the playground owner
     * @return 
     */
    public double getBalance()
    {
	return balance;
    }
    /**
     * This function withdraw amount of money from the playground owner wallet
     * @param amount 
     */
    public void withdraw(double amount) 
    {
	balance = balance - amount;
    }
    /**
     * This function helps the playground owner to deposit amount of money in his wallet
     * @param amount 
     */
    public void deposit(double amount) 
    {
	balance = balance + amount;
    }
    /**
     * this function displays the playground owner information
     * @return 
     */
    @Override
    public String toString()
    {
    return "Playground owner name = " + getuserName() + "\n" +"Playground owner's password= "+ getPassword() + "\n"+ "Playground owner id = "+getId()+ "\n"+ "Playground owner's email = " + 
           getEmail() + "\n" + "Playground owner's phone number = " + getPhoneNumber()  + "\n"+ "Playground owner's address "+ getAddress() +"\n" ;
    
    }
            
    
    
}

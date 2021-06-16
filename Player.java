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
public class Player extends User {
    private double balance;
    public ArrayList<ArrayList<String> > team = new ArrayList<ArrayList<String>>();
    public ArrayList<Booking> booking = new ArrayList<Booking>();
    /**
     * The parameterized constructor for the Player
     * @param userName
     * @param id
     * @param password
     * @param email
     * @param phoneNumber
     * @param address 
     */
    public Player(String userName, int id, String password, String email, String phoneNumber, String address) 
    {
        super(userName, id, password, email, phoneNumber, address);
    }
    /**
     * This function help player to join a team
     * @param name
     * @param email 
     */
    public void addTeammate(String name, String email) 
    {
	team.get(0).add(name);
	team.get(1).add(email);
    }
    /**
     * This function make the player remove one of the teammate
     * @param index 
     */
    public void removeTeammate(int index) 
    {
	team.get(0).remove(index);
	team.get(1).remove(index);
    }
    /**
     * This function helps the player to book a playground
     * @param book 
     */
    public void bookPlayground(Booking book)
    {
        booking.add(book);
    }
    /**
     * This function helps the player to cancel his booking
     * @param book 
     */
    public void cancelBooking(Booking book)
    {
        booking.remove(book);
    }
    /**
     * This function displays the booking of the player
     */
    public void myBook()
    {
        for(int i=0 ; i<booking.size();i++)
        {
            System.out.println(booking.get(i));
        }
    }
    /**
     * This function set the balance of the player in his wallet
     * @param balance 
     */
    public void setBalance(double balance) 
    {
	this.balance = balance;
    }
    /**
     * This function get the balance of the player
     * @return 
     */
    public double getBalance()
    {
	return balance;
    }
    /**
     * This function withdraw amount of money from the player wallet
     * @param amount 
     */
    public void withdraw(double amount) 
    {
	balance = balance - amount;
    }
    /**
     * This function helps the player to deposit amount of money in his wallet
     * @param amount 
     */
    public void deposit(double amount) 
    {
	balance = balance + amount;
    }
    /**
     * this function displays the player information
     * @return 
     */
    @Override
    public String toString()
    {
    return "Player name : " + getuserName() + "\n" +"Player's password : "+ getPassword() + "\n"+ "Player id : "+getId()+ "\n"+ "Player's email : " + 
           getEmail() + "\n" + "Player's phone number : " + getPhoneNumber()  + "\n"+ "Player's address : "+ getAddress();
    
    }
    
    
}

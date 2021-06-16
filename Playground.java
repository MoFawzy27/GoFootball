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
public class Playground {
    private int length;
    private int width;
    private double hour_price;
    private String name;
    private String avaliable_hours;
    private String location;
    private boolean status;
    PlaygroundOwner owner;

    /**
     *
     */
    public ArrayList<Booking> Book = new ArrayList<Booking>(100);
    /**
     * paramerterized constructor
     * @param length
     * @param width
     * @param hour_price
     * @param name
     * @param avaliable_hours
     * @param location
     * @param owner 
     */
    public Playground(int length, int width, double hour_price, String name, String avaliable_hours, String location , PlaygroundOwner owner) 
    {
        this.length = length;
        this.width = width;
        this.hour_price = hour_price;
        this.name = name;
        this.avaliable_hours = avaliable_hours;
        this.location = location;
        this.owner = owner;
    }
    /**
     * This function get the length of the playground
     * @return 
     */
    public int getLength() {
        return length;
    }
    /**
     * This function set the length of the playground
     * @param length 
     */
    public void setLength(int length) {
        this.length = length;
    }
     /**
      * This function get the width of the playground
      * @return 
      */
    public int getWidth() {
        return width;
    }
     /**
      * This function set the width of the playground
      * @param width 
      */
    public void setWidth(int width) {
        this.width = width;
    }
     /**
      * This function get the hour price of the playground
      * @return 
      */
    public double getHour_price() {
        return hour_price;
    }
     /**
      * This function set the hour price of the playground
      * @param hour_price 
      */
    public void setHour_price(double hour_price) {
        this.hour_price = hour_price;
    }
    /**
     * This function get the name of the playground
     * @return 
     */
    public String getName() {
        return name;
    }
     /**
     * This function set the name of the playground 
     *
     * @param name 
     **/
    public void setName(String name) {
        this.name = name;
    }
    /**
     * This function get the avaliable hours of the playground
     * @return 
     */
    public String getAvaliable_hours() {
        return avaliable_hours;
    }
     /**
      * This function set the avaliable hours of the playground
      * @param avaliable_hours 
      */
    public void setAvaliable_hours(String avaliable_hours) {
        this.avaliable_hours = avaliable_hours;
    }
    /**
     * This function get the location of the playground
     * @return 
     */
    public String getLocation() {
        return location;
    }
    /**
     * This function set the location of the playground
     * @param location 
     */
    public void setLocation(String location) {
        this.location = location;
    } 
    /**
     * This function get the owner of the playground
     * @return 
     */
    public PlaygroundOwner getOwner() {
        return owner;
    }
    /**
     * This function set the owner of the playground
     * @param owner 
     */
    public void setOwner(PlaygroundOwner owner) {
        this.owner = owner;
    }
    /**
     * This function set the status of the playground
     * @param status 
     */
    public void setStatus(boolean status)
    {
        this.status = status;
    }
    /**
     * This function get the status of the playground
     * @return 
     */
    public boolean getstatus()
    {
        return status;
    }
    /**
     * this function setting booking for the playground
     * @param B 
     */
    public void setBook(Booking B)
    {
        Book.add(B);
    }
    
    /**
     * this function displays the playground information
     * @return 
     */
    @Override
    public String toString()
    {
    return "Playground's owner name: "+ owner.getuserName() +"\n" + "Playground name = " + getName() + "\n" +"Location of playground = "+ getLocation() + "\n"+ "Playgound Length = "+ getLength()+"\n" + "Playgound width = " + getWidth() + "\n"+ "Time Available for booking = " + 
           getAvaliable_hours() + "\n" + "Price per hour = " + getHour_price() + " LE" ;
    
    }

    
    
}

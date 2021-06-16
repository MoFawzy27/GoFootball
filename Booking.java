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
public class Booking {
    private double startTime ;
    private double endTime ;
    private String date ;
    private boolean booked;
    Player player;
    Playground playground;
    /**
     * default constructor
     */
    public Booking()
    {
        this.startTime = 0;
        this.endTime = 0;
        this.date = " ";
    }
    /**
     * parameterized constructor 
     * @param startTime
     * @param endTime
     * @param date
     * @param player
     * @param playground 
     */
    public Booking(double startTime, double endTime, String date, Player player, Playground playground) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
        this.player = player;
        this.playground = playground;
    }
    /**
     * get the start time
     * @return 
     */
    public double getStartTime() {
        return startTime;
    }
    /**
     * set the start time
     * @param startTime 
     */
    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }
    /**
     * get the end time
     * @return 
     */
    public double getEndTime() {
        return endTime;
    }
    /**
     * set the end time
     * @param endTime 
     */
    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
    /**
     * get the date
     * @return 
     */
    public String getDate() {
        return date;
    }
    /**
     * set the date
     * @param date 
     */
    public void setDate(String date) {
        this.date = date;
    }
    /**
     * get the player who booked the playground
     * @return 
     */
    public Player getPlayer() {
        return player;
    }
    /**
     * set the player who wants to book a playground
     * @param player 
     */
    public void setPlayer(Player player) {
        this.player = player;
    }
    /**
     * get the playground
     * @return 
     */
    public Playground getPlayground() {
        return playground;
    }
    /**
     * set the playground
     * @param playground 
     */
    public void setPlayground(Playground playground) {
        this.playground = playground;
    }
    /**
     * this function calculate the total price of hours booked by the player and take from his wallet and deposit in the playground owner wallet
     */
    public void calculateTotalPrice()
    {
        double time = endTime - startTime;
        double total_price;
        total_price = time* playground.getHour_price();
        if(total_price<=player.getBalance())
        {
            player.withdraw(total_price);
            playground.owner.deposit(total_price);
            booked = true;
        }
        else
        {
            booked=false;
        }
        
    }
    /**
     * this function indicates that the playground is booked
     * @return 
     */
    public boolean isBooked() {
        return booked;
    }
    /**
     * set the booked
     * @param booked 
     */
    public void setBooked(boolean booked) {
        this.booked = booked;
    }
    /**
     * this function displays the booking information
     * @return 
     */
    @Override
    public String toString()
    {
    return "The Booked player's name : " + player.getuserName() +"\n"+"The start time: " + getStartTime() +"\n" +"The end time: "+getEndTime()+"\n"+
            "The date : "+ getDate() + "\n" +"The booked playground: "+playground.getName()+"\n";
    }
    
}

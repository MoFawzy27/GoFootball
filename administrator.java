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
public class administrator {
    private String email, password;
	/**
         * paramertized constructor
         * @param email
         * @param password 
         */
	public administrator(String email, String password) 
        {
		this.email = email;
		this.password = password;
	}
        /**
         * This function make the administrator to accept of reject the playground register
         * @param playground 
         */
	public void decesion_Playground(Playground playground) 
        {
		if((playground.getLength()>36 && playground.getLength()<120) &&(playground.getWidth()<90 && playground.getWidth()>27) )
                {
                    playground.setStatus(true);
                }
                else
                {
                     playground.setStatus(false);
              
                }
                    
	}
        /**
         * this function set the administrator email
         * @param email 
         */
	public void setEmail(String email) 
        {
		this.email = email;
	}
	/**
         * this function get the administrator email
         * @return 
         */
	public String getEmail() 
        {
		return email;
	}
	/**
         * this function set the administrator password
         * @param password 
         */
	public void setPassword(String password) 
        {
		this.password = password;
	}
	/**
         * this function get the administrator password
         * @return 
         */
	public String getPassword()
        {
		return password;
	}
    
}

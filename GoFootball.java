/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofootball;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mohamed Fawzy
 */
public class GoFootball {

    /**
     *
     */
    static public ArrayList<Playground> p = new ArrayList<Playground>(100);

    /**
     *
     */
    static public Scanner scan = new Scanner(System.in);

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        
        while(true)
        {
           System.out.println("1)sign up as playground owner \n" + "2)sign up as player\n" + "3)Quit \n" ); 
           int choice = scan.nextInt();
           scan.nextLine();
           Playground p1;
           PlaygroundOwner m;
           if(choice==3)
           {
               break;
           }
           else if(choice == 1)
           {
               System.out.println("Enter your name :");
               String name=scan.nextLine();
               System.out.println("Enter your password :");
               String password = scan.nextLine();
               System.out.println("Enter your id:");
               int id = scan.nextInt();
               scan.nextLine();
               System.out.println("Enter your email:");
               String email=scan.nextLine();
               System.out.println("Enter your phone number:");
               String phone_number=scan.nextLine();
               System.out.println("Enter your address:");
               String address=scan.nextLine();
               m = new PlaygroundOwner(name,id,password,email,phone_number,address) ;
               System.out.println();
               while(true)
               {
               System.out.println("Choose from the following :");
               System.out.println("1)add playground");
               System.out.println("2)Display playground owner information");
               System.out.println("3)Display playground information");
               System.out.println("4)My Wallet");
               System.out.println("5)quit");
               choice = scan.nextInt();
               if(choice == 1)
               {
                   scan.nextLine();
                   System.out.println("Enter the playground name :");
                   String playground_name=scan.nextLine();
                   System.out.println("Enter the playground length :");
                   int Length = scan.nextInt();
                   System.out.println("Enter the playground width");
                   int width = scan.nextInt();
                   scan.nextLine();
                   System.out.println("Enter The hour price:");
                   double price =scan.nextDouble();
                   scan.nextLine();
                   System.out.println("Enter the avaliable hours:");
                   String avaliable_hours=scan.nextLine();
                   System.out.println("Enter the playground location:");
                   String location=scan.nextLine();
                   p1=new Playground(Length,width,price,playground_name,avaliable_hours,location, m);
                   administrator a1 =new administrator("mohamed@gmail.com","123456679");
                   a1.decesion_Playground(p1);
                   m.addPlayground(p1);
                   p.add(p1);
               }
               else if(choice==2)
               {
                  System.out.println(m.toString());
               }
               else if(choice == 3)
               {
                  System.out.println("\n");
                  m.getPlaygrounds();
                  System.out.println("\n");
               }
               else if(choice==4)
               {
                   m.getBalance();
               }
               else if(choice==5)
               {
                   break;
               }
               
              }
           }
           else if(choice == 2)
           {
              
               System.out.println("Enter your name :");
               String name=scan.nextLine();
               System.out.println("Enter your password :");
               String password = scan.nextLine();
               System.out.println("Enter your id:");
               int id = scan.nextInt();
               scan.nextLine();
               System.out.println("Enter your email:");
               String email=scan.nextLine();
               System.out.println("Enter your phone number:");
               String phone_number=scan.nextLine();
               System.out.println("Enter your address:");
               String address=scan.nextLine();
               Player u = new Player(name,id,password,email,phone_number,address) ;
               while(true)
               {
                   System.out.println("Choose from the following :");
                   System.out.println("1)Display all playgrounds");
                   System.out.println("2)Book a playground");
                   System.out.println("3)My Book");
                   System.out.println("4)My Wallet");
                   System.out.println("5)quit");
                   choice = scan.nextInt();
                   if(choice==1)
                   {
                       for(int i=0 ; i<p.size() ; i++)
                       {
                           System.out.println(p.get(i)+"\n");
                       }
                   }
                   else if(choice==2)
                   {
                      scan.nextLine();
                      System.out.println("Set start time : ");
                      double start = scan.nextDouble();
                      System.out.println("Set end time : ");
                      double end =scan.nextDouble();
                      System.out.println("Set date : ");
                      String date = scan.nextLine();
                      scan.nextLine();
                      System.out.println("Set the playground name: ");
                      String pN = scan.nextLine();
                      
                      for(int i=0 ;i<p.size();i++)
                      {
                      
                          if(pN.equalsIgnoreCase(p.get(i).getName()))
                          {
                        
                              if(p.get(i).Book.isEmpty())
                              {
                                  Booking B = new Booking(start,end,date,u,p.get(i));
                                  B.calculateTotalPrice();
                                  if(B.isBooked()==true)
                                  {
                                      p.get(i).setBook(B);
                                      System.out.println("Booking succeeded");
                                  }
                                  else
                                  {
                                      System.out.println("Your balance is not enough");
                                  }
                              }
                              else
                              {
                                  for(int j=0 ;j<p.get(i).Book.size();j++)
                                  {
                                      if(((p.get(i).Book.get(j).getStartTime()<=start) && (p.get(i).Book.get(j).getEndTime() >= start)) &&(p.get(i).Book.get(j).getDate().equalsIgnoreCase(date)) )
                                      {
                                            System.out.println("Sorry , The playground is already booked");
                                      }
                                      else
                                      {
                                           Booking b = new Booking(start,end,date,u,p.get(i));
                                           b.calculateTotalPrice();
                                           if(b.isBooked()==true)
                                           {
                                               p.get(i).setBook(b);
                                               System.out.println("Booking succeeded " +"\n");
                                           }
                                           else
                                           {
                                               System.out.println("Your balance is not enough");
                                           }
                                      }
                                  }
                              }
                         }
                      }
                   }
                   else if(choice == 3)
                   {
                       u.myBook();
                   }
                   else if(choice==4)
                   {
                       while(true)
                       {
                           System.out.println("1)Withdraw");
                           System.out.println("2)check balance");
                           System.out.println("3)Back");
                           choice=scan.nextInt();
                           if(choice == 1)
                           {
                               System.out.println("Enter the amount you want to withdraw");
                               double amo = scan.nextDouble();
                               u.deposit(amo);
                           }
                           else if(choice == 2)
                           {
                               System.out.println("The balance is : "+u.getBalance()+"L.E");
                           }
                           else if(choice == 3)
                           {
                               break;
                           }
                       }
                       
                   }
                   else if(choice == 5)
                   {
                       break;
                   }
               }
               
           }
        
        
    }
    
    }
}



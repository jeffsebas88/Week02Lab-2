/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

/**
 *
 * @author 643507
 */
public class userservices {
   private String[] usernames = {"adam", "betty", "Betty","Adam"};
    private String password = "password";
    
    public  boolean loging(String userName, String password){
        boolean isValid = false;
        
        for(String user : usernames)
            if(user.equals(userName))
                if(this.password.equals(password))
                isValid = true;
            
return isValid;
}
}

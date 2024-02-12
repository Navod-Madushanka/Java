/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import Entity.User;
import Patterns.Singleton;

/**
 *
 * @author Navod Madusanka
 */
public class UserService {
    public void eiyqfe8(User user){
        Singleton.iud("INSERT INTO `user` (`username`, `email`, `password`) VALUES ('"+user.getUsername()+"', '"+user.getEmail()+"', '"+user.getPassword()+"');");
    }
}

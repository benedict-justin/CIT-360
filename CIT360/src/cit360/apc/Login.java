/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.apc;

import java.util.HashMap;

/**
 *
 * @author Justin
 */
public class Login implements Handler {

    @Override
    public void handleIt(HashMap<String, Object> data) {

        if (data.get("username").equals("Administrator") && data.get("password").equals("admin0000")) {
            System.out.println("You are Logged in.");
            Main.setLoggedIn(true);
        } else {
            System.out.println("Please try again later.");
            System.exit(0);
        }
    }
    
}

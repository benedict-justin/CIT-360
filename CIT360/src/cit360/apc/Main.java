/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.apc;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class Main implements Serializable {
    
    private static boolean loggedIn = false;

    public void main() {
        
        ApplicationControlPattern appController = new ApplicationControlPattern();
        appController.mapCommand("login", new Login());
        
        
        HashMap handlerData = new HashMap();

        while (!this.loggedIn) {
            System.out.println("Welcome to 360 Car Rentals");
            handlerData.put("username", Main.getInput("Username:  "));
            handlerData.put("password", Main.getInput("Password:  "));
            appController.handleRequest("login", handlerData);
        }
    }

    public static String getInput(String promptMessage) {

        Scanner keyboard = new Scanner(System.in); 
        String value = "";
        boolean valid = false;

        while (!valid) {
            System.out.println(promptMessage);

            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            break;
        }
    return value;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

}

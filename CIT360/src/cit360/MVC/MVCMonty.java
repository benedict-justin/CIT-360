/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.MVC;

/**
 *
 * @author Justin
 */
public class MVCMonty {
    
    public static void main(String[] args) {

        MontyView theView = new MontyView();
        
        MontyModel theModel = new MontyModel();
        
        MontyControl theControl = new MontyControl(theView,theModel);
        
    }
}

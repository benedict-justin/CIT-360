/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.MVC;

import static java.lang.Math.round;

/**
 *
 * @author Justin
 */
public class MontyControl {

    private final MontyView theView;
    private final MontyModel theModel;

    MontyControl(MontyView theView, MontyModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
    }


    
    public double calcMontyControl (double freq, double amplitude) {
    

        
	if (freq < 16) {
            return -1;
        }
                    
        if (freq > 24) {
            return -1;
        }
        
	if (amplitude < .2) {
            return -1;
        }
        
        if (amplitude > .28) {
            return -1;
        }
        
        double speed = (6* freq * amplitude) /2;
            return speed;

        }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plain;

import java.awt.Component;
import java.awt.Graphics;
import java.io.Serializable;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.UIManager;
import javax.swing.plaf.UIResource;

/**
 *
 * @author ssamb
 */
public class PlainIconFactory {
    private static Icon radioButtonIcon;
    private static Icon checkBoxIcon;
    
    //Provide access to the single RadioButtonIcon instance.
    public static Icon getRadioButtonIcon() {
        if (radioButtonIcon  == null) {
            radioButtonIcon = new RadioButtonIcon();            
        }
        return radioButtonIcon;
    }
    
    //An icon for rendering the default radio button icon
    private static class RadioButtonIcon implements Icon, UIResource, Serializable {

        private static final int size = 15;
        
        @Override
        public int getIconWidth() { return size; }

        @Override
        public int getIconHeight() { return size; }
        
        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            //Get the button and model containing the state we are supposed to show.
            AbstractButton b = (AbstractButton)c;
            ButtonModel model = b.getModel();
            
            //If the button is being pressed (and armed: a mouse pointer is over the button), 
            //change the BG color.
            //(NOTE: could also do something different if the button is disabled)            
            if (model.isPressed() && model.isArmed()) {  
                g.setColor(UIManager.getColor("RadioButton.pressed"));
                g.fillOval(x, y, size - 1 , size - 1);
            }
            
            //Draw an outer circle.
            g.setColor(UIManager.getColor("RadioButton.foreground"));
            g.drawOval(x, y, size - 1, size - 1);
            
            // Fill a small circle inside if the button is selected.
            if (model.isSelected()) {
                g.fillOval(x + 4, y + 4, size - 8, size - 8);
            }
        }
    }
    
    
    
            
}

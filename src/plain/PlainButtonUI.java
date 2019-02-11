/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plain;

import java.awt.Color;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.plaf.metal.MetalButtonUI;
import sun.awt.AppContext;

/**
 *
 * @author ssamb
 */
public class PlainButtonUI extends BasicButtonUI {
    protected Color focusColor;
    protected Color selectColor;
    protected Color disabledColor;
    
    private static final Object PLAIN_BUTTON_UI_KEY = new Object();
 
    //Crate PLAF
    public static ComponentUI createUI(JComponent c) {
        AppContext appContext = AppContext.getAppContext();        
        PlainButtonUI plainButtonUI = (PlainButtonUI) appContext.get(PLAIN_BUTTON_UI_KEY);
        if (plainButtonUI == null) {
            plainButtonUI = new PlainButtonUI();
            appContext.put(PLAIN_BUTTON_UI_KEY, plainButtonUI);
        }
        return plainButtonUI;
    }
    
    
    //Install
    public void installDefaults(AbstractButton b) {
        super.installDefaults(b);
    }
    
    public void uninstallDefaults(AbstractButton b) {
        super.uninstallDefaults(b);
    }
    
    

    public PlainButtonUI() {        
    }
    public PlainButtonUI(JButton button) {        
    }
}

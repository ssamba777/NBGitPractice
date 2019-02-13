/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plain;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicButtonListener;
import javax.swing.plaf.basic.BasicButtonUI;
import sun.awt.AppContext;

/**
 *
 * @author ssamb
 */
public class PlainButtonUI extends BasicButtonUI {
    protected Color focusColor;
    protected Color selectColor;
    protected Color disabledTextColor;
    
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
    
    //Create Listeners
    protected BasicButtonListener createButtonListener(AbstractButton b) {
        return super.createButtonListener(b);
    }

    //Default Accessors
    protected Color getSelectColor() {
        selectColor = UIManager.getColor(getPropertyPrefix() + "select");
        return selectColor;
    }
    
    protected Color getDisabledTextColor() {
        disabledTextColor = UIManager.getColor(getPropertyPrefix() + "disabledText");
        
        return disabledTextColor;
    } 
    
    protected Color getFocusColor() {
        focusColor = UIManager.getColor(getPropertyPrefix() + "focus");
        
        return focusColor;
    }
        
    //paint
    public void update(Graphics g, JComponent c) {
    
    }
    
    public PlainButtonUI() {        
    }
    
    public PlainButtonUI(JButton button) {        
    }
}

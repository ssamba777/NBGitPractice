/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plain;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JSlider;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicSliderUI;

/**
 *
 * @author ssamb
 */
public class PlainSliderUI extends BasicSliderUI {
    public PlainSliderUI(JSlider slider) {
        super(slider);
    }
    
    public static ComponentUI createUI(JComponent c) {
        return new PlainSliderUI((JSlider) c);
    }
    
    // user installUI of BasicSliderUI that implements 
    //  Enables the slider and makes it opaque
    //  Adds six listeners to the slider to track its state
    //  Retrieves resource defaults from the UIManager
    //  Installs the border, bakground, and foreground colors (from resource values) on the component
    //  Adds keyborad actions to the slider, allowing it to be adjusted with keys as well as with a mouse
    //  Defines a Timer used when scrolling
    //  Calculates the bounds of each region of the slider for use in painting
    
    // user uninstallUI of BasicSliderUI that implements
    //  Removes the vorder
    //  Stops the Timer
    //  Uninstalls the listeners
    //  Sets fields to null
    
    public Dimension getMinimumHorizontalSize() { return MIN_HORIZ; }
    public Dimension getMinimumVerticalSize() { return MIN_VERT; } 
    public Dimension getPreferredHorizontalSize() { return PREF_HORIZ; }
    public Dimension getPreferredVerticalSize() { return PREF_VERT; }
    
    private static final Dimension PREF_HORIZ = new Dimension(250, 15);
    private static final Dimension PREF_VERT = new Dimension(15, 250);
    private static final Dimension MIN_HORIZ = new Dimension(25, 15);
    private static final Dimension MIN_VERT = new Dimension(15, 25);
    
    protected Dimension getThumbSize() {
        Dimension size = new Dimension();
        
        if (slider.getOrientation() == JSlider.VERTICAL) {
            size.width = 10;
            size.height = 7;  //Needs to be thick enough to be able to grab it
        } else {
            size.width = 7; //Needs to be thick enough to be able to grab it
            size.height = 10;
        }
        
        return size;
    }
    
    protected int getTickLength() {
        return 6;
    }
    
    //Paint the track as a single solid line.
    public void paintTrack(Graphics g) {
        int x = trackRect.x;
        int y = trackRect.y;
        int h = trackRect.height;
        int w = trackRect.width;
        
        g.setColor(slider.getForeground());
        
        if (slider.getOrientation() == JSlider.HORIZONTAL) {
            g.drawLine(x, y+h-1, x+w-1, y+h-1);
        } else {
            g.drawLine(x+w-1, y, x+w-1, y+h-1);
        }
    }
    
    //Paint the thumb as a single solid line, centered in the thumb area.
    public void paintThumb(Graphics g) {
        int x = thumbRect.x;
        int y = thumbRect.y;
        int h = thumbRect.height;
        int w = thumbRect.width;
        
        g.setColor(slider.getForeground());
        if (slider.getOrientation() == JSlider.HORIZONTAL) {
            g.drawLine(x+(w/2), y, x +(w/2), y+h-1);
        } else {
            g.drawLine(x, y+(h/2), x+w-1, x+(h/2));
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plain;

import java.awt.Color;
import java.awt.Font;
import javax.swing.LookAndFeel;
import javax.swing.border.Border;
import javax.swing.UIDefaults;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.InsetsUIResource;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.plaf.basic.BasicLookAndFeel;

/**
 *
 * @author ssamb
 */
public class PlainLookAndFeel extends BasicLookAndFeel {

    @Override
    public String getName() { return "Plain"; }

    @Override
    public String getID() { return "Plain"; }

    @Override
    public String getDescription() { return "The Plain Look and Feel"; }

    @Override
    public boolean isNativeLookAndFeel() { return false; }

    @Override
    public boolean isSupportedLookAndFeel() { return true; }
    
    @Override
    protected void initClassDefaults(UIDefaults table) {
//        super.initClassDefaults(table); // Install the "basic" delegates.
//        
//        // Map between class ID of a component and the implentation of the component
//        String plainPkg = "plain.";
//        Object[] classes = {
//            //"ButtonUI", plainPkg + PlainButtonUI.class.getName(),
//            "SliderUI", plainPkg + PlainSliderUI.class.getName()
//        };
        Object[] classes = {
            "SliderUI", PlainSliderUI.class.getName()
        };
        table.putDefaults(classes);
    }
    
//    @Override
//    protected void initSystemColorDefaults(UIDefaults table) {
//        String[] colors = {
//            "desktop", "#C0C0C0",
//            "activeCaption", "#FFFFFF", 
//            "activeCaptionText", "#000000",
//            "activeCaptionBorder", "#000000"//,
////            "inactiveCaption",
////            "inactiveCationText",
////            "inactiveCaptionBorder",
////            "window",
////            "windowBorder",
////            "windowText",
////            "menu",
////            "menuText",
////            "text",
////            "textText",
////            "textHighlight",
////            "textHighlightText",
////            "textInactiveText",
////            "control",
////            "controlText",
////            "controlHighlight",
////            "controlLtHighlight",
////            "controlShadow",
////            "controlDkShadow",
////            "scrollbar",
////            "info",
////            "infoText"
//        };
//        loadSystemColors(table, colors, false);
//    }
//    
//    /**
//     * Define all of the colors, icons, borders, and other resources used by each of the individual component delegates.
//     * 1. For a custom JButton
//     */
//    @Override
//    protected void initComponentDefaults(UIDefaults table) {
//        
//        super.initComponentDefaults(table);
//        
//        //Define any xommon resources, lazy / active value resources, etc.
//        //Defome fonts
//        FontUIResource sansSerifPlain10 = new FontUIResource("SansSerif", Font.PLAIN, 10);
//        FontUIResource monospacedPlain10 = new FontUIResource("Monospaced", Font.PLAIN, 10);
//
//        //Define colors
//        ColorUIResource green = new ColorUIResource(Color.green);
//        ColorUIResource veryLightGray = new ColorUIResource(240, 240, 240);
//
//        //Define insets: 
//        //  four (top, left, bottom, right) distance 
//        //  from current component to parent compenent
//        InsetsUIResource zeroInsets = new InsetsUIResource(0, 0, 0, 0);
//        InsetsUIResource bigInsets = new InsetsUIResource(10, 10, 10, 10);
//
//        //Define borders
//        Border etchedBorder = BorderUIResource.getEtchedBorderUIResource();
//        Border blackLineBorder = BorderUIResource.getBlackLineBorderUIResource();
//        Border marginBorder = new BasicBorders.MarginBorder();
//        Object buttonBorder = new BorderUIResource.CompoundBorderUIResource(
//                                                new PlainBorders.ButtonBorder(), // outside border
//                                                marginBorder);                   // inside border
//        
////                 
////        Border buttonBorder = new BorderUIResource.CompoundBorderUIResource(
////                                                new PlainBorders.ButtonBorder(),  // outside border
////                                                new BasicBorders.MarginBorder()); // inside border
//        
//        
//        //Define icons
//        Object warningIcon = LookAndFeel.makeIcon(getClass(), "icons/warning.gif");
//
//        //Define other resources
//
//        //Crate defaults array
//        Object[] defaults = {
//            "Button.border", buttonBorder,
//            "Button.margin", new InsetsUIResource(2, 2, 2, 2),
//            "Button.font", sansSerifPlain10
//        };
//
//        table.putDefaults(defaults);
//    }
}

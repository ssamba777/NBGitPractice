/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import plain.PlainLookAndFeel;
//import javax.swing.plaf.metal.MetalLookAndFeel;
/**
 *
 * @author ssamb
 */
public class PlainSliderDemo {
    public static void main(String[] args) {
        try {
            javax.swing.LookAndFeel plainLAF = new PlainLookAndFeel();
            //javax.swing.LookAndFeel plainLAF = new MetalLookAndFeel();
            javax.swing.UIManager.setLookAndFeel(plainLAF);
        } catch (Exception e) {
            System.err.println("Simple Look and Feel is not available on this platform?!");
            e.printStackTrace();
            System.exit(1);
        }
//        UIManager.put("SliderUI", "PlainSliderUI");
        JFrame frame = new JFrame("SimpleSlider example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        
        JSlider slider = new JSlider();
        // Set major or minor ticks for the slider
        slider.setMajorTickSpacing(25);
        slider.setMinorTickSpacing(10);
        slider.setPaintTicks(true);
         
        // Set the labels to be painted on the slider
        slider.setPaintLabels(true);
        panel.add(slider);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

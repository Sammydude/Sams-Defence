/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sams.defence;
import java.awt.*;
/**
 *
 * @author Sam
 */
public class SamsDefence extends Frame {

    private Level model;
    private View view;
    private Controller controller;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SamsDefence venster = new SamsDefence();
        venster.setTitle("Sams Defence");
        venster.setSize(600, 480);
        venster.setVisible(true);
    }
    
    public SamsDefence() {
        //initialiseren van datamembers
        model = new Level();
        view = new View(model);
        add(view);
        controller = new Controller(model,view);
    }
}

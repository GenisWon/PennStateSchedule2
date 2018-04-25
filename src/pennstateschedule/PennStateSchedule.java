/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pennstateschedule;

import javax.swing.JFrame;

/**
 *
 * @author cjd258
 */
public class PennStateSchedule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Set initial JFrame
        JFrame frame = new LoginFrame();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } // main
    
} // PennStateSchedule

package boletin25_4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fiestra implements ActionListener {

    JFrame marco;
    JPanel panel;
    

    public Fiestra() {

        marco = new JFrame();
        panel = new JPanel();
        
        //panel.setLayout(null);
       
        
        marco.add(panel);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(180, 100);
        marco.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Fiestra obx = new Fiestra();
    }

}

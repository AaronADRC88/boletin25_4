package boletin25_4;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana {

    JFrame marco;
    JPanel panel;
    JButton boton1;

    public void amosar() {
        marco = new JFrame();
        panel = new JPanel();
        boton1 = new JButton("Vaite");
        //panel.setLayout(null);
        panel.add(boton1);
        boton1.addActionListener(new Fiestra());
        marco.add(panel);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(180, 100);
        marco.setLocationRelativeTo(null);
    }

}

package TP.TP_methodes.code_dominique;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

public class RoundedPopup extends JDialog {
    public RoundedPopup(String titre, String message) {
        super((JFrame)null, true);
        setSize(300, 150);
        setUndecorated(true);
        setResizable(false);

        setShape(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 30, 30));

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setStroke(new BasicStroke(4));
                g2d.drawRoundRect(2, 2, getWidth()-5, getHeight()-5, 30, 30);
                g2d.dispose();
            }
        };
        panel.setBackground(Color.decode("#DEF6C5"));

        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel("<html><font color='#024C8D'>" + message + "</font></html>", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 48));

        setContentPane(panel);
        panel.add(label, BorderLayout.CENTER);

        setLocationRelativeTo(null);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        });
        timer.setRepeats(false);
        timer.start();
    }
}


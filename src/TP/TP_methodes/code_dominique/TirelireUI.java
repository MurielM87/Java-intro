package TP.TP_methodes.code_dominique;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TirelireUI {
    private double montant;

    public double getMontant() {
        return montant;
    }

    public void afficher(){
        JLabel messageLabel = new JLabel();
        if (this.montant == 0) {
            messageLabel.setText("Vous êtes sans le sou.");
        } else {
            messageLabel.setText("Vous avez : " + this.montant + "€ dans votre tirelire.");
        }
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        JOptionPane.showMessageDialog(null, messageLabel);
    }

    public void secouer(JFrame frame){
        Point originalLocation = frame.getLocationOnScreen();
        int deltaX = 5;
        int deltaY = 5;
        int shakeIterations = 10;

        Timer shakeTimer = new Timer(50, new ActionListener() {
            private int iteration = 0;
            private boolean moveRight = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (iteration < shakeIterations){
                    int newX = originalLocation.x + (moveRight ? deltaX : -deltaX);
                    int newY = originalLocation.y + (iteration % 2 == 0 ? deltaY : -deltaY);
                    frame.setLocation(newX, newY);
                    moveRight = !moveRight;
                    iteration++;
                } else {
                    frame.setLocation(originalLocation);
                    ((Timer) e.getSource()).stop();
                }
            }
        });

        shakeTimer.start();

        if (this.montant != 0) {
            afficherPopup(null,"Bing bing");
        }
    }
    public boolean remplir(double montant){
        if (montant > 0) {
            this.montant += montant;
            return true;
        }
        return false;
    }

    public void vider(){
        this.montant = 0;
    }

    public void puiser(double montant){
        if (this.montant > 0){
            if (montant >= this.montant) {
                this.vider();
            } else {
                this.montant -= montant;
            }
        }
    }

    public double calculerSolde(double budget){
        double delta = this.montant - budget;

        return (delta <= 0) ? this.montant : delta;
    }

    public TirelireUI(double montant) {
        this.montant = montant;
    }

    public static void afficherPopup(String titre, String message) {
        RoundedPopup popup = new RoundedPopup(titre, message);
        popup.setVisible(true);
    }
}

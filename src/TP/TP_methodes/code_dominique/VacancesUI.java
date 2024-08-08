package TP.TP_methodes.code_dominique;

import javax.swing.*;
import java.awt.*;

public class VacancesUI {
    static TirelireUI tirelire = new TirelireUI(0);
    private JPanel menuPanel;

    public VacancesUI() {
        UIManager.put("Label.font", new Font("Arial", Font.PLAIN, 18));
        UIManager.put("Button.font", new Font("Arial", Font.PLAIN, 18));
        UIManager.put("TextField.font", new Font("Arial", Font.PLAIN, 18));
        UIManager.put("TextArea.font", new Font("Arial", Font.PLAIN, 18));
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 18));
        UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 18));
/*
        setTitle("e-Tirelire 4.0");
        setSize(400, 228);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);

        getContentPane().setBackground(Color.decode("#DAE6A1"));

        setLayout(new BorderLayout());

        JLabel welcomeLabel = new JLabel("BIENVENUE DANS VOTRE E-TIRELIRE 4.0 !");
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(welcomeLabel, BorderLayout.NORTH);
*/
        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        centerPanel.setBackground(Color.decode("#DAE6A1"));
        menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(0,1));
        menuPanel.setBackground(Color.decode("#DAE6A1"));
        centerPanel.add(menuPanel);
   //     add(centerPanel, BorderLayout.CENTER);

    /*    setVisible(true);
        requestFocusInWindow();
        afficherMenu();*/
    }
    public void afficherMenu(){
        menuPanel.removeAll();

        ajouterOptionMenu("\n1 : afficher le montant");
        ajouterOptionMenu("2 : secouer la tirelire");
        ajouterOptionMenu("3 : mettre de l'argent");
        ajouterOptionMenu("4 : vider la tirelire");
        ajouterOptionMenu("5 : retirer de l'argent");
        ajouterOptionMenu("6 : évaluer un budget");
        ajouterOptionMenu("7 : quitter");

        menuPanel.revalidate();
        menuPanel.repaint();
    }

    private void ajouterOptionMenu(String optionText){
        JLabel optionLabel = new JLabel(optionText);
        optionLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        menuPanel.add(optionLabel);
    }

    public static void main(String[] args) {
        new VacancesUI();
    }

    public static void ajouter(){
        double montant;

        String montantStr = JOptionPane.showInputDialog("Entrez le montant que vous souhaitez ajouter : ");
        montant = Double.parseDouble(montantStr);
        if (tirelire.remplir(montant)) {
            JOptionPane.showMessageDialog(null,montant + "€ ont bien été ajoutés à votre tirelire !");
        } else {
            JOptionPane.showMessageDialog(null, "Aucun argent n'a été ajouté à votre tirelire.");
        }
    }

    public static void vider(){
        double montant = tirelire.getMontant();

        tirelire.vider();
        JOptionPane.showMessageDialog(null, "Vous avez vidé votre tirelire et retiré " + montant + "€.");
    }

    public static void retirer() {
        double montant;

        String montantStr = JOptionPane.showInputDialog("Entrez le montant que vous souhaiter retirer : ");
        montant = Double.parseDouble(montantStr);
        tirelire.puiser(montant);
        JOptionPane.showMessageDialog(null, "Vous avez retiré " + montant + "€.\nVotre solde restant est de " + tirelire.getMontant() + "€.");
    }
    public static void budgetiser() {
        double budget;

        String budgetStr = JOptionPane.showInputDialog("Quel est le montant de votre future dépense ? ");
        budget = Double.parseDouble(budgetStr);
        if (tirelire.calculerSolde(budget) != tirelire.getMontant()) {
            JOptionPane.showMessageDialog(null, "Vous êtes assez riche pour votre projet !");
            JOptionPane.showMessageDialog(null, "Il vous restera " + (tirelire.getMontant() - budget) + "€.");
        } else if (tirelire.getMontant() == budget) {
            JOptionPane.showMessageDialog(null, "Vous avez exactement la somme pour votre projet !");
        } else {
            JOptionPane.showMessageDialog(null, "Il vous manque " + (budget - tirelire.getMontant()) + "€ pour réaliser votre projet.");
        }
    }

    public static void quitter() {
        JOptionPane.showMessageDialog(null, "Merci d'avoir utilisé votre e-Tirelire 4.0.\n");
        System.exit(0);
    }

/*    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode){
            case KeyEvent.VK_1, KeyEvent.VK_NUMPAD1 -> tirelire.afficher();
            case KeyEvent.VK_2, KeyEvent.VK_NUMPAD2  -> tirelire.secouer(this);
            case KeyEvent.VK_3, KeyEvent.VK_NUMPAD3  -> ajouter();
            case KeyEvent.VK_4, KeyEvent.VK_NUMPAD4  -> vider();
            case KeyEvent.VK_5, KeyEvent.VK_NUMPAD5  -> retirer();
            case KeyEvent.VK_6, KeyEvent.VK_NUMPAD6  -> budgetiser();
            case KeyEvent.VK_7, KeyEvent.VK_NUMPAD7  -> quitter();
            default -> JOptionPane.showMessageDialog(null, "Option invalide. Veuillez réessayer.");
        }
    }

    @Override
    public void keyTyped(KeyEvent e){}

    @Override
    public void keyReleased(KeyEvent e){}*/
}


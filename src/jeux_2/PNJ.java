package jeux_2;

//personnages non joueurs mais on peut parler avec eux
public class PNJ extends Personnage{
    private String dialogue;

    public PNJ(String nom, int dureeDeVie,String dialogue) {
        super(nom, dureeDeVie);
        this.dialogue=dialogue;
    }

    public String getDialogue() {
        return dialogue;
    }

    public void setDialogue(String dialogue) {
        this.dialogue = dialogue;
    }
}

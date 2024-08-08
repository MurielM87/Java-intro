package librairie;

//importer à partir d'un autre package //declarer une class en public quand on veut l'importer dans d'autres packages
import livres.Livre;

public class Bibliotheque {
    public static void main(String[] args) {
        Livre livre=new Livre("Abc", "Zinedine Zidane", 34);
    }
}

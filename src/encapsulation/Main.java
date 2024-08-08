package encapsulation;

public class Main {
    public static void main(String[] args) {
        BrowserGood chrome = new BrowserGood();
        chrome.navigate("https://m2iformation.fr");
        //chrome.findIpAdress("https//m2iformation.fr", 90); //methode privee - mise en prive dans BrowserGood alors supprimer de ce cote
        //chrome.sendHttpRequest("110.2.5.67"); //methode privee - a supprimer car mise en prive dans BrowserGood
    }
}

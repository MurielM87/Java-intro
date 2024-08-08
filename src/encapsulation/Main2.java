package encapsulation;

public class Main2 {
    public static void main(String[] args) {
        BrowserBad chrome = new BrowserBad();
        chrome.navigate("https://nike.com");
        chrome.findIpAdress("https//nike.com", 90); //methode privee
        chrome.sendHttpRequest("100.5.9.56"); //methode privee
    }
}

package encapsulation;

public class BrowserGood {
    // -> ecrire l'url dans la barre d'url
    // -> trouver l'adresse ip correspondant au nom de domaine
    // -> envoyer la requete
    public void navigate(String url) {
        String ip = findIpAdress(url, 80);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    private String findIpAdress(String url, int port) {
        return "127.0.0.1";
    }

    private String sendHttpRequest(String ip) {
        return "<html><head></head><body></body></html>";
    }
}

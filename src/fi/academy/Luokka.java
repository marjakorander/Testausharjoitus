package fi.academy;

public class Luokka {
    private String sana;
    private String sijamuoto;

    public String getIsoSana() {
        return sana.toUpperCase();
    }

    public String getSana() {
        return sana;
    }
    
    public String getSijamuoto() {
        return sijamuoto;
    }    

    public void setSana(String sana) {
        this.sana = sana;
    }
}

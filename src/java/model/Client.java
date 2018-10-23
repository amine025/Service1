package model;

public class Client {

    String nom;
    String prenom;
    int ddn;
    String username;
    String machineName;
    String localisation;

    public Client(String nom, String prenom, int ddn, String ip, String nomMachine, String localisation) {
        this.nom = nom;
        this.prenom = prenom;
        this.ddn = ddn;
        this.username = ip;
        this.machineName = nomMachine;
        this.localisation = localisation;
    }

    public Client() {

    }

    public Client(String nom, String prenom, int ddn) {
        this.nom = nom;
        this.prenom = prenom;
        this.ddn = ddn;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getDdn() {
        return ddn;
    }

    public String getUsername() {
        return username;
    }

    public String getMachineName() {
        return machineName;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDdn(int ddn) {
        this.ddn = ddn;
    }

    public void setUsername(String ip) {
        this.username = ip;
    }

    public void setMachineName(String nomMachine) {
        this.machineName = nomMachine;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }
}

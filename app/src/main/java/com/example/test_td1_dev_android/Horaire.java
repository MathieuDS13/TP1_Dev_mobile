package com.example.test_td1_dev_android;

public class Horaire {

    private String villeDepart, villeArrivee;
    private String horaire;

    public Horaire(String villeDepart, String villeArrivee, String horaire) {
        this.villeDepart = villeDepart;
        this.villeArrivee = villeArrivee;
        this.horaire = horaire;
    }

    public String getVilleDepart() {
        return villeDepart;
    }

    public void setVilleDepart(String villeDepart) {
        this.villeDepart = villeDepart;
    }

    public String getVilleArrivee() {
        return villeArrivee;
    }

    public void setVilleArrivee(String villeArrivee) {
        this.villeArrivee = villeArrivee;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }
}

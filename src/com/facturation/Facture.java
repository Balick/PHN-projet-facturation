/**
 * @author Théo Balick
 * @author Jeff Emmanuel
 */

package com.facturation;

import java.util.Date;

public class Facture {
    private String nom_marchandise;
    private int qte_marchandise;
    private int numero_marchandise;
    private double prix_total;
    private Client client;
    private Date date_vente;

    public Facture(String nom, int qte, int num, double prix_total) {
        this.date_vente = new Date();
        this.nom_marchandise = nom;
        this.qte_marchandise = qte;
        this.numero_marchandise = num;
    }

    // Méthodes setters de la class Facture


    public double getPrix_total() {
        return prix_total;
    }

    public void setDate_vente(Date date_vente) {
        this.date_vente = date_vente;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setNom_marchandise(String nom_marchandise) {
        this.nom_marchandise = nom_marchandise;
    }

    public void setQte_marchandise(int qte_marchandise) {
        this.qte_marchandise = qte_marchandise;
    }

    public void setNumero_marchandise(int numero_marchandise) {
        this.numero_marchandise = numero_marchandise;
    }

    // Méthodes getters de la class Facture


    public void setPrix_total(double prix_total) {
        this.prix_total = prix_total;
    }

    public Date getDate_vente() {
        return date_vente;
    }

    public int getNumero_marchandise() {
        return numero_marchandise;
    }

    public String getNom_marchandise() {
        return nom_marchandise;
    }

    public int getQte_marchandise() {
        return qte_marchandise;
    }

    public Client getClient() {
        return client;
    }

    // Autres méthodes de la Class


}

/**
 * @author Théo Balick
 * @author Jeff Emmanuel
 */

package com.facturation;


import java.util.*;

public class Client {
    private List<Facture> facture = new ArrayList<Facture>();
    private String nom;

    /**
     * Constructeur de la class Clien
     * @param nom est le nom du client
     */
    public Client(String nom) {
        this.nom = nom;
    }

    // Méthodes setters de la class Client

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setFacture(List<Facture> facture) {
        this.facture = facture;
    }

    // Méthodes getters de la class Client

    public List<Facture> getFacture() {
        return facture;
    }

    public String getNom() {
        return nom;
    }

    public List<Facture> getFactures() {
        return facture;
    }

    /**
     * La class Adress est contenue dans la class Client.
     * Toute suppression de la class Client entrenerait aussi celle de la Class Adress.
     * Il s'agit de la class qui contient les informations sur l'adresse du client
     */
    static class Adress {
        private static String avenue;
        private static String numero;
        private static String ville;
        private static String commune;
        private static String pays;

        /**
         * Constructeur de la sous class Adress
         * @param avenue est le nom de l'avenue
         * @param numero est le numero de la parcelle
         * @param ville est le nom de la ville
         * @param commune est le nom de la commune
         * @param pays est le nom du pays
         */
        public Adress(String avenue, String numero, String ville, String commune, String pays) {
            Adress.avenue = avenue;
            Adress.numero = numero;
            Adress.ville = ville;
            Adress.commune = commune;
            Adress.pays = pays;
        }

        // Méthodes getters

        public String getAvenue() {
            return avenue;
        }

        public String getCommune() {
            return commune;
        }

        public String getNumero() {
            return numero;
        }

        public String getPays() {
            return pays;
        }

        public String getVille() {
            return ville;
        }

        // Méthodes setters

        public void setAvenue(String avenue) {
            Adress.avenue = avenue;
        }

        public void setCommune(String commune) {
            Adress.commune = commune;
        }

        public void setNumero(String numero) {
            Adress.numero = numero;
        }

        public void setPays(String pays) {
            Adress.pays = pays;
        }

        public void setVille(String ville) {
            Adress.ville = ville;
        }
    }

    // Autres méthodes de la Class

    // La méthode ci-dessous permet d'afficher les informations sur le client

    public void afficher_client() {
        System.out.println("Informations sur le client");
        System.out.println("---------------------------------------------------");
        System.out.println("Nom du client : " + this.nom);
        System.out.println("Avenue de résidence : " + Adress.avenue);
        System.out.println("Numéro du client : " + Adress.numero);
        System.out.println("Commune de résidence : " + Adress.commune);
        System.out.println("Ville de résidence : " + Adress.ville);
        System.out.println("Pays de résidence : " + Adress.pays);
        System.out.println("Nombre total des factures : " + this.facture.size());
    }

    // La méthode permet de trier le tableau passé en paramètre

    public void afficher_factures() {
        for (int i = 0; i < this.facture.size(); i++) {
            final Facture facture = this.facture.get(i);
            System.out.println("Facture numero " + (i+1));
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Nom de la marchandise(s) : " + facture.getNom_marchandise());
            System.out.println("Numéro de la facture : " + facture.getNumero_marchandise());
            System.out.println("Prix total sur la facture : " + facture.getPrix_total());
            System.out.println("Quantité de la marchandise : " + facture.getQte_marchandise());
            System.out.println("Date de la vente : " + facture.getDate_vente());
            System.out.println("Nom du client : " + facture.getClient().nom);
            System.out.println();
        }
    }
}

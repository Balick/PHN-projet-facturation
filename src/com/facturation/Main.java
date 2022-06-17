/**
 * @author Théo Balick
 * @author Jeff Emmanuel
 */

package com.facturation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Création et instanciation des objets de type facture
	    Facture facture1 = new Facture("banane",5,1,5000);
        Facture facture2 = new Facture("avocat",5,5,5000);
        Facture facture3 = new Facture("pomme",5,2,5000);
        Facture facture4 = new Facture("ananas",5,9,5000);
        List<Facture> factures = new ArrayList<Facture>();
        factures.add(facture1);
        factures.add(facture2);
        factures.add(facture3);
        factures.add(facture4);

        // Création et instanciation de l'objet client
        Client client = new Client("Zozo Matabaro");

        // Création et instanciation de l'adresse du client
        Client.Adress adress = new Client.Adress(
                "Du shaba",
                "503",
                "Lubumbashi",
                "kipushi",
                "République démocratique du congo"
        );

        // Attribution du client aux factures
        facture1.setClient(client);
        facture2.setClient(client);
        facture3.setClient(client);
        facture4.setClient(client);

        // Attribution de la facture au client
        client.setFacture(factures);

        //client.afficher_factures();
        client.afficher_client();
    }
}

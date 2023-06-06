package org.learning.shop;


/*Un prodotto è caratterizzato da:
        - codice (numero intero)
        - nome
        - descrizione
        - prezzo
        - iva
        - il codice prodotto sia accessibile solo in lettura
- gli altri attributi siano accessibili sia in lettura che in scrittura
- il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva
Lo shop gestisce diversi tipi di prodotto:
- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
- Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.
Create una classe Carrello con metodo main, in cui chiedete all’utente di valorizzare un carrello di prodotti con dati inseriti tramite scanner. Durante la richiesta di valorizzazione chiedete all’utente
se sta inserendo uno Smarphone o un Televisore o Cuffie e in base alla scelta dell’utente utilizzate il costruttore opportuno.
Al termine dell’inserimento stampate il riepilogo del carrello (fate l’override del metodo toString per restituire le informazioni da stampare per ogni classe)

*/

import java.util.Random;

public class Product {
    // CAMPI o ATTRIBUTI
    private final int idCode;
    private String name;
    private String description;
    private double price;

    private int vat;





    // COSTRUTTORE
    public Product(String name, String description, double price,int vat) {
        Random random = new Random();
        this.name = name;
        this.description = description;
        this.price = price;
        this.idCode = random.nextInt(9999999);
        this.vat = vat;
    }
    // METODI
    public String toString() {
        String data = "Name: " + name + "\n" +"code: " + idCode + "\n" + "Description: " + description + "\n" + "price: "
                + price + "\n" +"vat: " + vat  + "\n";

        return data;
    }


    public void setName(String name) {
        this.name = name;
    };public void setVat(int vat) {
        this.vat = vat;
    };

    public void setDescription(String description) {
        this.description = description;
    };

    public void setPrice(double price) {
        this.price = price;
    }


    public double getVatPrice() {

        return this.price + (this.price * this.vat / 100);
    }

    public String getCompleteName() {

        return this.name+ this.idCode;
    }


}

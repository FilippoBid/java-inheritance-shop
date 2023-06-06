package org.learning.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("quanti prodotti vuoi inserire ?");
        int cartSize = scanner.nextInt();
        
        String[] cart = new String[cartSize];

        for (int i = 0; i < cartSize; i++) {

            System.out.print("inserisci il tipo di prodotto, 1 per cuffie,2 per smartphone,3 per televisore,4 per prodotto generico");
            switch (scanner.nextInt()){
                case 1:
                    System.out.println("Hai scelto il cuffie");
                    scanner.nextLine();
                    System.out.println("Inserisci il nome del prodotto:");
                    String name = scanner.nextLine();

                    System.out.println("Inserisci la descrizione del prodotto:");
                    String description = scanner.nextLine();

                    System.out.println("Inserisci il prezzo del prodotto:");
                    double price = scanner.nextDouble();

                    System.out.println("Inserisci l'IVA del prodotto:");
                    int vat = scanner.nextInt();

                    /*scanner.nextLine(); */

                    System.out.println("Il prodotto è wireless? (1sì/0no)");

                    boolean wireless = true;
                    while (true){
                        int chose = scanner.nextInt();
                        if (chose == 1){
                            wireless = true;
                            break;

                        } else if (chose==2) {
                            wireless =false;
                            break;

                        }else{
                            System.out.println("inserire parametro valido,Il prodotto è wireless? (1sì/0no)");
                            chose= scanner.nextInt();}


                    }


                    System.out.println("Il prodotto è cablato? (sì/no)");

                    boolean cable = true;
                    while (true){
                        int chose = scanner.nextInt();
                        if (chose == 1){
                            cable = true;
                            break;

                        } else if (chose==2) {
                            cable =false;
                            break;

                        }else{
                            System.out.println("inserire parametro valido,Il prodotto è cablato? (1sì/0no)");
                            chose= scanner.nextInt();}


                    }
                    scanner.nextLine();
                    System.out.println("Inserisci il colore del prodotto:");
                    String color = scanner.nextLine();

                    Product product = new Headphone(name,description,price,vat,wireless,cable,color);
                    cart[i] = product.toString();
                    System.out.println(cart[i]);

                    break;
                case 2:
                    System.out.println("Hai scelto il smartphone");
                    scanner.nextLine();
                    System.out.println("Inserisci il nome del prodotto:");
                     name = scanner.nextLine();

                    System.out.println("Inserisci la descrizione del prodotto:");
                    description = scanner.nextLine();

                    System.out.println("Inserisci il prezzo del prodotto:");
                     price = scanner.nextDouble();

                    System.out.println("Inserisci l'IVA del prodotto:");
                    vat = scanner.nextInt();

                    System.out.println("Inserisci codice IMEI del prodotto:");
                    String IMEI = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Inserisci il storage del prodotto:");
                    int storage = scanner.nextInt();

                    Product product2 = new Smartphone(name,description,price,vat,IMEI,storage);
                    cart[i] = product2.toString();
                    System.out.println(cart[i]);

                    break;
                case 3:
                    System.out.println("Hai scelto televisore");
                    System.out.println("Hai scelto il smartphone");
                    scanner.nextLine();
                    System.out.println("Inserisci il nome del prodotto:");
                    name = scanner.nextLine();

                    System.out.println("Inserisci la descrizione del prodotto:");
                    description = scanner.nextLine();

                    System.out.println("Inserisci il prezzo del prodotto:");
                    price = scanner.nextDouble();

                    System.out.println("Inserisci l'IVA del prodotto:");
                    vat = scanner.nextInt();

                    System.out.println("Il prodotto è smart? (sì/no)");

                    boolean smart = true;
                    while (true){
                        int chose = scanner.nextInt();
                        if (chose == 1){
                             smart = true;
                            break;

                        } else if (chose==2) {
                            smart =false;
                            break;

                        }else{
                            System.out.println("inserire parametro valido,Il prodotto è cablato? (1sì/0no)");
                            chose= scanner.nextInt();}


                    }

                    System.out.println("Inserisci le dimensioni dello schermo:");
                    int screensize = scanner.nextInt();

                    Product product3 = new Television(name,description,price,vat,smart,screensize);
                    cart[i] = product3.toString();
                    System.out.println(cart[i]);

                    break;
                /*case 4:
                    System.out.println("Hai scelto prodotto generico");
                    break;*/
                default:
                    System.out.println("Scelta non valida");
                    scanner.nextInt();
            }

        }

    }
}

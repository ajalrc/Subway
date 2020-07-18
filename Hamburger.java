package com.timbuchaka;

import java.util.Scanner;

public class Hamburger {
    private String breadtype;
    private String meattype;
    private String[] additems;
    int initialprice = 0;
    Scanner scanner = new Scanner(System.in);

    public Hamburger(String bread, String meat) {
        this.breadtype = bread;
        this.meattype = meat;
    }

    public int Hamburgerprice(Hamburger burger) {
        if (burger.breadtype.equals("white")) {
            initialprice = initialprice + 1;
            System.out.println("You chose white bread");
        }
        if (burger.meattype.equals("chicken")) {
            initialprice = initialprice + 4;
            System.out.println("You chose chicken for meat");
        }
        if (burger.breadtype.equals("wheat")) {
            initialprice = initialprice + 2;
            System.out.println("You chose healthy bread");
        }
        if (burger.meattype.equals("beef")) {
            initialprice = initialprice + 5;
            System.out.println("You choose beef.");
        }
        System.out.println(" You can add 4 more items. Do you want to add: Yes or No ");
        String ans = scanner.nextLine();

        if (ans.equals("Yes")) {
            System.out.println("How many items do you want to add: ");
            int numitems = scanner.nextInt();
            scanner.nextLine();
            while (numitems <= 4 & numitems > 0) {
                numitems--;
                itemsaddedprice();

            }
        }
        return initialprice;
    }

    public void itemsaddedprice() {

        System.out.println("Items to choose from: " +
                "Tomatoes- $1, " +
                "Carrots- $2, " +
                "Onion-$3, " +
                "Cabbage-$1, " +
                "Broccoli- $2," +
                "Olive- $1" +
                "Salsa-$1");

        String scan = scanner.nextLine();
        if (scan.equals("Tomatoes")) {
            initialprice = initialprice + 1;
            System.out.println("You added tomotoes");
            System.out.println("Price is :"+initialprice);
        }
        if (scan.equals("Carrots")) {
            initialprice = initialprice + 2;
            System.out.println("You added Carrots");
            System.out.println("Price is :"+initialprice);
        }
        if (scan.equals("Onion")) {
            initialprice = initialprice + 3;
            System.out.println("You added Onions");
            System.out.println("Price is :"+initialprice);
        }
        if (scan.equals("Cabbage")) {
            initialprice = initialprice + 1;
            System.out.println("You added Cabbage");
            System.out.println("Price is :"+initialprice);
        }
        if (scan.equals("Broccoli")) {
            initialprice = initialprice + 2;
            System.out.println("You added Broccoli");
            System.out.println("Price is :"+initialprice);
        }
    }

    public static class Healthyburger{
        private String bread;
        private String meat;
        int initialprice = 0;
        Scanner scanner = new Scanner(System.in);
        public Healthyburger( String meat) {
            this.bread = "Brown Ryle bread";
            this.meat = meat;
        }

        public int healthyHamburgerprice(Healthyburger burger) {

            if (this.bread == "Brown Ryle bread") {
                initialprice = initialprice + 3;
                System.out.println("Price is :"+initialprice);
            }
            if (this.meat == "chicken") {
                initialprice = initialprice + 4;
                System.out.println("You chose chicken for meat");
                System.out.println("Price is :"+initialprice);
            }
            if (this.meat == "beef") {
                initialprice = initialprice + 5;
                System.out.println("You choose beef. Be careful");
                System.out.println("Price is :"+initialprice);
            }
            System.out.println("You can add six more items");
            System.out.println("Do you want to add any items: Yes or No");
            String ans = scanner.nextLine();
            System.out.println("How many items do you want to add: ");
            int numitems = scanner.nextInt();
            scanner.nextLine();
            if (ans.equals("Yes")) {
                while (numitems <= 6 & numitems >=0) {
                    numitems--;
                    itemsaddedprice();

                }
            }
            return initialprice;
        }
        public void itemsaddedprice() {

            System.out.println("Items to choose from: " +
                    "Tomatoes- $1, " +
                    "Carrots- $2, " +
                    "Onion-$3, " +
                    "Cabbage-$1, " +
                    "Broccoli- $2" +
                    "Olive- $1" +
                    "Salsa-$1");

            String scan = scanner.nextLine();
            if (scan.equals("Tomatoes")) {
                initialprice = initialprice + 1;
                System.out.println("You added tomotoes");
                System.out.println("Price is :"+initialprice);
            }
            if (scan.equals("Carrots")) {
                initialprice = initialprice + 2;
                System.out.println("You added Carrots");
                System.out.println("Price is :"+initialprice);
            }
            if (scan.equals("Onion")) {
                initialprice = initialprice + 3;
                System.out.println("You added Onions");
                System.out.println("Price is :"+initialprice);
            }
            if (scan.equals("Cabbage")) {
                initialprice = initialprice + 1;
                System.out.println("You added Cabbage");
                System.out.println("Price is :"+initialprice);
            }
            if (scan.equals("Broccoli")) {
                initialprice = initialprice + 2;
                System.out.println("You added Broccoli");
                System.out.println("Price is :"+initialprice);
            }
        }


    }
}

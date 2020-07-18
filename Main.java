package com.timbuchaka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" What kind of bread do you want for you Hamburger: white or wheat");
        String bread= scanner.nextLine();
        System.out.println(" What kind of meat do you want for you Hamburger: chicken or beef");
        String meat= scanner.nextLine();
        Hamburger myburger= new Hamburger(bread, meat);

        System.out.println("The total price would be "+ myburger.Hamburgerprice(myburger));
    }
}

package com.neoteric.savingsaccounts.interfacesegregation;

import java.util.Scanner;

public class Test {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            ShoppingMall mall = new ShoppingMall();
            mall.enterMall();

            System.out.println("\nAvailable Brands:");
            System.out.println("1. US Polo");
            System.out.println("2. Manyavar");
            System.out.print("Choose a brand: ");
            int choice = scanner.nextInt();

            Brand brand;
            switch (choice) {
                case 1:
                    brand = new Brand("US Polo", new USPoloFactory());
                    break;
                case 2:
                    brand = new Brand("Manyavar", new ManyavarFactory());
                    break;
                default:
                    brand = new Brand("Default", new USPoloFactory());
                    break;
            }

            brand.chooseBrand();
            brand.showOutfit();
        }
    }



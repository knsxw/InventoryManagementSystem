package service;

import model.Furniture;
import model.Item;

import java.util.Scanner;

import static main.Main.itemArray;

public class FurnitureService {
    Scanner scanner;
    public FurnitureService(Scanner scanner){
        this.scanner = scanner;
    }

    public Furniture insert(){
        System.out.print("Enter the name of the item: ");
        String name = scanner.next();

        System.out.print("Enter the price of the item: ");
        int price = scanner.nextInt();

        System.out.print("Enter the quantity of the item: ");
        int qty = scanner.nextInt();

        System.out.print("Enter the company of item: ");
        String company = scanner.next();

        System.out.print("Enter the country import of item: ");
        String countryImport = scanner.next();

        Furniture item;
        item = new Furniture(name, price, qty, company, countryImport);

        return item;
    }

    public void update(){
        System.out.print("Enter ID to update: ");
        String id = scanner.next();

        System.out.print("Enter the name of the item: ");
        String name = scanner.next();

        System.out.print("Enter the price of the item: ");
        int price = scanner.nextInt();

        System.out.print("Enter the quantity of the item: ");
        int qty = scanner.nextInt();

        System.out.print("Enter the company of item: ");
        String company = scanner.next();

        System.out.print("Enter the country import of item: ");
        String countryImport = scanner.next();

        for (Item ob : itemArray) {
            if(ob.getID().equalsIgnoreCase(id)){
                Furniture obj = (Furniture) ob;
                obj.setName(name);
                obj.setPrice(price);
                obj.setQty(qty);
                obj.setCompany(company);
                obj.setCountryImport(countryImport);
                break;
            }
        }
    }
}

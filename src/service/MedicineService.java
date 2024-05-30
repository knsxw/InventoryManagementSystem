package service;

import model.Item;
import model.Medicine;

import java.util.Scanner;

import static main.Main.itemArray;

public class MedicineService {
    Scanner scanner;
    public MedicineService(Scanner scanner){
        this.scanner = scanner;
    }

    public Medicine insert(){
        System.out.print("Enter the name of the medicine: ");
        String name = scanner.next();

        System.out.print("Enter the price of the medicine: ");
        int price = scanner.nextInt();

        System.out.print("Enter the quantity of the medicine: ");
        int qty = scanner.nextInt();

        System.out.print("Enter the expired date of the medicine: ");
        String expiredDate = scanner.next();

        System.out.print("Enter the company of medicine: ");
        String company = scanner.next();

        Medicine item;
        item = new Medicine(name, price, qty, expiredDate, company);
        return item;
    }

    public void update(){
        System.out.print("Enter ID to update: ");
        String id = scanner.next();

        System.out.print("Enter the name of the medicine: ");
        String name = scanner.next();

        System.out.print("Enter the price of the medicine: ");
        int price = scanner.nextInt();

        System.out.print("Enter the quantity of the medicine: ");
        int qty = scanner.nextInt();

        System.out.print("Enter the expired date of the medicine: ");
        String expiredDate = scanner.next();

        System.out.print("Enter the company of medicine: ");
        String company = scanner.next();

        for (Item ob : itemArray) {
            if(ob.getID().equalsIgnoreCase(id)){
                Medicine obj = (Medicine) ob;
                obj.setName(name);
                obj.setPrice(price);
                obj.setQty(qty);
                obj.setExpiredDate(expiredDate);
                obj.setCompany(company);
                break;
            }
        }
    }
}

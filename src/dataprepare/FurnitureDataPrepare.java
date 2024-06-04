package dataprepare;

import model.Furniture;

import static util.DataUtil.generateID;
import static util.DataUtil.scanner;

public class FurnitureDataPrepare {

    public FurnitureDataPrepare(){}

    public Furniture insert() {
        Furniture furniture = new Furniture();
        furniture.setID(generateID());

        System.out.print("Enter the name of the item: ");
        furniture.setName(scanner.next());

        System.out.print("Enter the price of the item: ");
        furniture.setPrice(scanner.nextInt());

        System.out.print("Enter the quantity of the item: ");
        furniture.setQty(scanner.nextInt());

        System.out.print("Enter the company of item: ");
        furniture.setCompany(scanner.next());

        System.out.print("Enter the country import of item: ");
        furniture.setCountryImport(scanner.next());
        return furniture;
    }

    public Furniture update() {
        Furniture furniture = new Furniture();

        System.out.print("Enter ID to update: ");
        furniture.setID(scanner.next());

        System.out.print("Enter the name of the item: ");
        furniture.setName(scanner.next());

        System.out.print("Enter the price of the item: ");
        furniture.setPrice(scanner.nextInt());

        System.out.print("Enter the quantity of the item: ");
        furniture.setQty(scanner.nextInt());

        System.out.print("Enter the company of item: ");
        furniture.setCompany(scanner.next());

        System.out.print("Enter the country import of item: ");
        furniture.setCountryImport(scanner.next());
        return furniture;
    }

    public String delete() {
        System.out.print("Enter ID to update: ");
        return scanner.next();
    }
}

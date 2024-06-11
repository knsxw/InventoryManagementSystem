package dataprepare;

import dao.FurnitureDao;
import model.Furniture;

import static util.DataUtil.generateID;
import static util.DataUtil.scanner;

public class FurnitureDataPrepare {
    private final FurnitureDao furnitureDao = new FurnitureDao();
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
        System.out.print("Enter ID to delete: ");
        return scanner.next();
    }

    public void showAll() {
        System.out.printf("%1s %10s %1s %15s %1s %15s %1s %15s %1s %15s %1s %15s %1s%n",
                "|", "ID", "|", "Name", "|", "Price", "|", "Qty", "|", "Company", "|","CountryImport", "|");
        furnitureDao.getAllFurniture().forEach((Furniture furniture)-> {
            System.out.println("-".repeat(104));
            System.out.printf("%1s %10s %1s %15s %1s %15s %1s %15s %1s %15s %1s %15s %1s%n",
                    "|", furniture.getID(), "|", furniture.getName(), "|", furniture.getPrice(), "|", furniture.getPrice(), "|", furniture.getCompany(), "|",
                    furniture.getCountryImport(),"|");
        });
        System.out.println("-".repeat(104));
    }
}

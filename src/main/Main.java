package main;

import dataprepare.BoxDataPrepare;
import model.Box;
import model.Furniture;
import model.Item;
import model.Medicine;
import service.BoxService;
import service.FurnitureService;
import service.MedicineService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static List<Item> itemArray = new ArrayList<>();
    static boolean isContinue = true;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BoxService pService = new BoxService();
        BoxDataPrepare boxDataPrepare = new BoxDataPrepare(scanner);
        FurnitureService fService = new FurnitureService(scanner);
        MedicineService mService = new MedicineService(scanner);

        while(isContinue) {

            System.out.print("Box, Furniture, Medicine (1,2,3): ");
            int PFM = scanner.nextInt();

            System.out.print("Insert, Delete, Update (1,2,3): ");
            int num = scanner.nextInt();

            switch(PFM) {
                case 1 -> {
                    switch(num) {
                        case 1 -> {
                            boxDataPrepare.insert();
                            Box item = pService.insert(boxDataPrepare.getName(), boxDataPrepare.getWeight(), boxDataPrepare.getType(), boxDataPrepare.getAddress());
                            itemArray.add(item);
                        }
                        case 2 -> {
                            boxDataPrepare.delete();
                            String ID = boxDataPrepare.getID();
                            delete(ID);
                        }
                        case 3 -> {
                            boxDataPrepare.update();
                            pService.update(boxDataPrepare.getID(), boxDataPrepare.getName(), boxDataPrepare.getWeight(), boxDataPrepare.getType(), boxDataPrepare.getAddress());
                        }
                    }
                }
                case 2 -> {
                    switch(num) {
                        case 1 -> {

                            Furniture item = fService.insert();
                            itemArray.add(item);

                        }
                        case 2 -> {

                            System.out.print("Enter ID to delete: ");
                            String ID = scanner.next();
                            delete(ID);

                        }
                        case 3 -> {
                            fService.update();
                        }
                    }
                }
                case 3 -> {
                    switch(num) {
                        case 1 -> {

                            Medicine item = mService.insert();
                            itemArray.add(item);

                        }
                        case 2 -> {

                            System.out.print("Enter ID to delete: ");
                            String ID = scanner.next();
                            delete(ID);

                        }
                        case 3 -> {
                            mService.update();
                        }
                    }
                }
            }

            print();

            System.out.print("Do you want to continue (Y/N) ? ");
            String yesNo = scanner.next();

            if (yesNo.equalsIgnoreCase("N")) {
                isContinue = false;
                scanner.close();
                print();
            } else if (yesNo.equalsIgnoreCase("Y")) {
            } else {
                System.out.println("Wrong Input");
                break;
            }

        }
    }

    public static void delete(String id) {
        Iterator<Item> iterator = itemArray.iterator();
        while (iterator.hasNext()) {
            Item obj = iterator.next();
            if (obj.getID().equalsIgnoreCase(id)) {
                iterator.remove();
                break;
            }
        }
    }

    public static void print() {
        for (Item item : itemArray) {
            switch (item) {
                case Box a -> a.print();
                case Furniture a -> a.print();
                default -> {
                    Medicine a = (Medicine) item;
                    a.print();
                }
            }
        }
        System.out.println("-".repeat(20));
    }
}
package main;

import dataprepare.BoxDataPrepare;
import dataprepare.FurnitureDataPrepare;
import dataprepare.MedicineDataPrepare;
import model.Box;
import model.Furniture;
import model.Item;
import model.Medicine;
import service.BoxService;
import service.FurnitureService;
import service.MedicineService;
import static util.DataUtil.scanner;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static List<Item> itemArray = new ArrayList<>();
    static boolean isContinue = true;
    public static void main(String[] args) {

        BoxService boxService = new BoxService();
        BoxDataPrepare boxDataPrepare = new BoxDataPrepare();
        FurnitureService furnitureService = new FurnitureService();
        FurnitureDataPrepare furnitureDataPrepare = new FurnitureDataPrepare();
        MedicineService medicineService = new MedicineService();
        MedicineDataPrepare medicineDataPrepare = new MedicineDataPrepare();

        while(isContinue) {

            System.out.print("Box, Furniture, Medicine (1,2,3): ");
            int PFM = scanner.nextInt();

            System.out.print("Insert, Delete, Update (1,2,3): ");
            int num = scanner.nextInt();

            switch(PFM) {
                case 1 -> {
                    switch(num) {
                        case 1 -> boxService.insert(boxDataPrepare.insert());
                        case 2 -> boxService.delete(boxDataPrepare.delete());
                        case 3 -> boxService.update(boxDataPrepare.update());
                    }
                }
                case 2 -> {
                    switch(num) {
                        case 1 -> furnitureService.insert(furnitureDataPrepare.insert());
                        case 2 -> furnitureService.delete(furnitureDataPrepare.delete());
                        case 3 -> furnitureService.update(furnitureDataPrepare.update());
                    }
                }
                case 3 -> {
                    switch(num) {
                        case 1 -> medicineService.insert(medicineDataPrepare.insert());
                        case 2 -> medicineService.delete(medicineDataPrepare.delete());
                        case 3 -> medicineService.update(medicineDataPrepare.update());
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
            } else {
                if (!yesNo.equalsIgnoreCase("Y")) {
                    System.out.println("Wrong Input");
                    break;
                }
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
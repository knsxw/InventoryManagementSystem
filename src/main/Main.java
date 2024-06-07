package main;

import controller.BoxController;
import controller.FurnitureController;
import controller.MedicineController;
import model.Item;

import static util.DataUtil.scanner;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static List<Item> itemArray = new ArrayList<>();
    static boolean isContinue = true;
    public static void main(String[] args) {
        BoxController boxController = new BoxController();
        FurnitureController furnitureController = new FurnitureController();
        MedicineController medicineController = new MedicineController();

        while(isContinue) {

            System.out.print("Box, Furniture, Medicine (1,2,3): ");
            int PFM = scanner.nextInt();

            System.out.print("Insert, Delete, Update, ShowAll (1,2,3,4): ");
            int num = scanner.nextInt();

            switch(PFM) {
                case 1 -> boxController.control(num);
                case 2 -> furnitureController.control(num);
                case 3 -> medicineController.control(num);
                default -> throw new IllegalStateException("Unexpected value: " + PFM);
            }

            System.out.print("Do you want to continue (Y/N) ? ");
            String yesNo = scanner.next();

            if (yesNo.equalsIgnoreCase("N")) {
                isContinue = false;
                scanner.close();
            } else {
                if (!yesNo.equalsIgnoreCase("Y")) {
                    System.out.println("Wrong Input");
                    break;
                }
            }

        }
    }

//    public static void print() {
//        for (Item item : itemArray) {
//            switch (item) {
//                case Box a -> a.print();
//                case Furniture a -> a.print();
//                default -> {
//                    Medicine a = (Medicine) item;
//                    a.print();
//                }
//            }
//        }
//    }
}
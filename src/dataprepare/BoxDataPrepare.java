package dataprepare;

import dao.BoxDao;
import model.Box;

import java.util.ArrayList;

import static util.DataUtil.generateID;
import static util.DataUtil.scanner;

public class BoxDataPrepare {
    private final BoxDao boxDao = new BoxDao();
    public BoxDataPrepare() {}

    public Box insert(){
        Box box = new Box();
        box.setID(generateID());

        System.out.print("Enter the name of the item: ");
        box.setName(scanner.next());

        System.out.print("Enter the weight of the item: ");
        box.setWeight(scanner.nextDouble());

        System.out.print("Enter the type of the item: ");
        box.setType(scanner.next());

        System.out.print("Enter the address of delivery: ");
        box.setAddress(scanner.next());

        return box;
    }

    public Box update(){
        Box box = new Box();

        System.out.print("Enter ID to update: ");
        box.setID(scanner.next());

        System.out.print("Enter the name of the item: ");
        box.setName(scanner.next());

        System.out.print("Enter the weight of the item: ");
        box.setWeight(scanner.nextDouble());

        System.out.print("Enter the type of the item: ");
        box.setType(scanner.next());

        System.out.print("Enter the address of delivery: ");
        box.setAddress(scanner.next());

        return box;
    }

    public String delete() {
        System.out.print("Enter ID to update: ");
        return scanner.next();
    }

    public void showAll() {
        System.out.printf("%1s %10s %1s %15s %1s %15s %1s %15s %1s %15s %1s%n",
                "|", "ID", "|", "Name", "|", "Weight", "|", "Type", "|", "Address", "|");
        boxDao.getAllBoxes().forEach((Box box)-> {
            System.out.println("-".repeat(150));
            System.out.printf("%1s %10s %1s %15s %1s %15s %1s %15s %1s %15s %1s%n",
                    "|", box.getID(), "|", box.getName(), "|", box.getWeight(), "|", box.getType(), "|", box.getAddress(), "|");
        });
        System.out.println("-".repeat(150));
    }

}

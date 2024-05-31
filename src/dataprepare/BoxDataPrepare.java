package dataprepare;

import model.Box;

import java.util.Scanner;

public class BoxDataPrepare extends DataPrepare{
    public BoxDataPrepare(Scanner scanner) {
        super(scanner);
    }
    public Box insert(){
        Box box = new Box();
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
}

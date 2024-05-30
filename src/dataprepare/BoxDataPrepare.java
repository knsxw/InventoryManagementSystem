package dataprepare;

import java.util.Scanner;

public class BoxDataPrepare extends DataPrepare{

    private String name;
    private double weight;
    private String type;
    private String address;

    public BoxDataPrepare(Scanner scanner) {
        super(scanner);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void insert(){
        System.out.print("Enter the name of the item: ");
        setName(scanner.next());

        System.out.print("Enter the weight of the item: ");
        setWeight(scanner.nextDouble());

        System.out.print("Enter the type of the item: ");
        setType(scanner.next());

        System.out.print("Enter the address of delivery: ");
        setAddress(scanner.next());

    }

    public void update(){
        System.out.print("Enter ID to update: ");
        super.setID(scanner.next());

        System.out.print("Enter the name of the item: ");
        setName(scanner.next());

        System.out.print("Enter the weight of the item: ");
        setWeight(scanner.nextDouble());

        System.out.print("Enter the type of the item: ");
        setType(scanner.next());

        System.out.print("Enter the address of delivery: ");
        setAddress(scanner.next());
    }
}

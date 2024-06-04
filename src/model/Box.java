package model;

public class Box extends Item {

    private double weight;
    private String type;
    private String address;

    public Box(){
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

    public void print() {
        System.out.println("-".repeat(20));
        System.out.println("ID : "+ this.getID());
        System.out.println("Name : "+ this.getName());
        System.out.println("Weight : "+ this.weight+"kg");
        System.out.println("Type : "+ this.type);
        System.out.println("Address : "+ this.address);
    }
}

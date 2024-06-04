package model;

public class Furniture extends Item{

    private int price;
    private int qty;
    private String company;
    private String countryImport;

    public Furniture() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCountryImport() {
        return countryImport;
    }

    public void setCountryImport(String countryImport) {
        this.countryImport = countryImport;
    }

    public void print() {
        System.out.println("-".repeat(20));
        System.out.println("ID : "+ this.getID());
        System.out.println("Name : "+ this.getName());
        System.out.println("Price : "+ this.price+"$");
        System.out.println("Qty : "+ this.qty);
        System.out.println("Company : "+ this.company);
        System.out.println("Country Import : "+ this.countryImport);
    }
}

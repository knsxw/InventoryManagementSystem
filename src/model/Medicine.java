package model;

public class Medicine extends Item{

    private int price;
    private int qty;
    private String expiredDate;
    private String company;

    public  Medicine(){
    }

    public Medicine(String name, int price, int qty, String expiredDate, String company) {
        super(name);
        this.price = price;
        this.qty = qty;
        this.expiredDate = expiredDate;
        this.company = company;
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

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void print() {
        System.out.println("-".repeat(20));
        System.out.println("ID : "+ this.getID());
        System.out.println("Name : "+ this.getName());
        System.out.println("Price : "+ this.price+"$");
        System.out.println("Qty : "+ this.qty);
        System.out.println("Company : "+ this.company);
        System.out.println("Expired Date : "+ this.expiredDate);
    }
}

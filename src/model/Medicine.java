package model;

import java.time.LocalDate;

public class Medicine extends Item{

    private int price;
    private int qty;
    private LocalDate expiredDate;
    private String company;

    public  Medicine(){
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

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(LocalDate expiredDate) {
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

package service;

import model.Furniture;
import model.Item;

import static main.Main.itemArray;

public class FurnitureService {
    public FurnitureService(){
    }

    public Furniture insert(Furniture furniture){
        Furniture item;
        item = new Furniture(furniture.getName(), furniture.getPrice(), furniture.getQty(), furniture.getCompany(), furniture.getCountryImport());
        return item;
    }

    public void update(Furniture furniture){

        for (Item ob : itemArray) {
            if(ob.getID().equalsIgnoreCase(furniture.getID())){
                Furniture obj = (Furniture) ob;
                obj.setName(furniture.getName());
                obj.setPrice(furniture.getPrice());
                obj.setQty(furniture.getQty());
                obj.setCompany(furniture.getCompany());
                obj.setCountryImport(furniture.getCountryImport());
                break;
            }
        }
    }
}

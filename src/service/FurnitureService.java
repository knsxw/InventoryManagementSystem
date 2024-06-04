package service;

import model.Furniture;
import model.Item;

import java.util.Iterator;

import static main.Main.itemArray;

public class FurnitureService {
    public FurnitureService(){
    }

    public void insert(Furniture furniture){
        itemArray.add(furniture);
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

    public void delete(String id) {
        Iterator<Item> iterator = itemArray.iterator();
        while (iterator.hasNext()) {
            Item obj = iterator.next();
            if (obj.getID().equalsIgnoreCase(id)) {
                iterator.remove();
                break;
            }
        }
    }
}

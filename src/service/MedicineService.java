package service;

import model.Item;
import model.Medicine;

import java.util.Iterator;

import static main.Main.itemArray;

public class MedicineService {

    public MedicineService(){
    }

    public void insert(Medicine medicine){
        itemArray.add(medicine);
    }

    public void update(Medicine medicine){
        for (Item ob : itemArray) {
            if(ob.getID().equalsIgnoreCase(medicine.getID())){
                Medicine obj = (Medicine) ob;
                obj.setName(medicine.getName());
                obj.setPrice(medicine.getPrice());
                obj.setQty(medicine.getQty());
                obj.setExpiredDate(medicine.getExpiredDate());
                obj.setCompany(medicine.getCompany());
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

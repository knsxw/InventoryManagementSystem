package service;

import model.Item;
import model.Medicine;

import static main.Main.itemArray;

public class MedicineService {

    public MedicineService(){
    }

    public Medicine insert(Medicine medicine){
        Medicine item;
        item = new Medicine(medicine.getName(), medicine.getPrice(), medicine.getQty(), medicine.getExpiredDate(), medicine.getCompany());
        return item;
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
}

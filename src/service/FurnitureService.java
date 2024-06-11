package service;

import dao.FurnitureDao;
import model.Furniture;
import model.Item;

import java.util.Iterator;

import static main.Main.itemArray;

public class FurnitureService {
    private final FurnitureDao furnitureDao = new FurnitureDao();
    public FurnitureService(){
    }

    public void insert(Furniture furniture){
        furnitureDao.insert(furniture);
    }

    public void update(Furniture furniture){
        furnitureDao.update(furniture);
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

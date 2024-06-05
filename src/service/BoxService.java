package service;

import dao.BoxDao;
import model.Box;
import model.Item;

import java.util.Iterator;

import static main.Main.itemArray;

public class BoxService {
    private final BoxDao boxDao = new BoxDao();
    public BoxService(){
    }

    public void insert(Box box) {
        this.boxDao.insert(box);
    }

    public void update(Box box){

        for (Item ob : itemArray) {
            if(ob.getID().equalsIgnoreCase(box.getID())){
                Box obj = (Box) ob;
                obj.setName(box.getName());
                obj.setWeight(box.getWeight());
                obj.setType(box.getType());
                obj.setAddress(box.getAddress());
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

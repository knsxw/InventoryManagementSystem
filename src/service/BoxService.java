package service;

import model.Box;
import model.Item;
import static main.Main.itemArray;

public class BoxService {
    public BoxService(){
    }

    public Box insert(String name, double weight, String type, String address) {
        Box item;
        item = new Box(name, weight, type, address);
        return item;
    }

    public void update(String id, String name, double weight, String type, String address){

        for (Item ob : itemArray) {
            if(ob.getID().equalsIgnoreCase(id)){
                Box obj = (Box) ob;
                obj.setName(name);
                obj.setWeight(weight);
                obj.setType(type);
                obj.setAddress(address);
                break;
            }
        }
    }
}

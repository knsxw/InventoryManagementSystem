package service;

import model.Box;
import model.Item;
import static main.Main.itemArray;

public class BoxService {
    public BoxService(){
    }

    public Box insert(Box box) {
        Box item;
        item = new Box(box.getName(), box.getWeight(), box.getType(), box.getAddress());
        return item;
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
}

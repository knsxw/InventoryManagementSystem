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
        boxDao.update(box);
    }

    public void delete(String id) {
        boxDao.delete(id);
    }


}

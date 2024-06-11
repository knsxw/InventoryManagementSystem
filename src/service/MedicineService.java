package service;

import dao.MedicineDao;
import model.Item;
import model.Medicine;

import java.util.Iterator;

import static main.Main.itemArray;

public class MedicineService {
    private final MedicineDao medicineDao = new MedicineDao();
    public MedicineService(){
    }

    public void insert(Medicine medicine){
        medicineDao.insert(medicine);
    }

    public void update(Medicine medicine){
        medicineDao.update(medicine);
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

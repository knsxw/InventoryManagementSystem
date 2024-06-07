package controller;

import dataprepare.MedicineDataPrepare;
import service.MedicineService;

public class MedicineController {
    MedicineService medicineService = new MedicineService();
    MedicineDataPrepare medicineDataPrepare = new MedicineDataPrepare();
    public MedicineController(){
    }
    public void control(int num){
        switch(num) {
            case 1 -> medicineService.insert(medicineDataPrepare.insert());
            case 2 -> medicineService.delete(medicineDataPrepare.delete());
            case 3 -> medicineService.update(medicineDataPrepare.update());
        }
    }
}

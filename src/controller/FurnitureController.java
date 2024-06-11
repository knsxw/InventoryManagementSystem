package controller;

import dataprepare.FurnitureDataPrepare;
import service.FurnitureService;

public class FurnitureController {
    FurnitureService furnitureService = new FurnitureService();
    FurnitureDataPrepare furnitureDataPrepare = new FurnitureDataPrepare();
    public FurnitureController() {
    }
    public void control(int num) {
        switch(num) {
            case 1 -> furnitureService.insert(furnitureDataPrepare.insert());
            case 2 -> furnitureService.delete(furnitureDataPrepare.delete());
            case 3 -> furnitureService.update(furnitureDataPrepare.update());
            case 4 -> furnitureDataPrepare.showAll();
        }
    }
}

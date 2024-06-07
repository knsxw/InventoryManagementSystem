package controller;

import dataprepare.BoxDataPrepare;
import service.BoxService;

public class BoxController {
    BoxService boxService = new BoxService();
    BoxDataPrepare boxDataPrepare = new BoxDataPrepare();
    public BoxController() {
    }
    public void control(int num) {
        switch(num) {
            case 1 -> boxService.insert(boxDataPrepare.insert());
            case 2 -> boxService.delete(boxDataPrepare.delete());
            case 3 -> boxService.update(boxDataPrepare.update());
            case 4 -> boxDataPrepare.showAll();
        }
    }
}

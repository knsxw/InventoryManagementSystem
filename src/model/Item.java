package model;

public class Item {

    private String ID = "";
    private String name;
    private final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public Item() {
        for (int i=0; i < 6; i++) {
            ID = ID + characters.charAt((int) Math.floor(Math.random() * 36));
        }
    }
    public Item (String n) {
        for (int i=0; i < 6; i++) {
            ID = ID + characters.charAt((int) Math.floor(Math.random() * 36));
        }
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}

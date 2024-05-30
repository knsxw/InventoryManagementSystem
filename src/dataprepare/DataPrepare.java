package dataprepare;

import java.util.Scanner;

public class DataPrepare {
    private String ID;
    Scanner scanner;

    public DataPrepare(Scanner scanner){
        this.scanner = scanner;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void delete(){
        System.out.print("Enter ID to Delete");
        setID(scanner.next());
    }
}

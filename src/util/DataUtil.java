package util;

import java.util.Scanner;

public class DataUtil {
    public static Scanner scanner = new Scanner(System.in);
    public static String generateID() {
        StringBuilder ID = new StringBuilder();
        for (int i=0; i < 6; i++) {
            String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            ID.append(characters.charAt((int) Math.floor(Math.random() * 36)));
        }
        return ID.toString();
    }
}

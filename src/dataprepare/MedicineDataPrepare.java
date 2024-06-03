package dataprepare;

import model.Medicine;
import java.time.LocalDate;
import java.util.Scanner;

public class MedicineDataPrepare extends DataPrepare{
    public MedicineDataPrepare(Scanner scanner) {
        super(scanner);
    }

    public Medicine insert(){
        Medicine medicine = new Medicine();
        System.out.print("Enter the name of the medicine: ");
        medicine.setName(scanner.next());

        System.out.print("Enter the price of the medicine: ");
        medicine.setPrice(scanner.nextInt());

        System.out.print("Enter the quantity of the medicine: ");
        medicine.setQty(scanner.nextInt());

        System.out.print("Enter the expired date of the medicine(yyyy-mm-dd): ");
        String date = scanner.next();
        medicine.setExpiredDate(LocalDate.parse(date));

        System.out.print("Enter the company of medicine: ");
        medicine.setCompany(scanner.next());
        return medicine;
    }

    public Medicine update(){
        Medicine medicine = new Medicine();

        System.out.print("Enter ID to update: ");
        medicine.setID(scanner.next());

        System.out.print("Enter the name of the medicine: ");
        medicine.setName(scanner.next());

        System.out.print("Enter the price of the medicine: ");
        medicine.setPrice(scanner.nextInt());

        System.out.print("Enter the quantity of the medicine: ");
        medicine.setQty(scanner.nextInt());

        System.out.print("Enter the expired date of the medicine(yyyy-mm-dd): ");
        String date = scanner.next();
        medicine.setExpiredDate(LocalDate.parse(date));

        System.out.print("Enter the company of medicine: ");
        medicine.setCompany(scanner.next());

        return medicine;
    }
}

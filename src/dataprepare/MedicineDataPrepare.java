package dataprepare;

import dao.MedicineDao;
import model.Medicine;
import java.time.LocalDate;

import static util.DataUtil.generateID;
import static util.DataUtil.scanner;

public class MedicineDataPrepare {
    private final MedicineDao medicineDao = new MedicineDao();
    public MedicineDataPrepare() {}

    public Medicine insert(){
        Medicine medicine = new Medicine();
        medicine.setID(generateID());

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

    public String delete() {
        System.out.print("Enter ID to delete: ");
        return scanner.next();
    }

    public void showAll() {
        System.out.printf("%1s %10s %1s %15s %1s %15s %1s %15s %1s %15s %1s %15s %1s%n",
                "|", "ID", "|", "Name", "|", "Price", "|", "Qty", "|", "ExpiredDate", "|","Company", "|");
        medicineDao.getAllMedicine().forEach((Medicine medicine)-> {
            System.out.println("-".repeat(104));
            System.out.printf("%1s %10s %1s %15s %1s %15s %1s %15s %1s %15s %1s %15s %1s%n",
                    "|", medicine.getID(), "|", medicine.getName(), "|", medicine.getPrice(), "|", medicine.getPrice(), "|", medicine.getExpiredDate(), "|",
                    medicine.getCompany(),"|");
        });
        System.out.println("-".repeat(104));
    }
}

package dao;

import model.Medicine;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import static util.DatabaseUtil.getConnection;

public class MedicineDao {
    public void insert(Medicine medicine) {
        try(Statement statement = getConnection().createStatement()) {
            String sql = "INSERT INTO Medicine VALUES (\""+medicine.getID()+"\",\""
                    +medicine.getName()+"\","+medicine.getPrice()+",\""+medicine.getQty()+"\",\""
                    +medicine.getExpiredDate()+"\",\""+medicine.getCompany()+"\");";
            System.out.println(sql);
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Medicine> getAllMedicine() {
        ArrayList<Medicine> medicines = new ArrayList<>();
        try (Statement statement = getConnection().createStatement()){
            ResultSet res = statement.executeQuery("SELECT * FROM Medicine");
            while (res.next()) {
                Medicine medicine = new Medicine();
                medicine.setID(res.getString("ID"));
                medicine.setName(res.getString("name"));
                medicine.setPrice(res.getInt("price"));
                medicine.setQty(res.getInt("qty"));
                medicine.setExpiredDate(res.getDate("expiredDate").toLocalDate());
                medicine.setCompany(res.getString(("company")));
                medicines.add(medicine);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return medicines;
    }

    public void delete(String id) {
        try(Statement statement = getConnection().createStatement()) {
            String sql = "DELETE FROM medicine WHERE medicine.ID = \""+id+"\";";
            System.out.println(sql);
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(Medicine medicine) {
        try(Statement statement = getConnection().createStatement()) {
            String sql = "UPDATE Medicine " +
                    "SET name = \""+medicine.getName()+"\", price = "+medicine.getPrice()+", qty = "+medicine.getQty()
                    +", expiredDate = \"" +medicine.getExpiredDate()+"\", company = \""+medicine.getCompany() +"\" WHERE ID = \""+medicine.getID()+"\";";
            System.out.println(sql);
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

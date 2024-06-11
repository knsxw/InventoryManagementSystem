package dao;

import model.Furniture;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import static util.DatabaseUtil.getConnection;

public class FurnitureDao {
    public void insert(Furniture furniture) {
        try(Statement statement = getConnection().createStatement()) {
            String sql = "INSERT INTO Furniture VALUES (\""+furniture.getID()+"\",\""
                    +furniture.getName()+"\","+furniture.getPrice()+",\""+furniture.getQty()+"\",\""
                    +furniture.getCompany()+"\",\""+furniture.getCountryImport()+"\");";
            System.out.println(sql);
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Furniture> getAllFurniture() {
        ArrayList<Furniture> furnitureArray = new ArrayList<>();
        try (Statement statement = getConnection().createStatement()){
            ResultSet res = statement.executeQuery("SELECT * FROM Furniture");
            while (res.next()) {
                Furniture furniture = new Furniture();
                furniture.setID(res.getString("ID"));
                furniture.setName(res.getString("name"));
                furniture.setPrice(res.getInt("price"));
                furniture.setQty(res.getInt("qty"));
                furniture.setCompany(res.getString("company"));
                furniture.setCountryImport(res.getString(("countryImport")));
                furnitureArray.add(furniture);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return furnitureArray;
    }

    public void delete(String id) {
        try(Statement statement = getConnection().createStatement()) {
            String sql = "DELETE FROM Furniture WHERE Furniture.ID = \""+id+"\";";
            System.out.println(sql);
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(Furniture furniture) {
        try(Statement statement = getConnection().createStatement()) {
            String sql = "UPDATE Furniture " +
                    "SET name = \""+furniture.getName()+"\", price = "+furniture.getPrice()+", qty = "+furniture.getQty()
                    +", company = \"" +furniture.getCompany()+"\", countryImport = \""+furniture.getCountryImport() +"\" WHERE ID = \""+furniture.getID()+"\";";
            System.out.println(sql);
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

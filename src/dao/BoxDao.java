package dao;

import model.Box;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import static util.DatabaseUtil.getConnection;

public class BoxDao {
    public void insert(Box box) {
        try(Statement statement = getConnection().createStatement()) {
            String sql = "INSERT INTO Box VALUES (\""+box.getID()+"\",\""
                    +box.getName()+"\","+box.getWeight()+",\""+box.getType()+"\",\""
                    +box.getAddress()+"\");";
            System.out.println(sql);
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Box> getAllBoxes() {
        ArrayList<Box> boxes = new ArrayList<>();
        try (Statement statement = getConnection().createStatement()){
            ResultSet res = statement.executeQuery("SELECT * FROM Box");
            while (res.next()) {
                Box box = new Box();
                box.setID(res.getString("ID"));
                box.setName(res.getString("name"));
                box.setWeight(res.getDouble("weight"));
                box.setType(res.getString("type"));
                box.setAddress(res.getString("address"));
                boxes.add(box);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return boxes;
    }

    public void delete(String id) {
        try(Statement statement = getConnection().createStatement()) {
            String sql = "DELETE FROM Box WHERE Box.ID = \""+id+"\";";
            System.out.println(sql);
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(Box box) {
        try(Statement statement = getConnection().createStatement()) {
            String sql = "UPDATE Box " +
                    "SET name = \""+box.getName()+"\", weight = "+box.getWeight()+", type = \""+box.getType()
                    +"\", address = \"" +box.getAddress()+"\" WHERE ID = \""+box.getID()+"\";";
            System.out.println(sql);
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

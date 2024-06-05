package dao;

import model.Box;

import java.sql.SQLException;
import java.sql.Statement;

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
}

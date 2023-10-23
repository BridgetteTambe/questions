package org.example.Q108;

import java.sql.Connection;
import java.sql.JDBCType;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {



        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BANK_DB", "root", "pvi@2022");
            PreparedStatement ps = conn.prepareStatement("INSERT INTO EMP VALUES(?,?,?)")){
            ps.setObject(1, 101, JDBCType.INTEGER);
            ps.setObject(2, "SMITH", JDBCType.VARCHAR);
            ps.setObject(3, "HR", JDBCType.VARCHAR);
            ps.executeUpdate();
            ps.setInt(1, 102);
            ps.setString(2, "JONES");
            ps.executeUpdate();
        }
        }

}

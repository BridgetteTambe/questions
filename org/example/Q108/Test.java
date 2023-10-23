package org.example.Q108;

import java.sql.Connection;
import java.sql.JDBCType;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {



        public static void main(String[] args) {
            try(Connection conn = ds.getConnectio());
            PreparedStatement ps = conn.PrepareStatement("INSERT INTO EMP VALUES(?,?,?)")){

                try {
                ps.setObject(1, 101, JDBCType.INTEGER);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                ps.setObject(2, "SMITH", JDBCType.VARCHAR);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                ps.setObject(3, "HR", JDBCType.VARCHAR);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                ps.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                ps.setInt(1,102);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                ps.setString(2,"JONES");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                ps.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

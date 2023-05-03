package com.example.jdbcboardinginfo.Utils;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtilsModule12 {
    private static final DataSource DATA_SOURCE;

    private DbUtilsModule12() {}

    public static Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/module12",
                    "root",
                    "9011"
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static DataSource getDataSource() {
        return DATA_SOURCE;
    }

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl("jdbc:mysql://localhost/module12");
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("1111");
        basicDataSource.setInitialSize(10);
        basicDataSource.setMaxTotal(10);

        DATA_SOURCE = basicDataSource;
    }
}

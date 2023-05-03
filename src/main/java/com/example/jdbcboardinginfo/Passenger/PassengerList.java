package com.example.jdbcboardinginfo.Passenger;

import com.example.jdbcboardinginfo.Utils.DbUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PassengerList {
    List<Passenger> passengerList = new ArrayList<>();

    public List<Passenger> getData() {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;

        try {
            DataSource dataSource = DbUtils.getDataSource();
            connection = dataSource.getConnection();

            String sqlQuery = "SELECT PassengerNo, PassengerName, Grade, Age FROM Passenger";

            statement = connection.prepareStatement(sqlQuery);
            result = statement.executeQuery(sqlQuery);

            while (result.next()) {
                this.passengerList.add(new Passenger(result.getInt(1),
                        result.getString(2),
                        result.getInt(3),
                        result.getInt(4)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                result.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return passengerList;
    }
}

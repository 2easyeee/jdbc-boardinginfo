package com.example.jdbcboardinginfo.Flight;

import com.example.jdbcboardinginfo.Utils.DbUtils;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlightList {
    List<Flight> flightList = new ArrayList<>();

    public List<Flight> getData(String passengerName) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;

        try {
            DataSource dataSource = DbUtils.getDataSource();
            connection = dataSource.getConnection();

            String sqlQuery =
                    "select PassengerName,ReservedDate,Departures,Arrival,FlightDate,Airline from Passenger inner join Reservation R on passenger.PassengerNo = R.PassengerNo inner join Flight F on R.FlightNo = F.FlightNo inner join Aircraft A on F.AircraftNo = A.AircraftNo where PassengerName = ?;";

            statement = connection.prepareStatement(sqlQuery);
            statement.setString(1,passengerName);
            result = statement.executeQuery();

            while (result.next()) {
                this.flightList.add(new Flight(result.getString(1),
                        result.getDate(2),
                        result.getString(3),
                        result.getString(4),
                        result.getDate(5),
                        result.getString(6)
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

        return flightList;
    }
}

package com.example.jdbcboardinginfo;

import java.sql.Date;

public class Flight {
    private String passengerName;
    private Date reservedDate;
    private String departures;
    private String arrival;
    private Date flightDate;
    private String airline;

    public Flight(String passengerName, Date reservedDate, String departures, String arrival, Date flightDate, String airline) {
        this.passengerName = passengerName;
        this.reservedDate = reservedDate;
        this.departures = departures;
        this.arrival = arrival;
        this.flightDate = flightDate;
        this.airline = airline;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public Date getReservedDate() {
        return reservedDate;
    }

    public String getDepartures() {
        return departures;
    }

    public String getArrival() {
        return arrival;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public String getAirline() {
        return airline;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "passengerName='" + passengerName + '\'' +
                ", reservedDate=" + reservedDate +
                ", departures='" + departures + '\'' +
                ", arrival='" + arrival + '\'' +
                ", flightDate=" + flightDate +
                ", airline='" + airline + '\'' +
                '}';
    }
}

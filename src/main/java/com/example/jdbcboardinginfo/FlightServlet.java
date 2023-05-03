package com.example.jdbcboardinginfo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FlightServlet", value = "/flight")
public class FlightServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String passengerName = request.getParameter("passengerName");
        FlightList list = new FlightList();
        List<Flight> flightList = list.getData(passengerName);

        request.setAttribute("flightList", flightList);

        RequestDispatcher rd = request.getRequestDispatcher("/flight-info.jsp");
        rd.forward(request,response);
    }

}

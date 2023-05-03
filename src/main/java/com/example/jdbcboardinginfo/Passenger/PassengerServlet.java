package com.example.jdbcboardinginfo.Passenger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "PassengerServlet", urlPatterns = {"/", ""})
public class PassengerServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PassengerList list = new PassengerList();
        List<Passenger> passengerList = list.getData();

        request.setAttribute("passengerList", passengerList);

        RequestDispatcher rd = request.getRequestDispatcher("/passenger.jsp");
        rd.forward(request,response);
    }

}
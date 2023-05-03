package com.example.jdbcboardinginfo.Memebers;

import com.example.jdbcboardinginfo.Flight.Flight;
import com.example.jdbcboardinginfo.Flight.FlightList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "MemberServlet", value = "/member")
public class MemberServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int nextPage = Integer.parseInt(request.getParameter("nextPage"));

        MemberList list = new MemberList();
        List<Member> memberList = list.getData(nextPage);

        request.setAttribute("memberList", memberList);

        RequestDispatcher rd = request.getRequestDispatcher("/member.jsp");
        rd.forward(request,response);
    }

}


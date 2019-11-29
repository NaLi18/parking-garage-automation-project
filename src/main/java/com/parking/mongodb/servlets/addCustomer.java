package com.parking.mongodb.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addCustomer
 */
@WebServlet("/addCustomer")
public class addCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String DriverLicenceId = request.getParameter("DriverLicenceId");
		String DriverLicenceId1 = request.getParameter("DriverLicenceId1");
		String Name = request.getParameter("name");
		String Password = request.getParameter("password");
		String Password1 = request.getParameter("password1");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		
		
		System.out.println("name:"+Name);
		System.out.println("DriverLicenceId:"+DriverLicenceId);
		System.out.println("DriverLicenceId1:"+DriverLicenceId1);
		System.out.println("Password:"+Password);
		System.out.println("Password1:"+Password1);
		System.out.println("phone:"+phone);
		System.out.println("email:"+email);
	}

}

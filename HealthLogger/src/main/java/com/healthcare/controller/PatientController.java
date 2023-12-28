package com.healthcare.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.healthcare.entity.Patient;
import com.healthcare.service.PatientService;




/**
 * Servlet implementation class PatientController
 */
@WebServlet("/PatientController")
public class PatientController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		 PrintWriter pw=response.getWriter();
		 String emailId=request.getParameter("email");
//		 PatientService ps = new PatientService();
//		 Patient patient=ps.findPatientById(email);				
//		}
	PatientService ps = new PatientService();
	Patient patient = ps.findPatientById(emailId);
	List<Patient> patients = new ArrayList<Patient>();
	patients.add(patient);
		 
	HttpSession hs = request.getSession();
	hs.setAttribute("patients", patients);
	
	response.sendRedirect("SD.jsp");
	response.setContentType("text/html");
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getParameter("operation");
		if (action.equals("add")) {
			addPatient(request, response);
		}
		else if(action.equals("delete")) {
			deletePatient(request, response);
		}
		else if(action.equals("update")) {
			updatePatient(request, response);
		}
				
	}
	private void deletePatient(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		PrintWriter pw=response.getWriter();
		
		String email=request.getParameter("email");
		
		// created service class object. 
		PatientService ps = new PatientService();
		String result=ps.deletePatientById(email);
		if(result.equals("Patient deleted successfully")) {
			pw.print(result);
			RequestDispatcher rd = request.getRequestDispatcher("search.jsp");
			rd.include(request, response);
			
		}else {
			pw.print(result);
			RequestDispatcher rd = request.getRequestDispatcher("search.jsp");
			rd.include(request, response);
		}
		response.setContentType("text/html");
	}

	private void addPatient(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		PrintWriter pw=response.getWriter();
		
		 
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		Long phone = Long.parseLong(request.getParameter("phone"));
		
		int age=Integer.parseInt(request.getParameter("age"));
		String diagnosis=request.getParameter("diagnosis");
		String remark=request.getParameter("remark");
		String gender=request.getParameter("gender");
		
		
		//convert those value to objects
		Patient p=new Patient();
		p.setPhone(phone);
		p.setAge(age);
		p.setDiagnosis(diagnosis);
		p.setEmail(email);
		p.setGender(gender);
		p.setName(name);
		p.setRemark(remark);
		
		
		// created service class object. 
		PatientService ps = new PatientService();
		String result = ps.storePatient(p);
		if(result.equals("Patient details stored successfully")) {
			pw.print(result);
			RequestDispatcher rd = request.getRequestDispatcher("doctorHomePage.jsp");
			rd.include(request, response);
			
		}else {
			pw.print(result);
			RequestDispatcher rd = request.getRequestDispatcher("managePatient.jsp");
			rd.include(request, response);
		}
		response.setContentType("text/html");
	}
	private void updatePatient(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		
			}
		}


package com.healthcare.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.healthcare.entity.Patient;
import com.healthcare.entity.Vital;
import com.healthcare.service.PatientService;
import com.healthcare.service.VitalService;

/**
 * Servlet implementation class VitalsController
 */
@WebServlet("/VitalsController")
public class VitalsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VitalsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("operation");
		if (action.equals("addVitals")) {
			getPatients(request, response);
			response.sendRedirect("addVitals.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String action=request.getParameter("operation");
		if (action.equals("addVitals")) {
			addVital(request, response);
			response.sendRedirect("addVitals.jsp");
		}
	}
	
	private void addVital(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		PrintWriter pw=response.getWriter();
		
		String email=request.getParameter("patient");		
		int bplow=Integer.parseInt(request.getParameter("bplow"));
		int bphigh=Integer.parseInt(request.getParameter("bphigh"));
		int spo2=Integer.parseInt(request.getParameter("spo2"));
		
		
		//convert those value to objects
		Vital v=new Vital();
		v.setEmail(email);
		v.setBplow(bplow);
		v.setBphigh(bphigh);
		v.setSpo2(spo2);
		
		
		// created service class object. 
		VitalService vs = new VitalService();
		String result = vs.storeVital(v);
		if(result.equals("Vitals details stored successfully")) {
			pw.print(result);
			RequestDispatcher rd = request.getRequestDispatcher("manageVitals.jsp");
			rd.include(request, response);
			
		}else {
			pw.print(result);
			RequestDispatcher rd = request.getRequestDispatcher("addVitals.jsp");
			rd.include(request, response);
		}
		response.setContentType("text/html");
		
	}

	private void getPatients(HttpServletRequest request, HttpServletResponse response) {
		PatientService ps = new PatientService();
		List<Patient> patientsList = ps.findAllPatient();
		HttpSession hs = request.getSession();
		hs.setAttribute("listPatients", patientsList);
	}

}

package youtube.learnings;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	//doPost and doGet works only with get and post
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i=Integer.parseInt(req.getParameter("num1")) ;
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		System.out.println("Result is " +k);
		PrintWriter out=res.getWriter();
		out.println("Result is"+k);
	}
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
			int i=Integer.parseInt(req.getParameter("num1")) ;
			int j=Integer.parseInt(req.getParameter("num2"));
			int k=i+j;
			/*
			 * Used when it has to be printed directly
			 * System.out.println("Result is " +k);
			PrintWriter out=res.getWriter();
			out.println("Result is"+k);
			 */
			
			/*
			 * To call one servlet from another servlet use RequestDispatcher
			 */
			req.setAttribute("k", res);
			RequestDispatcher rd=req.getRequestDispatcher("square");
			rd.forward(req, res);
			
		}
}

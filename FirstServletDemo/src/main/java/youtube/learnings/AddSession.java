package youtube.learnings;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddSession {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i=Integer.parseInt(req.getParameter("num1")) ;
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		HttpSession session=req.getSession();
		session.setAttribute("res", session);
		res.sendRedirect(null);
	}
}

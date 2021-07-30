package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.countryDAO;
import DAO.stateDAO;
import VO.countryVO;
import VO.stateVO;

/**
 * Servlet implementation class ccontroller
 */
@WebServlet("/ccontroller")
public class ccontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ccontroller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		if (flag.equals("insert")) {
			insert(request, response);
			view(request, response);
		}

		if (flag.equals("view")) {
			view(request, response);
		}
		if (flag.equals("delete")) {
			delete(request, response);
			view(request, response);
		}
		if (flag.equals("edit")) {
			edit(request, response);
			// view(request,response);
		}
		if (flag.equals("addstate")) {
			addstate(request, response);

		}
		if (flag.equals("insertState")) {
			insertState(request, response);
			viewState(request, response);

		}
		if (flag.equals("viewstate")) {
			viewState(request, response);

		}
		if (flag.equals("deleteState")) {
			deleteState(request, response);
			viewState(request, response);
		}

		if (flag.equals("editState")) {
			editState(request, response);

		}
		
		if (flag.equals("updateState")) {
			updateState(request, response);
			viewState(request, response);
		}

	}

	private void updateState(HttpServletRequest request, HttpServletResponse response) {
		int idS = Integer.parseInt(request.getParameter("x"));
		int idC = Integer.parseInt(request.getParameter("cid"));
		String sn=request.getParameter("sn");
		String sd=request.getParameter("sd");
		stateVO v = new stateVO();
		countryVO cv=new countryVO();
		cv.setId(idC);
		v.setId(idS);
		v.setSn(sn);
		v.setSd(sd);
		v.setC(cv);
		
		stateDAO d=new stateDAO();
		d.update(v);
		
		
		
	}

	private void editState(HttpServletRequest request, HttpServletResponse response) throws IOException {

		int id = Integer.parseInt(request.getParameter("id_edit"));
		stateVO v = new stateVO();
		v.setId(id);
		stateDAO d = new stateDAO();
		List ls = d.editstate(v);
		HttpSession ss = request.getSession();
		ss.setAttribute("editState", ls);
		
		
		countryVO v1 = new countryVO();
		countryDAO d1 = new countryDAO();
		List ls1 = d1.getCountry(v1);
		HttpSession ss1 = request.getSession();
		ss1.setAttribute("country", ls1);
		response.sendRedirect("editState.jsp");
		
		

	}

	private void deleteState(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id_delete"));
		stateVO v = new stateVO();
		v.setId(id);
		stateDAO d = new stateDAO();
		d.delete(v);

	}

	private void viewState(HttpServletRequest request, HttpServletResponse response) throws IOException {
		stateVO v = new stateVO();
		stateDAO d = new stateDAO();
		List ls = d.view(v);
		HttpSession s = request.getSession();
		s.setAttribute("viewState", ls);
		response.sendRedirect("viewState.jsp");
		
	}

	private void insertState(HttpServletRequest request, HttpServletResponse response) {

		int id = Integer.parseInt(request.getParameter("cid"));
		String sn = request.getParameter("sn");
		String sd = request.getParameter("sd");

		stateVO va = new stateVO();
		countryVO v = new countryVO();
		// va.setId(id);
		va.setSn(sn);
		va.setSd(sd);
		v.setId(id);
		va.setC(v);
		stateDAO d = new stateDAO();
		d.insert(va);

	}

	private void addstate(HttpServletRequest request, HttpServletResponse response) throws IOException {
		countryVO v = new countryVO();
		countryDAO d = new countryDAO();
		List ls = d.getCountry(v);
		HttpSession ss = request.getSession();
		ss.setAttribute("country", ls);
		response.sendRedirect("addstate.jsp");

	}

	private void edit(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id_edit"));
		countryVO cv = new countryVO();
		cv.setId(id);

		countryDAO d = new countryDAO();
		List ls = d.edit(cv);
		HttpSession ss = request.getSession();
		ss.setAttribute("edit", ls);
		response.sendRedirect("update.jsp");

	}

	private void delete(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id_delete"));
		countryVO cv = new countryVO();
		cv.setId(id);

		countryDAO cd = new countryDAO();
		cd.delete(cv);

	}

	private void view(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		countryVO v = new countryVO();
		countryDAO d = new countryDAO();
		List ls = d.view(v);
		HttpSession sp = request.getSession();
		sp.setAttribute("view", ls);
		response.sendRedirect("view.jsp");

	}

	private void insert(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String c = request.getParameter("cname");
		String cd = request.getParameter("cdes");
		countryVO v = new countryVO();
		v.setCn(c);
		v.setCd(cd);
		countryDAO m = new countryDAO();
		m.insert(v);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		String flag = request.getParameter("flag");
		if (flag.equals("update")) {
			update(request, response);
			view(request, response);
		}

	}

	private void update(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("x"));
		String cn = request.getParameter("cname");
		String cd = request.getParameter("cdes");
		countryVO v = new countryVO();
		v.setId(id);
		v.setCn(cn);
		v.setCd(cd);

		countryDAO d = new countryDAO();
		d.update(v);

	}

}

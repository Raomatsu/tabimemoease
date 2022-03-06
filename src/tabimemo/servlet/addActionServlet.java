package tabimemo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tabimemo.logic.LocationDAO;

public class addActionServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//情報取得
		request.setCharacterEncoding("UTF-8");
		String area = request.getParameter("area");
		String prefecture = request.getParameter("prefecture");
		String locationName = request.getParameter("locationName");
		String URL = request.getParameter("URL");
		String comments = request.getParameter("comments");

		//DB接続
		LocationDAO lDao = new LocationDAO();
		lDao.connectToDB();

		//行きたい場所を追加
		lDao.addLocation(area,prefecture,locationName,URL,comments);

		//追加成功メッセージ
		request.setAttribute("successInAddition", "行きたい場所を追加しました！");

		//add.jspに遷移
		RequestDispatcher dispatcher = request.getRequestDispatcher("add.jsp");
		dispatcher.forward(request, response);

	}

}

package tabimemo.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tabimemo.logic.LocationDAO;
import tabimemo.object.Location;

public class toListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public toListServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String area = request.getParameter("area");
//		System.out.println(area);

		//該当地方の全都道府県(の入ったString配列)をリクエストスコープに格納
		String[] prefectures =
				tabimemo.object.PrefectureList.areaAndPrefectures.get(area);
//		System.out.println(prefectures[0]);
		request.setAttribute("allPrefecturesInTheArea", prefectures);

		//該当地方の各都道府県についての全レコードをリクエストスコープに格納
		LocationDAO lDao = new LocationDAO();
		lDao.connectToDB();
		List<Location> locations = lDao.getPrefecturesInf(area);
//		System.out.println(locations.get(0));
		request.setAttribute("AllLocationsInfInTheArea", locations);

		//list.jspに遷移
		RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
		dispatcher.forward(request, response);


	}

}

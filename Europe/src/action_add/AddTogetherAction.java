package action_add;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.*;
import dao.TogetherTableDAO;
import dto.TogetherElementBean;
import jdbc.ConnectionProvider;

public class AddTogetherAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			int number = Integer.parseInt(request.getParameter("number"));
			String country = request.getParameter("country");
			String name = request.getParameter("name");
			String title = request.getParameter("title");
			String detail = request.getParameter("detail");

			TogetherElementBean toe = new TogetherElementBean(number, country, name, title, detail);
			System.out.println(toe);
			
			conn = ConnectionProvider.getConnection();
			TogetherTableDAO dao = TogetherTableDAO.getInstance();
			dao.insert(conn, toe);
			
			System.out.println("Success Add TogetherElement");
		} catch(SQLException e){
			throw new ServiceException("AddTogetherAction Error " + e.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}

package action_delete;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import dao.LocationTableDAO;
import dao.TravelTableDAO;
import jdbc.ConnectionProvider;

public class MyTravelDeleteAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			int number = Integer.parseInt(request.getParameter("number"));
			
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			TravelTableDAO dao = TravelTableDAO.getInstance();
			LocationTableDAO ldao = LocationTableDAO.getInstance();
			dao.delete(conn, number);
			ldao.deleteall(conn, number);
			conn.commit();
			System.out.println("Success Delete Element");
		} catch(SQLException e){
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			} finally {
				try {
					if(conn!=null) conn.close();
				} catch(SQLException se){
					se.printStackTrace();
				}
			}
		}
	}
}

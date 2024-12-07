import java.lang.Thread.State;
import java.sql.*;

public class Animals {

	private static void listOwnersTable (Statement stmt) throws SQLException{

		ResultSet rs = stmt.executeQuery("SELECT * FROM Owners");
		System.out.println("=====");
		while (rs.next()){
			System.out.println(rs.getString("ownerName"));
		}
		rs.close();

	}

	private static void listAnimalsTable (Statement stmt) throws SQLException{

		ResultSet rs = stmt.executeQuery("SELECT * FROM Animals, Owners WHERE Animals.ownerId = Owners.ownerID");
		System.out.println(">>>>>");
		while (rs.next()){
			System.out.println(rs.getString("animalName") + " is owned by " + rs.getString("ownerName"));
		}
		rs.close();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection  c = null;
		try{
			try {
				String sDriverName = "org.sqlite.JDBC";
				Class.forName(sDriverName);

				c = DriverManager.getConnection("jdbc:sqlite:test.sqlite");  

				Statement stmt = c.createStatement();

				listOwnersTable(stmt);

				stmt.executeUpdate("INSERT INTO Owners (ownerName) VALUES ('Maria')");
				listOwnersTable(stmt);

				stmt.executeUpdate("DELETE FROM Owners WHERE ownerName = 'Maria'");
				listOwnersTable(stmt);

				listAnimalsTable(stmt);


			}catch(Exception e){
				System.out.println("error:" + e.getMessage());
			}
			c.close();
		}catch (Exception ignore){}
	}

}

import java.sql.*;
import java.util.Scanner;
	
public class ReadData {
	public static void main(String args[]) throws SQLException
	{
		Connection con = null;
		try 
		{
			
			// 1. Load the drive for particular database
			//2. Establish Connection
			//3. Use of statement -> write statement for any query, normal and prepared statement
			//4. Execute the statement
			//5. Close the connection in finally block apart from try and catch.
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Pass@123");
			Statement stmt=con.createStatement();
			Scanner sc = new Scanner(System.in);
			String des = sc.next();
			ResultSet rs = stmt.executeQuery("Select * from emp where desig="+"\'"+des+"\'");
			
			
			while(rs.next())
			{
				// either write the column name in the argument or column number.
				
				System.out.println(rs.getInt("id")+": "+rs.getString(2)+": "+rs.getInt(3));
				//System.out.println(rs.getInt(1)+": "+rs.getString(1) );
				//int id = rs.getInt(1);
				//System.out.println(id);
				//System.out.println(rs.getInt("id")+": "+rs.getString("name"));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			con.close();
		}

	}
}

	
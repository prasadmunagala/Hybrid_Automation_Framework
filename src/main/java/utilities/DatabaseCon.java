package utilities;
import java.sql.*;

public class DatabaseCon {
	
	public void Database()
	{
		String jdbcurl="jdbc:mysql://localhost:3306/credentialsdb";
		String username="root";
		String password="Texas@technology1";
		
		try
		{
		
			Connection connection=DriverManager.getConnection(jdbcurl,username,password);
			System.out.println("connected");
			
			Statement statement=connection.createStatement();
			
			ResultSet result=statement.executeQuery("select username,password from credentials_table");
			
			while(result.next())
			{
				String username_data=result.getString("username");
				String password_data=result.getString("password");
				
				System.out.print(username_data+"   "+password_data);
				System.out.println();
			}	
		
		}
		catch(Exception e)
		{
			System.out.println("not connected");
		}
		
	}

}

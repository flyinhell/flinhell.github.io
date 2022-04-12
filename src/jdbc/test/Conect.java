package jdbc.test;

import java.sql.*;
public class Conect
{
    public static void main(String a[]) throws ClassNotFoundException, SQLException
    {
        try
        {
            String url = "jdbc:sqlserver://localhost:1433//SQLEXPRESS;databaseName=mydb";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url);
            System.out.println("connection created");
            Statement st=conn.createStatement();
            String sql="select * from mydb";
            ResultSet rs=st.executeQuery(sql);
            while(rs.next())
            {
                System.out.println("Name: "+rs.getString(1));
                //System.out.println("Address : "+rs.getString(2));
            }
            if(st!=null)
                st.close();
            if(conn!=null)
                conn.close();
        }
        catch(SQLException sqle)
        {
            System.out.println("Sql exception "+sqle);
        }
    }
}
package jdbc.test;

//STEP 1. Import required packages
import java.sql.*;
import java.util.*;
import java.sql.ResultSet;
import jdbc.test.Book;


public class JDBCExample {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static final String DB_URL = "jdbc:sqlserver://172.17.13.114:1433;";

    //  Database credentials
    static final String USER = "sa";
    static final String PASS = "eland1234";

    public static void main(String[] args) {
        Connection conn = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");



            // 添加圖書信息的SQL語句
            String sql = "select * from testdb.dbo.db_book";
            // 獲取Statement
            Statement statement = conn.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);


            List<Book> list = new ArrayList<Book>();
            while (resultSet.next()) {

                Book book = new Book();
                book.setId(resultSet.getInt("id"));
                book.setName(resultSet.getString("name"));
                book.setPrice(resultSet.getInt("price"));
                book.setBookCount(resultSet.getInt("bookCount"));
                book.setAuthor(resultSet.getString("author"));
                list.add(book);
                System.out.println(book.getAuthor());

            }

            if (list == null || list.size() < 1) {
                System.out.println("没有資料！");
            } else {
                // 遍歷圖書集合中的數據
                for (Book book : list) {
                    System.out.println(book.getId());
                    System.out.println(book.getName());
                    System.out.println(book.getBookCount());
                    System.out.println(book.getPrice());
                    System.out.println(book.getAuthor());
                    System.out.println("----------------");
                }
            }




        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main
}//end JDBCExample
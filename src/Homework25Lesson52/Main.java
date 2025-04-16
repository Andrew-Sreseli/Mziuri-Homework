package Homework25Lesson52;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:postgresql://localhost:5432/LibraryManagementSystem";
        String user = "postgres";
        String password = "1216";
        try {
            Scanner scanner = new Scanner(System.in);
            Connection conn = DriverManager.getConnection(url, user, password);

            System.out.println("connected database!");

            int input=scanner.nextInt();
            if(input==1) {
                printAllAuthors(conn);
            }
            if(input==2) {
                int author_id = 6;
                String name = "Harmony Cobel";
                String country = "United States";
                addRowAuthors(conn, author_id, name, country);
            }
            if(input==3){
                int author_id=6;
                deleteRowAuthors(conn,author_id);
            }
            if(input==4){
                int author_id=6;
                String name="Jeffrey Shmitt";
                changeRowAuthors(conn,6,name);
            }

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }

    static void printAllAuthors(Connection conn) throws Exception{

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM authors");
        System.out.println("Author ID | Name              | Country");
        System.out.println("----------------------------------------");
        while (rs.next()) {
            int id = rs.getInt("author_id");
            String name = rs.getString("name");
            String country = rs.getString("country");
            System.out.printf("%-9d | %-17s | %s%n", id, name, country);
        }
        rs.close();
        st.close();

    }
    static void addRowAuthors(Connection conn,int id, String b,String c) throws Exception{

        String insert=" INSERT INTO authors (author_id, name, country) VALUES (?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(insert);
        statement.setInt(1, id);
        statement.setString(2, b);
        statement.setString(3, c);
        statement.executeUpdate();
    }
    static void deleteRowAuthors(Connection conn,int id) throws Exception{

        String delete="DELETE FROM authors WHERE author_id = ?";
        PreparedStatement statement = conn.prepareStatement(delete);
        statement.setInt(1,id);
        statement.executeUpdate();
    }
    static void changeRowAuthors(Connection conn,int id,String name) throws Exception{

        String update = "UPDATE authors SET name = ? WHERE author_id = ?";
        PreparedStatement statement = conn.prepareStatement(update);
        statement.setString(1, name);
        statement.setInt(2, id);
        statement.executeUpdate();
    }



}

/*String name = sc.nextLine();
            String selectQuery = "SELECT * FROM librarians where full_name = ?;";
            PreparedStatement statement = conn.prepareStatement(selectQuery);
            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("librarian_id");
                String fullName = rs.getString("full_name");

                System.out.println(id);
                System.out.println(fullName);


            }*/
package soa_jdbc;

import java.sql.*;

public class Soa_Jdbc {

    public static void main(String[] args) {

Connection connection = null;
String url = "jdbc:mysql://127.0.0.1:3306/soa_jdbc";
String user = "root";
String password = "Nnew0980657562";

try {
//Connection to database
Class.forName("com.mysql.jdbc.Driver");
connection = DriverManager.getConnection(url, user, password);
 Statement stmt = connection.createStatement();
 
//      ข้อ 2
// if (connection != null) {
// System.out.println("connected sucessfully to database");

//      Country
// String sql = "INSERT INTO Country VALUES('THA', 'Thailand', 'Asi', '600','Thai')," +
// "('USA', 'United State of America', 'North America', '1000', 'English')," +
// "('MAS', 'Malaysia', 'Asia','350', 'English')," +
// "('GER', 'German', 'Europe','10', 'Deutsch')";

//      City
// String sql = "INSERT INTO City VALUES"
// +"('1', 'THA', 'Phuket', '2'),"
// +"('2', 'THA', 'Bangkok', '10'),"
// +"('3', 'THA', 'Chaingmai', '4'),"
// +"('4', 'USA', 'California', '35'),"
// +"('5', 'USA', 'New York', '45'),"
// +"('6', 'MAS', 'Kuala Lumpur', '11')";
// stmt.executeUpdate(sql);
// }

//ข้อ 3
// Statement statement = connection.createStatement();
// statement.executeUpdate(
// "INSERT INTO city VALUES( '0','MAS', 'Johor Bahru',20)",
// Statement.RETURN_GENERATED_KEYS);
// ResultSet rs = statement.getGeneratedKeys();
// if (rs.first()) {
// int id = rs.getInt(1);
// System.out.println("ID:" + id);
// }

//ข้อ 4
// PreparedStatement pstmt= connection.prepareStatement("SELECT * FROM CITY WHERE COUNTRYCODE ='THA'");
// ResultSet rst = pstmt.executeQuery();
// System.out.println("ID\t\tCountry code\t\tName\t\tPopulation");
// while(rst.next()) {
// System.out.print(rst.getInt(1));
// System.out.print("\t\t"+rst.getString(2));
// System.out.print("\t\t\t"+rst.getString(3));
// System.out.print("\t\t"+rst.getInt(4));
// System.out.println();
// }

//ข้อ 5.1
// PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM COUNTRY WHERE CONTINENT ='ASIA'");
// ResultSet rst = pstmt.executeQuery();
//
// System.out.println("Code\t\tName\t\tContinent\t\tPopulation\t\tOfficialLanguage");
// while (rst.next()) {
// System.out.print(rst.getString(1));
// System.out.print("\t\t" + rst.getString(2));
// System.out.print("\t" + rst.getString(3));
// System.out.print("\t\t\t" + rst.getInt(4));
// System.out.print("\t\t\t" + rst.getString(5));
// System.out.println();
// }

//      ข้อ 5.2
// PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM CITY WHERE COUNTRYCODE ='USA'");
    // ResultSet rst = pstmt.executeQuery();
// System.out.println("ID\t\tCountry code\t\tName\t\tPopulation");
// while (rst.next()) {
// System.out.print(rst.getInt(1) );
// System.out.print("\t\t" + rst.getString(2));
// System.out.print("\t\t\t"+rst.getString(3));
// System.out.print("\t\t\t"+rst.getInt(4));
// System.out.println();
// }

//      ข้อ 5.3
// PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM CITY WHERE population > 5 ");
// ResultSet rst = pstmt.executeQuery();
// System.out.println("ID\t\tCountry code\t\tName\t\tPopulation");
// while (rst.next()) {
// System.out.print(rst.getInt(1));
// System.out.print("\t\t" + rst.getString(2));
// System.out.print("\t\t\t"+rst.getString(3));
// System.out.print("\t\t\t"+rst.getInt(4));
// System.out.println();
//}
 
} catch (Exception e) {
System.out.println("not connected to database because "+ e);
}
}
}

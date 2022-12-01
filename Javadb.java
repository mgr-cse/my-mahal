/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadb;
import java.sql.*;

public class Javadb {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        String query = "use newdb";
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306", "root", "password");
            System.out.println("Connected database successfully...");
            /*
            System.out.println("selecting table");
            stmt = conn.createStatement();
            // set table
            String sql = query;
            stmt.executeQuery(sql);
            
            // get data from table
            System.out.println("id");
            sql = "select * from user";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                String row = rs.getString("id");
                System.out.println(row);
            }*/
            System.out.println("EVERYTHING WORKS!");
            
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException se) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
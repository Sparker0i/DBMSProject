/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.*;

/**
 *
 * @author Spark
 */
public class DataConnection	{

    private static Statement stmt;
    private static Connection conn;
    private static ResultSet rs;

    /**
     * Constructor creates a live connection ready for use
     */
    public DataConnection()	 {
        try	{
            Class.forName("org.postgresql.Driver").newInstance();
            conn =  java.sql.DriverManager.getConnection("jdbc:postgresql://localhost/postgres?user=postgres&password=root");
            stmt = conn.createStatement();
        }
        catch (java.sql.SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            ex.printStackTrace();
        }
    }
    
    public Connection getConnection() {
        return conn;
    }

    /**
     * Method kills the open statement & connection object
     */
    public void killOpenObjects()	{
        try	{
            if (stmt != null)	 {
                stmt.close();
            }
            if (conn != null)	 {
                conn.close();
            }
        }
        catch (java.sql.SQLException e)	 {
            System.out.println("Exception in killOpenObjects");
            e.printStackTrace();
        }
    }

    /**
     * @param query A String containing the query to be executed
     * @param killTrigger A boolean that signifies whether to call the killOpenObjects or leave the connection live
     * @return rs A java.sql.ResultSet containing the required data
     * It should be noted that the connection may be killed even thought the resultset is still to be used in MySQL ONLY
     */
    public ResultSet getResultSet(String query, boolean killTrigger)	{
        try	{
            rs = stmt.executeQuery(query);
        }
        catch (java.sql.SQLException e)	{
            System.out.println(query);
            System.out.println("Exception in DataConnection get ResultSet");
            e.printStackTrace();
        }
        finally	{
            if (killTrigger)	{
                killOpenObjects();
            }
        }
        return rs;
    }

    /**
     * @param query A String containing the query to be executed
     * @param killTrigger A boolean that signifys whether to call the killOpenObjects or leave the connection live
     * @returns rows An integer signifying how many rows were effected by the query
     * It should be noted that the connection may be killed even thought the resultset is still to be used in MySQL ONLY
     */
    public int updateTable(String query, boolean killTrigger)	{
        int rows = 0;
        try	{
            rows = stmt.executeUpdate(query);
        }
        catch (SQLException e)	{
            if (!e.getMessage().contains("Invalid argument value: Duplicate entry"))	 {
                System.out.println(e.getMessage());
                System.out.println(query);
            }
        }
        finally	{
            if (killTrigger)	{
                killOpenObjects();
            }
        }
        return rows;
    }
};

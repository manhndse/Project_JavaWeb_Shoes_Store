/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MacBook
 */
public class ProductModel {
    
    private Connection cnn;
    private PreparedStatement stm;
    private ResultSet rs;
    
    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String query = "select * FROM dbo.tblProducts order by viewNumber desc";
        try {
            cnn = new DBContext().getConnection();
            stm = cnn.prepareStatement(query);
            rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getInt(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> paging(int index) {
        List<Product> list = new ArrayList<>();
        String query = "select * FROM dbo.tblProducts\n"
                + "ORDER BY ProductID\n"
                + "OFFSET ? ROWS \n"
                + "FETCH NEXT 3 ROWS ONLY;";
        try {
            cnn = new DBContext().getConnection();
            stm = cnn.prepareStatement(query);
            stm.setInt(1, (index-1)*3);
            rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getInt(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<Product> search(String txt) {
        List<Product> list = new ArrayList<>();
        String query = "select * FROM dbo.tblProducts\n"
                + "WHERE ProductName LIKE '%" + txt + "%'";
        try {
            cnn = new DBContext().getConnection();
            stm = cnn.prepareStatement(query);
            rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5), rs.getInt(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public Product getProductByID(String id) {
        String query = "select * FROM dbo.tblProducts\n"
                + "WHERE ProductID = '" + id + "'";
        try {
            cnn = new DBContext().getConnection();
            stm = cnn.prepareStatement(query);
            rs = stm.executeQuery();
            while (rs.next()) {
                return new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5), rs.getInt(6));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void upView(String id) {
        String query = "UPDATE dbo.tblProducts\n"
                + "SET viewNumber = viewNumber + 1\n"
                + "WHERE ProductID = '" + id + "'";
        try {
            cnn = new DBContext().getConnection();
            stm = cnn.prepareStatement(query);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void delete(String id) {
        String query = "DELETE FROM dbo.tblProducts\n"
                + "WHERE ProductID = '" + id + "'";
        try {
            cnn = new DBContext().getConnection();
            stm = cnn.prepareStatement(query);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void add(String id, String name, String unit, String price, String image) {
        String query = "INSERT [dbo].[tblProducts] ([ProductID], [ProductName], [Unit], [Price], [Image]) VALUES \n"
                + "(?, ?, ?, ?, ?)";
        try {
            cnn = new DBContext().getConnection();
            stm = cnn.prepareStatement(query);
            stm.setString(1, id);
            stm.setString(2, name);
            stm.setString(3, unit);
            stm.setString(4, price);
            stm.setString(5, image);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void update(String id, String name, String unit, String price, String image) {
        String query = "UPDATE dbo.tblProducts\n"
                + "SET ProductName = ?, Unit = ?, price = ?, [image] = ?\n"
                + "WHERE [ProductID] = ?";
        try {
            cnn = new DBContext().getConnection();
            stm = cnn.prepareStatement(query);
            stm.setString(1, name);
            stm.setString(2, unit);
            stm.setString(3, price);
            stm.setString(4, image);
            stm.setString(5, id);
            
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }
}

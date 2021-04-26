/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author MacBook
 */
public class Register {
    private String username;
    private String account;
    private String password;
    private String email;
    private String phone;
    
    private Connection cnn;
    private Statement stm;
    private ResultSet rs;

    public Register() {
        connect();
    }

    public Register(String account, String password,String phone, String email) {
        this.account = account;
        this.password = password;
        this.phone = phone;
        this.email = email;
        
        connect();
    }
    public void connect() {
        try {
            cnn = (new DBContext()).getConnection();
            System.out.println("Connect successfully");
            stm = cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (Exception e) {
            System.out.println("Loi ket noi" + e.getMessage());
        }
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String checkAdd() {
       String add="";
//       String message="";
//        try {
//            String check = "select * from tblUser where account=" +account;
//            rs = stm.executeQuery(check);            
//            while (rs.next()) {
//               message="The account is existed";
//            }
//        } catch (Exception e) {           
//            System.out.println(e.getMessage());
//        }
        try {
            String strInsert = "insert into tblUsers values('" + account + "','" + password + "','" + phone + "','" + email + "')";             
            System.out.println(strInsert);
            stm.execute(strInsert);
            System.out.println("Insert OK");
        } catch (Exception e) {
            System.out.println("Insert fail" + e.getMessage());
        }
        return add;
    }
    
    
}

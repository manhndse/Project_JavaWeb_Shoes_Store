/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author MacBook
 */
public class User {
    //Property

    private String account;
    private String pass;
    private String name;
    private String gender;
    private String address;
    private String dob;

    private Connection cnn;
    private Statement stm;
    private ResultSet rs;
    //Method

    public User() {
    }

    public User(String account, String pass) {
        this.account = account;
        this.pass = pass;

        //Ket noi den database
        try {
            cnn = (new DBContext()).getConnection();
            System.out.println("Connect succesfully!");
        } catch (Exception e) {
            System.out.println("Loi ket noi:" + e.getMessage());
        }
    }

    public User(String account, String pass, String name, String gender, String address, String dob) {
        this.account = account;
        this.pass = pass;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dob = dob;

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void connect() {
        try {
            cnn = (new DBContext()).getConnection();
            System.out.println("Connect succesfully!");
        } catch (Exception e) {
            System.out.println("Loi ket noi:" + e.getMessage());
        }
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean checkUser() {
        //Check xem account="admin" va  password="123". Neu dung tra ve true, sai tra ve false
//        if("admin".equals(account) && "123".equals(pass)){
//            return true;
//        }
//        return false;
        //Check xem database co ton tai tai khoan nay khong?
        try {
            String strSelect = "Select * from tblUsers where account = '" + account + "' and pass = '" + pass + "'";
            stm = cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stm.executeQuery(strSelect);
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    
}

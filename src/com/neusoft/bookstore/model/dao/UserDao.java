package com.neusoft.bookstore.model.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.sun.org.apache.regexp.internal.recompile;

public class UserDao {
	 public String findUsername(String username,String pwd){  
	        String psw = null;  
	        Connection con =null;  
	        PreparedStatement pstmt =null;  
	        ResultSet rs = null;  
	        try {  
	            String driver ="com.mysql.jdbc.Driver";  
	            String url ="jdbc:mysql://localhost:3306/bookstore";  
	            String user ="root";  
	            String password ="root"; 
	            Class.forName(driver);  
	            con = (Connection) DriverManager.getConnection(url, user, password);  
	            String sql = "select password from user1 where user=? and password=?";  
	            pstmt = (PreparedStatement) con.prepareStatement(sql);  
	            pstmt.setString(1, username); 
	            pstmt.setString(2,pwd);
	            rs = pstmt.executeQuery();  
	            if(rs==null){  
	                return null;  
	            }  
	            if(rs.next()){
	                psw=rs.getString("password");  
	            }else{  
	                psw=null;  
	            }  
	        } catch (ClassNotFoundException e) {  
	            e.printStackTrace();  
	        } catch (SQLException e) {  
	            e.printStackTrace();  
	        }finally {  
	            try {  
	                if(pstmt!=null)pstmt.close();  
	                if(con!=null)con.close();  
	                }   
	            catch (SQLException e) {          
	                                    }  
	        }
			return psw;  
	        
	    }  
	 public void addUser(String username,String psw){  
	        Connection con =null;  
	        PreparedStatement pstmt =null;  
	        try {  
	            String driver ="com.mysql.jdbc.Driver"; 
	            Class.forName(driver); 
	            String url ="jdbc:mysql://localhost:3306/bookstore";  
	            String user ="root";  
	            String password ="root";//改为自己的用户名密码和数据库名  
	            con = (Connection) DriverManager.getConnection(url, user, password); 
	            String sql = "INSERT INTO user (name,password)VALUES(?,?)";  
	            pstmt = (PreparedStatement) con.prepareStatement(sql);  
	            pstmt.setString(1, username);  
	            pstmt.setString(2, psw);  
	            pstmt.executeUpdate();  
	        } catch (ClassNotFoundException e) {  
	            e.printStackTrace();  
	        } catch (SQLException e) {  
	            e.printStackTrace();  
	        }finally {  
	            try {  
	                if(pstmt!=null)
	                	pstmt.close();  
	                if(con!=null)
	                	con.close();  
	                }   
	            catch (SQLException e) {          
	                                    }  
	        }  
	    }  
	  /*  //单独测试使用  
	    public static void main(String[] args) {  
	        String psw =new UserDao().findUsername("345");  
	      
	        UserDao u = new UserDao();  
	        u.addUser("345", "345");  
	    }  
*/
}

package com.kate.app.dao;


import java.sql.Connection;
import java.sql.DriverManager;




public class BaseDao {
	
	protected static String url = null;
	protected static String username = null;
	protected static String password = null;
	protected static Connection con = null;
	static {
		System.out.println("fffffffff");
		try{   
		    //����MySql������   
		    Class.forName("com.mysql.jdbc.Driver") ;   
		}
		catch(ClassNotFoundException e){   
		    System.out.println("�Ҳ���������� ��������ʧ�ܣ�");   
		    e.printStackTrace() ;   
		}   
		try {
            url = "jdbc:mysql://54.187.200.118:3306/media";
            username = "root";
            password = "admin";
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
           
        }
	}
	
	
}

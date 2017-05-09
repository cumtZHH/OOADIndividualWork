package cn.edu.cumt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cn.edu.cumt.entity.Guitar;

public class GuitarJDBC {
	  public static ResultSet executeQuery(String sql,Object[] args){
			 Connection conn=null;
			 PreparedStatement stat = null; 
			 ResultSet rs=null;
			 try{
				 Class.forName("org.sqlite.JDBC"); 
				 conn=DriverManager.getConnection("jdbc:sqlite::resource:guitar.db");
				 try{
					 stat=conn.prepareStatement(sql);
					 if(args!=null&&args.length>0){
						 for(int i=0;i<args.length;i++){
							 stat.setObject(i+1, args[i]);
						 }
					 }}catch(Exception e){
						 e.printStackTrace();
					 }
				 rs=stat.executeQuery();
			 }catch(Exception e){
				 e.printStackTrace();
			 }
			 return rs;
		 }
	  
}

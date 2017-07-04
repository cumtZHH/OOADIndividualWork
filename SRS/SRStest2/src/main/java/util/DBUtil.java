package util;

import java.sql.*;
import java.io.*;

public class DBUtil {
	private static final long serialVersionUID = 1L;
	
	public static ResultSet executeQuery(String sql,Object[] args){
		 Connection conn=null;
		 PreparedStatement stat = null; 
		 ResultSet rs=null;
		 try{
			 Class.forName("org.sqlite.JDBC"); 
			 conn=DriverManager.getConnection("jdbc:sqlite:guitar.db");
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

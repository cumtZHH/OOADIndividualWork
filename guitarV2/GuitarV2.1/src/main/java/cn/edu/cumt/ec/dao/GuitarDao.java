package cn.edu.cumt.ec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.edu.cumt.ec.dbutil.GuitarJDBC;
import cn.edu.cumt.ec.entity.Guitar;
import cn.edu.cumt.ec.entity.GuitarSpec;

public class GuitarDao {
	public List<Guitar> getAll() {
		// TODO Auto-generated method stub
		ResultSet rs=GuitarJDBC.executeQuery("select * from guitar;",new Object[]{});
		List<Guitar> guitars=new ArrayList<Guitar>();
		try{
			while(rs.next()){
				GuitarSpec guitarSpec=new GuitarSpec(rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
				Guitar guitar=new Guitar(rs.getString(1),rs.getDouble(2),guitarSpec);				
				guitars.add(guitar);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return guitars;
}
}

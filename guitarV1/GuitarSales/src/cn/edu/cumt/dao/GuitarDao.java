package cn.edu.cumt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.edu.cumt.jdbc.GuitarJDBC;
import cn.edu.cumt.entity.Guitar;

public class GuitarDao {
	public List<Guitar> getAll() {
		// TODO Auto-generated method stub
		ResultSet rs=GuitarJDBC.executeQuery("select * from guitar;",new Object[]{});
		List<Guitar> guitars=new ArrayList<Guitar>();
		try{
			while(rs.next()){
				Guitar guitar=new Guitar();
				guitar.setSerialNumber(rs.getString(1));
				guitar.setPrice(rs.getDouble(2));
				guitar.setBuilder(rs.getString(3));
				guitar.setModel(rs.getString(4));
				guitar.setType(rs.getString(5));
				guitar.setBackWood(rs.getString(6));
				guitar.setTopWood(rs.getString(7));
				guitars.add(guitar);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return guitars;
}
}

package cn.edu.cumt.ec.service;

import java.sql.SQLException;
import java.util.List;

import cn.edu.cumt.ec.dao.DataAccess;
import cn.edu.cumt.ec.dao.GuitarDao;
import cn.edu.cumt.ec.entity.Guitar;
import cn.edu.cumt.ec.entity.Inventory;

public class GuitarServiceImpl implements GuitarService{
	GuitarDao guitarDao=DataAccess.CreateGuitarDao();
	public Inventory getInventory() throws SQLException { 
		Inventory inventory=new Inventory();
		List<Guitar> list=guitarDao.getAll();
		for(Guitar guitar:list){
			inventory.addGuitar(guitar.getSerialNumber(),guitar.getPrice(),guitar.getSpec());
		}
		return inventory;
	}
	 public void addGuitar(Guitar guitar) throws SQLException {
		 guitarDao.addGuitar(guitar);
	 }	 
	 public void deleteGuitar(String serialNumber ) throws SQLException{
		 guitarDao.deleteGuitar(serialNumber );
	 }

	
}

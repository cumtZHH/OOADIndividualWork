package cn.edu.cumt.ec.service;

import java.sql.SQLException;

import cn.edu.cumt.ec.entity.Guitar;
import cn.edu.cumt.ec.entity.Inventory;

public interface GuitarService {
	public Inventory getInventory() throws SQLException;
	public void addGuitar(Guitar guitar) throws SQLException;
	public void deleteGuitar(String serialNumber) throws SQLException;
}

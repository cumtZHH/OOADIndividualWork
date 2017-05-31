package cn.edu.cumt.ec.action;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.dao.DataAccess;
import cn.edu.cumt.ec.dao.GuitarDao;
import cn.edu.cumt.ec.entity.Guitar;
import cn.edu.cumt.ec.entity.GuitarSpec;
import cn.edu.cumt.ec.entity.Inventory;
import cn.edu.cumt.ec.service.GuitarService;
import cn.edu.cumt.ec.service.GuitarServiceImpl;


public class GuitarAction extends ActionSupport {
	GuitarService guitarService=new GuitarServiceImpl();
	private String serialNumber;
	private Double price;
    public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	private String builder; 
    private String model;
    private String type;
    private String backWood;
    private String topWood;
	 public String getBuilder() {
		return builder;
	}

	public void setBuilder(String builder) {
		this.builder = builder;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBackWood() {
		return backWood;
	}

	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}

	public String getTopWood() {
		return topWood;
	}

	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}

	@Override
		public String execute() throws Exception {
        // TODO Auto-generated method stub
		 ActionContext ctx=ActionContext.getContext();
		 HttpServletRequest request= ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		//
		 Inventory inventory= guitarService.getInventory();
		request.setAttribute("guitar", inventory);
		GuitarSpec guitarSpec=new GuitarSpec(builder,model,type,backWood,topWood);
		List<Guitar> macthingGuitars=inventory.search(guitarSpec);
		
        if(macthingGuitars==null|| macthingGuitars.isEmpty()){
        	ctx.put("error", "Sorry,none of what you need.");
        	return ERROR;
        }else{
        
        request.setAttribute("guitarInfo", macthingGuitars);
        }
        return SUCCESS;
    }
	public String add() throws IOException{
		String message="";
		try{
			Guitar guitar=new Guitar(serialNumber,price,new GuitarSpec(builder,model,type,backWood,topWood));
			guitarService.addGuitar(guitar);
		}
		catch(Exception e){
		}  
		return SUCCESS;
	}

	public String delete() throws IOException, SQLException{
		guitarService.deleteGuitar(serialNumber);
		return null;
		
	}
	public String findAll() throws Exception{
		ActionContext ctx=ActionContext.getContext();
		 HttpServletRequest request= ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		GuitarDao guitarDao=DataAccess.CreateGuitarDao();
		 request.setAttribute("guitarAll", guitarDao.getAll());
		return SUCCESS;
		
	}

}
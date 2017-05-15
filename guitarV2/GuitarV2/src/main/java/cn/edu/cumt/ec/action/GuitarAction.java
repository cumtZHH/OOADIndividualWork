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

import cn.edu.cumt.ec.dao.GuitarDao;
import cn.edu.cumt.ec.entity.Guitar;
import cn.edu.cumt.ec.entity.GuitarSpec;
import cn.edu.cumt.ec.entity.Inventory;
import cn.edu.cumt.ec.service.GuitarService;


public class GuitarAction extends ActionSupport {
    private GuitarDao guitarDao=new GuitarDao();
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
		Inventory inventory=new Inventory(guitarDao.getAll());
		GuitarService guitarService=new GuitarService();
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

}
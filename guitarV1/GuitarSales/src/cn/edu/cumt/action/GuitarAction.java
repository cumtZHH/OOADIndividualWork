package cn.edu.cumt.action;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.sqlite.JDBC;

import cn.edu.cumt.dao.GuitarDao;
import cn.edu.cumt.entity.Guitar;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/Welcome")
public class GuitarAction extends HttpServlet {
    private static final long serialVersionUID = 1L;
    GuitarDao guitarDao=new GuitarDao();
    Guitar guitar= new Guitar();

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    public Guitar search(String c) {
        List<Guitar> guitars=new ArrayList<Guitar>();
        guitars=guitarDao.getAll();
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
          Guitar guitar = (Guitar)i.next();
          if ((c.equals(guitar.getBuilder()))||c.equals(guitar.getModel())||(c.equals(guitar.getType()))
              ||(c.equals(guitar.getBackWood()))||c.equals(guitar.getTopWood())||c.equals(guitar.getPrice()))
        	  return guitar;         
      }
        return null;
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    	
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String c = request.getParameter("c");
      
 /*       try
        {
         //连接SQLite的JDBC
         Class.forName("org.sqlite.JDBC");       
         //建立一个数据库名lincj.db的连接，如果不存在就在当前目录下创建之
         Connection conn = DriverManager.getConnection("jdbc:sqlite::resource:guitar.db");  
         //Connection conn = DriverManager.getConnection("jdbc:sqlite:path(路径)/lincj.db");
         Statement stat = conn.createStatement();
         ResultSet rs = stat.executeQuery("select * from guitar;"); //查询数据 
         if(c.equals("yes")){
         while (rs.next()) { //将查询到的数据打印出来
         import java.util.Iterator;
}
          out.print("name = " + rs.getString("type") + " "); //列属性一
             out.println("price = " + rs.getString("price")); //列属性二
         }}else{
        	 out.print("I don't like you!");
         }
         rs.close();
         conn.close(); //结束数据库的连接 
        }
        catch( Exception e )
        {
         e.printStackTrace ( );
        }*/
//        if(c.equals("yes"))
        if(search(c)==null){
        	out.print("Sorry,none of what you need.");
        }else{
        out.println(search(c).getSerialNumber());
        out.println(search(c).getPrice());
        out.println(search(c).getBuilder());
        out.println(search(c).getModel());
        out.println(search(c).getType());
        out.println(search(c).getBackWood());
        out.println(search(c).getTopWood());
        }
       
/*        else
            out.print("I don't like you!");*/
    }

}
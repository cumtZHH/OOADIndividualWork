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
         //����SQLite��JDBC
         Class.forName("org.sqlite.JDBC");       
         //����һ�����ݿ���lincj.db�����ӣ���������ھ��ڵ�ǰĿ¼�´���֮
         Connection conn = DriverManager.getConnection("jdbc:sqlite::resource:guitar.db");  
         //Connection conn = DriverManager.getConnection("jdbc:sqlite:path(·��)/lincj.db");
         Statement stat = conn.createStatement();
         ResultSet rs = stat.executeQuery("select * from guitar;"); //��ѯ���� 
         if(c.equals("yes")){
         while (rs.next()) { //����ѯ�������ݴ�ӡ����
         import java.util.Iterator;
}
          out.print("name = " + rs.getString("type") + " "); //������һ
             out.println("price = " + rs.getString("price")); //�����Զ�
         }}else{
        	 out.print("I don't like you!");
         }
         rs.close();
         conn.close(); //�������ݿ������ 
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
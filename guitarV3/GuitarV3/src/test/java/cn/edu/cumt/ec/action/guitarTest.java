package cn.edu.cumt.ec.action;
import static org.junit.Assert.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import cn.edu.cumt.ec.entity.Guitar;
import cn.edu.cumt.ec.entity.GuitarSpec;
import cn.edu.cumt.ec.entity.Inventory;

public class guitarTest {

	@Test
	public void test() {
	
		
         //给inventory注入数据
		GuitarSpec specone=new GuitarSpec("FENDER","MM","ACOUSTIC","NATO","BASSWOOD");
		GuitarSpec spectwo=new GuitarSpec("GIBSON","MM","ELECTRIC","MAPLE","BASSWOOD");
		Guitar guitarone=new Guitar("g00001",2000.00,specone);
		Guitar guitartwo=new Guitar("g00002",2050.00,spectwo);
		List<Guitar> guitars=new LinkedList();
		guitars.add(guitarone);
		guitars.add(guitartwo);
		Inventory inventory=new Inventory(guitars);
		//模拟前台传入数据
		    GuitarSpec whatErinLikes = 
		      new GuitarSpec("", "", 
		                     "ELECTRIC", "", "");
		    List matchingGuitars = inventory.search(whatErinLikes);
		    if (!matchingGuitars.isEmpty()) {
		      System.out.println("you might like these guitars:");
		      for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
		        Guitar guitar = (Guitar)i.next();
		        GuitarSpec spec = guitar.getSpec();
		        System.out.println("  We have a " +
		          spec.getBuilder() + " " + spec.getModel() + " " +
		          spec.getType() + " guitar:\n     " +
		          spec.getBackWood() + " back and sides,\n     " +
		          spec.getTopWood() + " top.\n  You can have it for only $" +
		          guitar.getPrice() + "!\n  ----");
		      }
		    } else {
		    	//输出
		      System.out.println("Sorry, Erin, we have nothing for you.");
		    }
		  }
	}

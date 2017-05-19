package cn.edu.cumt.ec.action;

import cn.edu.cumt.ec.DaoImpl.FlyRocketPowered;
import cn.edu.cumt.ec.entity.MallardDuck;
import cn.edu.cumt.ec.entity.ModelDuck;
import cn.edu.cumt.ec.entity.RubberDuck;

public class DuckSimulator {
	 public static void main(String[] args) {  
		   
	        MallardDuck mallard = new MallardDuck();  
	        RubberDuck  rubberDuck = new RubberDuck();  
	        ModelDuck   model = new ModelDuck();  	 
	        mallard.display();
	        mallard.performQuack();  
	        rubberDuck.display();
	        rubberDuck.performQuack();  	 
	        model.display();
	        model.performFly();   
	        //动态设置飞行方式
	        model.setFlyBehavior(new FlyRocketPowered());  
	        model.display();
	        model.performFly();  
	    }  
}

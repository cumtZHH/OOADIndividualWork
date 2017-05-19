package cn.edu.cumt.ec.entity;

import cn.edu.cumt.ec.DaoImpl.FlyNoWay;
import cn.edu.cumt.ec.DaoImpl.Squeak;

public class RubberDuck extends Duck {  
	   
    public RubberDuck() {  
        flyBehavior = new FlyNoWay();  
        quackBehavior = new Squeak();  
    }  
   
    public void display() {  
        System.out.println("I'm a rubber duckie");  
    }  
}  
package cn.edu.cumt.ec.entity;

import cn.edu.cumt.ec.DaoImpl.FlyWithWings;
import cn.edu.cumt.ec.DaoImpl.Quack;
//ҰѼ
public class MallardDuck extends Duck {  
	   
    public MallardDuck() {  
        quackBehavior = new Quack();  
        flyBehavior = new FlyWithWings();  
    }  
   
    public void display() {  
        System.out.println("I'm a real Mallard duck");  
    }  
}  
package cn.edu.cumt.ec.entity;

import cn.edu.cumt.ec.DaoImpl.FlyWithWings;
import cn.edu.cumt.ec.DaoImpl.Quack;
//ºìÍ·Ñ¼
public class RedHeadDuck extends Duck {  
	   
    public RedHeadDuck() {  
        flyBehavior = new FlyWithWings();  
        quackBehavior = new Quack();  
    }  
    public void display() {  
        System.out.println("I'm a real Red Headed duck");  
    }  
}  

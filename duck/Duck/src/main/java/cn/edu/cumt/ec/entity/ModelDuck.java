package cn.edu.cumt.ec.entity;

import cn.edu.cumt.ec.DaoImpl.FlyNoWay;
import cn.edu.cumt.ec.DaoImpl.Quack;
//Ä£ÐÍÑ¼
public class ModelDuck extends Duck {  
    public ModelDuck() {  
        flyBehavior = new FlyNoWay();  
        quackBehavior = new Quack();  
    }  
  
    public void display() {  
        System.out.println("I'm a model duck");  
    }  
}  

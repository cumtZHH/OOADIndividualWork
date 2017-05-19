package cn.edu.cumt.ec.entity;

import cn.edu.cumt.ec.DaoImpl.FlyNoWay;
import cn.edu.cumt.ec.DaoImpl.Quack;
//ģ��Ѽ
public class ModelDuck extends Duck {  
    public ModelDuck() {  
        flyBehavior = new FlyNoWay();  
        quackBehavior = new Quack();  
    }  
  
    public void display() {  
        System.out.println("I'm a model duck");  
    }  
}  

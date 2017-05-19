package cn.edu.cumt.ec.entity;

import cn.edu.cumt.ec.dao.FlyBehavior;
import cn.edu.cumt.ec.dao.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;  
    QuackBehavior quackBehavior;  
   
    public Duck() {  
    }  
        //动态设置飞行行为  
    public void setFlyBehavior (FlyBehavior flyBehavior) {  
        this.flyBehavior = flyBehavior;  
    }  
  //动态设置叫
    public void setQuackBehavior(QuackBehavior quackBehavior) {  
        this.quackBehavior = quackBehavior;  
    }  
        //不同的鸭子长相不同  
    abstract void display();  
        //将飞行行为委托给飞行行为类处理  
    public void performFly() {  
        flyBehavior.fly();  
    }  
        //将呱呱叫行为委托给呱呱叫行为类处理  
    public void performQuack() {  
        quackBehavior.quack();  
    }  
        //所有鸭子都会浮水  
    public void swim() {  
        System.out.println("All ducks float!");  
    }  
}

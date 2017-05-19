package cn.edu.cumt.ec.entity;

import cn.edu.cumt.ec.dao.FlyBehavior;
import cn.edu.cumt.ec.dao.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;  
    QuackBehavior quackBehavior;  
   
    public Duck() {  
    }  
        //��̬���÷�����Ϊ  
    public void setFlyBehavior (FlyBehavior flyBehavior) {  
        this.flyBehavior = flyBehavior;  
    }  
  //��̬���ý�
    public void setQuackBehavior(QuackBehavior quackBehavior) {  
        this.quackBehavior = quackBehavior;  
    }  
        //��ͬ��Ѽ�ӳ��಻ͬ  
    abstract void display();  
        //��������Ϊί�и�������Ϊ�ദ��  
    public void performFly() {  
        flyBehavior.fly();  
    }  
        //�����ɽ���Ϊί�и����ɽ���Ϊ�ദ��  
    public void performQuack() {  
        quackBehavior.quack();  
    }  
        //����Ѽ�Ӷ��ḡˮ  
    public void swim() {  
        System.out.println("All ducks float!");  
    }  
}

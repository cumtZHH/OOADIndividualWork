package cn.edu.cumt.ec.DaoImpl;

import cn.edu.cumt.ec.dao.QuackBehavior;
//�����
public class MuteQuack implements QuackBehavior {  
    public void quack() {  
        System.out.println("I can't quack");  
    }  
}  
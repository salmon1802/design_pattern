package com.salmon.design.principle.compositereuse;

/**
 * @date 2021-6-14 - 00:13
 * Created by Salmon
 */
public class UserDao {
    //此类在执行增加用户行为时需要与数据库进行连接，调用Database的方法，但没有继承database类，
    //而是在自身setter了database，合成复用了databa以及他的getConnection方法

    private DataBase dataBase;

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void addUser(){
        dataBase.getConnection();
        System.out.println("user增加成功");
    }
}

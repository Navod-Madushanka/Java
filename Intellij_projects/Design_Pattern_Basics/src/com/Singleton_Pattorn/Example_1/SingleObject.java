package com.Singleton_Pattorn.Example_1;

public class SingleObject {
    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    //make the constructor private so that this class cannot be instantiated
    private SingleObject(){}

    //get the only object available
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMassage(){
        System.out.println("Hello Singleton Pattern");
    }
}

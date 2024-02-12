package com.Singleton_Pattorn.Example_1;

import com.Singleton_Pattorn.Example_1.SingleObject;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        //get the only object available
        SingleObject object = SingleObject.getInstance();
        //show message
        object.showMassage();
    }
}

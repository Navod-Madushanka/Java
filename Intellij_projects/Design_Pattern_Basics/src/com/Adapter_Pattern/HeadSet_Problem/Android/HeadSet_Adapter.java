package com.Adapter_Pattern.HeadSet_Problem.Android;

import com.Adapter_Pattern.HeadSet_Problem.Android.AndroidHeadSet;
import com.Adapter_Pattern.HeadSet_Problem.IOS.IPhoneHeadSet;

public class HeadSet_Adapter implements AndroidHeadSet {
    IPhoneHeadSet iPhoneHeadSet = new IPhoneHeadSet();
    @Override
    public void giveSound(String str) {
        iPhoneHeadSet.giveQualitySound(str);
    }
}

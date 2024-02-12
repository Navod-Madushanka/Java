package com.Adapter_Pattern.HeadSet_Problem.Android;

public class ListenMusic {
    private AndroidHeadSet HeadSet;

    public ListenMusic(AndroidHeadSet HeadSet){
        this.HeadSet = HeadSet;
    }

    public void ListenSong(String str){
        HeadSet.giveSound(str);
    }
}

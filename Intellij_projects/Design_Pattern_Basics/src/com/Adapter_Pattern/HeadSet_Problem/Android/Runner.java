package com.Adapter_Pattern.HeadSet_Problem.Android;

public class Runner {
    public static void main(String[] args) {
        AndroidHeadSet headSet_adapter = new HeadSet_Adapter();
        ListenMusic listenMusic = new ListenMusic(headSet_adapter);
        listenMusic.ListenSong("Shake It Off");
    }
}

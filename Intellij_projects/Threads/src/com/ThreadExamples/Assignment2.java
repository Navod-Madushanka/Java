package com.ThreadExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Thread2 extends Thread{
    @Override
    public void run() {
        System.out.println("Enter the Word: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String txt = null;
        try {
            txt = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        char[] c = txt.toCharArray();
        for(int i = 0; i<txt.length(); i++){
            System.out.println(c[i]);
        }
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        Thread t = new Thread2();
        t.start();

    }
}

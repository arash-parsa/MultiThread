package com.example.multithread;

import android.util.Log;

public class SimpleRunnable implements Runnable {

    @Override
    public void run() {
        Log.i(SimpleThread.TAG,"Threaad"+ Thread.currentThread().getName()+" is running");
    }
}

package com.example.multithread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(SimpleThread.TAG,"thread "+ Thread.currentThread().getName()+" is running");


        SimpleThread simpleThread = new SimpleThread();
        simpleThread.start();

        Thread simpleThread2 = new Thread(new SimpleRunnable());
        simpleThread2.start();


        //or

       /* Thread simpleThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Log.i(SimpleThread.TAG,"Thread "+Thread.currentThread().getName()+" is running");

            }
        });
        simpleThread2.start();
*/
    }
}

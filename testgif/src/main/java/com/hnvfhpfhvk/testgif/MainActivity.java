package com.hnvfhpfhvk.testgif;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private GifView mGifView;
    private int time, time2;
    private TimerTask mTimerTask = new TimerTask() {
        @Override
        public void run() {
            mHandler.sendEmptyMessage(1);
        }
    };
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            time += time2;
            if (time>=mGifView.getMovie().duration()){
                time=0;
            }
            System.out.println(time);
            mGifView.setMovieTime(time);

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGifView = (GifView) findViewById(R.id.gif);
        mGifView.setMovieResource(R.raw.test);
        mGifView.setPaused(true);
        time2 = mGifView.getMovie().duration() / 15;
        Timer mTimer = new Timer(true);
        mTimer.schedule(mTimerTask, 1000, 1000);
    }
}

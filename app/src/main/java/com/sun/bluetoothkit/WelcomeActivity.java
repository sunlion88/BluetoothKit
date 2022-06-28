package com.sun.bluetoothkit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class WelcomeActivity extends Activity{
    private Timer timeout;
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        this.setTitle("欢迎使用...");
        timeout = new Timer(1000, new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setClass(WelcomeActivity.this, DeviceListActivity.class);
                startActivity(intent);
                timeout.stop();
                WelcomeActivity.this.finish();
            }
        });
        timeout.restart();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        timeout.stop();
    }
}
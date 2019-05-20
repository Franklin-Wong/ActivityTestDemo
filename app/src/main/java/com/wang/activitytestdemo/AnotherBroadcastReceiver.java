package com.wang.activitytestdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AnotherBroadcastReceiver extends BroadcastReceiver {
    public static final String DATA_NAME = "1";
    @Override
    public void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra(DATA_NAME, 0);
        Toast.makeText(context," AnotherBroadcastReceiver接收到标准广播 " + intExtra , Toast.LENGTH_SHORT).show();





    }
}

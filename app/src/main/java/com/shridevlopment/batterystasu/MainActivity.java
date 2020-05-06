package com.shridevlopment.batterystasu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import com.shridevlopment.batterystasu.R;

public class MainActivity extends AppCompatActivity {
    private BatteryReceiver mBatteryReceiver = new BatteryReceiver();
    private IntentFilter mIntentFilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(mBatteryReceiver, mIntentFilter);
    }

    @Override
    protected void onPause() {
        unregisterReceiver(mBatteryReceiver);
        super.onPause();
    }
}

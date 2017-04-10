package com.example.apple.android_bugly;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by 张越 on 17/4/10.
 */

public class MyApplication extends Application{


    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(getApplicationContext(), "2eaec144a6", true);
        
    }
}

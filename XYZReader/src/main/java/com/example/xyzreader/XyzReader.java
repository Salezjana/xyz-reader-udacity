package com.example.xyzreader;

import android.app.Application;

import com.facebook.stetho.Stetho;

public class XyzReader extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this);
        }


    }
}

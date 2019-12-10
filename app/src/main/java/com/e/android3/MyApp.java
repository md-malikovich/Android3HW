package com.e.android3;

import android.app.Application;

import com.e.android3.data.PreferenceHelper;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        PreferenceHelper.init(this);
    }
}

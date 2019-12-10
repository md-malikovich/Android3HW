package com.e.android3.ui.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import com.e.android3.R;
import com.e.android3.data.PreferenceHelper;
import com.e.android3.ui.main.MainActivity;
import com.e.android3.ui.onboard.OnBoardActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                selectActivity();
            }
        }, 1_000);
    }

    private void selectActivity() {
        if(PreferenceHelper.getIsFirstLaunch()) {
            MainActivity.start(this);
        } else {
            PreferenceHelper.setIsFirstLaunch();
            OnBoardActivity.start(this);
        }
        finish();
    }
}

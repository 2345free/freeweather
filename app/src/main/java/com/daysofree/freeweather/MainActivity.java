package com.daysofree.freeweather;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        String weatherVal = prefs.getString("weather", "");
        if (!TextUtils.isEmpty(weatherVal)) {
            Intent intent = new Intent(this, WeatherActivity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(getApplicationContext(), "欢迎使用免费天气应用", Toast.LENGTH_LONG).show();
        }
    }

}

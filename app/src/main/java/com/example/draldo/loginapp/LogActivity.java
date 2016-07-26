package com.example.draldo.loginapp;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String name = intent.getStringExtra("log_name");
        TextView hello = (TextView) findViewById(R.id.a_hello_et);
        hello.setText("Welcome " + name);
    }

    public void Return(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}

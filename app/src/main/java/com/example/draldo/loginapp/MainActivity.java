package com.example.draldo.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText pass;
    private int index=0;
    private String[][] usrdb = new String[10][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        if(intent!=null && index<10) {
            usrdb[index][0] = intent.getStringExtra("sign_name");
            usrdb[index][1] = intent.getStringExtra("sign_mail");
            usrdb[index][2] = intent.getStringExtra("sign_pass");
            index++;
        }
    }

    public void LogUsr(View view) {
        name = (EditText)findViewById(R.id.a_main_name);
        pass = (EditText)findViewById(R.id.a_main_pass);

        for (int i = 0; i < 10; i++) {
            if (name.getText().toString().equals(usrdb[i][0])) {
                if (pass.getText().toString().equals(usrdb[i][2])) {
                    Intent intent = new Intent(this, LogActivity.class);
                    intent.putExtra("log_name", name.getText().toString());
                    intent.putExtra("log_pass", pass.getText().toString());
                    startActivity(intent);
                }
            }
        }
    }

    public void Register(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}

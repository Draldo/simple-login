package com.example.draldo.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private static final String TAG = "TAG_" ;
    private EditText name;
    private EditText email;
    private EditText pass;
    private EditText pass2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void doRegister(View view) {
        name = (EditText) findViewById(R.id.reg_name);
        email = (EditText) findViewById(R.id.reg_mail);
        pass = (EditText) findViewById(R.id.reg_pass);
        pass2 = (EditText) findViewById(R.id.reg_pass2);

        if(pass.getText().toString().equals(pass2.getText().toString())) {
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("sign_name", name.getText().toString());
            intent.putExtra("sign_mail", email.getText().toString());
            intent.putExtra("sign_pass", pass.getText().toString());
            startActivity(intent);
        }
    }
}

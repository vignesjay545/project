package com.example.suresh.passwordlessauth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        b1=(Button)findViewById(R.id.blsignup);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(LoginActivity.this,SignupActivity.class);
                startActivity(i1);
            }
        });
        b2=(Button)findViewById(R.id.bllogin);
        final EditText e=(EditText)findViewById(R.id.logemail);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText("Imei");
            }
        });



    }

}

package com.example.loginform;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextInputEditText email, password;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.name_edit_email);
        password = findViewById(R.id.name_edit_password);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                function();


            }
        });


    }
    void function(){
        boolean b = true;
        String mail= email.getText().toString();
        String pass = password.getText().toString();

        if(TextUtils.isEmpty(mail)){
            email.setError("Pleas Enter Email");
            b = false;
            email.requestFocus();
        }
        else {
            if(!mail.contains("@")){
                b = false;
                email.setError("Email is not valid");
                email.requestFocus();
            }

        }

        if(TextUtils.isEmpty(pass)){
            password.setError("Please Enter password");
            b= false;
            password.requestFocus();
        }
        else{
            if(pass.length()<8)
            {
                password.setError("Password is not valid");
                b=false;
                password.requestFocus();

            }
        }

        if(b == true){
            Toast.makeText(this, "Login Successful", Toast.LENGTH_LONG).show();
        }
    }




}


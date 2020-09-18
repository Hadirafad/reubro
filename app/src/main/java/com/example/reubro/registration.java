package com.example.reubro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registration extends AppCompatActivity {

    EditText e1, e2, e3, e4;
    Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        e3 = (EditText) findViewById(R.id.editText3);
        e4 = (EditText) findViewById(R.id.editText4);
        b3 = (Button) findViewById(R.id.button3);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = e2.getText().toString().trim();
                String name_ = e1.getText().toString().trim();
                String pass_ = e4.getText().toString().trim();


                if (email.length() <= 0 || name_.length() <= 0 || pass_.length() <= 7) {
                    Toast.makeText(getApplicationContext(), "please fill all the fields correctly.", Toast.LENGTH_SHORT).show();
                } else {

                    if (name_.matches("[a-zA-Z ]+")) {

                        e1.setError("Invalid Name..!");
                        Toast.makeText(getApplicationContext(), "invalid name", Toast.LENGTH_SHORT).show();

                    }
                    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

                    boolean val = email.matches(emailPattern);

                    if (!val) {

                        e2.setError("Invalid email...!");

                        Toast.makeText(getApplicationContext(), "invalid mail", Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(getApplicationContext(), "registration successful", Toast.LENGTH_SHORT).show();

                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }
                }

            }
        });


    }
}

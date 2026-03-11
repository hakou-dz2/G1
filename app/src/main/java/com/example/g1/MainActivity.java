package com.example.g1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    TextView reset;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username = findViewById(R.id.et_username);
        password = findViewById(R.id.et_pass);

        reset = findViewById(R.id.tv_reset);

        login = findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = username.getText().toString();
                String p = password.getText().toString();
                if(p.length()<8){
                    Toast.makeText(MainActivity.this, "password must be more than 8", Toast.LENGTH_SHORT).show();
                }
                if(n.isEmpty() && p.isEmpty()){
                    Toast.makeText(MainActivity.this, "All fields must be filled", Toast.LENGTH_SHORT).show();
                }else {
                    if (!n.equals("SI")) {
                        Toast.makeText(MainActivity.this, "the username is wrong", Toast.LENGTH_SHORT).show();

                    } else {
                        if (!p.equals("1234")) {
                            Toast.makeText(MainActivity.this, "the password is wrong", Toast.LENGTH_SHORT).show();

                        } else {
                            Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                            intent.putExtra("username", n);
                            startActivity(intent);
                        }
                    }

                }}
        });




    }
}
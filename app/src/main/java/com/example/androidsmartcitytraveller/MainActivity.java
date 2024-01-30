package com.example.androidsmartcitytraveller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private View proceedActivityBtn;

    EditText edPersonName, edPassword;
    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edPersonName = findViewById(R.id.editTextTextPersonName);
        edPassword = findViewById(R.id.editTextTextPassword);
        btn = findViewById(R.id.buttonLogin);
        tv = findViewById(R.id.textView3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username =edPersonName.getText().toString();
                String password=edPassword.getText().toString();
                Database db = new Database(getApplicationContext(), "Androidsmartcity",null, 1);
              if (username.length() == 0 || password.length() == 0){
                    Toast.makeText(getApplicationContext(), "please fill in all details", Toast.LENGTH_SHORT).show();
                }else {
                  if (db.login(username, password) == 1) {
                      Toast.makeText(getApplicationContext(), "login success", Toast.LENGTH_SHORT).show();
                      SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
                      SharedPreferences.Editor editor = sharedPreferences.edit();
                      editor.putString("username", username);
                      //to save our data with key and value .
                      editor.apply();

                      startActivity(new Intent(MainActivity.this, HomeActivity.class));
                  } else {
                      Toast.makeText(getApplicationContext(), "Invalid Username and Password", Toast.LENGTH_SHORT).show();
                  }
              }
            }
         });

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
            }
        });
    }
}

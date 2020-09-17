package com.example.android.capstoneprojectsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username_et;
    EditText password_et;

    DatabaseHelper databaseHelper;

    String username;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signIn = findViewById(R.id.create_btn);
        Button createAccount = findViewById(R.id.cancel_btn);

        username_et = findViewById(R.id.username_et);
        password_et = findViewById(R.id.password_et);

        databaseHelper = new DatabaseHelper(MainActivity.this);

        // storing the user's input username
        username_et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                username = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        // storing the user's input password
        password_et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                password = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (databaseHelper.checkPassword(username, password)){

                    // opens the home screen only if a login is successful
                    Intent intent = new Intent(MainActivity.this,
                            HomeScreenActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid Login", Toast.LENGTH_LONG).show();
                }

                username_et.setText("");
                password_et.setText("");
            }
        });

        // launches an activity that allows the user to create an account.
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        CreateAccountActivity.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.android.capstoneprojectsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateAccountActivity extends AppCompatActivity {

    String username;
    String password;
    String passwordConfirm;

    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        Button create_btn = findViewById(R.id.create_btn);
        Button cancel_btn = findViewById(R.id.cancel_btn);

        final EditText username_et = findViewById(R.id.username_et);
        final EditText password_et = findViewById(R.id.password_et);
        final EditText passwordConfirm_et = findViewById(R.id.passwordConfirm_et);

        databaseHelper = new DatabaseHelper(CreateAccountActivity.this);

        username_et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                username = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });


        password_et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                password = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });


        passwordConfirm_et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                passwordConfirm = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });


        create_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // determining if the password meets a basic criteria of 6 characters
                // also checking to make sure password and confirmation password mach
                if(password.equals(passwordConfirm)){
                    if (password.length() == 6){

                        UserModel userModel;

                        try {
                            userModel = new UserModel(username,password);
                        }
                        catch (Exception e){
                            Toast.makeText(CreateAccountActivity.this,
                                    "Error Creating Account", Toast.LENGTH_LONG).show();
                            userModel = new UserModel("error", "error");
                        }

                        DatabaseHelper databaseHelper = new DatabaseHelper(
                                CreateAccountActivity.this);

                        boolean success = databaseHelper.addUser(userModel);

                        if (success){
                            Toast.makeText(CreateAccountActivity.this,
                                    "Account Created", Toast.LENGTH_SHORT).show();
                            username_et.setText("");
                            password_et.setText("");
                            passwordConfirm_et.setText("");
                            Intent intent = new Intent(CreateAccountActivity.this, HomeScreenActivity.class);
                            CreateAccountActivity.this.startActivity(intent);
                        }
                        else {
                            Toast.makeText(CreateAccountActivity.this,
                                    "Failed to Create Account", Toast.LENGTH_LONG).show();
                            username_et.setText("");
                            password_et.setText("");
                            passwordConfirm_et.setText("");
                        }
                    }
                    else {
                        Toast.makeText(CreateAccountActivity.this,
                                "Passwords must be 6 characters long.", Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(CreateAccountActivity.this,
                            "Passwords Do Not Match", Toast.LENGTH_LONG).show();
                }
            }
        });

        // going back to sign in
        cancel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if (action.equals("finish_activity")) {
                    finish();
                }
            }
        };
        registerReceiver(broadcastReceiver, new IntentFilter("finish_activity"));
    }
}
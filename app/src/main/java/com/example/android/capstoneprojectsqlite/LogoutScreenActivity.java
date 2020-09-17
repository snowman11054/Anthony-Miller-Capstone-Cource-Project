package com.example.android.capstoneprojectsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogoutScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout_screen);

        Button login = findViewById(R.id.login_btn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogoutScreenActivity.this, MainActivity.class);
                LogoutScreenActivity.this.startActivity(intent);
                finish();
            }
        });
    }
}

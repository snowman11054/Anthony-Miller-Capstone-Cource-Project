package com.example.android.capstoneprojectsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Button recipes = findViewById(R.id.recipe_btn);
        Button calculator = findViewById(R.id.calculator_btn);
        Button logout = findViewById(R.id.logout_btn);

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

        recipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreenActivity.this, RecipeActivity.class);
                HomeScreenActivity.this.startActivity(intent);
            }
        });

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeScreenActivity.this, CalculatorActivity.class);
                HomeScreenActivity.this.startActivity(intent);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeScreenActivity.this, LogoutScreenActivity.class);
                HomeScreenActivity.this.startActivity(intent);

                Intent intent_broadcast = new Intent("finish_activity");
                sendBroadcast(intent_broadcast);
            }
        });
    }
}

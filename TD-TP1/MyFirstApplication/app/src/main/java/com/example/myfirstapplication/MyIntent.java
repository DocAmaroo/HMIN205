package com.example.myfirstapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MyIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_intent);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        String userData = intent.getStringExtra("userData");

        TextView userDataDisplay = findViewById(R.id.user_data);
        userDataDisplay.setText(userData);

        findViewById(R.id.ok_button).setOnClickListener(v -> {
            Intent okIntent = new Intent(this, OkActivity.class);
            startActivity(okIntent);
        });

        findViewById(R.id.return_button).setOnClickListener(v -> {
            this.finish();
        });
    }

    // this event will enable the back function to the button on press
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class OkActivity extends AppCompatActivity {

    private String phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ok);

        Intent intent = this.getIntent();
        this.phone = intent.getStringExtra("userPhoneNumber");

        TextView phone = findViewById(R.id.okActivity_phone);
        phone.setText(this.phone);

        findViewById(R.id.imageView).setOnClickListener(v -> {
            Intent call = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", this.phone, null));
            startActivity(call);
        });
    }
}
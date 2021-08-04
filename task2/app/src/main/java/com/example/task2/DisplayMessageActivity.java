package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
    public void showToast(View view){
        Intent intent = getIntent();
        Toast.makeText(this, intent.getStringExtra(MainActivity.EXTRA_MESSAGE), Toast.LENGTH_LONG).show();
    }
}

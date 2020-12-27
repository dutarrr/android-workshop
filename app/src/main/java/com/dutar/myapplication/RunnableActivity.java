package com.dutar.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RunnableActivity extends AppCompatActivity {

    TextView textView;
    Button button1;
    Button button2;
    Runnable runnable;
    Handler handler;
    int sayi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_runnable);
        textView = findViewById(R.id.textView);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        sayi = 0;
        button1.setEnabled(true);
        button2.setEnabled(false);
    }

    public void start(View view) {
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                sayi++;
                textView.setText("Zaman: " +sayi);
                handler.postDelayed(runnable, 1000);
            }
        };

        handler.post(runnable);
        button1.setEnabled(false);
        button2.setEnabled(true);
    }

    public void stop(View view) {
        handler.removeCallbacks(runnable);
        button1.setEnabled(true);
        button2.setEnabled(false);
    }
}
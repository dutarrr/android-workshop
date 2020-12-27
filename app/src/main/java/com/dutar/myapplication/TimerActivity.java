package com.dutar.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

public class TimerActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        init();
    }

    public void init() {
        textView = findViewById(R.id.textView);

        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                textView.setText("Kalan Süre: " + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
                textView.setText("Kalan Süre: 0");
                Toast.makeText(getApplicationContext(), "Süre Bitti", Toast.LENGTH_LONG).show();
            }
        }.start();
    }
}
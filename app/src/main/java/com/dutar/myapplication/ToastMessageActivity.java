package com.dutar.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ToastMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_toast_message);
    }

    public void button1_Click(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),"Düzgün Tutar",10000);
        toast.show();
    }
    public void button2_Click(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),"Button 2 clicked",5000);
        toast.show();
    }
}

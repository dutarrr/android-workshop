package com.dutar.myapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button1_Click(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),"Button 1 clicked",5000);
        toast.show();
    }
    public void button2_Click(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),"Button 2 clicked",5000);
        toast.show();
    }
}
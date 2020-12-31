package com.dutar.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Gravity;
import android.view.MenuInflater;
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

    //menu eklenen kısım
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.add_product, menu);

        return super.onCreateOptionsMenu(menu);
    }

    //menu item tıklanınca çalışan kisim
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menuItemAddProduct) {
            Intent intent = new Intent(MainActivity.this,AddProductActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    public void openToastMessageScreen(View view) {
        Intent intent = new Intent(this, ToastMessageActivity.class);
        startActivity(intent);
    }

    public void openConstraintLayout(View view) {
        Intent intent = new Intent(this, ConstraintLayoutActivity.class);
        startActivity(intent);
    }

    public void SharedPreferencesActivity(View view) {
        Intent intent = new Intent(this, SharedPreferencesActivity.class);
        startActivity(intent);
    }

    public void openAlertDialog(View view) {
        Intent intent = new Intent(this, AlertDialogActivity.class);
        startActivity(intent);
    }

    public void openTimerScreen(View view) {
        Intent intent = new Intent(this, TimerActivity.class);
        startActivity(intent);
    }

    public void openRunnable(View view) {
        Intent intent = new Intent(getApplicationContext(), RunnableActivity.class);
        startActivity(intent);
    }

    public void openListview(View view) {
        Intent intent = new Intent(getApplicationContext(), ListviewActivity.class);
        startActivity(intent);
    }

}
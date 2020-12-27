package com.dutar.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SharedPreferencesActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);

        editText = findViewById(R.id.editTextTextPersonName);
        textView = findViewById(R.id.textViewName);
        sharedPreferences = this.getSharedPreferences("com.dutar.myapplication", Context.MODE_PRIVATE);

    }

    public void button1_Click(View view) {
        String name = editText.getText().toString();
        if (name.matches("")) {
            Toast toast= Toast.makeText(getApplicationContext(),"isim giriniz",Toast.LENGTH_SHORT);
            toast.show();
        } else {
            sharedPreferences.edit().putString("name", editText.getText().toString()).apply();
        }
    }

    public void button2_Click(View view) {
        String name = sharedPreferences.getString("name", "Düzgün");
        textView.setText("Adınız: " + name);
    }

}
package com.dutar.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        ListView listView = findViewById(R.id.listview);

        List<String> animals = new ArrayList<>();
        animals.add("Aslan");
        animals.add("Fare");
        animals.add("Ceylan");
        animals.add("Yılan");
        animals.add("Ayı");
        animals.add("Kurt");

        ArrayAdapter adapter = new ArrayAdapter(ListviewActivity.this,android.R.layout.simple_list_item_1,animals);
        listView.setAdapter(adapter);

    }
}
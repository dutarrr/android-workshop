package com.dutar.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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

        //listview item click event
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast toast = Toast.makeText(getApplicationContext(),"Tıklanan item index: "+position,Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }

}
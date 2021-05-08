package com.allbachelor.list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listView;
        setContentView(R.layout.activity_main);
         listView = findViewById(R.id.listView);
//        ArrayList<String> array = new ArrayList();
//        array.add("ram");
//        array.add("shyam");
        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.listitem, array);
        String[] programming = {"Samsung", "Nokia", "Huawei", "Lava", "Iphone", "Mi", "Lenovo", "Htc"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.listitem, programming);
        listView.setAdapter(arrayAdapter);
    }
}
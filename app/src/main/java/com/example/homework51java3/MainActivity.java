package com.example.homework51java3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Adapter adapter;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycle_view_contacts);
        ArrayList<String> contacts = new ArrayList<>();
        contacts.add("Almaz Melisbekov");
        contacts.add("Nursultan Maatkaziev");
        contacts.add("Kudaibergen Osorov");
        contacts.add("Dastan Kanybek uulu");
        contacts.add("Adil Kudaibergenov");
        contacts.add("Ermek Mambetov");
        contacts.add("Edelweiss Ponomarev");
        contacts.add("Nikita Ivanov");
        adapter = new Adapter(contacts);
        recyclerView.setAdapter(adapter);
    }
}
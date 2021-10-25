package com.example.roomcobangurahsuwijaya;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    private AdapterMakananList adapterMakananList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addNewUserButton = findViewById(R.id.buttonAdd);
        addNewUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(MainActivity.this, InsertActivity.class), 100);
            }
        });
        RecyclerView();
        MakananList();
    }

    private void RecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
        adapterMakananList = new AdapterMakananList(this);
        recyclerView.setAdapter(adapterMakananList);
    }

    private void MakananList() {
        DatabaseJ db = DatabaseJ.getDbInstance(this.getApplicationContext());
        List<Menu> makananList =db.QueryMakananDao().getAllMenu();
        adapterMakananList.setMakananList(makananList);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == 100) {
            MakananList();
        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}
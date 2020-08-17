package com.example.infobeasiswaditmawa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.infobeasiswaditmawa.adapter.ListBeasiswaAdapter;
import com.example.infobeasiswaditmawa.model.Beasiswa;
import com.example.infobeasiswaditmawa.model.BeasiswaData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    private RecyclerView rvBeasiswa;
    private ArrayList<Beasiswa> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBeasiswa = findViewById(R.id.rv_beasiswa);
        rvBeasiswa.setHasFixedSize(true);

        list.addAll(BeasiswaData.getListData());
        showRecyclerList();

    }

    private void showRecyclerList() {
        rvBeasiswa.setLayoutManager(new LinearLayoutManager(this));
        ListBeasiswaAdapter listBeasiswaAdapter = new ListBeasiswaAdapter(list, this);
        rvBeasiswa.setAdapter(listBeasiswaAdapter);

        listBeasiswaAdapter.setOnItemClickCallback(new ListBeasiswaAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Beasiswa data) {
                showSelectedBeasiswa(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        setMode (item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode (int selectedMode){
        switch (selectedMode){
            case R.id.about_action:
            gotoAbout();
            break;
        }
    }

    private void gotoAbout(){
        Intent moveIntent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(moveIntent);
    }

    private void showSelectedBeasiswa(Beasiswa beasiswa) {
        Toast.makeText(this, "Anda memilih " + beasiswa.getNama(), Toast.LENGTH_SHORT).show();
    }
}
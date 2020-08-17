package com.example.infobeasiswaditmawa;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class AboutActivity extends AppCompatActivity {
    ImageView img;

    @Override
    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_activity);

        img = findViewById(R.id.photo_profile);
        Glide.with(this)
                .load(R.drawable.niken)
                .apply(new RequestOptions().override(100,100))
                .into(img);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Tentang Saya");
        }
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.back_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        setMode (item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode (int selectedMode){
        switch (selectedMode){
            case R.id.back_action:
                gotoMain();
                break;
        }
    }

    private void gotoMain(){
        Intent moveIntent = new Intent(AboutActivity.this, MainActivity.class);
        startActivity(moveIntent);
    }
}

package com.example.amst3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

import com.github.clans.fab.FloatingActionMenu;

public class MainActivity extends AppCompatActivity {
    FloatingActionMenu menuaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menuaction = (FloatingActionMenu)findViewById(R.id.grupofab);
        menuaction.setClosedOnTouchOutside(true);
    }
    public void video_show(View view) {
        Intent intent = new Intent(MainActivity.this, video_form.class);
        startActivity(intent);
    }
    public void mapa_show(View view) {
        Intent intent = new Intent(MainActivity.this, mapa_form.class);
        startActivity(intent);
    }
    public void calendar_show(View view) {
        Intent intent = new Intent(MainActivity.this, calendar_form.class);
        startActivity(intent);
    }
    public void graph_show(View view) {
        Intent intent = new Intent(MainActivity.this, graph_form.class);
        startActivity(intent);
    }
}
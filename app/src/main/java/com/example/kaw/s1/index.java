package com.example.kaw.s1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class index extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        Button btnMap = (Button) findViewById(R.id.map);
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(index.this, map.class);
                startActivity(i);
            }
        });
        Button btnFoods = (Button) findViewById(R.id.foods);
        btnFoods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(index.this, foods.class);
                startActivity(i);
            }
        });
        Button btnOther = (Button) findViewById(R.id.other);
        btnOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(index.this, other.class);
                startActivity(i);
            }
        });


    }

}
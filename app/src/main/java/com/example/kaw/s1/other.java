package com.example.kaw.s1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class other extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        Button btnPrayer = (Button) findViewById(R.id.prayer);
        btnPrayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(other.this, prayer.class);
                startActivity(i);
            }
        });
        Button btnHymn = (Button) findViewById(R.id.hymn);
        btnHymn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(other.this, hymn.class);
                startActivity(i);
            }
        });
        Button btnCheer = (Button) findViewById(R.id.cheer);
        btnCheer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(other.this, cheer.class);
                startActivity(i);
            }
        });
    }

    public void onSubmit(View v) {
        // closes the activity and returns to first screen
        this.finish();
    }
}

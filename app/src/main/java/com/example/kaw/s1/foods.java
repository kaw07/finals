package com.example.kaw.s1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ExpandableListView;


import java.util.ArrayList;

public class foods extends ActionBarActivity {

    private ArrayList<String> parentItems = new ArrayList<String>();
    private ArrayList<Object> childItems = new ArrayList<Object>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods);
        ExpandableListView expandableList = (ExpandableListView) findViewById(R.id.list); // you can use (ExpandableListView) findViewById(R.id.list)

        expandableList.setDividerHeight(2);
        expandableList.setGroupIndicator(null);
        expandableList.setClickable(true);

        setGroupParents();
        setChildData();

        MyExpandableAdapter adapter = new MyExpandableAdapter(parentItems, childItems);

        adapter.setInflater((LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE), this);
        expandableList.setAdapter(adapter);
    }

    public void setGroupParents() {
        parentItems.add("Jollibee");
        parentItems.add("McDonald's");
        parentItems.add("KFC");
        parentItems.add("BonChon Chicken");
        parentItems.add("Rice in a Box");
        parentItems.add("Mang Inasal");
        parentItems.add("Tokyo Tokyo");
        parentItems.add("Wendy's");

    }

    public void setChildData() {

        ArrayList<String> child = new ArrayList<String>();
        child.add("Dapitan St. cor. Asturias St.");
        child.add("Dapitan St. cor. Lacson St.");
        childItems.add(child);

        child = new ArrayList<String>();
        child.add("1F UST Carpark");
        child.add("P.Noval St.");
        childItems.add(child);

        child = new ArrayList<String>();
        child.add("1F UST Carpark");
        child.add("Dapitan St.");
        childItems.add(child);

        child = new ArrayList<String>();
        child.add("2F UST Carpark");
        childItems.add(child);

        child = new ArrayList<String>();
        child.add("1F UST Carpark");
        childItems.add(child);

        child = new ArrayList<String>();
        child.add("Dapitan St.");
        childItems.add(child);

        child = new ArrayList<String>();
        child.add("2F UST Carpark");
        childItems.add(child);

        child = new ArrayList<String>();
        child.add("Dapitan St.");
        childItems.add(child);
    }


    public void onSubmit(View v) {
        // closes the activity and returns to first screen
        this.finish();
    }
}

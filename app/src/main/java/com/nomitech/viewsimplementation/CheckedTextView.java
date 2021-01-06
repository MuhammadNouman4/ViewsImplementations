package com.nomitech.viewsimplementation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;


public class CheckedTextView extends AppCompatActivity {
    String value;
    String[] superStarNames = {"John Cena", "Randy Orton", "Triple H", "Roman Reign", "Sheamus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checked_text_view);
// initiate a ListView
        ListView listView = (ListView) findViewById(R.id.listView);
        // set the adapter to fill the data in ListView
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), superStarNames);
        listView.setAdapter(customAdapter);
     }
}
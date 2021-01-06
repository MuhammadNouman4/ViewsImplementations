package com.nomitech.viewsimplementation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

import javax.xml.namespace.QName;

public class SearchViewImplementation extends AppCompatActivity implements SearchView.OnQueryTextListener {
            ListView listView;
            SearchView searchView;
            String[] animalNameList;
            ListViewAdapter adapter;

    ArrayList<AnimalNames> arraylist = new ArrayList<AnimalNames>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view_implementation);
            animalNameList = new String[]{"Lion", "Tiger", "Dog",
                    "Cat", "Tortoise", "Rat", "Elephant", "Fox",
                    "Cow","Donkey","Monkey"};
            listView=(ListView) findViewById(R.id.listview1);


for (int i=0; i<animalNameList.length; i++)
{
    AnimalNames animalNames = new AnimalNames(animalNameList[i]);

    arraylist.add(animalNames);

}
        adapter = new ListViewAdapter(this, arraylist);


        listView.setAdapter(adapter);

        // Locate the EditText in listview_main.xml
        searchView = (SearchView) findViewById(R.id.searchview);
        searchView.setOnQueryTextListener(this);



     }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        String text = newText;
        adapter.filter(text);
        return false;
    }
}
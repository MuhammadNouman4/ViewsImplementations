package com.nomitech.viewsimplementation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

/*
ListView ls;
String[] SkillsBuck={"Nouman","Hammad","Ali","Hamza","Zain","Awais","Babar","Farzand","Nadeem","Arslan","Farhan","Arfan","Moiz","Abdullah","Farhad"};
*/


int[] icons={
         R.drawable.ic_launcher_background,
         R.drawable.ic_launcher_background
        ,R.drawable.ic_launcher_background
        ,R.drawable.ic_launcher_background
        ,R.drawable.ic_launcher_background
        ,R.drawable.ic_launcher_background
        ,R.drawable.ic_launcher_background
        ,R.drawable.ic_launcher_background
};
String[] names={"noum","nou","ali","asa","abc","bfd","sss","ttt"};

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
GridView gridView;

    ls=(ListView) findViewById(R.id.listview);
    ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,SkillsBuck);

    ls.setAdapter(adapter);
*/
    GridView gridView;

 gridView=(GridView) findViewById(R.id.grdview);

gridView.setAdapter(new gridimplement(names,icons,this));
    }
}
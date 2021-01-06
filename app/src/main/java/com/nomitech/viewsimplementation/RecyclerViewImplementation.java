package com.nomitech.viewsimplementation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerViewImplementation extends AppCompatActivity {
RecyclerView recyclerView;

String pnames[],pdesc[],pprice[];

int[] images={R.drawable.java,R.drawable.c_plusplus,R.drawable.python,R.drawable.msoffice,
        R.drawable.msword,R.drawable.mspp,R.drawable.digitalmarketing};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_implementation);

        recyclerView=findViewById(R.id.recyclerview);
        pnames = getResources().getStringArray(R.array.programming_name);
        pdesc = getResources().getStringArray(R.array.programming_Description);
        pprice = getResources().getStringArray(R.array.programming_Price);


        Myadapter myadapter=new Myadapter(this,pnames,pdesc,pprice,images);

            recyclerView.setAdapter(myadapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
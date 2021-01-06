package com.nomitech.viewsimplementation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;

public class ViewStubImplementation extends AppCompatActivity {

    Button btnshow,btnhide;
    ViewStub viewStub;
      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_stub_implementation);

            btnhide=findViewById(R.id.btnhide);
            btnshow=findViewById(R.id.btnshow);
        viewStub=findViewById(R.id.viewstub);

        viewStub.inflate();


        btnhide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             viewStub.setVisibility(View.GONE);
            }
        });

        btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewStub.setVisibility(View.VISIBLE);

            }
        });

    }
}
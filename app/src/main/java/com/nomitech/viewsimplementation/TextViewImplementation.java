package com.nomitech.viewsimplementation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TextViewImplementation extends AppCompatActivity {
TextView textView;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_implementation);
   textView=findViewById(R.id.clickText);
   button=findViewById(R.id.btn);

    }

    public void change(View view) {
        textView.setText("Nouman");
       }
}
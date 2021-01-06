package com.nomitech.viewsimplementation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterViewFlipper;

public class AdapterviewFlipperImple extends AppCompatActivity {
   private AdapterViewFlipper adapterViewFlipper;

   int[] images={R.drawable.ppring,R.drawable.ic_launcher_background,R.drawable.checked};
   String[] names={"Apple","Background","checked"};

      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapterview_flipper_imple);

        adapterViewFlipper= findViewById(R.id.adapterviewflipper);

        avfCustomAdapter customAdapter= new avfCustomAdapter(getApplicationContext(),images,names);
        adapterViewFlipper.setAdapter(customAdapter);

        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);


    }
}
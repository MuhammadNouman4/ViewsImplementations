package com.nomitech.viewsimplementation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewAnimator;

public class ViewANimationImplementation extends AppCompatActivity {
Button btn,btn1;
private ViewAnimator animatorl;
int[] images={R.drawable.ppring, R.drawable.ppring, R.drawable.ic_launcher_background,R.drawable.ppring};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_a_nimation_implementation);

        btn=findViewById(R.id.btn);
        btn1=findViewById(R.id.btn1);
        animatorl=findViewById(R.id.viewAnimation);

        for (int i=0; i < images.length; i++)
        {
            ImageView imageView=new ImageView(getApplicationContext());
            imageView.setImageResource(images[i]);
            animatorl.addView(imageView);
        }

        Animation out=AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);
        Animation in= AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);


        animatorl.setInAnimation(in);
        animatorl.setOutAnimation(out);

        animatorl.setAnimateFirstView(true);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animatorl.showNext();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animatorl.showPrevious();
            }
        });

    }
}
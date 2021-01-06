package com.nomitech.viewsimplementation;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ImageviewImplem extends AppCompatActivity implements View.OnClickListener {
ImageView Appleimage;
Button btncenter,btncenterCrop,btnCenterInside,
        btnFitCenter,btnFitEnd,
        btnFitStart,
        btnFitXY,btnMatrix;


   /* ImageView simpleImageView;
    Button scaleTypeCenter, scaleTypeCenterCrop, scaleTypeCenterInside, scaleTypeFitCenter, scaleTypeFitEnd, scaleTypeFitStart, scaleTypeFitXY, scaleTypeMatrix;
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageview_implem);
        //initiate views
        Appleimage=findViewById(R.id.image);
        Appleimage.setOnClickListener(this);

        btncenter=findViewById(R.id.CENTER);
        btncenter.setOnClickListener(this);

        btncenterCrop=findViewById(R.id.CENTERCROP);
        btncenterCrop.setOnClickListener(this);

        btnCenterInside=findViewById(R.id.CENTERINSIDE);
        btnCenterInside.setOnClickListener(this);

        btnFitCenter=findViewById(R.id.FITCENTER);
        btnFitCenter.setOnClickListener(this);

        btnFitEnd=findViewById(R.id.FITEND);
        btnFitEnd.setOnClickListener(this);

        btnFitStart=findViewById(R.id.FITSTART);
        btnFitStart.setOnClickListener(this);

        btnFitXY=findViewById(R.id.FITXY);
        btnFitXY.setOnClickListener(this);

        btnMatrix=findViewById(R.id.MATRIX);
        btnMatrix.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.CENTER:
                    Appleimage.setScaleType(ImageView.ScaleType.CENTER);
                 Toast.makeText(getApplicationContext(), "Center Apple", Toast.LENGTH_SHORT).show();
                break;

            case R.id.CENTERCROP:
                Appleimage.setScaleType(ImageView.ScaleType.CENTER_CROP);
                Toast.makeText(getApplicationContext(), "CenterCrop Apple", Toast.LENGTH_SHORT).show();
                break;

            case R.id.CENTERINSIDE:
                Appleimage.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                Toast.makeText(getApplicationContext(), "CenterInside Apple", Toast.LENGTH_SHORT).show();
                break;

            case R.id.FITCENTER:
                Appleimage.setScaleType(ImageView.ScaleType.FIT_CENTER);
                Toast.makeText(getApplicationContext(), "FitCenter Apple", Toast.LENGTH_SHORT).show();
                break;

            case R.id.FITEND:
                Appleimage.setScaleType(ImageView.ScaleType.FIT_END);
                Toast.makeText(getApplicationContext(), "FitEnd Apple", Toast.LENGTH_SHORT).show();
                break;

            case R.id.FITSTART:
                Appleimage.setScaleType(ImageView.ScaleType.FIT_START);
                Toast.makeText(getApplicationContext(), "FitStart Apple", Toast.LENGTH_SHORT).show();
                break;

            case R.id.FITXY:
                Appleimage.setScaleType(ImageView.ScaleType.FIT_XY);
                Toast.makeText(getApplicationContext(), "FitXY Apple", Toast.LENGTH_SHORT).show();
                break;

            case R.id.MATRIX:
                Appleimage.setScaleType(ImageView.ScaleType.MATRIX);
                Toast.makeText(getApplicationContext(), "Matrix Apple", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}

/*
        ImageView am,na;










*/








       /* am=(ImageView) findViewById(R.id.Am);
        na=(ImageView) findViewById(R.id.na);


        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ImageviewImplem.this, "Am", Toast.LENGTH_SHORT).show();
            }
        });
        na.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ImageviewImplem.this, "Na", Toast.LENGTH_SHORT).show();
            }
        });*/
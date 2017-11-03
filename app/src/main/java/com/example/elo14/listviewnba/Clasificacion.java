package com.example.elo14.listviewnba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Clasificacion extends AppCompatActivity {
    TextView tvClasificacion;
    TextView tvPlayoffs;
    ImageView imgLiga;
    ImageView imgPlayoffs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clasificacion);

        tvClasificacion=(TextView)findViewById(R.id.tvLiga);
        tvPlayoffs=(TextView)findViewById(R.id.tvPlayoffs);
        imgLiga=(ImageView)findViewById(R.id.imgLiga);
        imgPlayoffs=(ImageView)findViewById(R.id.imgLiga);
    }
}

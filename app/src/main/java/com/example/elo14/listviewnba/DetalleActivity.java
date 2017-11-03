package com.example.elo14.listviewnba;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by elo14 on 01/11/2017.
 */

public class DetalleActivity extends AppCompatActivity {
    ImageView imagenEstadio;
    TextView nombre;
    TextView detalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        imagenEstadio=(ImageView)findViewById(R.id.imgvEstadio);
        nombre=(TextView)findViewById(R.id.tvTitulo);
        detalle=(TextView)findViewById(R.id.tvDetalle);

        Datos obj = (Datos) getIntent().getExtras().getSerializable("objeto");
        nombre.setText(obj.getNombre());
        detalle.setText(obj.getDetalle());
        imagenEstadio.setImageResource(obj.getImagenEstadio());
    }
}

package com.example.elo14.listviewnba;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by elo14 on 01/11/2017.
 */

public class DetalleActivityPabellones extends AppCompatActivity {
    ImageView imagenEstadio;
    TextView nombreEquipo;
    TextView nombrePabellon;
    TextView detallePabellon;
    Datos obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_pabellones);

        imagenEstadio = (ImageView) findViewById(R.id.imgvEstadio);
        nombreEquipo = (TextView) findViewById(R.id.tvEquipo);
        nombrePabellon=(TextView)findViewById(R.id.tvPabellon);
        detallePabellon = (TextView) findViewById(R.id.tvDetalleEquipo);

        obj = (Datos) getIntent().getExtras().getSerializable("objeto");
        nombreEquipo.setText(obj.getNombreEquipo());
        nombrePabellon.setText(obj.getNombreEstadio());
        imagenEstadio.setImageResource(obj.getImagenEstadio());
        detallePabellon.setText(obj.getDetalleEstadio());
    }

    public void paginaweb(View view){
        Intent lp = new Intent(this, PaginaWeb.class);
        lp.putExtra("url", obj.getUrl());
        startActivity(lp);
        overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);
    }
}

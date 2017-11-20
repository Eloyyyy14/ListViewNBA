package com.example.elo14.listviewnba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivityLogos extends AppCompatActivity {
    TextView tvEquipo;
    TextView tvActual;
    TextView tvHistorico;
    TextView tvDetalleEquipo;
    ImageView imgvLogoActual;
    ImageView imgvLogoHistorico;
    Datos obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_logos);

        tvEquipo=(TextView)findViewById(R.id.tvEquipo);
        tvActual=(TextView)findViewById(R.id.tvActual);
        tvHistorico=(TextView)findViewById(R.id.tvHistorico);
        tvDetalleEquipo=(TextView)findViewById(R.id.tvDetalleEquipo);
        imgvLogoActual=(ImageView)findViewById(R.id.imgvLogoActual);
        imgvLogoHistorico=(ImageView)findViewById(R.id.imgvLogoHistorico);

        obj = (Datos) getIntent().getExtras().getSerializable("objeto");
        tvEquipo.setText(obj.getNombreEquipo());
        tvDetalleEquipo.setText(obj.getDetalle());
        imgvLogoActual.setImageResource(obj.getImagenLogo());
        imgvLogoHistorico.setImageResource(obj.getImagenLogo2());
    }
}

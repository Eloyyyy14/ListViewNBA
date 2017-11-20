package com.example.elo14.listviewnba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivityJugadores extends AppCompatActivity {
    TextView tvEquipo;
    TextView tvJugador;
    TextView tvDetalleJugador;
    ImageView imgvJugador;
    Datos obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_jugadores);

        tvEquipo=(TextView)findViewById(R.id.tvEquipo);
        tvJugador=(TextView)findViewById(R.id.tvJugador);
        tvDetalleJugador=(TextView)findViewById(R.id.tvDetalleJugador);
        imgvJugador=(ImageView)findViewById(R.id.imgvJugador);

        obj = (Datos) getIntent().getExtras().getSerializable("objeto");
        tvEquipo.setText(obj.getNombreEquipo());
        tvJugador.setText(obj.getNombreJugador());
        tvDetalleJugador.setText(obj.getDetalleJugador());
        imgvJugador.setImageResource(obj.getImagenJugador());
    }
}

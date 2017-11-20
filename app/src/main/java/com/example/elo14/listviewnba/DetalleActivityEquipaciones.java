package com.example.elo14.listviewnba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivityEquipaciones extends AppCompatActivity {

    TextView tvEquipo;
    TextView tvInfo;
    ImageView imgvEquipacion1;
    ImageView imgvEquipacion2;
    Datos obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_equipaciones);

        tvEquipo=(TextView)findViewById(R.id.tvEquipo);
        tvInfo=(TextView)findViewById(R.id.tvInfo);
        imgvEquipacion1=(ImageView)findViewById(R.id.imgvEquipacion1);
        imgvEquipacion2=(ImageView)findViewById(R.id.imgvEquipacion2);

        obj = (Datos) getIntent().getExtras().getSerializable("objeto");
        tvEquipo.setText(obj.getNombreEquipo());
        imgvEquipacion1.setImageResource(obj.getImagenEquipacionLocal());
        imgvEquipacion2.setImageResource(obj.getImagenEquipacionVisitante());
    }
}

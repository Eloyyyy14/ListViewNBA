package com.example.elo14.listviewnba;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class InicioActivity extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        mp = MediaPlayer.create(this, R.raw.botar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent i;
        switch (item.getItemId()) {
            case R.id.itemJugadores:
                i=new Intent(this, Jugadores.class);
                startActivity(i);
                mp.start();
                break;

            case R.id.itemLogos:
                i=new Intent(this, Logos.class);
                startActivity(i);
                mp.start();
                break;

            case R.id.itemUniformes:
                i=new Intent(this, Uniformes.class);
                startActivity(i);
                mp.start();
                break;

            case R.id.itemPabellones:
                i=new Intent(this, Pabellones.class);
                startActivity(i);
                mp.start();
                break;

            case R.id.itemClasificaciones:
                i=new Intent(this, Clasificacion.class);
                startActivity(i);
                mp.start();
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
        }

        return true;
    }
}

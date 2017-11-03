package com.example.elo14.listviewnba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEquipos;
    ArrayList <Datos> listEquipos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEquipos=(ListView)findViewById(R.id.lvEquipos);
        listEquipos=new ArrayList<Datos>();

        listEquipos.add(new Datos(1, "Atlanta Hawks", "Atlanta Hawks es un equipo de baloncesto de la NBA con sede en la ciudad de Atlanta, Georgia. El equipo fue fundado en 1946", R.mipmap.logohawks, R.mipmap.estadiohawks));
        listEquipos.add(new Datos(2, "Boston Celtics", "Boston Celtics es una franquicia de baloncesto en la NBA con sede en Boston, Massachusetts, Estados Unidos. Fundado en 1946", R.mipmap.logoceltics, R.mipmap.estadioceltics));
        listEquipos.add(new Datos(3, "Brookyn Nets", "Brooklyn Nets es una franquicia de baloncesto de la NBA con sede en Brooklyn. Fundado en 1967", R.mipmap.logonets, R.mipmap.estadionets));
        listEquipos.add(new Datos(4, "Charlotte Hornets", "Los Charlotte Hornets son un equipo profesional de baloncesto estadounidense con sede en Charlotte, Carolina del Norte. Fundado en 1988", R.mipmap.logohornets, R.mipmap.estadiohornets));
        listEquipos.add(new Datos(5, "Chicago Bulls", "Chicago Bulls es un equipo de baloncesto profesional de la NBA con sede en Chicago, Illinois, fundado en 1966. Actualmente juega allí el español Nikola Mirotic", R.mipmap.logobulls, R.mipmap.estadiobulls));
        listEquipos.add(new Datos(6, "Cleveland Cavaliers", "Cleveland Cavaliers es un equipo profesional de baloncesto de la NBA con sede en Cleveland, Ohio, fundado en 1970. Actualmente juega allí el español Jose Manuel Calderón", R.mipmap.logocavaliers, R.mipmap.estadiocavaliers));
        listEquipos.add(new Datos(7, "Dallas Mavericks", "Dallas Mavericks es un equipo profesional de baloncesto de la NBA con base en Dallas, Texas. Fundado en 1980.", R.mipmap.logomavs, R.mipmap.estadiomavs));
        listEquipos.add(new Datos(8, "Denver Nuggets", "Denver Nuggets es un equipo profesional de baloncesto de la NBA con sede en Denver, Estados Unidos. Fundado en 1967. Actualmente juega allí el español Juancho Hernangómez", R.mipmap.logonuggets, R.mipmap.estadionuggets));
        listEquipos.add(new Datos(9, "Detroit Pistons", "Los Detroit Pistons es un equipo profesional de baloncesto de la NBA con sede en Auburn Hills, en el área metropolitana de Detroit, Míchigan. Fundado en 1941", R.mipmap.logopistons, R.mipmap.estadiopistons));
        listEquipos.add(new Datos(10, "Golden State Warriors", "Golden State Warriors es un equipo profesional de baloncesto que juega en la NBA con base en Oakland, California. Actuales campeones de la NBA, fundado en 1946", R.mipmap.logowarriors, R.mipmap.estadiowarriors));
        listEquipos.add(new Datos(11, "Houston Rockets", "Houston Rockets es un equipo profesional de baloncesto estadounidense con sede en Houston, Texas. Fundado en 1967", R.mipmap.logorockets, R.mipmap.estadiorockets));
        listEquipos.add(new Datos(12, "Indiana Pacers", "Indiana Pacers es un equipo de baloncesto profesional de la NBA con sede en Indianápolis, Indiana.Fundado en 1967", R.mipmap.logopacers, R.mipmap.estadiopacers));
        listEquipos.add(new Datos(13, "Los Angeles Clippers", "Los Angeles Clippers es un equipo de baloncesto de la NBA con sede en Los Ángeles, California. Fundado en 1970.", R.mipmap.logoclippers, R.mipmap.estadioclippers));
        listEquipos.add(new Datos(14, "Los Angeles Lakers", "Los Angeles Lakers es un equipo de baloncesto profesional de la NBA con sede en Los Ángeles, California. Fundado en 1946", R.mipmap.logolakers, R.mipmap.estadiolakers));
        listEquipos.add(new Datos(15, "Memphis Grizzlies", "Memphis Grizzlies es un equipo de baloncesto de la NBA con sede en Memphis, Tennessee. Fundado en 1995. Actualmente juega allí el español Marc Gasol", R.mipmap.logogrizzlies, R.mipmap.estadiogrizzlies));
        listEquipos.add(new Datos(16, "Miami Heat", "El Miami Heat es un equipo de baloncesto de la NBA con base en Miami, Florida. Fundado en 1988", R.mipmap.logoheat, R.mipmap.estadioheat));
        listEquipos.add(new Datos(17, "Milwaukee Bucks", "Milwaukee Bucks es un equipo de baloncesto de la NBA con base en Milwaukee, Wisconsin. Fundado en 1968", R.mipmap.logobucks, R.mipmap.estadiobucks));
        listEquipos.add(new Datos(18, "Minnesota Timberwolves", "Minnesota Timberwolves es un equipo de baloncesto que juega en la NBA, y tiene su sede en Minneapolis, perteneciente al estado de Minnesota. Fundado en 1989", R.mipmap.logowolves, R.mipmap.estadiowolves));
        listEquipos.add(new Datos(19, "New Orleans Pelicans", "Los New Orleans Pelicans\u200B son una franquicia profesional de baloncesto estadounidense con sede en Nueva Orleans, Luisiana. Fundado en 2002", R.mipmap.logopelicans, R.mipmap.estadiopelicans));
        listEquipos.add(new Datos(20, "New York Knicks", "Los New York Knickerbockers, más conocidos popularmente como New York Knicks son una franquicia de baloncesto de la NBA con sede en la ciudad de Nueva York. Fundado en 1946. Actualmente juega allí el español Willy Hernangómez", R.mipmap.logoknicks, R.mipmap.estadioknicks));
        listEquipos.add(new Datos(21, "Oklahoma City Thunder", "Oklahoma City Thunder es un equipo profesional de baloncesto de la NBA con sede en Oklahoma City. Fundado en 1967. Actualmente juega allí el español Alex Abrines", R.mipmap.logothunder, R.mipmap.estadiothunder));
        listEquipos.add(new Datos(22, "Orlando Magic", "Orlando Magic es una franquicia de la NBA con sede en Orlando, Florida. Fundado en 1989", R.mipmap.logomagic, R.mipmap.estadiomagic));
        listEquipos.add(new Datos(23, "Philadelphia 76ers", "Philadelphia 76ers\u200B, frecuentemente acortado a Sixers, es un equipo de baloncesto de la NBA con sede en Filadelfia, Pensilvania. Fundado en 1946", R.mipmap.logosixers, R.mipmap.estadiosixers));
        listEquipos.add(new Datos(24, "Phoenix Suns", "Phoenix Suns es un equipo profesional de baloncesto de la NBA con sede en Phoenix, Arizona fundado en 1968", R.mipmap.logosuns, R.mipmap.estadiosuns));
        listEquipos.add(new Datos(25, "Portland Trail Blazers", "Portland Trail Blazers es un equipo de baloncesto de la NBA con base en Portland, Oregón. Fundado en 1970", R.mipmap.logoblazers, R.mipmap.estadioblazers));
        listEquipos.add(new Datos(26, "Sacramento Kings", "Sacramento Kings es un equipo de baloncesto de la NBA con base en Sacramento, California. Fundado en 1923", R.mipmap.logokings, R.mipmap.estadiokings));
        listEquipos.add(new Datos(27, "San Antonio Spurs", "San Antonio Spurs es un equipo de baloncesto de la NBA con base en San Antonio, Texas. Fundado en 1967. Actualmente juega allí el español Pau Gasol", R.mipmap.logospurs, R.mipmap.estadiospurs));
        listEquipos.add(new Datos(28, "Toronto Raptors", "Toronto Raptors es un equipo de baloncesto de la NBA con sede en Toronto, Canadá. Fundado en 1995. Actualmente juega allí el español Serge Ibaka", R.mipmap.logoraptors, R.mipmap.estadioraptors));
        listEquipos.add(new Datos(29, "Utah Jazz", "Utah Jazz es un equipo de la NBA de la ciudad de Salt Lake City, Utah. Fundado en 1974. Actualmente juega allí el español Ricky Rubio", R.mipmap.logojazz, R.mipmap.estadiojazz));
        listEquipos.add(new Datos(30, "Washington Wizards", "Washington Wizards es un equipo profesional de baloncesto de la NBA con sede en la capital de Estados Unidos, Washington D. C. Fundado en 1961", R.mipmap.logowizards, R.mipmap.estadiowizards));


        Adaptador miAdaptador=new Adaptador(getApplicationContext(), listEquipos);

        lvEquipos.setAdapter(miAdaptador);


        lvEquipos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Datos obj = (Datos) adapterView.getItemAtPosition(i);

                Intent paso = new Intent(getApplicationContext(), DetalleActivity.class);
                paso.putExtra("objeto", (Serializable)obj);
                startActivity(paso);
            }
        });


    }

}



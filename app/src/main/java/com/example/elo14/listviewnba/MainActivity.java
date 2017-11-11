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

        listEquipos.add(new Datos(1, "Atlanta Hawks", "Atlanta Hawks es un equipo de baloncesto de la NBA con sede en la ciudad de Atlanta, Georgia. El equipo fue fundado en 1946", R.mipmap.logohawks, R.mipmap.estadiohawks, "https://es.wikipedia.org/wiki/Atlanta_Hawks"));
        listEquipos.add(new Datos(2, "Boston Celtics", "Boston Celtics es una franquicia de baloncesto en la NBA con sede en Boston, Massachusetts, Estados Unidos. Fundado en 1946", R.mipmap.logoceltics, R.mipmap.estadioceltics, "https://es.wikipedia.org/wiki/Boston_Celtics"));
        listEquipos.add(new Datos(3, "Brookyn Nets", "Brooklyn Nets es una franquicia de baloncesto de la NBA con sede en Brooklyn. Fundado en 1967", R.mipmap.logonets, R.mipmap.estadionets, "https://es.wikipedia.org/wiki/Brooklyn_Nets"));
        listEquipos.add(new Datos(4, "Charlotte Hornets", "Los Charlotte Hornets son un equipo profesional de baloncesto estadounidense con sede en Charlotte, Carolina del Norte. Fundado en 1988", R.mipmap.logohornets, R.mipmap.estadiohornets, "https://es.wikipedia.org/wiki/Charlotte_Hornets"));
        listEquipos.add(new Datos(5, "Chicago Bulls", "Chicago Bulls es un equipo de baloncesto profesional de la NBA con sede en Chicago, Illinois, fundado en 1966. Actualmente juega allí el español Nikola Mirotic", R.mipmap.logobulls, R.mipmap.estadiobulls, "https://es.wikipedia.org/wiki/Chicago_Bulls"));
        listEquipos.add(new Datos(6, "Cleveland Cavaliers", "Cleveland Cavaliers es un equipo profesional de baloncesto de la NBA con sede en Cleveland, Ohio, fundado en 1970. Actualmente juega allí el español Jose Manuel Calderón", R.mipmap.logocavaliers, R.mipmap.estadiocavaliers, "https://es.wikipedia.org/wiki/Cleveland_Cavaliers"));
        listEquipos.add(new Datos(7, "Dallas Mavericks", "Dallas Mavericks es un equipo profesional de baloncesto de la NBA con base en Dallas, Texas. Fundado en 1980.", R.mipmap.logomavs, R.mipmap.estadiomavs, "https://es.wikipedia.org/wiki/Dallas_Mavericks"));
        listEquipos.add(new Datos(8, "Denver Nuggets", "Denver Nuggets es un equipo profesional de baloncesto de la NBA con sede en Denver, Estados Unidos. Fundado en 1967. Actualmente juega allí el español Juancho Hernangómez", R.mipmap.logonuggets, R.mipmap.estadionuggets, "https://es.wikipedia.org/wiki/Denver_Nuggets"));
        listEquipos.add(new Datos(9, "Detroit Pistons", "Los Detroit Pistons es un equipo profesional de baloncesto de la NBA con sede en Auburn Hills, en el área metropolitana de Detroit, Míchigan. Fundado en 1941", R.mipmap.logopistons, R.mipmap.estadiopistons, "https://es.wikipedia.org/wiki/Detroit_Pistons"));
        listEquipos.add(new Datos(10, "Golden State Warriors", "Golden State Warriors es un equipo profesional de baloncesto que juega en la NBA con base en Oakland, California. Actuales campeones de la NBA, fundado en 1946", R.mipmap.logowarriors, R.mipmap.estadiowarriors, "https://es.wikipedia.org/wiki/Golden_State_Warriors"));
        listEquipos.add(new Datos(11, "Houston Rockets", "Houston Rockets es un equipo profesional de baloncesto estadounidense con sede en Houston, Texas. Fundado en 1967", R.mipmap.logorockets, R.mipmap.estadiorockets, "https://es.wikipedia.org/wiki/Houston_Rockets"));
        listEquipos.add(new Datos(12, "Indiana Pacers", "Indiana Pacers es un equipo de baloncesto profesional de la NBA con sede en Indianápolis, Indiana.Fundado en 1967", R.mipmap.logopacers, R.mipmap.estadiopacers, "https://es.wikipedia.org/wiki/Indiana_Pacers"));
        listEquipos.add(new Datos(13, "Los Angeles Clippers", "Los Angeles Clippers es un equipo de baloncesto de la NBA con sede en Los Ángeles, California. Fundado en 1970.", R.mipmap.logoclippers, R.mipmap.estadioclippers, "https://es.wikipedia.org/wiki/Los_Angeles_Clippers"));
        listEquipos.add(new Datos(14, "Los Angeles Lakers", "Los Angeles Lakers es un equipo de baloncesto profesional de la NBA con sede en Los Ángeles, California. Fundado en 1946", R.mipmap.logolakers, R.mipmap.estadiolakers, "https://es.wikipedia.org/wiki/Los_Angeles_Lakers"));
        listEquipos.add(new Datos(15, "Memphis Grizzlies", "Memphis Grizzlies es un equipo de baloncesto de la NBA con sede en Memphis, Tennessee. Fundado en 1995. Actualmente juega allí el español Marc Gasol", R.mipmap.logogrizzlies, R.mipmap.estadiogrizzlies, "https://es.wikipedia.org/wiki/Memphis_Grizzlies"));
        listEquipos.add(new Datos(16, "Miami Heat", "El Miami Heat es un equipo de baloncesto de la NBA con base en Miami, Florida. Fundado en 1988", R.mipmap.logoheat, R.mipmap.estadioheat, "https://es.wikipedia.org/wiki/Miami_Heat"));
        listEquipos.add(new Datos(17, "Milwaukee Bucks", "Milwaukee Bucks es un equipo de baloncesto de la NBA con base en Milwaukee, Wisconsin. Fundado en 1968", R.mipmap.logobucks, R.mipmap.estadiobucks, "https://es.wikipedia.org/wiki/Milwaukee_Bucks"));
        listEquipos.add(new Datos(18, "Minnesota Timberwolves", "Minnesota Timberwolves es un equipo de baloncesto que juega en la NBA, y tiene su sede en Minneapolis, perteneciente al estado de Minnesota. Fundado en 1989", R.mipmap.logowolves, R.mipmap.estadiowolves, "https://es.wikipedia.org/wiki/Minnesota_Timberwolves"));
        listEquipos.add(new Datos(19, "New Orleans Pelicans", "Los New Orleans Pelicans\u200B son una franquicia profesional de baloncesto estadounidense con sede en Nueva Orleans, Luisiana. Fundado en 2002", R.mipmap.logopelicans, R.mipmap.estadiopelicans, "https://es.wikipedia.org/wiki/New_Orleans_Pelicans"));
        listEquipos.add(new Datos(20, "New York Knicks", "Los New York Knicks son una franquicia de baloncesto de la NBA con sede en la ciudad de Nueva York. Fundado en 1946. Actualmente juega allí el español Willy Hernangómez", R.mipmap.logoknicks, R.mipmap.estadioknicks, "https://es.wikipedia.org/wiki/New_York_Knicks"));
        listEquipos.add(new Datos(21, "Oklahoma City Thunder", "Oklahoma City Thunder es un equipo profesional de baloncesto de la NBA con sede en Oklahoma City. Fundado en 1967. Actualmente juega allí el español Alex Abrines", R.mipmap.logothunder, R.mipmap.estadiothunder, "https://es.wikipedia.org/wiki/Oklahoma_City_Thunder"));
        listEquipos.add(new Datos(22, "Orlando Magic", "Orlando Magic es una franquicia de la NBA con sede en Orlando, Florida. Fundado en 1989", R.mipmap.logomagic, R.mipmap.estadiomagic, "https://es.wikipedia.org/wiki/Orlando_Magic"));
        listEquipos.add(new Datos(23, "Philadelphia 76ers", "Philadelphia 76ers\u200B, frecuentemente acortado a Sixers, es un equipo de baloncesto de la NBA con sede en Filadelfia, Pensilvania. Fundado en 1946", R.mipmap.logosixers, R.mipmap.estadiosixers, "https://es.wikipedia.org/wiki/Philadelphia_76ers"));
        listEquipos.add(new Datos(24, "Phoenix Suns", "Phoenix Suns es un equipo profesional de baloncesto de la NBA con sede en Phoenix, Arizona fundado en 1968", R.mipmap.logosuns, R.mipmap.estadiosuns, "https://es.wikipedia.org/wiki/Phoenix_Suns"));
        listEquipos.add(new Datos(25, "Portland Trail Blazers", "Portland Trail Blazers es un equipo de baloncesto de la NBA con base en Portland, Oregón. Fundado en 1970", R.mipmap.logoblazers, R.mipmap.estadioblazers, "https://es.wikipedia.org/wiki/Portland_Trail_Blazers"));
        listEquipos.add(new Datos(26, "Sacramento Kings", "Sacramento Kings es un equipo de baloncesto de la NBA con base en Sacramento, California. Fundado en 1923", R.mipmap.logokings, R.mipmap.estadiokings, "https://es.wikipedia.org/wiki/Sacramento_Kings"));
        listEquipos.add(new Datos(27, "San Antonio Spurs", "San Antonio Spurs es un equipo de baloncesto de la NBA con base en San Antonio, Texas. Fundado en 1967. Actualmente juega allí el español Pau Gasol", R.mipmap.logospurs, R.mipmap.estadiospurs, "https://es.wikipedia.org/wiki/San_Antonio_Spurs"));
        listEquipos.add(new Datos(28, "Toronto Raptors", "Toronto Raptors es un equipo de baloncesto de la NBA con sede en Toronto, Canadá. Fundado en 1995. Actualmente juega allí el español Serge Ibaka", R.mipmap.logoraptors, R.mipmap.estadioraptors, "https://es.wikipedia.org/wiki/Toronto_Raptors"));
        listEquipos.add(new Datos(29, "Utah Jazz", "Utah Jazz es un equipo de la NBA de la ciudad de Salt Lake City, Utah. Fundado en 1974. Actualmente juega allí el español Ricky Rubio", R.mipmap.logojazz, R.mipmap.estadiojazz, "https://es.wikipedia.org/wiki/Utah_Jazz"));
        listEquipos.add(new Datos(30, "Washington Wizards", "Washington Wizards es un equipo profesional de baloncesto de la NBA con sede en la capital de Estados Unidos, Washington D. C. Fundado en 1961", R.mipmap.logowizards, R.mipmap.estadiowizards, "https://es.wikipedia.org/wiki/Washington_Wizards"));


        Adaptador miAdaptador=new Adaptador(getApplicationContext(), listEquipos);

        lvEquipos.setAdapter(miAdaptador);


        lvEquipos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Datos obj = (Datos) adapterView.getItemAtPosition(i);

                Intent paso = new Intent(getApplicationContext(), DetalleActivity.class);
                paso.putExtra("objeto", (Serializable)obj);
                startActivity(paso);
                overridePendingTransition(R.anim.vertical_in, R.anim.vertical_out);
            }
        });


    }

    public void clasificaciones(View v){
        startActivity(new Intent(this, Clasificacion.class));
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

}



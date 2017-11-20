package com.example.elo14.listviewnba;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class Jugadores extends AppCompatActivity {

    ListView lvEquipos;
    ArrayList<Datos> listEquipos;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugadores);

        lvEquipos=(ListView)findViewById(R.id.lvEquipos);
        listEquipos=new ArrayList<Datos>();


        listEquipos.add(new Datos(1, "Atlanta Hawks", "Atlanta Hawks es un equipo de baloncesto de la NBA con sede en la ciudad de Atlanta, Georgia. El equipo fue fundado en 1946", R.mipmap.logohawks, R.mipmap.estadiohawks, "Philips Arena", "El Philips Arena es un pabellón deportivo localizado en Atlanta, Georgia. Completado en 1999 con un coste de 213.5 millones de dólares. Caben 20.300 espectadores para los partidos de baloncesto", "https://es.wikipedia.org/wiki/Atlanta_Hawks", R.mipmap.uniformehawks1, R.mipmap.uniformehawks2, R.mipmap.logohawks3, R.mipmap.jugadorhawks, "Dominique Wilkins", "Jacques Dominique Wilkins (nacido el 12 de enero de 1960 en París, Francia), es un exjugador estadounidense de baloncesto profesional de la NBA. Jugó en Atlanta Hawks entre 1982-1994. Títulos: 2 veces Campeón del Concurso de Mates de la NBA (1985 y 1990), Basketball Hall of Fame (2006) y máximo anotador de la historia de los Atlanta Hawks"));
        listEquipos.add(new Datos(2, "Boston Celtics", "Boston Celtics es una franquicia de baloncesto en la NBA con sede en Boston, Massachusetts, Estados Unidos. Fundado en 1946", R.mipmap.logoceltics, R.mipmap.estadioceltics, "TD Garden", "El TD Garden es un pabellón deportivo localizado en el barrio North End de Boston, Massachusetts. Casa de los Celtics desde el 1995, con capacidad para 18.624 espectadores y un coste de $160 millones USD","https://es.wikipedia.org/wiki/Boston_Celtics", R.mipmap.uniformeceltics1, R.mipmap.uniformeceltics2, R.mipmap.logoceltics2, R.mipmap.jugadorceltics, "Larry Bird", "Larry Joe Bird (West Baden, Indiana, 7 de diciembre de 1956) es un exjugador de baloncesto estadounidense que disputó 13 temporadas en la NBA, todas ellas con los Boston Celtics (1979-1992) y una de las más grandes figuras del baloncesto mundial. Títulos: 3 campeonatos de la NBA (1981, 1984, 1986), 3 MVP de la Temporada (1984–1986), 12 veces All-Star (1980–1988, 1990–1992) y Medalla de Oro en los JJ.OO. de Barcelona 92"));
        listEquipos.add(new Datos(3, "Brookyn Nets", "Brooklyn Nets es una franquicia de baloncesto de la NBA con sede en Brooklyn. Fundado en 1967", R.mipmap.logonets, R.mipmap.estadionets, "Barclays Center", "El Barclays Center es un pabellón deportivo multiusos ubicado en el barrio de Prospect Heights, Brooklyn, en Nueva York (Estado de Nueva York, Estados Unidos), inaugurado el 21 de septiembre de 2012. Con capacidad para 17.732 espectadores", "https://es.wikipedia.org/wiki/Brooklyn_Nets", R.mipmap.uniformenets1, R.mipmap.uniformenets2, R.mipmap.logonets2, R.mipmap.jugadornets, "Jason Kidd", "Jason Frederick Kidd (nacido el 23 de marzo de 1973 en San Francisco, California) es un exjugador profesional y entrenador de baloncesto estadounidense, que disputó 19 temporadas en la NBA. New Jersey Nets (2001-2008). Títulos: Campeón de la NBA (2011), Rookie del Año de la NBA (1995), 5 veces Mejor quinteto de la NBA (1999–2002, 2004), 4 veces Mejor quinteto defensivo de la NBA (1999, 2001–2002, 2006), 10 veces All-Star (1996, 1998, 2000–2004, 2007–2008, 2010)"));
        listEquipos.add(new Datos(4, "Charlotte Hornets", "Los Charlotte Hornets son un equipo profesional de baloncesto estadounidense con sede en Charlotte, Carolina del Norte. Fundado en 1988", R.mipmap.logohornets, R.mipmap.estadiohornets, "Spectrum Center", "El Spectrum Center es un pabellón deportivo localizado en Charlotte, Carolina del Norte. Cuenta con 19.000 localidades y es el pabellón de los Charlotte Hornets de la NBA. Fue inaugurado en octubre de 2005 con un coste de 260 millones de dólares.", "https://es.wikipedia.org/wiki/Charlotte_Hornets", R.mipmap.uniformehornets1, R.mipmap.uniformehornets2, R.mipmap.logohornets2, R.mipmap.jugadorhornets, "Glen Rice", "Glen Anthony Rice (Flint, Míchigan, 28 de mayo de 1967) es un antiguo baloncestista estadounidense de la NBA. Rice era un alero cuya principal característica radicaba en su lanzamiento exterior de tres puntos, jugó en Charlotte Hornets (1995-1998). Títulos: 23,5 puntos por partido en 240 partidos."));
        listEquipos.add(new Datos(5, "Chicago Bulls", "Chicago Bulls es un equipo de baloncesto profesional de la NBA con sede en Chicago, Illinois, fundado en 1966. Actualmente juega allí el español Nikola Mirotic", R.mipmap.logobulls, R.mipmap.estadiobulls, "United Center","El United Center es un pabellón multideportivo situado en el área de Chicago, Illinois. Cuenta con 21.711 localidades e inaugurado en 1994", "https://es.wikipedia.org/wiki/Chicago_Bulls", R.mipmap.uniformebulls1, R.mipmap.uniformebulls2, R.mipmap.logobulls2, R.mipmap.jugadorbulls, "Michael Jordan", "Michael Jeffrey Jordan (Brooklyn, Nueva York, 17 de febrero de 1963), más conocido como Michael Jordan, es un exjugador de baloncesto estadounidense. En la actualidad es propietario del equipo de la NBA los Charlotte Hornets. Considerado por la mayoría de aficionados y especialistas como el mejor jugador de baloncesto de todos los tiempos. Jugó en los Chicago Bulls entre 1984-1993 y 1995-1998. Títulos: Rookie del Año de la NBA (1985), Mejor Defensor de la NBA (1988), 6 veces Campeón de la NBA (1991, 1992, 1993, 1996, 1997 y 1998), 5 MVP de la Temporada (1988, 1991, 1992, 1996 y 1998), 14 veces All-Star de la NBA (1985-1993, 1996-1998, 2002-2003), Máximo anotador de la historia de los Chicago Bulls y Miembro del Basketball Hall of Fame desde 2009"));
        listEquipos.add(new Datos(6, "Cleveland Cavaliers", "Cleveland Cavaliers es un equipo profesional de baloncesto de la NBA con sede en Cleveland, Ohio, fundado en 1970. Actualmente juega allí el español Jose Manuel Calderón", R.mipmap.logocavaliers, R.mipmap.estadiocavaliers,"Quicken Loans Arena","Quicken Loans Arena, conocido popularmente como \"The Q\", es un pabellón multiusos situado en el centro de la ciudad de Cleveland, en Ohio (Estados Unidos). Capacidad para 20.562 espectadores, inaugurado en 1994 y un coste de $100 millones USD.", "https://es.wikipedia.org/wiki/Cleveland_Cavaliers", R.mipmap.uniformecavs1, R.mipmap.uniformecavs2, R.mipmap.logocavs2, R.mipmap.jugadorcavs, "Lebron James", "LeBron Raymone James (Akron, Ohio, 30 de diciembre de 1984) es un jugador de baloncesto estadounidense que actualmente pertenece a la plantilla de los Cleveland Cavaliers de la NBA, Con 2,03 metros de estatura, su posición es la de alero, pero su talento, versatilidad y un poderoso físico le permite jugar tanto de base como de ala-pívot. Cleveland Cavaliers (2003-2010 y 2014-presente). Títulos: Rookie del año de la NBA (2004), 3 veces Campeón de la NBA (2012, 2013 y 2016), 4 veces MVP de la NBA (2009-2010-2012-2013), Líder Anotador de la NBA (2008), 13 veces All-Star de la NBA (2005-2017), Máximo anotador de todos los tiempos de Cleveland Cavaliers"));
        listEquipos.add(new Datos(7, "Dallas Mavericks", "Dallas Mavericks es un equipo profesional de baloncesto de la NBA con base en Dallas, Texas. Fundado en 1980.", R.mipmap.logomavs, R.mipmap.estadiomavs,"American Airlines Center","El American Airlines Center (literalmente en español Centro de American Airlines) es un pabellón localizado en el barrio de Parque Victoria cercano al centro de Dallas, Texas. Hogar de los Mavericks desde el 2001, con 19.200 espectadores y un coste de $420 millones USD", "https://es.wikipedia.org/wiki/Dallas_Mavericks", R.mipmap.uniformemavs1, R.mipmap.uniformemavs2, R.mipmap.logomavs2, R.mipmap.jugadormavs, "Dirk Nowitzki", "Dirk Werner Nowitzki (Wurzburgo, Alemania Occidental, 19 de junio de 1978) es un jugador alemán de baloncesto que juega en Dallas Mavericks de la NBA. Dallas Mavericks (1998-presente). Títulos: Campeón de la NBA (2011), 13 veces All-Star de la NBA (2002-2012, 2014-2015), MVP de la Temporada de la NBA (2007), Máximo anotador de la historia de los Dallas Mavericks"));
        listEquipos.add(new Datos(8, "Denver Nuggets", "Denver Nuggets es un equipo profesional de baloncesto de la NBA con sede en Denver, Estados Unidos. Fundado en 1967. Actualmente juega allí el español Juancho Hernangómez", R.mipmap.logonuggets, R.mipmap.estadionuggets,"Pepsi Center","El Pepsi Center (también conocido como The Can) es un pabellón multideportivo situado en Denver, Colorado, para 19.309 espectadores, inaugurado en 1999 y con un coste de $160 millones USD", "https://es.wikipedia.org/wiki/Denver_Nuggets", R.mipmap.uniformenuggets1, R.mipmap.uniformenuggets2, R.mipmap.logonuggets2, R.mipmap.jugadornuggets, "Alex English", "Alexander \"Alex\" English (nacido el 5 de enero de 1954 en Columbia, Carolina del Sur) es un exjugador de baloncesto estadounidense que disputó 15 temporadas en la NBA, en los Nuggets desde 1980 a 1990. Títulos: Máximo anotador de la NBA (1983), Miembro del Basketball Hall of Fame (1997) y Máximo anotador de la historia de los Denver Nuggets"));
        listEquipos.add(new Datos(9, "Detroit Pistons", "Los Detroit Pistons es un equipo profesional de baloncesto de la NBA con sede en Auburn Hills, en el área metropolitana de Detroit, Míchigan. Fundado en 1941", R.mipmap.logopistons, R.mipmap.estadiopistons,"Little Caesars Arena","El Little Caesars Arena es un pabellón multiusos en construcción ubicado en la ciudad de Detroit, Míchigan, Estados Unidos. Su inauguración estaba prevista para septiembre de 2017, con un coste de 732.600.000 $", "https://es.wikipedia.org/wiki/Detroit_Pistons", R.mipmap.uniformepistons1, R.mipmap.uniformepistons2, R.mipmap.logopistons2, R.mipmap.jugadorpistons, "Isiah Thomas", "Isiah Lord Thomas III (Chicago, Illinois, 30 de abril de 1961) es un exjugador de baloncesto estadounidense. Desarrolló toda su carrera en los Detroit Pistons desde 1981 hasta su retirada en 1994. Títulos: 2 Campeonatos de la NBA (1989 y 1990), 12 veces All-Star y Máximo anotador de la historia de los Detroit Pistons"));
        listEquipos.add(new Datos(10, "Golden State Warriors", "Golden State Warriors es un equipo profesional de baloncesto que juega en la NBA con base en Oakland, California. Actuales campeones de la NBA, fundado en 1946", R.mipmap.logowarriors, R.mipmap.estadiowarriors,"Oracle Arena","El Oracle Arena es un estadio deportivo localizado en Oakland, California, siendo construido en 1966. Con capacidad para 19.596 espectadores y coste de $121 millones USD", "https://es.wikipedia.org/wiki/Golden_State_Warriors", R.mipmap.uniformewarriors1, R.mipmap.uniformewarriors2, R.mipmap.logowarriors2, R.mipmap.jugadorwarriors, "Wilt Chamberlain", "Wilton Norman «Wilt» Chamberlain (Filadelfia, 21 de agosto de 1936-Los Ángeles, 12 de octubre de 1999) fue un jugador estadounidense de baloncesto, jugó en los Warriors (1959-1965). Títulos: 2 veces Campeón de la NBA (1967 y 1972), 4 veces MVP de la NBA (1960, 1966, 1967 y 1968), 13 veces All-Star de la NBA (1960-1969, 1971-1973), Mejor quinteto defensivo de la NBA (1972-1973), 7 veces Máximo anotador de la NBA (1960-1996), Máximo anotador de todos los tiempos de Philadelphia / San Francisco / Golden State Warriors, Máximo reboteador de la historia de la NBA, Miembro del Basketball Hall of Fame"));
        listEquipos.add(new Datos(11, "Houston Rockets", "Houston Rockets es un equipo profesional de baloncesto estadounidense con sede en Houston, Texas. Fundado en 1967", R.mipmap.logorockets, R.mipmap.estadiorockets,"Toyota Center","El Toyota Center es un pabellón deportivo localizado en el centro de la ciudad de Houston, Texas. Inaugurado en 2003 con un coste de $175 millones USD y capacidad para 18.400 espectadores", "https://es.wikipedia.org/wiki/Houston_Rockets", R.mipmap.uniformerockets1, R.mipmap.uniformerockets2, R.mipmap.logorockets2, R.mipmap.jugadorrockets, "Hakeem Olajuwon", "Hakeem Abdul Olajuwon (Lagos, Nigeria, 21 de enero de 1963), es un exjugador de baloncesto estadounidense de origen nigeriano que disputó 18 temporadas en la NBA, 17 de ellas con los Houston Rockets (1984-2001). Títulos: Mejor Defensor de la NBA (1993 y 1994), Campeón de la NBA (1994 y 1995), MVP de la Temporada (1994), 12 veces All-Star, Elegido uno de los 50 mejores jugadores de la historia de la NBA (1996), Miembro del Basketball Hall of Fame (2008), Máximo anotador de la historia de los Houston Rockets"));
        listEquipos.add(new Datos(12, "Indiana Pacers", "Indiana Pacers es un equipo de baloncesto profesional de la NBA con sede en Indianápolis, Indiana.Fundado en 1967", R.mipmap.logopacers, R.mipmap.estadiopacers,"Bankers Life Fieldhouse","El Bankers Life Fieldhouse es un pabellón deportivo situado en Indianápolis, Indiana. Inaugurado en 1999 con un coste de $183 millones USD y capacidad para 18.345 espectadores", "https://es.wikipedia.org/wiki/Indiana_Pacers", R.mipmap.uniformepacers1, R.mipmap.uniformepacers2, R.mipmap.logopacers2, R.mipmap.jugadorpacers, "Reggie Miller", "Reginald Wayne Miller (nacido el 24 de agosto de 1965 en Riverside, California), es un ex-jugador de baloncesto estadounidense que desarrolló toda su carrera profesional en Indiana Pacers, de la NBA (1987-2005). Títulos: 5 veces All-Star, Medalla de oro olímpica (1996) y 3er Mejor quinteto de la NBA (1995, 1996 y 1998)"));
        listEquipos.add(new Datos(13, "Los Angeles Clippers", "Los Angeles Clippers es un equipo de baloncesto de la NBA con sede en Los Ángeles, California. Fundado en 1970.", R.mipmap.logoclippers, R.mipmap.estadioclippers,"Staples Center","El Staples Center es un recinto multiusos situado en la ciudad de Los Ángeles, en California (Estados Unidos). Es famoso por ser la sede de dos equipos de la NBA Los Angeles Clippers y Los Angeles Lakers, y por ser la sede de la ceremonia anual de entrega de los Premios Grammy. Inaugurado en 1999 con un coste de $375 millones USD y para 18.997 espectadores", "https://es.wikipedia.org/wiki/Los_Angeles_Clippers", R.mipmap.uniformeclippers1, R.mipmap.uniformeclippers2, R.mipmap.logoclippers2, R.mipmap.jugadorclippers, "Bob Mcadoo","Robert Allen 'Bob' McAdoo (Greensboro, Carolina del Norte, 25 de septiembre de 1951) es un exjugador de baloncesto estadounidense. Buffalo Braves (1972-1976). Títulos: MVP de la NBA en 1975, Rookie del Año de la NBA (1973), 2 veces Campeón de la NBA (1982 y 1985) y Miembro del Basketball Hall of Fame (2000)"));
        listEquipos.add(new Datos(14, "Los Angeles Lakers", "Los Angeles Lakers es un equipo de baloncesto profesional de la NBA con sede en Los Ángeles, California. Fundado en 1946", R.mipmap.logolakers, R.mipmap.estadiolakers,"Staples Center","El Staples Center es un recinto multiusos situado en la ciudad de Los Ángeles, en California (Estados Unidos). Es famoso por ser la sede de dos equipos de la NBA Los Angeles Clippers y Los Angeles Lakers, y por ser la sede de la ceremonia anual de entrega de los Premios Grammy. Inaugurado en 1999 con un coste de $375 millones USD y para 18.997 espectadores", "https://es.wikipedia.org/wiki/Los_Angeles_Lakers", R.mipmap.uniformelakers1, R.mipmap.uniformelakers2, R.mipmap.logolakers2, R.mipmap.jugadorlakers,"Kareem Abdul-Jabbar", "Kareem Abdul-Jabbar, en idioma árabe كريم عبدالجبار (nacido con el nombre de Ferdinand Lewis Alcindor, Jr., Harlem, Nueva York, 16 de abril de 1947) es un exbaloncestista estadounidense. Los Angeles Lakers (1975-1989). Títulos: 6 veces Campeón de la NBA, 6 MVP de la Temporada, Rookie del Año de la NBA (1970) y 10 veces Mejor Quinteto de la NBA"));
        listEquipos.add(new Datos(15, "Memphis Grizzlies", "Memphis Grizzlies es un equipo de baloncesto de la NBA con sede en Memphis, Tennessee. Fundado en 1995. Actualmente juega allí el español Marc Gasol", R.mipmap.logogrizzlies, R.mipmap.estadiogrizzlies,"FedExForum","El FedExForum se encuentra situado en la parte sur de la ciudad de Memphis, Tennessee, en los Estados Unidos. Inaugurado en 2004 con un coste de $250 millones USD y 18.165 espectadores", "https://es.wikipedia.org/wiki/Memphis_Grizzlies", R.mipmap.uniformegrizzlies1, R.mipmap.uniformegrizzlies2, R.mipmap.logogrizzlies2, R.mipmap.jugadorgrizzlies, "Shareef Abdur-Rahim", "Julius Shareef Abdur-Rahim (Marietta, Georgia, 11 de diciembre de 1976) es un exbaloncestista estadounidense que jugó durante once temporadas en la NBA. Vancouver Grizzlies (1996-2001). Títulos: Mejor quinteto de rookies de la NBA (1997), Campeón Olímpico en Sídney 2000 y All-Star (2002)"));
        listEquipos.add(new Datos(16, "Miami Heat", "El Miami Heat es un equipo de baloncesto de la NBA con base en Miami, Florida. Fundado en 1988", R.mipmap.logoheat, R.mipmap.estadioheat,"AmericanAirlines Arena","El AmericanAirlines Arena es un pabellón deportivo localizado en el centro de Miami, Florida. Inaugurado en 1999 con un coste de $175 millones USD y para 19.600 espectadores", "https://es.wikipedia.org/wiki/Miami_Heat", R.mipmap.uniformeheat1, R.mipmap.uniformeheat2, R.mipmap.logoheat2, R.mipmap.jugadorheat, "LeBron James y Dwyane Wade", "LeBron Raymone James (Akron, Ohio, 30 de diciembre de 1984) y Dwyane Tyrone Wade, Jr. (Chicago, Illinois, 17 de enero de 1982) formaron una de las mejores duplas de la historia de la NBA, conduciendo a Miami Heat a 3 campeonatos. Leyendas en Miami. Títulos juntos: 3 veces Campeones de la NBA (2006, 2012 y 2013), Wade además cuenta con 12 veces All-Star (2005-2016), 2 veces Mejor quinteto de la NBA (2009 y 2010) y Máximo anotador de todos los tiempos de Miami Heat"));
        listEquipos.add(new Datos(17, "Milwaukee Bucks", "Milwaukee Bucks es un equipo de baloncesto de la NBA con base en Milwaukee, Wisconsin. Fundado en 1968", R.mipmap.logobucks, R.mipmap.estadiobucks,"BMO Harris Bradley Center","El BMO Harris Bradley Center, es un pabellón multiusos que se encuentra en la localidad estadounidense de Milwaukee, en el estado de Wisconsin. Inauguración 1988 con coste $90 millones USD y capacidad para 18.717 espectadores", "https://es.wikipedia.org/wiki/Milwaukee_Bucks", R.mipmap.uniformebucks1, R.mipmap.uniformebucks2, R.mipmap.logobucks2, R.mipmap.jugadorbucks, "Kareem Abdul-Jabbar", "Kareem Abdul-Jabbar, en idioma árabe كريم عبدالجبار (nacido con el nombre de Ferdinand Lewis Alcindor, Jr., Harlem, Nueva York, 16 de abril de 1947) es un exbaloncestista estadounidense. Los Angeles Lakers (1975-1989). Títulos: 6 veces Campeón de la NBA, 6 MVP de la Temporada, Rookie del Año de la NBA (1970) y 10 veces Mejor Quinteto de la NBA y Máximo anotador de la historia de los Milwaukee Bucks"));
        listEquipos.add(new Datos(18, "Minnesota Timberwolves", "Minnesota Timberwolves es un equipo de baloncesto que juega en la NBA, y tiene su sede en Minneapolis, perteneciente al estado de Minnesota. Fundado en 1989", R.mipmap.logowolves, R.mipmap.estadiowolves,"Target Center","El Target Center es un estadio deportivo localizado en el centro urbano de Minneapolis, Minnesota. Inauguración en 1990 con coste de $104 millones USD y 20.500 espectadores", "https://es.wikipedia.org/wiki/Minnesota_Timberwolves", R.mipmap.uniformewolves1, R.mipmap.uniformewolves2, R.mipmap.logowolves2, R.mipmap.jugadorwolves, "Kevin Garnett", "Kevin Maurice Garnett (nacido en Greenville, Carolina del Sur, el 19 de mayo de 19761\u200B) es un exjugador de baloncesto estadounidense que disputó 21 temporadas en la NBA. Minnesota Timberwolves (1995-2007, 2015-2016). Títulos: Campeón de la NBA (2008), MVP de la NBA (2004), Medalla de oro olímpica (Sydney 2000), 14 veces All-Star, Máximo anotador de la historia de los Minnesota Timberwolves"));
        listEquipos.add(new Datos(19, "New Orleans Pelicans", "Los New Orleans Pelicans\u200B son una franquicia profesional de baloncesto estadounidense con sede en Nueva Orleans, Luisiana. Fundado en 2002", R.mipmap.logopelicans, R.mipmap.estadiopelicans,"Smoothie King Center","El Smoothie King Center es un pabellón deportivo situado en New Orleans, Luisiana, y está ubicado en el Central Business District, muy cerca del centro de la ciudad. Inauguración en 1999 con un coste de 84.000.000 $ y para 18.000 espectadores", "https://es.wikipedia.org/wiki/New_Orleans_Pelicans", R.mipmap.uniformepelicans1, R.mipmap.uniformepelicans2, R.mipmap.logopelicans2, R.mipmap.jugadorpelicans,"Anthony Davis", "Anthony Marshon Davis, Jr. (Chicago, Illinois, Estados Unidos; 11 de marzo de 1993) es un jugador profesional de baloncesto estadounidense que actualmente milita en los New Orleans Pelicans de la NBA. New Orleans Hornets/Pelicans (2012-presente). Títulos: 2 veces Mejor Quinteto de la NBA (2015, 2017) y 4 veces All-Star de la NBA (2014, 2015, 2016 y 2017)"));
        listEquipos.add(new Datos(20, "New York Knicks", "Los New York Knicks son una franquicia de baloncesto de la NBA con sede en la ciudad de Nueva York. Fundado en 1946. Actualmente juega allí el español Willy Hernangómez", R.mipmap.logoknicks, R.mipmap.estadioknicks,"Madison Square Garden","El Madison Square Garden (abreviado como MSG o Garden) es un pabellón deportivo multiusos situado en el distrito de Manhattan, en Nueva York (Estado de Nueva York, Estados Unidos). Se encuentra en el cruce entre las avenidas Séptima y Octava. Inauguración en 1968 con un coste de 123 millones USD y capacidad para 19.812 perosnas", "https://es.wikipedia.org/wiki/New_York_Knicks", R.mipmap.uniformeknicks1, R.mipmap.uniformeknicks2, R.mipmap.logoknicks2, R.mipmap.jugadorknicks, "Patrick Ewing", "Patrick (Pat) Aloysius Ewing (Kingston, Jamaica, 5 de agosto de 1962) es un exjugador y entrenador de baloncesto estadounidense de origen jamaicano. New York Knicks (1985-2000). Títulos: Rookie del Año de la NBA (1986), Medalla de oro olímpica (1984 y 1992), Mejor Quinteto de la NBA (1990), 11 veces All-Star, Miembro del Basketball Hall of Fame (2008), Máximo anotador histórico de New York Knicks"));
        listEquipos.add(new Datos(21, "Oklahoma City Thunder", "Oklahoma City Thunder es un equipo profesional de baloncesto de la NBA con sede en Oklahoma City. Fundado en 1967. Actualmente juega allí el español Alex Abrines", R.mipmap.logothunder, R.mipmap.estadiothunder,"Chesapeake Energy Arena","El Chesapeake Energy Arena, es un pabellón localizado en el centro de Oklahoma City, Oklahoma. Abrió sus puertas el 8 de junio de 2002 con un coste de $89 millones USD y para 19.599 espectadores", "https://es.wikipedia.org/wiki/Oklahoma_City_Thunder", R.mipmap.uniformethunder1, R.mipmap.uniformethunder2, R.mipmap.logothunder2,R.mipmap.jugadorthunder, "Russell Westbrook", "Russell Westbrook III (Long Beach, California, 12 de noviembre de 1988) es un jugador de baloncesto estadounidense que juega en Oklahoma City Thunder de la NBA (2008-presente). Títulos: MVP de la NBA (2017), 6 veces All-Star Game de la NBA (2011, 2012, 2013, 2015, 2016, 2017) y 2 veces Mejor Quinteto de la NBA (2016, 2017)"));
        listEquipos.add(new Datos(22, "Orlando Magic", "Orlando Magic es una franquicia de la NBA con sede en Orlando, Florida. Fundado en 1989", R.mipmap.logomagic, R.mipmap.estadiomagic,"Amway Center","El Amway Center es un pabellón polideportivo situado en Orlando, Florida. Inaugurado en 2010 con un coste de $480 millones USD y para 18.500 espectadores", "https://es.wikipedia.org/wiki/Orlando_Magic", R.mipmap.uniformemagic1, R.mipmap.uniformemagic2, R.mipmap.logomagic2, R.mipmap.jugadormagic, "Shaquille O'Neal", "Shaquille Rashaun O’Neal (Newark, Nueva Jersey, 6 de marzo de 1972) es un exjugador estadounidense de baloncesto. Es considerado como uno de los jugadores más dominantes de la historia de la NBA. Orlando Magic (1992-1996). Títulos: Rookie del Año de la NBA (1993), MVP de la Temporada (2000), 4 campeonatos de la NBA (2000, 2001, 2002 y 2006), Máximo anotador de la NBA (1995, 2000), 8 veces en el mejor quinteto de la NBA (1998, 2000–2006), 15 veces All-Star (1993–1998, 2000–2007, 2009), Oro olímpico (1996) y Basketball Hall of Fame (2016)"));
        listEquipos.add(new Datos(23, "Philadelphia 76ers", "Philadelphia 76ers\u200B, frecuentemente acortado a Sixers, es un equipo de baloncesto de la NBA con sede en Filadelfia, Pensilvania. Fundado en 1946", R.mipmap.logosixers, R.mipmap.estadiosixers,"Wells Fargo Center","El Wells Fargo Center es un pabellón deportivo situado en Filadelfia, Pensilvania, Estados Unidos. Inaugurado en 1996 con un coste de $210 millones USD y para 21.600 espectadores", "https://es.wikipedia.org/wiki/Philadelphia_76ers", R.mipmap.uniformesixers1, R.mipmap.uniformesixers2, R.mipmap.logosixers2, R.mipmap.jugadorsixers, "Julius Erving", "Julius Winfield Erving II (nacido el 22 de febrero de 1950 en Roosevelt, Nueva York), conocido popularmente como Dr. J, es un exjugador de baloncesto estadounidense. Philadelphia 76ers (1976-1987). Títulos: MVP de la NBA (1981), Elegido uno de los 50 mejores jugadores de la historia de la NBA (1996), Miembro del Basketball Hall of Fame (1993), 11 veces All-Star de la NBA y Campeón de la NBA (1983)"));
        listEquipos.add(new Datos(24, "Phoenix Suns", "Phoenix Suns es un equipo profesional de baloncesto de la NBA con sede en Phoenix, Arizona fundado en 1968", R.mipmap.logosuns, R.mipmap.estadiosuns,"Talking Stick Resort Arena","El Talking Stick Resort Arena es un centro deportivo y lúdico situado en Phoenix, Arizona. Inauguración en 1992 con un coste de $90 millones USD y para 18.422 espectadores", "https://es.wikipedia.org/wiki/Phoenix_Suns", R.mipmap.uniformesuns1, R.mipmap.uniformesuns2, R.mipmap.logosuns2, R.mipmap.jugadorsuns, "Charles Barkley", "Charles Wade Barkley (Leeds, Alabama, 20 de febrero de 1963) es un exjugador de baloncesto estadounidense. Phoenix Suns (1992-1996). Títulos: MVP de la NBA (1993), Mejor quinteto de la NBA (1988, 1991 y 1993), Medalla de oro en los Juegos Olímpicos de Barcelona 1992 y Atlanta 1996), Elegido uno de los 50 mejores jugadores de la historia de la NBA (1996) y Miembro del Basketball Hall of Fame desde el 2006"));
        listEquipos.add(new Datos(25, "Portland Trail Blazers", "Portland Trail Blazers es un equipo de baloncesto de la NBA con base en Portland, Oregón. Fundado en 1970", R.mipmap.logoblazers, R.mipmap.estadioblazers,"Moda Center","El Moda Center,  es un pabellón deportivo situado en Portland, Oregón. Inaugurado en 1995 con un coste de $262 millones USD y para 19.980 espectadores.", "https://es.wikipedia.org/wiki/Portland_Trail_Blazers", R.mipmap.uniformetrailblazers1, R.mipmap.uniformetrailblazers2, R.mipmap.logoblazers2, R.mipmap.jugadortrailblazers, "Clyde Drexler", "Clyde Austin \"The Glide\" Drexler (nacido el 22 de junio de 1962 en New Orleans, Luisiana) es un ex jugador de baloncesto que jugó en la NBA. Portland Trail Blazers (1983-1995). Títulos: Campeón de la NBA (1995), Elegido entre los 50 mejores jugadores de la historia de la NBA (1996), Miembro del Basketball Hall of Fame (2004) y Máximo anotador de la historia de los Portland Trail Blazers"));
        listEquipos.add(new Datos(26, "Sacramento Kings", "Sacramento Kings es un equipo de baloncesto de la NBA con base en Sacramento, California. Fundado en 1923", R.mipmap.logokings, R.mipmap.estadiokings,"Golden 1 Center","El Golden 1 Center es un pabellón multiusos situado en Sacramento, California. Inauguración en 2016 con un coste de \t$507 millones USD y para 17.500 espectadores", "https://es.wikipedia.org/wiki/Sacramento_Kings", R.mipmap.uniformekings1, R.mipmap.uniformekings2, R.mipmap.logokings2, R.mipmap.jugadorkings, "Oscar Robertson", "Oscar Palmer Robertson (n. Charlotte, Tennessee; 24 de noviembre de 1938) es un exjugador de baloncesto estadounidense afroamericano que destacó en la NBA en los años 60. Cincinnati Royals (1960-1970). Títulos: Rookie del año de la NBA (1961), MVP de la NBA (1964), 9 veces elegido en el mejor quinteto de la NBA, Campeón de la NBA (1971), Elegido uno de los 50 mejores jugadores de la historia de la NBA (1996), Miembro del Basketball Hall of Fame (1980), Máximo anotador de la historia de los Cincinnati Royals / Sacramento Kings"));
        listEquipos.add(new Datos(27, "San Antonio Spurs", "San Antonio Spurs es un equipo de baloncesto de la NBA con base en San Antonio, Texas. Fundado en 1967. Actualmente juega allí el español Pau Gasol", R.mipmap.logospurs, R.mipmap.estadiospurs,"AT&T Center","El AT&T Center es un pabellón deportivo situado en la ciudad de San Antonio, Texas, en los Estados Unidos. Se terminó de construir en el año 2002, con un coste de \t$186 millones USD y para 18.797 espectadores", "https://es.wikipedia.org/wiki/San_Antonio_Spurs", R.mipmap.uniformespurs1, R.mipmap.uniformespurs2, R.mipmap.logospurs2, R.mipmap.jugadorspurs, "Tim Duncan", "Timothy Theodore Duncan (Christiansted, Saint Croix, Islas Vírgenes de los Estados Unidos, 25 de abril de 1976), es un exjugador de baloncesto estadounidense. San Antonio Spurs (1997-2016). Títulos: 5 veces Campeón de la NBA (1999, 2003, 2005, 2007 y 2014), 2 veces MVP de la NBA (2002 y 2003), 15 veces All-Star de la NBA (1998, 2000-2011, 2013 y 2015), 10 veces Mejor Quinteto de la NBA (1998-2005, 2007, 2013), 8 veces Mejor quinteto defensivo de la NBA (1999-2003, 2005, 2007-2008), Rookie del Año de la NBA (1998) y Máximo anotador de todos los tiempos de San Antonio Spurs"));
        listEquipos.add(new Datos(28, "Toronto Raptors", "Toronto Raptors es un equipo de baloncesto de la NBA con sede en Toronto, Canadá. Fundado en 1995. Actualmente juega allí el español Serge Ibaka", R.mipmap.logoraptors, R.mipmap.estadioraptors,"Air Canada Centre","El Air Canada Centre, es un pabellón multifuncional situado en Toronto, Ontario. Inaugurado en 1999 con un coste de $265 millones USD y para 19.800 espectadores", "https://es.wikipedia.org/wiki/Toronto_Raptors", R.mipmap.uniformeraptors1, R.mipmap.uniformeraptors2, R.mipmap.logoraptors2, R.mipmap.jugadorraptors, "Vince Carter", "Vincent Lamar Carter (Daytona Beach, Florida, 26 de enero de 1977) es un jugador de baloncesto estadounidense. Toronto Raptors (1999-2004). Títulos: Rookie del Año de la NBA (1999) y 8 veces All-Star (2000-2007)"));
        listEquipos.add(new Datos(29, "Utah Jazz", "Utah Jazz es un equipo de la NBA de la ciudad de Salt Lake City, Utah. Fundado en 1974. Actualmente juega allí el español Ricky Rubio", R.mipmap.logojazz, R.mipmap.estadiojazz,"Vivint Smart Home Arena","El Vivint Smart Home Arena es un pabellón deportivo situado en la ciudad de Salt Lake City, Utah, en los Estados Unidos. Inaugurado en 1991 con un coste de $93 millones USD y para 19.911 espectadores.", "https://es.wikipedia.org/wiki/Utah_Jazz", R.mipmap.uniformejazz1, R.mipmap.uniformejazz2, R.mipmap.logojazz2, R.mipmap.jugadorjazz, "John Stockton y Karl Malone", "John Stockton y Karl Malone son considerados la mejor pareja de la historia de la NBA. Utah Jazz (1984-2003). Ambos consiguieron: Elegidos unos de los 50 mejores jugadores de la historia de la NBA (1996), 2 Medallas de oro en Juegos Olímpicos (1992 y 1996), 13 veces en el mejor quinteto de la NBA, 23 veces All-Star, Miembros del Basketball Hall of Fame y además Karl Malone es el Máximo anotador de la historia de los Utah Jazz"));
        listEquipos.add(new Datos(30, "Washington Wizards", "Washington Wizards es un equipo profesional de baloncesto de la NBA con sede en la capital de Estados Unidos, Washington D. C. Fundado en 1961", R.mipmap.logowizards, R.mipmap.estadiowizards,"Capital One Arena","El Capital One Arena es un pabellón multideportivo y una zona de entretenimiento situado en Washington D. C., Estados Unidos. Inaugurado en 1997 para 20.173 espectadores", "https://es.wikipedia.org/wiki/Washington_Wizards", R.mipmap.uniformewizards1, R.mipmap.uniformewizards2, R.mipmap.logowizards2, R.mipmap.jugadorwizards,"Gilbert Arenas", "Gilbert Jay Arenas Jr. (nacido el 6 de enero de 1982 en Tampa, Florida) es un jugador estadounidense de baloncesto. Washington Wizards (2003- 2010). Títulos: 3 veces All-Star (2005-09)"));

        AdaptadorJugadores miAdaptador=new AdaptadorJugadores(getApplicationContext(), listEquipos);

        lvEquipos.setAdapter(miAdaptador);
        mp = MediaPlayer.create(this, R.raw.botar);

        lvEquipos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Datos obj = (Datos) adapterView.getItemAtPosition(i);

                Intent paso = new Intent(getApplicationContext(), DetalleActivityJugadores.class);
                paso.putExtra("objeto", (Serializable)obj);
                startActivity(paso);
                mp.start();
                overridePendingTransition(R.anim.vertical_in, R.anim.vertical_out);
            }
        });
    }
}

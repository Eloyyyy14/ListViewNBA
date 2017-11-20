package com.example.elo14.listviewnba;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by elo14 on 01/11/2017.
 */

public class AdaptadorEquipaciones extends BaseAdapter {

    Context contexto; //contexto de la aplicacion
    ArrayList<Datos> ListaObjetos; //lista de datos a generar. Podemos usar tb un ArrayList

    public AdaptadorEquipaciones(Context contexto, ArrayList<Datos> listaObjetos) {
        this.contexto = contexto;
        ListaObjetos = listaObjetos;

    }

    @Override
    public int getCount() {
        return ListaObjetos.size(); //Devuelve la cantidad de elementos de la lista
    }

    @Override
    public Object getItem(int i) { //Devuelve el objeto de la lista en la posición indicada como parametro
        return ListaObjetos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return ListaObjetos.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) { //Es el método que se ejecuta cuando se muestra en mi ListView cada item
        View vista=view;
        LayoutInflater inflate = LayoutInflater.from(contexto); //Obtenemos el contexto del item sobre el cual estamos trabajando del ListView
        vista=inflate.inflate(R.layout.itemlistview_equipaciones, null); //Consigo referenciar a la vista en sí

        ImageView imgvEquipo=(ImageView)vista.findViewById(R.id.imgvEquipo);
        TextView tvTitulo=(TextView)vista.findViewById(R.id.tvEquipo);


        tvTitulo.setText(ListaObjetos.get(i).getNombreEquipo());
        imgvEquipo.setImageResource(ListaObjetos.get(i).getImagenLogo());

        return vista;

    }

}

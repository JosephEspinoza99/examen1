package com.example.semana5.Adaptadores;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.semana5.Modelos.Revistas;
import com.example.semana5.R;

import java.util.ArrayList;

public class AdaptadorRevistas extends ArrayAdapter<Revistas> {
    public AdaptadorRevistas(Context context, ArrayList<Revistas> datos) {
        super(context, R.layout.lista_libros, datos);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.lista_libros, null);
        TextView lbltitulo = (TextView)item.findViewById(R.id.categoria);lbltitulo.setText(getItem(position).getCategory());
        TextView lblfecha = (TextView)item.findViewById(R.id.categoria2);lblfecha.setText(getItem(position).getTitle());
        TextView lblprecio = (TextView)item.findViewById(R.id.precio);lblprecio.setText(getItem(position).getPrice());
        TextView lbldescripcion = (TextView)item.findViewById(R.id.Descripcion);lbldescripcion.setText(getItem(position).getDescription());
        ImageView imageView = (ImageView)item.findViewById(R.id.image);
        Glide.with(this.getContext())
                .load(getItem(position).getImage())
                .into(imageView);
        return(item);
    }
}

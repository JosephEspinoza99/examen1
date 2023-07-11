package com.example.semana5.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.semana5.Modelos.Libros;
import com.example.semana5.R;

import java.util.ArrayList;

public class AdaptadorLibros extends ArrayAdapter<Libros> {
    public AdaptadorLibros(Context context, ArrayList<Libros> informacion){
        super(context, R.layout.lista_revistas, informacion);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.lista_revistas, null);
        TextView lbltitulo = (TextView)item.findViewById(R.id.categoria2);lbltitulo.setText(getItem(position).getTitle());
        TextView lblfecha = (TextView)item.findViewById(R.id.titulo2);lblfecha.setText(getItem(position).getCategory());
        TextView lblprecio = (TextView)item.findViewById(R.id.pagar2);lblprecio.setText(getItem(position).getPrice());
        ImageView imageView = (ImageView)item.findViewById(R.id.image);
        Glide.with(this.getContext())
                .load(getItem(position).getImage())
                .into(imageView);
        return(item);
    }

}

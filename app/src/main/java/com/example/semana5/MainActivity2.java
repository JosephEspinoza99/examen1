package com.example.semana5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity2 extends AppCompatActivity {
    ListView Lstlibros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle  = this.getIntent().getExtras();
        TextView Datos = (TextView)findViewById(R.id.categoria2);
        Datos.setText("Categoria:"+" "+bundle.getString("CATEGORIA"));
        TextView Datos2 = (TextView)findViewById(R.id.titulo2);
        Datos2.setText(bundle.getString("NOMBRE"));
        TextView Datos3 = (TextView)findViewById(R.id.pagar2);
        Datos3.setText("TOTAL A PAGAR:"+" "+bundle.getString("PRECIO"));
        String imageUrl = bundle.getString("IMAGEN");
        ImageView imageView = findViewById(R.id.image);
        Glide.with(this)
                .load(imageUrl)
                .into(imageView);


    }

}
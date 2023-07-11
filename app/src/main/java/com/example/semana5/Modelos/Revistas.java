package com.example.semana5.Modelos;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Revistas {
    private String id;
    private String category;
    private String title;
    private String price;
    private String description;
    private String image;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Revistas(JSONObject a) throws JSONException {
        id = a.getString("id").toString();
        category = a.getString("category").toString() ;
        title = a.getString("title").toString() ;
        price = a.getString("price").toString() ;
        description = a.getString("description").toString() ;
        image = a.getString("image").toString() ;
    }
    public static ArrayList<Revistas> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Revistas> usuarios = new ArrayList<>();
        for (int i = 0; i < datos.length() && i<20; i++) {
            usuarios.add(new Revistas(datos.getJSONObject(i)));
        }
        return usuarios;
    }


}

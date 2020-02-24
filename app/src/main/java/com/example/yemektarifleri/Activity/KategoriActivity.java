package com.example.yemektarifleri.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.yemektarifleri.Adapter.AdapterKategori;
import com.example.yemektarifleri.Model.Kategori;
import com.example.yemektarifleri.R;

import java.util.ArrayList;

public class KategoriActivity extends AppCompatActivity {

    GridView gridViewKategoriler;
    ArrayList<Kategori> kategoriler = new ArrayList<>();
    AdapterKategori adapterKategori;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        gridViewKategoriler = findViewById(R.id.gridViewKategoriler);
        //int id, String ad, String aciklama, int resim

        kategoriler.add(new Kategori(1,"Çorbalar","Açıklama",R.drawable.logo));
        kategoriler.add(new Kategori(2,"Balıklar","Açıklama",R.drawable.logo));
        kategoriler.add(new Kategori(3,"Tatlılar","Açıklama",R.drawable.logo));
        kategoriler.add(new Kategori(4,"Etli Yemekler","Açıklama",R.drawable.logo));
        kategoriler.add(new Kategori(4,"Hamurişi","Açıklama",R.drawable.logo));
        kategoriler.add(new Kategori(4,"İçecekler","Açıklama",R.drawable.logo));
        kategoriler.add(new Kategori(4,"Sebze","Açıklama",R.drawable.logo));
        kategoriler.add(new Kategori(4,"Meze","Açıklama",R.drawable.logo));

        adapterKategori = new AdapterKategori(getApplicationContext(),kategoriler);
        gridViewKategoriler.setAdapter(adapterKategori);

        gridViewKategoriler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),kategoriler.get(position).getAd(),Toast.LENGTH_LONG).show();

            }
        });
    }
}

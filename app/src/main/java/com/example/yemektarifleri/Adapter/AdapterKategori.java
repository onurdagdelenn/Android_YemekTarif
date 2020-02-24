package com.example.yemektarifleri.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yemektarifleri.Model.Kategori;
import com.example.yemektarifleri.R;

import java.util.ArrayList;

public class AdapterKategori extends BaseAdapter {



    private ArrayList<Kategori> kategoriler;
    private Context context; // activity sınıfın metodlarını cagırmak ıcın kullanır
    private LayoutInflater layoutInflater; // satır goruntusu olusturabılmek ıcın kullanılır

    public AdapterKategori(){


    }

    public AdapterKategori(Context context, ArrayList<Kategori> kategoriler){ //verileri doldurdugumuz kısım. kategori_row kısmından alıyoeuz
        this.context = context;
        this.kategoriler=kategoriler;
        this.layoutInflater= (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


    }
    @Override
    public int getCount() {
        return kategoriler.size();
    }

    @Override
    public Object getItem(int position) {
        return kategoriler.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=layoutInflater.inflate(R.layout.kategori_row,null); // layoutInflater.inflate demeseydık her satır kategor_row tipinde gozukmezdi

        TextView tvBaslik = v.findViewById(R.id.tvBaslik);
        ImageView ivResim= v.findViewById(R.id.ivResim);

        tvBaslik.setText(kategoriler.get(position).getAd());
        ivResim.setImageResource(kategoriler.get(position).getResim());

        return v;
    }
}

package com.serifgungor.yemektarifleri.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.serifgungor.yemektarifleri.Model.Kategori;
import com.serifgungor.yemektarifleri.R;

import java.util.ArrayList;

public class AdapterKategori extends BaseAdapter {
    private ArrayList<Kategori> kategoriler;
    private Context context;
    private LayoutInflater layoutInflater;

    public AdapterKategori(){

    }
    public AdapterKategori(Context context,ArrayList<Kategori> kategoriler){
        this.context = context;
        this.kategoriler = kategoriler;
        this.layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
        View v  =layoutInflater.inflate(R.layout.kategori_row,null);

        TextView tvBaslik = v.findViewById(R.id.tvBaslik);
        ImageView ivResim = v.findViewById(R.id.ivResim);

        tvBaslik.setText(kategoriler.get(position).getAd());
        ivResim.setImageResource(kategoriler.get(position).getResim());

        return v;
    }
}

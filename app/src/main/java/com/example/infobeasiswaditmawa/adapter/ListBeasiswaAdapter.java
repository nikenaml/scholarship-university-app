package com.example.infobeasiswaditmawa.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.infobeasiswaditmawa.DetailActivity;
import com.example.infobeasiswaditmawa.R;
import com.example.infobeasiswaditmawa.model.Beasiswa;
import com.example.infobeasiswaditmawa.model.BeasiswaData;

import java.util.ArrayList;

public class ListBeasiswaAdapter extends RecyclerView.Adapter<ListBeasiswaAdapter.ListViewHolder> {
    private ArrayList<Beasiswa> listBeasiswa;
    Context c;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListBeasiswaAdapter(ArrayList<Beasiswa> list, Context c) {
        this.listBeasiswa = list;
        this.c=c;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_beasiswa, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Beasiswa beasiswa = listBeasiswa.get(position);

        final String nama=beasiswa.getNama();
        final String asal=beasiswa.getAsal();
        final String isi=beasiswa.getIsi();
        final String photo= beasiswa.getPhoto();

        Glide.with(holder.itemView.getContext())
                .load(beasiswa.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvNama.setText(beasiswa.getNama());
        holder.tvAsal.setText(beasiswa.getAsal());
        holder.tvIsi.setText(beasiswa.getIsi());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              onItemClickCallback.onItemClicked(listBeasiswa.get(holder.getAdapterPosition()));
              openDetail(nama,asal,isi,photo);}
            });
    }

    private void openDetail(String... details) {
            Intent i = new Intent(c, DetailActivity.class);
            i.putExtra("NAMA_KEY", details[0]);
            i.putExtra("ASAL_KEY", details[1]);
            i.putExtra("ISI_KEY", details[2]);
            i.putExtra("IMAGE_KEY", details[3]);
            c.startActivity(i);
    }

    public interface OnItemClickCallback {
        void onItemClicked(Beasiswa data);
    }

    @Override
    public int getItemCount() {
        return listBeasiswa.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvNama, tvAsal, tvIsi;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvNama = itemView.findViewById(R.id.tv_item_nama);
            tvAsal = itemView.findViewById(R.id.tv_item_asal);
            tvIsi = itemView.findViewById(R.id.tv_item_isi);
        }
    }
}
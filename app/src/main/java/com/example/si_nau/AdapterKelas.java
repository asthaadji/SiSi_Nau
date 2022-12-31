package com.example.si_nau;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class holder extends RecyclerView.ViewHolder{
    ImageView img;
    TextView txtnama,txtdetail;

    public holder(@NonNull View itemView) {
        super(itemView);

        img = itemView.findViewById(R.id.imgKelas);
        txtnama = itemView.findViewById(R.id.txtnama);
        txtdetail =itemView.findViewById(R.id.txtdetail);
    }
}

public class AdapterKelas extends RecyclerView.Adapter<holder> {
    Context context;
    ArrayList<Kelas> listKelas;

    public AdapterKelas(Context context, ArrayList<Kelas> listKelas) {
        this.context = context;
        this.listKelas = listKelas;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        Kelas kelas = listKelas.get(position);
        holder.img.setImageResource(kelas.getPhoto());
        holder.txtnama.setText(kelas.getNama());
        holder.txtdetail.setText(kelas.getDetail());

    }

    @Override
    public int getItemCount() {
        return listKelas.size();
    }
}

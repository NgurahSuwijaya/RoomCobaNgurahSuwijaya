package com.example.roomcobangurahsuwijaya;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterMakananList extends RecyclerView.Adapter<AdapterMakananList.MyViewHolder> {
    private Context context;
    private List<Menu> makananList;
    public AdapterMakananList(Context context) {
        this.context = context;
    }
    public void setMakananList(List<Menu> makananList) {
        this.makananList = makananList;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public AdapterMakananList.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_data, parent, false);

        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textViewMakanan.setText(this.makananList.get(position).makanan);
        holder.textViewRasa.setText(this.makananList.get(position).rasa);
    }
    @Override
    public int getItemCount() {
        return  this.makananList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textViewMakanan;
        TextView textViewRasa;

        public MyViewHolder(View view) {
            super(view);
            textViewMakanan = view.findViewById(R.id.textViewMakanan);
            textViewRasa = view.findViewById(R.id.textViewRasa);
        }
    }
}
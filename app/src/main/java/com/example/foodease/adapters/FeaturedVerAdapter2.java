package com.example.foodease.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodease.R;
import com.example.foodease.models.FeaturedVerModel2;
import com.example.foodease.models.FeaturedVerModel2;

import java.util.List;

public class FeaturedVerAdapter2 extends RecyclerView.Adapter<FeaturedVerAdapter2.ViewHolder> {
    List<FeaturedVerModel2> list;

    public FeaturedVerAdapter2(List<FeaturedVerModel2> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public FeaturedVerAdapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.featured_ver_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.description.setText(list.get(position).getDescription());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name,description;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.detailed_img);
            name = itemView.findViewById(R.id.detailed_name);
            description = itemView.findViewById(R.id.detailed_des);
        }
    }
}


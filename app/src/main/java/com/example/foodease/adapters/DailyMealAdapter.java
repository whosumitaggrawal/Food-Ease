package com.example.foodease.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.foodease.R;
import com.example.foodease.activities.DetailedDailyMealActitvity;
import com.example.foodease.models.DailyMealModel;
import com.example.foodease.ui.dailymeal.DailyMealFragment;

import java.util.List;

public class DailyMealAdapter extends RecyclerView.Adapter<DailyMealAdapter.ViewHolder> {

    Context context;
    List<DailyMealModel> list;

    public DailyMealAdapter(Context context, List<DailyMealModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public DailyMealAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.daily_meal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull DailyMealAdapter.ViewHolder holder, int position) {
        holder.imageview.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.discount.setText(list.get(position).getDiscount());
        holder.description.setText(list.get(position).getDescription());

        holder.itemView.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DetailedDailyMealActitvity.class);
                i.putExtra("type",list.get(position).getType());
                context.startActivity(i);
            }
        }));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView imageview;
            TextView name,description,discount;
            public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageview = itemView.findViewById(R.id.imageview);
            name = itemView.findViewById(R.id.textView9);
            description = itemView.findViewById(R.id.textView10);
            discount = itemView.findViewById(R.id.tv11);
        }
    }
}

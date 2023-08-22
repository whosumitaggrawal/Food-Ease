package com.example.foodease.adapters;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.foodease.R;
import com.example.foodease.models.HomeHorModel;
import com.example.foodease.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if(check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Tomato Pizza", "10:00 - 23:00", "4.6", "Min - $35"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Onion Pizza", "10:00 - 23:00", "4.9", "Min - $45"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Cheezy Pizza", "10:00 - 23:00", "5.0", "Min - $50"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "Loaded Pizza", "10:00 - 23:00", "4.8", "Min - $60"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row_index = position;
                    notifyDataSetChanged();
                    if(position == 0){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Tomato Pizza", "10:00 - 23:00", "4.6", "Min - $35"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Onion Pizza", "10:00 - 23:00", "4.9", "Min - $45"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Cheezy Pizza", "10:00 - 23:00", "5.0", "Min - $50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "Loaded Pizza", "10:00 - 23:00", "4.8", "Min - $60"));
                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if(position ==1){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.burger1,"Double Patty Burger","10:00 - 21:00","4.8","Min - $30"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger2,"Cheesy Burger","10:00 - 22:00","5.0","Min - $23"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger4,"Meaty Bonanza","10:00 - 23:00","4.9","Min - $20"));
                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if(position ==2){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.fries1,"Plain Fries","10:00 - 23:00","4.9","Min - $10"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries2,"Cheesy Fries","10:00 - 23:00","4.8","Min - $30"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries3,"Peri Peri Fries","10:00 - 23:00","4.9","Min - $34"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries4,"Classic Salted","10:00 - 23:00","5.0","Min - $12"));
                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if(position ==3){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream1,"Chocolate Icrecream","10:00 - 23:30","4.8","Min - $34"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream4,"Vanilla Icecream","10:00 - 23:00","4.9","Min - $21"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream2,"Sizzler","10:00 - 22:00","5.0","Min - $30"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream3,"Choco Moussee","10:00 - 23:00","4.9","Min - $35"));
                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if(position ==4){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich1,"Potato Sandwich","10:00 - 21:00","4.9","Min - $35"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich2,"Healthy Sandwich","10:00 - 23:00","5.0","Min - $34"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich3,"Meat Sandwich","10:00 - 23:30","4.9","Min - $26"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich4,"Sandwich Mania","10:00 - 22:00","4.8","Min - $30"));
                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                }
            });
            if(select) {
                if (position == 0) {
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select = false;
                }
            }
            else {
                if(row_index == position) {
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }
                else{
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);
                }
            }
        }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}

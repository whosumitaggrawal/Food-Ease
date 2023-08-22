package com.example.foodease.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.foodease.MainActivity;
import com.example.foodease.R;
import com.example.foodease.adapters.DetailedDailyAdapter;
import com.example.foodease.models.DetailedDailyModel;
import com.example.foodease.ui.MyCartFragment;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActitvity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);

        if(type != null && type.equalsIgnoreCase("breakfast")){
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav1,"Fruit Salad","Healthy Start for the Morning","4.8","20","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav2,"Bite Burger","A quick snack for you","4.9","40","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav3,"Noodles","Subtle start for refreshing day","4.4","25","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav1,"Fruit Salad","Healthy Start for the Morning","4.8","20","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav2,"Bite Burger","A quick snack for you","4.9","40","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav3,"Noodles","Subtle start for refreshing day","4.4","24","10am to 9pm"));
            dailyAdapter.notifyDataSetChanged();
        }
        if(type != null && type.equalsIgnoreCase("sweets")){
            imageView.setImageResource(R.drawable.sweets);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s1,"Gems","For the sweet-tooth","5.0","30","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s2,"Donuts","Choco-Filled Donuts","4.9","45","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s3,"Cone","Delicious ice-cream + crispy cone","4.8","36","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s4,"French Toast","Delicious Toast with honey & stawberry","5.0","50","10am to 9pm"));
            dailyAdapter.notifyDataSetChanged();
        }

        if(type != null && type.equalsIgnoreCase("lunch")){
            imageView.setImageResource(R.drawable.lunch);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.ver1,"Gems","For the sweet-tooth","5.0","30","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.ver2,"Donuts","Choco-Filled Donuts","4.9","45","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.ver3,"Cone","Delicious ice-cream + crispy cone","4.8","36","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s4,"French Toast","Delicious Toast with honey & stawberry","5.0","50","10am to 9pm"));
            dailyAdapter.notifyDataSetChanged();
        }

        if(type != null && type.equalsIgnoreCase("dinner")){
            imageView.setImageResource(R.drawable.dinner);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s1,"Gems","For the sweet-tooth","5.0","30","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s2,"Donuts","Choco-Filled Donuts","4.9","45","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s3,"Cone","Delicious ice-cream + crispy cone","4.8","36","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s4,"French Toast","Delicious Toast with honey & stawberry","5.0","50","10am to 9pm"));
            dailyAdapter.notifyDataSetChanged();
        }

        if(type != null && type.equalsIgnoreCase("coffee")){
            imageView.setImageResource(R.drawable.coffe);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s1,"Gems","For the sweet-tooth","5.0","30","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s2,"Donuts","Choco-Filled Donuts","4.9","45","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s3,"Cone","Delicious ice-cream + crispy cone","4.8","36","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s4,"French Toast","Delicious Toast with honey & stawberry","5.0","50","10am to 9pm"));
            dailyAdapter.notifyDataSetChanged();
        }
    }
}

package com.example.foodease.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.foodease.R;
import com.example.foodease.adapters.DailyMealAdapter;
import com.example.foodease.models.DailyMealModel;
import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {
    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModels;
    DailyMealAdapter dailyMealAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstances)
    {
        View root = inflater.inflate(R.layout.fragment_daily_meal,container,false);

        recyclerView = root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels = new ArrayList<>();

        dailyMealModels.add(new DailyMealModel(R.drawable.breakfast,"Breakfast","30% Off","Hearty morning feast.","breakfast"));
        dailyMealModels.add(new DailyMealModel(R.drawable.lunch,"Lunch","34% Off","Quick, satisfying lunch.","lunch"));
        dailyMealModels.add(new DailyMealModel(R.drawable.dinner,"Dinner","30% Off","Savory dinner.","dinner"));
        dailyMealModels.add(new DailyMealModel(R.drawable.sweets,"Sweets","20% Off","Decadent treats.","sweets"));
        dailyMealModels.add(new DailyMealModel(R.drawable.coffe,"Coffee","12% Off","Bold, aromatic brew.","coffee"));

        dailyMealAdapter = new DailyMealAdapter(getContext(),dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();
        return root;
    }
}
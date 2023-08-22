package com.example.foodease.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodease.R;
import com.example.foodease.adapters.FeaturedAdapter;
import com.example.foodease.adapters.FeaturedVerAdapter;
import com.example.foodease.models.FeatuedModel;
import com.example.foodease.models.FeaturedVerModel;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {

    List<FeatuedModel> featuredModelList;
    List<FeaturedVerModel> featuredVerModelList;
    RecyclerView recyclerView;
    RecyclerView recyclerView2;
    FeaturedAdapter featuredAdapter;
    FeaturedVerAdapter featuredVerAdapter;
    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);




        recyclerView2 = view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        featuredVerModelList = new ArrayList<>();
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver1,"Oats","Description 1","4.5","10:00 - 9:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver2,"Omelette","Description 1","4.6","10:00 - 8:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver1,"Milk Oats","Description 1","4.9","10:00 - 7:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver3,"Honey Toast","Description 1","5.0","10:00 - 8:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver1,"Oats with Fruits","Description 1","4.2","10:00 - 8:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver2,"Yellow Sun","Description 1","4.8","10:00 - 6:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver1,"Stawberry Delight","Description 1","4.5","10:00 - 11:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver3,"French Toast","Description 1","4.6","10:00 - 6:00"));

        featuredVerAdapter = new FeaturedVerAdapter(featuredVerModelList);
        recyclerView2.setAdapter(featuredVerAdapter);
        return view;
    }
}
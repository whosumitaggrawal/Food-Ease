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

public class SecondFragment extends Fragment {

    List<FeatuedModel> featuredModelList;
    List<FeaturedVerModel> featuredVerModelList;
    RecyclerView recyclerView;
    RecyclerView recyclerView2;
    FeaturedAdapter featuredAdapter;
    FeaturedVerAdapter featuredVerAdapter;
    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        recyclerView = view.findViewById(R.id.featured_hor_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        featuredModelList = new ArrayList<>();
        featuredModelList.add(new FeatuedModel(R.drawable.fav1,"Fruit Salad","A healthy start to the Morning"));
        featuredModelList.add(new FeatuedModel(R.drawable.fav2,"Bite Sized Burgers","Cute burgers for lil'ones"));
        featuredModelList.add(new FeatuedModel(R.drawable.fav3,"Noodles","Spicy Haka Noddles"));
        featuredModelList.add(new FeatuedModel(R.drawable.fav1,"Healthy Morning","Fruity Delight : Good Start"));
        featuredAdapter = new FeaturedAdapter(featuredModelList);
        recyclerView.setAdapter(featuredAdapter);



        return view;
    }
}
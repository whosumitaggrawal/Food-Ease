package com.example.foodease.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.foodease.MainActivity;
import com.example.foodease.R;
import com.example.foodease.adapters.CartAdapter;
import com.example.foodease.models.CartModel;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;


public class MyCartFragment extends Fragment {

    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;

    public MyCartFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_cart, container, false);
        recyclerView = view.findViewById(R.id.cart_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();

        list.add(new CartModel(R.drawable.s1,"Gems","30","4.3"));
        list.add(new CartModel(R.drawable.s2,"Donuts","25","4.3"));
        list.add(new CartModel(R.drawable.fav1,"Fruit Salad","40","4.3"));
        list.add(new CartModel(R.drawable.ver2,"Omelette","30","4.8"));
        list.add(new CartModel(R.drawable.pizza4,"Loaded Pizza","20","4.2"));
        list.add(new CartModel(R.drawable.icecream3,"Sizzler","25","4.9"));
        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);

        return view;
    }

    public void makeOrder(View view) {
        Snackbar.make(view, "Your Order has been Placed", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
}
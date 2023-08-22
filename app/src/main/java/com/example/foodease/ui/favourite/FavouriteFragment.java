package com.example.foodease.ui.favourite;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.foodease.MainActivity;
import com.example.foodease.R;
import com.example.foodease.fragments.FragmentAdapter;
import com.google.android.material.tabs.TabLayout;

public class FavouriteFragment extends Fragment {

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    FragmentAdapter fragmentAdapter;
    private FragmentActivity myContext;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstances)
    {
        View root = inflater.inflate(R.layout.fragment_favourite,container,false);

        tabLayout = root.findViewById(R.id.tab_layout);
        viewPager2 = root.findViewById(R.id.view_pager2);

        FragmentManager fm = getActivity().getSupportFragmentManager();
        fragmentAdapter = new FragmentAdapter(fm,getLifecycle());

        viewPager2.setAdapter(fragmentAdapter);
        tabLayout.addTab(tabLayout.newTab().setText("Featured"));
        tabLayout.addTab(tabLayout.newTab().setText("Popular"));
        tabLayout.addTab(tabLayout.newTab().setText("New"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });

        return root;
    }

//    public void alertMes(View view) {
//        AlertDialog.Builder adb = new AlertDialog.Builder(FavouriteFragment.this);
//        adb.setIcon(R.drawable.baseline_warning_24);
//        adb.setTitle("Close Window");
//        adb.setMessage("Do you want to Continue");
//        adb.setCancelable(false);
//        adb.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                System.exit(0);
//            }
//        });
//
//        adb.setNegativeButton("No", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//            }
//        });
//
//        adb.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//            }
//        });
//        adb.show();
//    }
}
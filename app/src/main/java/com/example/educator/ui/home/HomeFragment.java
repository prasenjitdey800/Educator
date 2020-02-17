package com.example.educator.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.educator.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    CardView cv;
    int i=0;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        /*homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        cv=(CardView)root.findViewById(R.id.card_view);
        final int ids[]={R.drawable.redbull,R.drawable.monster_drink,R.drawable.fanta,R.drawable.diet_coke,R.drawable.coke};
        final ImageView iv=(ImageView)root.findViewById(R.id.imageView1);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=(++i)%5;
                iv.setImageResource(ids[i]);
            }
        });
        return root;
    }
}
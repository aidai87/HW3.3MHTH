package com.example.hw33mhth;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class ThirdFragment extends Fragment {

    private Button button_third;
    private TextView textView;
    private String s;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        s = getArguments().getString("text_one");
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button_third = view.findViewById(R.id.click_me_third);
        textView = view.findViewById(R.id.textViewthird);
        textView.setText(s);
        button_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new FourthFragment();
                Bundle chemodan_one = new Bundle();
                chemodan_one.putString("text_second", s);
                fragment.setArguments(chemodan_one);
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.conteiner, fragment).addToBackStack("").commit();
            }
        });

    }
}
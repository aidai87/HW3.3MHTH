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


public class FourthFragment extends Fragment {
    private TextView textView;
    private String string;
    private Button button_fourth;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        string = getArguments().getString("text_second");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = view.findViewById(R.id.textViewfourth);
        textView.setText(string);
        button_fourth = view.findViewById(R.id.click_me_fourth);
        button_fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new FifthFragment();
                Bundle chemodan_one = new Bundle();
                chemodan_one.putString("text_fourth", string);
                fragment.setArguments(chemodan_one);
                requireActivity().getSupportFragmentManager().beginTransaction().add(R.id.conteiner,fragment).addToBackStack("").commit();
            }
        });

    }
}
package com.example.hw33mhth;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class SecondFragment extends Fragment {

    private Button button;
    private TextView textView;
    private String string;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        assert getArguments() != null;
        string = getArguments().getString("text");
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button = view.findViewById(R.id.click_me_second);
        textView = view.findViewById(R.id.textViewsecond);
        textView.setText(string);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new ThirdFragment();
                Bundle chemodan_one = new Bundle();
                chemodan_one.putString("text_one", string);
                fragment.setArguments(chemodan_one);
                requireActivity().getSupportFragmentManager().beginTransaction().add(R.id.conteiner, fragment).addToBackStack("").commit();
            }
        });

    }
}
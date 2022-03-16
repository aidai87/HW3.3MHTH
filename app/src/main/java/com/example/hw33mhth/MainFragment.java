package com.example.hw33mhth;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class MainFragment extends Fragment {
    private Button button_second;
    private EditText editText;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button_second = view.findViewById(R.id.btn);
        editText = view.findViewById(R.id.EdiText);

        button_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new SecondFragment();
                Bundle chemodan_one = new Bundle();
                chemodan_one.putString("text", editText.getText().toString());
                fragment.setArguments(chemodan_one);
                requireActivity().getSupportFragmentManager().beginTransaction().
                        replace(R.id.conteiner, fragment).addToBackStack(null).commit();
            }
        });

    }
}
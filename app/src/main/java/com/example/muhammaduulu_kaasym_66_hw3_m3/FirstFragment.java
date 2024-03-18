package com.example.muhammaduulu_kaasym_66_hw3_m3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FirstFragment extends Fragment {

    private RecyclerView rvCoutry;
    private ArrayList<String> countryList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadDate();
        initView();
        CountryAdapter countryAdapter = new CountryAdapter(countryList);
        rvCoutry.setAdapter(countryAdapter);
    }

    private void loadDate() {

        countryList.add("Kyrgyzstan");
        countryList.add("China");
        countryList.add("Turkey");
        countryList.add("USA");
        countryList.add("Japan");
        countryList.add("Azerbaijan");
        countryList.add("Kazakhstan");
        countryList.add("Jordan");
        countryList.add("OAE");
        countryList.add("Russia");
        countryList.add("Mexico");
        countryList.add("Palestine");
        countryList.add("Uzbekistan");



    }
    private void initView(){
        rvCoutry = requireActivity().findViewById(R.id.rv_country);
    }
}
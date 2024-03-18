package com.example.muhammaduulu_kaasym_66_hw3_m3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class CountryViewHolder extends RecyclerView.ViewHolder {

    private TextView tvCountry;


    public CountryViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCountry = itemView.findViewById(R.id.tv_country);
    }
    public void onBind(String country){
        tvCountry.setText(country);
    }
}

package com.india.gov.helperapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class RecommendationsActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_recommendations, null, false);
        drawer.addView(contentView, 0);
        textView.setVisibility(View.GONE);
    }

    @Override
    protected void onResume(){
        super.onResume();
        navigationView.getMenu().getItem(2).setChecked(true);
    }
}

package com.choirulhuda.aplikasisederhana.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.choirulhuda.aplikasisederhana.R;

public class ListViewNegaraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_negara);

        getSupportActionBar().setTitle("List View Negara");
    }
}
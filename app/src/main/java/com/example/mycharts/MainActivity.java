package com.example.mycharts;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    BarChart barChart;
    BarData barData;
    BarDataSet barDataSet;
    ArrayList barentries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //========================================
        getdata();
        //========================================

        barChart = findViewById(R.id.charts);

        //==========================================

        barDataSet = new BarDataSet(barentries, "Data Set");
        barData = new BarData(barDataSet);

        barChart.setData(barData);

        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(18f);


        //========================================


    }

    private void getdata() {
        barentries = new ArrayList<>();
        barentries.add(new BarEntry(1f, 32));
        barentries.add(new BarEntry(2f, 22));
        barentries.add(new BarEntry(3f, 222));
        barentries.add(new BarEntry(4f, 2));
        barentries.add(new BarEntry(5f, 12));
        barentries.add(new BarEntry(6f, 23));
        barentries.add(new BarEntry(7f, 2));
        barentries.add(new BarEntry(8f, 21));
        barentries.add(new BarEntry(9f, 23));
        barentries.add(new BarEntry(10f, 24));
        barentries.add(new BarEntry(11f, 93));
        barentries.add(new BarEntry(12f, 32));
        barentries.add(new BarEntry(13f, 51));
        barentries.add(new BarEntry(14f, 2));
        barentries.add(new BarEntry(15f, 50));
    }
}
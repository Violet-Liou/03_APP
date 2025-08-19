package com.example.application_1;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_Textview_java extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_textview_java);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        TextView textview_01,textview_02,textview_03;
        ColorStateList colorText2;

        textview_01 = findViewById(R.id.textview_01);
        textview_02 = findViewById(R.id.textview_02);
        textview_03 = findViewById(R.id.textview_03);

        colorText2 = textview_02.getTextColors();

        textview_01.setOnFocusChangeListener((v, hasfocus) -> {
           if(hasfocus){
               textview_02.setTextColor(0xff0000ff);
               textview_02.setText("目前焦點： Focus On TextView2");
           }else{
               textview_02.setTextColor(colorText2);
               textview_02.setText("顯示文字：TextView2");
           }
        });

    }
}
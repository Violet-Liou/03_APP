package com.example.application_1;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_ImageView_java  extends AppCompatActivity {
    ImageView imageView_01;
    TextView textview_01,textview_02;
    int imageIndex = 0, scaleIndex=0, i=0;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_imageview_java);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        imageView_01=findViewById(R.id.imageview_01);
        textview_01=findViewById(R.id.textview_01);
        textview_02=findViewById(R.id.textview_02);

        textview_01.setOnTouchListener(new View.OnTouchListener(){

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    if(imageIndex ==2){
                        imageView_01.setImageResource(R.drawable.picture02);
                        imageIndex=1;
                    }else{
                        imageView_01.setImageResource(R.drawable.picture03);
                        imageIndex=2;
                    }
                }
                return false;
            }
        });

        textview_02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                i += 1;
                textview_02.setText("變更縮放程式："+i);
                if(scaleIndex == 2){
                    imageView_01.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    scaleIndex=1;
                }else{
                    imageView_01.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    scaleIndex = 2;
                }
            }
        });

    }
}

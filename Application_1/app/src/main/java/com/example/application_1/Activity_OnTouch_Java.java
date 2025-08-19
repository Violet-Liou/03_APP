package com.example.application_1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_OnTouch_Java extends AppCompatActivity {
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

        textview_01.setText("手勢觸發的動作型態");
        textview_02.setText("");

        imageView_01.setOnTouchListener(new View.OnTouchListener(){

            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    textview_02.setText("Action Down 動作被觸發！");
                }else if(motionEvent.getAction() == MotionEvent.ACTION_UP){
                    textview_02.setText("Action Up 動作被觸發！");
                }else if(motionEvent.getAction() == MotionEvent.ACTION_MOVE){
                    textview_02.setText("Action Move 動作被觸發！");
                }else{
                    textview_02.setText("Action Code -"+motionEvent.getAction());
                }
                return false;
            }
        });
//
//        textview_02.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                i += 1;
//                textview_02.setText("變更縮放程式："+i);
//                if(scaleIndex == 2){
//                    imageView_01.setScaleType(ImageView.ScaleType.FIT_CENTER);
//                    scaleIndex=1;
//                }else{
//                    imageView_01.setScaleType(ImageView.ScaleType.CENTER_CROP);
//                    scaleIndex = 2;
//                }
//            }
//        });

    }
}

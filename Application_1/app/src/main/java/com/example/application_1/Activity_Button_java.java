package com.example.application_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;

public class Activity_Button_java extends AppCompatActivity {

    Button button_01, btn_02;

    int i=0, j=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_button_java); //把某個特定的內容載到畫面上，看要顯示哪個View的畫面
        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
        //    Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        //    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
        //   return insets;
        //});

        button_01 = findViewById(R.id.btn1);
        btn_02 =findViewById(R.id.btn_02);  //  後面的id要和lauout的.xml要一樣

        button_01.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View v){
                i = i + 1;
                button_01.setText("已按下按鈕一："+ i +"次");
            }
        });

        btn_02.setText("清零按鈕一已按次數");

        btn_02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                i = 0;
            }
        });


    }
}

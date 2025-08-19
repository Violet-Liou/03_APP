package com.example.intem01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView textview_01;
    Button button_01, button_02, button_03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        button_01 = findViewById(R.id.button_01);
        button_02 = findViewById(R.id.button_02);
        button_03 = findViewById(R.id.button_03);


        button_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Activity_Two.class);
                startActivity(i);
            }
        });

        button_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Activity_Three.class);
                startActivity(i);
            }
        });

        button_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_03.getVisibility() == View.VISIBLE) {
                    button_03.setVisibility(View.INVISIBLE);
                    button_01.setVisibility(View.INVISIBLE);
                    button_02.setVisibility(View.INVISIBLE);
                }else{
                    button_01.setVisibility(View.VISIBLE);
                    button_02.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
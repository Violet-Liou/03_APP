package com.example.application_1;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.RadioGroup;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_Radiobutton_Java extends AppCompatActivity {

    TextView textview_01,textview_02,textview_03,textview_04;
    RadioGroup radioGroup_01,radioGroup_02;
    RadioButton radio_01,radio_02,radio_03,radio_04,radio_05,radio_06;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_radiobutton_java);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        textview_01 = findViewById(R.id.textview_01);
        textview_02 = findViewById(R.id.textview_02);
        textview_03 = findViewById(R.id.textview_03);
        textview_04 = findViewById(R.id.textview_04);

        radioGroup_01 = findViewById(R.id.radioGroup_01);
        radioGroup_02 = findViewById(R.id.radioGroup_02);

        radio_01 = findViewById(R.id.radio_01);
        radio_02 = findViewById(R.id.radio_02);
        radio_03 = findViewById(R.id.radio_03);
        radio_04 = findViewById(R.id.radio_04);
        radio_05 = findViewById(R.id.radio_05);
        radio_06 = findViewById(R.id.radio_06);

        radioGroup_01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int selectedId = radioGroup_01.getCheckedRadioButtonId();

                if(selectedId == R.id.radio_01){
                    textview_03.setText("第一題選擇了：" + radio_01.getText().toString());
                }
                else if(selectedId == R.id.radio_02){
                    textview_03.setText("第一題選擇了：" + radio_02.getText().toString());
                }
                else if(selectedId == R.id.radio_03){
                    textview_03.setText("第一題選擇了：" + radio_03.getText().toString());
                }
            }
        });

        radio_04.setOnClickListener(radioClickListener);
        radio_05.setOnClickListener(radioClickListener);
        radio_06.setOnClickListener(radioClickListener);

    }

    View.OnClickListener radioClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int selectedId = radioGroup_02.getCheckedRadioButtonId();
            View v1 = findViewById(selectedId);
            RadioButton rb1 = (RadioButton) v1;
            textview_04.setText("第二題選擇了：" + rb1.getText().toString());
        }
    };
}
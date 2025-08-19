package com.example.application_1;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_Checkbox_Java extends AppCompatActivity {

    CheckBox checkbox_01,checkbox_02,checkbox_03,checkbox_04;
    String strTemp="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_checkbox_java);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });


        checkbox_01 = findViewById(R.id.checkbox_01);
        checkbox_02 = findViewById(R.id.checkbox_02);
        checkbox_03 = findViewById(R.id.checkbox_03);
        checkbox_04 = findViewById(R.id.checkbox_04);

        checkbox_01.setOnCheckedChangeListener(checkedChangeListener_01);
        checkbox_02.setOnCheckedChangeListener(checkedChangeListener_01);
        checkbox_03.setOnCheckedChangeListener(checkedChangeListener_01);
        checkbox_04.setOnCheckedChangeListener(checkedChangeListener_01);

    }


    CompoundButton.OnCheckedChangeListener checkedChangeListener_01 = new CompoundButton.OnCheckedChangeListener(){
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

         strTemp = "已選擇";

         if(checkbox_01.isChecked()){
             strTemp += checkbox_01.getText().toString() + "，";
         }
         if(checkbox_02.isChecked()){
             strTemp += checkbox_02.getText().toString() + "，";
         }
         if(checkbox_03.isChecked()){
             strTemp += checkbox_03.getText().toString() + "，";
         }
         if(checkbox_04.isChecked()){
             strTemp += checkbox_04.getText().toString() + "，";
         }

         Toast t = Toast.makeText(Activity_Checkbox_Java.this, strTemp, Toast.LENGTH_SHORT);
         t.show();
        }
    };
}
package com.example.intent02;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityTemperature_F extends AppCompatActivity {

    TextView textView_01, textView_02;
    Button button_close;

    Double c, f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_temperature_f);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        textView_01 = findViewById(R.id.textview_01);
        textView_02 = findViewById(R.id.textview_02);
        button_close = findViewById(R.id.button_close);

        Intent intent_getFromMainActivity = ActivityTemperature_F.this.getIntent();
        Bundle bundle = intent_getFromMainActivity.getExtras();

        if(bundle != null)
        {
            String s = bundle.getString("temp_c");
            c = Double.parseDouble(s);
            f = ((9.0*c)/5)+32;
            textView_02.setText("轉換後的華氏溫度為："+f.toString());
        }else{
            textView_02.setText("無資料");

        }

        button_close.setOnClickListener(view -> {
            ActivityTemperature_F.this.finish();
        });
    }
}
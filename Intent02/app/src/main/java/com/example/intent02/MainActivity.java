package com.example.intent02;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView textView_01, textView_02, textView_03;
    EditText editText_01, editText_02, editText_03;
    Button button_01, button_02, button_03;;


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

//        editText_01 = findViewById(R.id.edittext_01);
//        editText_02 = findViewById(R.id.edittext_02);
//        editText_03 = findViewById(R.id.edittext_03);
//
//        button_choice = findViewById(R.id.button_choice);
//
//
//        button_choice.setOnClickListener(new View.OnClickListener() {
//            @Override
//                    public void onClick(View v){
//                Intent intent_toActivityOperate = new Intent(MainActivity.this, ActivityOperate.class);
//                Bundle bundle = new Bundle();
//
//                bundle.putString("num_01", editText_01.getText().toString());
//                bundle.putString("num_02", editText_02.getText().toString());
//                intent_toActivityOperate.putExtras(bundle);
//
//                startActivityForResult(intent_toActivityOperate, REQUEST_CODE_UP);
//            }
//        });

        button_01 = findViewById(R.id.button_01);
        button_02 = findViewById(R.id.button_02);
        button_03 = findViewById(R.id.button_03);

        editText_01 = findViewById(R.id.edittext_01);
        editText_02 = findViewById(R.id.edittext_02);
        editText_03 = findViewById(R.id.edittext_03);

        button_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = editText_01.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        button_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tel = editText_02.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(tel));
                startActivity(intent);
            }
        });

        button_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gps = editText_03.getText().toString();
                Intent intent = new Intent();
                intent.setData(Uri.parse(gps));
                intent.setAction(Intent.ACTION_VIEW);
                startActivity(intent);
            }
        });

    }
}
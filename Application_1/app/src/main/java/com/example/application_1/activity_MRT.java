package com.example.application_1;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;

import java.util.ArrayList;

public class activity_MRT extends AppCompatActivity {

    TextView textview_01;
    Button button_01,button_02;
    ListView Listview_01;
    ArrayList<String> MRT_arrayListOfString;
    ArrayAdapter<String> MRT_arrayAdapter;

    String strAPI_URL = "https://api.kcg.gov.tw/api/service/Get/4278fc6a-c3ea-4192-8ce0-40f00cdb40dd";

    String strMRT = "高雄捷運站資料";

    String strMRTID, strMRTName, strLongitude, strLatitude;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mrt);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        textview_01 = findViewById(R.id.textview_01);
        button_01 = findViewById(R.id.button_01);
        button_02 = findViewById(R.id.button_02);
        Listview_01 = findViewById(R.id.Listview_01);

        MRT_arrayListOfString = new ArrayList<String>();

        button_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((MRT_arrayListOfString != null) &&(MRT_arrayAdapter != null)){
                    MRT_arrayListOfString.clear();
                    MRT_arrayAdapter.notifyDataSetChanged();
                    textview_01.setText(strMRT+"\nAPI資料已清空......");
                }
            }
        });

        button_01.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
//               try{
//                   JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET,strAPI_URL,null, new Response.ErrorListener() {
//                       @Override
//                       public void onErrorResponse(VolleyError error) {
//
//                       }
//                   });
//               }catch (Exception ex){
//
//               }
           }
        });

    }
}
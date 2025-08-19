package com.example.application_1;

import android.Manifest;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GPSActivity extends AppCompatActivity  { //implements LocationListener

    private TextView textview_01;
    private Button button_01,button_02,button_03;
    private LocationManager lm;
    private Location currentlocation;
    private String bestProvider;
    private static final int PERMISSION_REQUEST_GPS = 1201;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gps);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.boTextView textview_01,textview_02,textview_03;
//        ColorStateList colorText2;ttom);
//            return insets;
//        });

        textview_01 = findViewById(R.id.textview_01);
        button_01 = findViewById(R.id.button_01);
        button_02 = findViewById(R.id.button_02);
        button_03 = findViewById(R.id.button_03);

        lm = (LocationManager) getSystemService(LOCATION_SERVICE);
//        checkGPSProviderStatus(lm);
//        checkSDKVersion();

    }

//    public void checkGPSProviderStatus(LocationManager location_manager){
//        if(!location_manager.isProviderEnabled(LocationManager.GPS_PROVIDER) == false){
//            AlterDiaLog.Builder builder;
//            builder = new AlterDiaLog.Builder(GPSActivity.this);
//            builder.setTitle("請開啟GPS");
//            builder.setMessage("GPS尚未開啟，是否開啟GPS?");
//            builder.create().show();
//            Toast.makeText(GPSActivity.this,"GPS已開啟",Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    public void checkSDKVersion(){
//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
//            if(checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED){
//                requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION},PERMISSION_REQUEST_GPS);
//            }
//        }
//    }
//
//    @Override
//    public void onRequestPermissionResult(int requestCode,String[] permissions,int[] grantResults){
//        super.onRequestPermissionsResult(requestCode,permissions,grantResults);
//
//        String strOutput;
//
//        if(requestCode == PERMISSION_REQUEST_GPS){
//            if(grantResults.length > 0){
//            }
//        }
//    }
}
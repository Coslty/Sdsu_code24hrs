package com.example.keng.sdsu_code24hrs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Keng on 11/18/2016.
 */

public class MapSDSUActivity extends Activity {
    private Button btn_start_main, btn_start_google_map;


    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_map);


        btn_start_google_map = (Button) findViewById(R.id.btn_start_google_map);
        btn_start_main = (Button) findViewById(R.id.btn_start_main);

        btn_start_google_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MapSDSUActivity.this, GoogleMapInfoActivity.class));
            }
        });

        btn_start_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MapSDSUActivity.this, MainActivity.class));
            }
        });









    }






}

package com.example.currentlocationtracking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView tv = findViewById(R.id.intent_data);

        String values = getIntent().getStringExtra(Location.CURRENT_LOCATION);
        tv.setText(values);

//        if (getIntent() == null){
//            Toast.makeText(this, "Null", Toast.LENGTH_SHORT).show();
//        }else {
//
//            String loc = getIntent().getStringExtra(Location.CURRENT_LOCATION);
//            Toast.makeText(this, ""+loc, Toast.LENGTH_SHORT).show();
//
//
//        }

//        findViewById(R.id.current_location).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//                startActivity(new Intent(getApplicationContext(),MapsActivity.class));
//
//            }
//        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
//AIzaSyDN8vBWKBfUtTGyXHaADvC_AOp_9dgPQTk
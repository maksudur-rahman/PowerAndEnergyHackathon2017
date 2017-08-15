package com.example.powerenergyhackathon2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HouseHoldScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_hold_screen);
    }



    public void toEPM_I(View view){
        Intent intent = new Intent(HouseHoldScreen.this,EPM_I.class);
        startActivity(intent);
    }
    public void toUsage_I(View view){
        Intent intent = new Intent(HouseHoldScreen.this,Usage_I.class);
        startActivity(intent);
    }
    public void toUnitFlow_I(View view){
        Intent intent = new Intent(HouseHoldScreen.this,Unitflow_I.class);
        startActivity(intent);
    }
    public void toBill_I(View view) {
        Intent intent = new Intent(HouseHoldScreen.this, Bill_I.class);
        startActivity(intent);
    }
    public void toSwitch_I(View view) {
        Intent intent = new Intent(HouseHoldScreen.this, Switch_I.class);
        startActivity(intent);
    }
}

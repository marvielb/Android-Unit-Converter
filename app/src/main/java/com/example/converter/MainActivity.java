package com.example.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.converter.Inch.InchToCentimetre;
import com.example.converter.Inch.InchToFoot;
import com.example.converter.Inch.InchToMetre;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Handle_InchToMetre_Click(View v)
    {
        UnitBase converter = new InchToMetre();
        StartNextActivity(converter);
    }

    public void Handle_InchToCentimetre_Click(View v)
    {
        UnitBase converter = new InchToCentimetre();
        StartNextActivity(converter);
    }

    public void Handle_InchToFoot_Click(View v)
    {
        UnitBase converter = new InchToFoot();
        StartNextActivity(converter);
    }

    public void StartNextActivity(UnitBase converter)
    {
        Intent intent = new Intent(MainActivity.this, InputActivity.class);
        intent.putExtra("converter", converter);
        startActivity(intent);
    }
}

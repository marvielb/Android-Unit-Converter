package com.example.converter;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class OutputActivity extends AppCompatActivity {


    private TextView textView_outputTitle;
    private TextView textView_output;
    private UnitBase converter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        CacheElements();
        textView_outputTitle.setText(converter.get_convertedName());
        String convertedValue = Float.toString(converter.GetConvertedValue());
        textView_output.setText(convertedValue);

        Intent intent = new Intent();
        intent.putExtra("converter", converter);
        setResult(RESULT_OK,intent);
    }

    private void CacheElements()
    {
        textView_outputTitle = (TextView)findViewById(R.id.textView_OutputTitle);
        textView_output = (TextView)findViewById(R.id.textView_Output);
        converter = (UnitBase)getIntent().getSerializableExtra("converter");
    }

}

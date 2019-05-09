package com.example.converter;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class InputActivity extends AppCompatActivity {

    TextView textView_UnitTitle;
    EditText editText_Input;
    UnitBase converter;
    private int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        CacheElements();
        textView_UnitTitle.setText( converter.get_Name() );
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
    {

    }

    public void Handle_Convert_Click(View v)
    {
        String strinput = editText_Input.getText().toString();
        float input = Float.parseFloat(strinput);
        converter.SetValue(input);
        Intent intent = new Intent(InputActivity.this, OutputActivity.class);
        intent.putExtra("converter", converter);
        startActivityForResult(intent,REQUEST_CODE);
    }

    private void CacheElements()
    {
        textView_UnitTitle = (TextView)findViewById(R.id.textView_Input_Title);
        editText_Input = (EditText)findViewById(R.id.editText_Input);
        Bundle extras = getIntent().getExtras();
        if(extras != null)
        {
            if(extras.containsKey("converter"))
            {
                converter = (UnitBase) getIntent().getSerializableExtra("converter");
            }
        }

    }
}

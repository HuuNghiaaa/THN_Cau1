package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import java.sql.Array;

public class MainActivity extends AppCompatActivity {
    String[] presidents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presidents =
                getResources() .getStringArray(R.array.presidents_array);
        Spinner s1=(Spinner) findViewById(R.id.spinnerl);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,android.R.layout)
    }
}

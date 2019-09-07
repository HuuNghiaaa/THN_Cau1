package com.example.casestudy2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

public class Activity2 extends AppCompatActivity {
    TextView tv_ketq;
    Button btn_thoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        tv_ketq =(TextView)findViewById(R.id.tv_ketq);
        String hoten = getIntent().getExtras().getString("ht");
        String namsinh = getIntent().getExtras().getString("ns");
        String st = "";
        st += "ho va ten " + hoten;
        st += "\n Nam inh" + namsinh;
        Calendar calendar = Calendar.getInstance();
        st += "Tuoi" + ((calendar.getTime().getYear() + 1900)  - Integer.parseInt(namsinh));
        tv_ketq.setText(st);
        btn_thoat = (Button)findViewById(R.id.btn_thoat);
        btn_thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}

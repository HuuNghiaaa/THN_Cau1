package com.example.casestudy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText edt_hoten, edt_namsinh;
    TextView txt_ketqua;
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_hoten = (EditText)findViewById(R.id.edt_hoten);
        edt_namsinh = (EditText)findViewById(R.id.edt_namsinh);
        btn_submit = (Button)findViewById(R.id.btn_submit);


        btn_submit.setOnClickListener(new  View.OnClickListener() {
            public  void  onClick (View vew)
            {
                Intent intent = new Intent();

            }

        }
    }

}

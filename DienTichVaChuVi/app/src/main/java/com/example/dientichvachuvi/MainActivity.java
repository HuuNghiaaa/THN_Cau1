package com.example.dientichvachuvi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt_dai, edt_rong;

    Button btn_dientich,btn_chuvi,btn_thoat;
    TextView txt_ketqua;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_dai =(EditText) findViewById(R.id.edt_dai);
        edt_rong =(EditText) findViewById(R.id.edt_rong);
        txt_ketqua = (TextView) findViewById(R.id.txt_ketqua);

    }
    public  void HCN (View v ){
     int dai = Integer.parseInt(edt_dai.getText()+"");
     int rong = Integer.parseInt((edt_rong.getText())+"");

     int kq = (dai * rong);
     txt_ketqua.setText(kq+"");
    }
    public  void ChuVi (View v){
        int a = Integer.parseInt(edt_dai.getText()+"");
        int b = Integer.parseInt((edt_rong.getText())+"");

        int kq = (a + b)*2;
        txt_ketqua.setText(kq+"");

    }
public void Thoat(View v){
        finish();
    }
}


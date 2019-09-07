package com.example.phepcong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt_soa,edt_sob;
    TextView ketqua;
    Button btn_cong, btn_tru, btn_nhan, btn_chia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_soa = (EditText) findViewById(R.id.edt_sob);
        edt_sob = (EditText) findViewById(R.id.edt_sob);
        ketqua =(TextView) findViewById(R.id.txt_ketqua);
    }
    public void cong2so(View v){
    int a = Integer.parseInt(edt_soa.getText()+"");
    int b = Integer.parseInt(edt_sob.getText()+"");
    ketqua.setText(ketqua+"");
    }
    public void truHaiSo(View v){
        int a = Integer.parseInt(edt_soa.getText()+"");
        int b = Integer.parseInt(edt_sob.getText()+"");

        int kq = a - b;
        ketqua.setText(kq+"");
    }
    public void nhanHaiSo(View v){
        int a = Integer.parseInt(edt_soa.getText()+"");
        int b = Integer.parseInt(edt_sob.getText()+"");

        int kq = a * b;
        ketqua.setText(kq+"");
    }
    public void chiaHaiSo(View v){
        int a = Integer.parseInt(edt_soa.getText()+"");
        int b = Integer.parseInt(edt_sob.getText()+"");
        if(b != 0){
            float kq = a / b;
            ketqua.setText(kq+"");
        }
        else {
            ketqua.setText("So b phai khac khong!");
        }

    }
    public  void uocChungLonNhat(View v){
        int a = Integer.parseInt(edt_soa.getText()+"");
        int b = Integer.parseInt(edt_sob.getText()+"");
        if(a>b){
            for (int i =b; i>=1; i--){
                if((a%i==0 )&&( b%i==0)){
                    ketqua.setText(i+"");
                    break;
                }
            }
        }
        else {
            for (int i =a; i>=1; i--){
                if((a%i==0 )&&( b%i==0)){
                    ketqua.setText(i+"");
                    break;
                }
            }
        }
    }
    public void Thoat(View v){
        finish();
    }

}

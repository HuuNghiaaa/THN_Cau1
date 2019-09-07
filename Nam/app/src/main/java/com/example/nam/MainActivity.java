package com.example.nam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtNamDuongLich;
    Button btnChuyenDoi;
    TextView txtNamAmLich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ChuyenDoi (View v){
    edtNamDuongLich = findViewById(R.id.edt_namduonglich);
    txtNamAmLich = findViewById(R.id.txt_namamlich);
    int namDuong = Integer.parseInt(edtNamDuongLich.getText()+"");
    String can =""  ;
    String chi="";
    if (namDuong < 1900 ) {
        txtNamAmLich.setText("Nam phai  > 1900 ");

        }
    else {
        switch (namDuong % 10) {
            case 0:
                can = "Canh";
                break;
            case 1:
                can = "Tan";
                break;
            case 2:
                can = "Nham";
                break;
            case 3:
                can = "Quy";
                break;
            case 4:
                can = "Giap";
                break;
            case 5:
                can = "At";
                break;
            case 6:
                can = "Binh";
                break;
            case 7:
                can = "Dinh";
                break;
            case 8:
                can = "Mau";
                break;
            case 9:
                can = "Ky";
                break;


        }
        switch (namDuong % 12) {
            case 0:
                chi = "Than";
                break;
            case 1:
                chi = "Dau";
                break;
            case 2:
                chi = "Tuat";
                break;
            case 3:
                chi = "Hoi";
                break;
            case 4:
                chi = "Ti";
                break;
            case 5:
                chi = "Suu";
                break;
            case 6:
                chi = "Dan";
                break;
            case 7:
                chi = "Meo";
                break;
            case 8:
                chi = "Thin";
                break;
            case 9:
                chi = "Ty";
                break;
            case 10:
                chi = "Ngo";
                break;
            case 11:
                chi = "Mui";
                break;

        }
        txtNamAmLich.setText(can + " " + chi);
        }
    }
}

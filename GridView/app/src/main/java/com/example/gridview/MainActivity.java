package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity {
    String arr[] = {"Ipad", "Iphone", "New Ipad","SamSung","Nokia","Sony","LG","Q Mobile","FPT"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView selection = (TextView) findViewById(R.id.selection);
        final GridView gv = (GridView) findViewById(R.id.gridViewl);
        ArrayAdapter<String> da=new ArrayAdapter<String> (this,android.R.layout.simple_list_item_1,arr);
        gv.setAdapter(da);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener()){
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3){
                selection.SetText(arr[arg2]);
            }
        });
    }
}

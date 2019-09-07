package com.example.testlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.sql.Array;

public class MainActivity extends ListActivity {
    String[] president ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lstView = getListView();
        lstView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        lstView.setTextFilterEnabled(true);
        president = getResources().getStringArray(R.array.president_array);

        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_checked, president));

        // Layout List_item_checked
        //position vi tri item duoc chon tac dong len
        // Toast : Message box

    }
    public  void  OnListItemClick (ListView parent, View v, int position, long id)

    {
        Toast.makeText(this, "you have selected" + president[position],
                Toast.LENGTH_SHORT).show();
    }
    public void  Onclick (View view){
        ListView lstView = getListView();
        String itemsSelected = "Selected items: \n ";
        for ( int i=0; i<lstView.getCount();i++)
        {
            if (lstView.isItemChecked(i)){
                itemsSelected += lstView.getItemAtPosition(i) + "\n";
            }
        }
        Toast.makeText(this, itemsSelected,Toast.LENGTH_LONG).show();
    }

}


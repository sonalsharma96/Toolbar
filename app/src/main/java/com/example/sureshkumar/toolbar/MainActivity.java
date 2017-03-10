package com.example.sureshkumar.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
//this is the activity for database...
public class MainActivity extends AppCompatActivity {
ListView l1;
    Toolbar toolbar;
    EditText text;
    private String[] title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1= (ListView) findViewById(R.id.list_item);
        title=getResources().getStringArray(R.array.title);
        l1.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,title));

        toolbar= (Toolbar) findViewById(R.id.bar);
        text= (EditText) findViewById(R.id.text);
        text.setVisibility(View.VISIBLE);
        text.setHint("Search");
    }
}

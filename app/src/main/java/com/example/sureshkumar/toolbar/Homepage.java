package com.example.sureshkumar.toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import static android.R.attr.value;

/**
 * Created by SURESH KUMAR on 3/9/2017.
 */

public class Homepage extends AppCompatActivity {
    Toolbar toolbar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        toolbar = (Toolbar) findViewById(R.id.bar);
        EditText text = (EditText) findViewById(R.id.text);
        text.setVisibility(View.INVISIBLE);

    }
    public  void database(View v){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void camera(View v){
        Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT,value);
        intent.putExtra(MediaStore.EXTRA_VIDEO_QUALITY,1);
        startActivity(intent);
    }
}

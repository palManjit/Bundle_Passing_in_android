package com.jp.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class secondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        TextView text;
        text=findViewById(R.id.text);
        Intent fromAct=getIntent();
        String title=fromAct.getStringExtra("title");
        String studentName=fromAct.getStringExtra("studentName");
        int rollNo=fromAct.getIntExtra("rollNo",0);

        text.setText("Roll No:"+rollNo+""+"Name:"+studentName);


        
    }
}
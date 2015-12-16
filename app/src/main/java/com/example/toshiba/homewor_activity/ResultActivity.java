package com.example.toshiba.homewor_activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by toshiba on 7.12.2015 г..
 */
public class ResultActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btn_final;
    private TextView txt_info;
    String info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        txt_info = (TextView) findViewById(R.id.txt_info);
        btn_final = (Button) findViewById(R.id.btn_show_address);
        btn_final.setOnClickListener(this);
        Intent result = getIntent();
        Intent details = getIntent();
        info = result.getExtras().getString("add");
        txt_info.setText(info);

    }


    @Override
    public void onClick(View v) {

    }
}


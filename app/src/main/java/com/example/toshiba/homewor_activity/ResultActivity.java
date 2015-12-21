package com.example.toshiba.homewor_activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.net.URI;

/**
 * Created by toshiba on 7.12.2015 г..
 */
public class ResultActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btn_final;
    private TextView txt_info;
    String name;
    String age;
    String address;
    String town;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        txt_info = (TextView) findViewById(R.id.txt_info);
        btn_final = (Button) findViewById(R.id.btn_show_address);
        btn_final.setOnClickListener(this);
        txt_info.setText(currentInfo());

    }

    public String currentInfo() {
        Intent result = getIntent();
        name = result.getExtras().getString("Name");
        age = result.getExtras().getString("Age");
        address = result.getExtras().getString("Address");
        town = result.getExtras().getString("Town");
        String currentInfo = name + ", " + age + ", " + "\n" +
                address + ", " + "\n" + "Град" + " " + town;
        return currentInfo;
    }

    @Override
    public void onClick(View v) {
        Uri locationUri = Uri.parse("geo:0,0?q=" + Uri.encode(address + " " + town));
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, locationUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}


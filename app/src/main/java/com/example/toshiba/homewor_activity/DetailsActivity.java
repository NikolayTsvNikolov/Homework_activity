package com.example.toshiba.homewor_activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by toshiba on 7.12.2015 г..
 */
public class DetailsActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText txt_age;
    private EditText txt_add;
    private EditText txt_town;
    private EditText txt_bd;
    private Button btn_continue;
    public String other_info;
    public String names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        txt_age = (EditText) findViewById(R.id.txt_age);
        txt_add = (EditText) findViewById(R.id.txt_address);
        txt_town = (EditText) findViewById(R.id.txt_town);
        txt_bd = (EditText) findViewById(R.id.txt_birth_date);
        btn_continue = (Button) findViewById(R.id.btn_continue);
        btn_continue.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if (isDataValid(txt_age) == false) {
        } else if (isDataValid(txt_add) == false) {
        } else if (isDataValid(txt_town) == false) {
        } else if (isDataValid(txt_bd) == false) {
        } else {
            Intent result = new Intent(this, ResultActivity.class);
            Intent details = getIntent();
            result.putExtra("Name", details.getExtras().getString("Name"));
            result.putExtra("Age", txt_age.getText().toString());
            result.putExtra("Address", txt_add.getText().toString());
            result.putExtra("Town", txt_town.getText().toString());
            startActivity(result);
        }

    }

    public boolean isDataValid(EditText example) {
        if (example.getText().toString().isEmpty()) {
            example.setError("Въведете правилни данни");
            return false;
        }
        return true;
    }
}


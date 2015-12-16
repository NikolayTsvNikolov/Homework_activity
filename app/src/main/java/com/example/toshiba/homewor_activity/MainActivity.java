package com.example.toshiba.homewor_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText txt_fn;
    private Button btn_enter;
    public String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_fn = (EditText) findViewById(R.id.txt_first_name);
        btn_enter = (Button) findViewById(R.id.btn_enter);
        btn_enter.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (txt_fn.getText().toString().isEmpty()) {
            txt_fn.setError("Въведете правилно име");
        } else {
            Intent details = new Intent(this, DetailsActivity.class);
            details.putExtra("name",txt_fn.getText().toString());
            startActivity(details);
        }
    }
}

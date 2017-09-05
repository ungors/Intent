package com.example.lenovo.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = (TextView) findViewById(R.id.txt_received);
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        textView.setText(name);
    }
    public void change(View view)
    {
        Intent a = new Intent(Main2Activity.this,MainActivity.class);
        startActivity(a);
    }
}

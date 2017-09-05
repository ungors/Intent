package com.example.lenovo.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void changeActivity(View view)
    {
        editText = (EditText) findViewById(R.id.et_entered);
        Intent ıntent = new Intent(getApplicationContext(),Main2Activity.class);
        ıntent.putExtra("name",editText.getText().toString());
        startActivity(ıntent);
    }
}

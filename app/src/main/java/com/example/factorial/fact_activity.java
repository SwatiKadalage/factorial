package com.example.factorial;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class fact_activity extends AppCompatActivity {
    TextView txt1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.factorial);
        txt1=(TextView) findViewById(R.id.txt1);
        Bundle extra=getIntent().getExtras();
        String value1=extra.getString("Factorial");
        txt1.setText("Factorial:"+value1);

    }
}

package com.example.factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txt;
    Button btn;
    int fact=1;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(EditText) findViewById(R.id.txt);
        btn=(Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                factorial();
                /*Toast.makeText(getApplicationContext(),x,Toast.LENGTH_LONG).show();


                Intent intent=new Intent(getApplicationContext(),fact_activity.class);
                intent.putExtra("Factorial=",factorial());
                startActivity(intent);*/

            }
            private void   factorial()
            {
                int no= Integer.parseInt(txt.getText().toString());

                for(i=1;i<=no;i++)
                {
                    fact=fact*i;



                }
                Toast.makeText(getApplicationContext(),fact,Toast.LENGTH_LONG).show();

            }
        });
    }
}
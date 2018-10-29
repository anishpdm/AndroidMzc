package com.logix.anishsnair.mzcproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    Button b,b1;
    String Name,Password,Result;
    int x,y,z;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1= (EditText)findViewById(R.id.name);
        ed2=(EditText)findViewById(R.id.pass);
        b=(Button)findViewById(R.id.button);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Name=ed1.getText().toString();
                Password=ed2.getText().toString();

                x=Integer.parseInt(Name);
                y=Integer.parseInt(Password);
                z=x+y;
                Result=String.valueOf(z);




            }
        });






    }
}

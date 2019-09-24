package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Scientific_Opener extends AppCompatActivity {

    EditText numb1,numb2;
    TextView result;
    Button sin,cos,tan,sqrt,pow;
    Double res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific__opener);
        numb1=(EditText)findViewById(R.id.num);
        numb2=(EditText)findViewById(R.id.pow);

        result=(TextView)findViewById(R.id.Result);


        sin=(Button)findViewById(R.id.sin);
        cos=(Button)findViewById(R.id.cos);
        tan=(Button)findViewById(R.id.tan);
        sqrt=(Button)findViewById(R.id.sqrt);
        pow=(Button)findViewById(R.id.power_bt);

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String s1;
                s1= numb1.getText().toString();

                if(s1.isEmpty()) {
                    Toast.makeText(Scientific_Opener.this,"Enter the Number", Toast.LENGTH_SHORT).show();
                    return;
                }
                Double n1 = Double.parseDouble(s1);
                res = (Double) Math.sin(Math.toRadians(n1));
                result.setText(String.valueOf(res));


            }
        });


        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String snum;
                snum= numb1.getText().toString();

                if(snum.isEmpty()){
                    Toast.makeText(Scientific_Opener.this, "No Number Entered in first field", Toast.LENGTH_SHORT).show();
                    return;
                }


                Double n1 = Double.parseDouble(snum);
                res = (Double) Math.cos(Math.toRadians(n1));
                result.setText(String.valueOf(res));

            }
        });

        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1;
                s1=numb1.getText().toString();

                if(s1.isEmpty()){
                    Toast.makeText(Scientific_Opener.this,"Enter The number",Toast.LENGTH_SHORT).show();
                    return;
                }

                Double n1 = Double.parseDouble(s1);
                res = (Double) Math.tan(Math.toRadians(n1));
                result.setText(String.valueOf(res));

            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z1;
                z1=numb1.getText().toString();
                if(z1.isEmpty()){
                    Toast.makeText(view.getContext(),"Enter No Zakaria",Toast.LENGTH_SHORT).show();
                    return;
                }
                Double n1 = Double.parseDouble(z1);
                res = (Double) Math.sqrt(n1);
                result.setText(String.valueOf(res));

            }
        });

        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z1,z2;
                z1=numb1.getText().toString();
                z2=numb2.getText().toString();

                if(z1.isEmpty()){
                    Toast.makeText(view.getContext(),"Enter No Zakaria",Toast.LENGTH_SHORT).show();
                    return;
                }
                else if(z2.isEmpty()){
                    Toast.makeText(view.getContext(),"Please Enter Correct No Zakaria",Toast.LENGTH_LONG).show();
                    return;
                }

                Double n1= Double.parseDouble(z1);
                Double n2= Double.parseDouble(z2);
                res = (Double) Math.pow(n1,n2);
                result.setText(String.valueOf(res));

            }
        });
    }

    public void Open_powientific_Opener(){
        Intent intent=new Intent(this, Scientific_Opener.class);
        startActivity(intent);
    }
}

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

public class MainActivity extends AppCompatActivity {

      EditText numb1,numb2;
    TextView result;
    Button Add,Sub,Mul,Div,Sc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numb1=(EditText)findViewById(R.id.num1);
        numb2=(EditText)findViewById(R.id.num2);

        result=(TextView)findViewById(R.id.Result);


        Add=(Button)findViewById(R.id.Add);
        Sub=(Button)findViewById(R.id.Subtract);
        Mul=(Button)findViewById(R.id.Multiply);
        Div=(Button)findViewById(R.id.Divide);
        Sc=(Button)findViewById(R.id.Scientific);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String s1,s2;
                s1= numb1.getText().toString();
                s2=numb2.getText().toString();

                if(s1.isEmpty()) {
                    Toast.makeText(MainActivity.this,"Enter the Number", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if(s2.isEmpty()){
                    Toast.makeText(MainActivity.this,"Please Enter Correct no",Toast.LENGTH_LONG).show();
                    return;
                }

                double n1 = Double.parseDouble(numb1.getText().toString());
                double n2 = Double.parseDouble(numb2.getText().toString());
                double res = n1 + n2;
                result.setText(String.valueOf(res));


            }
        });


        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String snum1, snum2;
                snum1= numb1.getText().toString();
                snum2= numb2.getText().toString();

                if(snum1.isEmpty()){
                    Toast.makeText(MainActivity.this, "No Number Entered in first field", Toast.LENGTH_SHORT).show();
                    return;
                }

                else if(snum2.isEmpty()){
                    Toast.makeText(MainActivity.this, "No Number Entered in Second field", Toast.LENGTH_SHORT).show();
                    return;
                }



                double n1 = Double.parseDouble(numb1.getText().toString());
                double n2 = Double.parseDouble(numb2.getText().toString());
                double res = n1 - n2;
                result.setText(String.valueOf(res));

            }
        });

        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1,s2;
                s1=numb1.getText().toString();
                s2=numb2.getText().toString();

                if(s1.isEmpty()){
                    Toast.makeText(MainActivity.this,"Enter The number",Toast.LENGTH_SHORT).show();
                    return;
                }
                else if(s2.isEmpty()) {
                    Toast.makeText(MainActivity.this,"Please Enter Correct no",Toast.LENGTH_SHORT).show();
                    return;
                }

                double n1 = Double.parseDouble(numb1.getText().toString());
                double n2 = Double.parseDouble(numb2.getText().toString());
                double res = n1 * n2;
                result.setText(String.valueOf(res));

            }
        });
        Div.setOnClickListener(new View.OnClickListener() {
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
                double n1 = Double.parseDouble(numb1.getText().toString());
                double n2 = Double.parseDouble(numb2.getText().toString());
                double res = n1 / n2;
                result.setText(String.valueOf(res));

            }
        });

        Sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Open_Scientific_Opener();
            }
        });
    }

    public void Open_Scientific_Opener(){
        Intent intent=new Intent(this, Scientific_Opener.class);
        startActivity(intent);
    }
}

package com.example.administrator.layoutdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
Button button1,button2,button3,button4,button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button) findViewById(R.id.button2);
        button2=(Button) findViewById(R.id.button3);
        button3=(Button) findViewById(R.id.button4);
        button4=(Button) findViewById(R.id.button5);
        button5=(Button) findViewById(R.id.button6);

        View.OnClickListener testListner=new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                switch(view.getId()) {
                    case R.id.button2:
                        Intent i=new Intent(MainActivity.this,SecondActivity.class);
                        startActivity(i);
                        break;
                    case R.id.button3:
                        Intent i1=new Intent(MainActivity.this,ThirdActivity.class);
                        startActivity(i1);
                        break;
                    case R.id.button4:
                        Intent i2=new Intent(MainActivity.this,FourthActivity.class);
                        startActivity(i2);
                        break;
                    case R.id.button5:
                        Intent i3=new Intent(MainActivity.this,FifthActivity.class);
                        startActivity(i3);
                        break;
                    case R.id.button6:
                        Intent i4=new Intent(MainActivity.this,SixthdActivity.class);
                        startActivity(i4);
                        break;

                }
            }
        };
        button1.setOnClickListener(testListner);
        button2.setOnClickListener(testListner);
        button3.setOnClickListener(testListner);
        button4.setOnClickListener(testListner);
        button5.setOnClickListener(testListner);
    }

}

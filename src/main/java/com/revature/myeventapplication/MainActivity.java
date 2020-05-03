package com.revature.myeventapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button,order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        order=(Button) findViewById(R.id.button);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitOrder(order);
            }
        });

        button=(Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity();
            }
        });
    }
    
    public void submitOrder(View text){
        display(1);
    }

    private void display(int orderNo) {
        TextView oderView =(TextView) findViewById(R.id.textView2);
        oderView.setText(""+orderNo);
    }

    public void openSecondActivity(){
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}

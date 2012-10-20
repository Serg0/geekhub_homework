package com.example.geekhub_1st_homework;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FirstActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
    
    Button b1 = (Button) findViewById(R.id.button1);
    b1.setOnClickListener(new OnClickListener() {
		
		public void onClick(View v) {
			startActivity(new Intent(FirstActivity.this, SecondActivity.class));
			
		}
	});
    
    Button b2 = (Button) findViewById(R.id.button2);
    b2.setOnClickListener(new OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			startActivity(new Intent(FirstActivity.this, ThirdActivity.class));
		}
	});
    
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.first_activity, menu);
        return true;
    }
}

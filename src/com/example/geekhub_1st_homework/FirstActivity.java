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
    
    Button b = (Button) findViewById(R.id.button1);
    b.setOnClickListener(new OnClickListener() {
		
		public void onClick(View v) {
			startActivity(new Intent(FirstActivity.this, SecondActivity.class));
			
		}
	});
    
    
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.first_activity, menu);
        return true;
    }
}

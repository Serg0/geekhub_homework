package com.example.geekhub_2d_homework;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;

public class MainActivity_ extends Activity {
	
	  FragmentTransaction fTrans;
	  Fragment1 frag1;
	  Fragment2 frag2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        frag1 = new Fragment1();
        frag2 = new Fragment2();
      //  fTrans = getFragmentManager().beginTransaction();
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}

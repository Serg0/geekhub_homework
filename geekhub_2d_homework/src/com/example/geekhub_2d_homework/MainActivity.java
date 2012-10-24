package com.example.geekhub_2d_homework;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.support.v4.app.*;

public class MainActivity extends FragmentActivity { 
	 FragmentTransaction fTrans;
	  Fragment1 frag1;
	  Fragment2 frag2;

	
	
	public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    frag1 = new Fragment1();
    frag2 = new Fragment2();
    fTrans = getSupportFragmentManager().beginTransaction();
    
    fTrans.add(R.id.frgmCont, frag1);
    fTrans.commit();

}

@Override
public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.activity_main, menu);
    return true;
}
}

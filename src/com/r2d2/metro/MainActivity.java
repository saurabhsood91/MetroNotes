package com.r2d2.metro;

import org.apache.cordova.DroidGap;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;

public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/main.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
    {
    	MenuInflater inflator=getMenuInflater();
    	
        inflator.inflate(R.menu.activity_main, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	// TODO Auto-generated method stub
    	
    	
    	super.loadUrl("file:///android_asset/www/index.html");
    	
    	return super.onOptionsItemSelected(item);
    }
    

    
}
